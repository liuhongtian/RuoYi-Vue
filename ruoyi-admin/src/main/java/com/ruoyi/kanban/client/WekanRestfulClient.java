package com.ruoyi.kanban.client;

import com.alibaba.fastjson2.JSON;
import com.ruoyi.kanban.client.model.Login;
import com.ruoyi.kanban.client.model.NewCard;
import com.ruoyi.kanban.client.model.Token;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * Wekan Restful API 客户端
 */
@Component
public class WekanRestfulClient {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Autowired
    private RestTemplate restTemplate;
    
    @Value("${wekan.urls.login}")
    private String loginUrl;

    @Value("${wekan.username}")
    private String username;

    @Value("${wekan.password}")
    private String password;

    @Value("${wekan.ids.board}")
    private String boardId;

    @Value("${wekan.ids.swimlane}")
    private String swimlaneId;  

    @Value("${wekan.ids.lists.pending}")
    private String pendingListId;

    @Value("${wekan.ids.lists.scheduling}")
    private String schedulingListId;    

    @Value("${wekan.ids.lists.apply}")
    private String applyListId;

    @Value("${wekan.ids.lists.scheduled}")
    private String scheduledListId; 

    @Value("${wekan.ids.lists.processing}")
    private String processingListId;

    @Value("${wekan.urls.apibase}")
    private String apiBase;

    /**
     * 创建卡片，只能在“待调度”列表中创建
     * 
     * @param newCard
     * @return 卡片ID
     */
    public String newCard(NewCard newCard) {
        String url = apiBase + "/boards/" + boardId + "/lists/" + pendingListId + "/cards";
        System.out.println("wekan newcard url: " + url);
        newCard.setSwimlaneId(swimlaneId);
        newCard.setAuthorId(redisTemplate.opsForValue().get("wekan.userid"));
        System.out.println("wekan newcard: " + newCard.getTitle());
        String resp = notify(url, newCard);
        if (resp != null) {
            return (String)JSON.parseObject(resp).get("_id");
        }
        return "";
    }

    /**
     * 请求Wekan API的公共方法
     * @param url 请求的URL
     * @param payload
     * @return 响应结果
     */
    private String notify(String url, Object payload) {
        String token = redisTemplate.opsForValue().get("wekan.token");
        if (token == null) {
            getToken();
            token = redisTemplate.opsForValue().get("wekan.token");
            if (token == null) {
                System.err.println("Token is null, cannot send request");
                return null;
            }
        }

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setBearerAuth(token);

        HttpEntity<Object> requestEntity = new HttpEntity<>(payload, headers);

        try {
            String resp = restTemplate.postForObject(url, requestEntity, String.class);
            System.out.println("wekan newcard response: " + resp);
            return resp;
        } catch (Exception e) {
            System.err.println("Failed to send request: " + e.getMessage());
            return null;
        }
    }

    private void getToken() {
        Login login = new Login();
        login.setUsername(username);
        login.setPassword(password);
        
        Token token = restTemplate.postForObject(loginUrl, login, Token.class);
        
        if (token != null) {
            // 将token信息存入Redis
            redisTemplate.opsForValue().set("wekan.token", token.getToken());
            redisTemplate.opsForValue().set("wekan.userid", token.getId());
            redisTemplate.opsForValue().set("wekan.token.expires", token.getTokenExpires());
        } else {
            System.err.println("获取token失败");
        }
    }

    @Scheduled(fixedRate = 300000)
    private void refreshToken() {
        System.out.println("refreshToken is running ...");
        String token = redisTemplate.opsForValue().get("wekan.token");
        if (token == null) {
            getToken();
        } else {
            String tokenExpires = redisTemplate.opsForValue().get("wekan.token.expires");
            if (tokenExpires != null) {
                LocalDateTime expiresTime = LocalDateTime.parse(tokenExpires);
                if (expiresTime.isBefore(LocalDateTime.now().plusDays(1))) {
                    getToken();
                }
            }
        }
    }
}
