package com.ruoyi.kanban.service.impl;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;
import com.ruoyi.kanban.domain.WekanWebhookLog;
import com.ruoyi.kanban.mapper.WekanWebhookLogMapper;
import com.ruoyi.kanban.service.IWekanWebhookService;
import com.ruoyi.obd.domain.HjjTaskList;
import com.ruoyi.obd.service.IHjjTaskListService;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Wekan WebHook通知处理Service实现类
 */
@Service
public class WekanWebhookServiceImpl implements IWekanWebhookService {
    
    @Autowired
    private IHjjTaskListService hjjTaskListService;

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

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Autowired
    private WekanWebhookLogMapper webhookLogMapper;

    private Logger logger = Logger.getLogger(WekanWebhookServiceImpl.class.getName());

    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean handleWebhook(String payload) {
        try {
            // 解析WebHook通知内容
            JSONObject jsonPayload = JSON.parseObject(payload);
            String type = jsonPayload.getString("type");
            
            // 保存WebHook日志
            WekanWebhookLog log = new WekanWebhookLog();
            log.setType(type);
            log.setPayload(payload);
            webhookLogMapper.insertWekanWebhookLog(log);
            logger.info(log.getPayload());
            
            // TODO: 根据不同的通知类型处理不同的业务逻辑
            logger.info("jsonPayload.description: " + jsonPayload.getString("description"));
            // 例如：卡片创建、更新、删除等
            if(jsonPayload.getString("description").contains("act-moveCard")) {
                // 卡片移动
                String cardId = jsonPayload.getString("cardId");
                String listId = jsonPayload.getString("listId");
                // 修改任务状态
                String status = "";
                if(listId.equals(applyListId)) {
                    status = "2";
                } else if(listId.equals(schedulingListId)) {
                    status = "1";
                } else if(listId.equals(scheduledListId)) {
                    status = "3";
                } else if(listId.equals(processingListId)) {
                    status = "4";
                } else if(listId.equals(pendingListId)) {
                    status = "0";
                }
                HjjTaskList q = new HjjTaskList();
                q.setWekanCardId(cardId);
                List<HjjTaskList> dbo = hjjTaskListService.selectHjjTaskListList(q);
                if(dbo.size() > 0) {
                    System.out.println("update status: " + status);
                    HjjTaskList hjjTaskList = dbo.get(0);
                    hjjTaskList.setStatus(status);
                    logger.info("update task: " + hjjTaskList.getPkId() + " status: " + status + " cardId: " + cardId + " listId: " + listId);
                    hjjTaskListService.updateHjjTaskList(hjjTaskList);
                }
            }
            
            return true;
        } catch (Exception e) {
            return false;
        }
    }
} 