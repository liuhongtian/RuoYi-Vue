package com.ruoyi.task.listener;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.flowable.engine.RepositoryService;
import org.flowable.engine.repository.ProcessDefinition;
import org.flowable.identitylink.api.IdentityLink;
import org.flowable.task.service.delegate.DelegateTask;
import org.flowable.task.service.delegate.TaskListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.system.mapper.SysUserMapper;
import com.ruoyi.system.mapper.SysUserRoleMapper;
import com.ruoyi.temp.domain.RtWorkwxMsg;
import com.ruoyi.temp.mapper.RtWorkwxMsgMapper;

@Component
public class ApprovalNotify implements TaskListener {

    private static final Logger log = LoggerFactory.getLogger(ApprovalNotify.class);

    private static ApplicationContext applicationContext;

    @Autowired
    public void setApplicationContext(ApplicationContext context) {
        applicationContext = context;
    }

    @Override
    public void notify(DelegateTask delegateTask) {
        log.info("任务监听器:{}", delegateTask);

        RtWorkwxMsgMapper rtWorkwxMsgMapper = applicationContext.getBean(RtWorkwxMsgMapper.class);
        RepositoryService repositoryService = applicationContext.getBean(RepositoryService.class);
        SysUserRoleMapper sysUserRoleMapper = applicationContext.getBean(SysUserRoleMapper.class);
        SysUserMapper sysUserMapper = applicationContext.getBean(SysUserMapper.class);

        List<Long> receivers = new ArrayList<>();

        String assignee = delegateTask.getAssignee();
        // 如果assignee不为空，则将assignee添加到receivers中
        if (assignee != null) {
            log.info("assignee:{}", assignee);
            receivers.add(Long.valueOf(assignee));
        }

        // 如果candidates不为空，则将candidates添加到receivers中
        Set<IdentityLink> candidates = delegateTask.getCandidates();
        if (candidates != null && !candidates.isEmpty()) {
            for (IdentityLink candidate : candidates) {
                if (candidate.getUserId() != null) {
                    log.info("candidate.userId:{}", candidate.getUserId());
                    receivers.add(Long.valueOf(candidate.getUserId()));
                }
                if (candidate.getGroupId() != null) {
                    log.info("candidate.groupId:{}", candidate.getGroupId());
                    List<Long> userIds = sysUserRoleMapper.queryUsersRoleByRoleId(Long.valueOf(candidate.getGroupId()));
                    log.info("candidate.userIds:{}", userIds);
                    if (userIds != null && !userIds.isEmpty()) {
                        userIds.forEach(id -> receivers.add(id));
                    }
                }
            }
        }

        log.info("receivers:{}", receivers);

        if (receivers.isEmpty()) {
            log.warn("没有找到接收人");
            return;
        }

        // TODO 消息内容：
        // http://www.liuhongtian.com:22080/flowable/task/todo/detail/index?procInsId=65&executionId=71&deployId=37&taskId=82
        String procInsId = delegateTask.getProcessInstanceId();
        String executionId = delegateTask.getExecutionId();
        ProcessDefinition processDefinition = repositoryService
                .getProcessDefinition(delegateTask.getProcessDefinitionId());
        String deployId = processDefinition.getDeploymentId();
        String taskId = delegateTask.getId();

        String url = String.format(
                "http://www.liuhongtian.com:22080/flowable/task/todo/detail/index?procInsId=%s&executionId=%s&deployId=%s&taskId=%s",
                procInsId, executionId, deployId, taskId);
        String messageContent = String.format("您有【%s】的审批任务，请及时处理。\n<a href=\"%s\">点击此处进行处理</a>",
                processDefinition.getName(), url);

        receivers.forEach(id -> {
            SysUser user = sysUserMapper.selectUserById(id);
            log.info("用户:{}", user);
            if (user != null && user.getWorkwx() != null) {
                RtWorkwxMsg msg = new RtWorkwxMsg();
                msg.setRecvUser(user.getWorkwx());
                msg.setRuoyiUser(user.getUserName());
                msg.setMessageContent(messageContent);
                rtWorkwxMsgMapper.insertRtWorkwxMsg(msg);
            }
        });

    }

    public static void main(String[] args) {
        String s = "100";
        Long l = Long.valueOf(s);
        System.out.println(l);
    }
}