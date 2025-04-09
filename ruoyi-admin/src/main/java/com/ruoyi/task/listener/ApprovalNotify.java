package com.ruoyi.task.listener;

import org.flowable.engine.RepositoryService;
import org.flowable.engine.repository.ProcessDefinition;
import org.flowable.task.service.delegate.DelegateTask;
import org.flowable.task.service.delegate.TaskListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

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
        
        // 从ApplicationContext中获取Mapper
        RtWorkwxMsgMapper rtWorkwxMsgMapper = applicationContext.getBean(RtWorkwxMsgMapper.class);
        RepositoryService repositoryService = applicationContext.getBean(RepositoryService.class);
        
        RtWorkwxMsg msg = new RtWorkwxMsg();
        // TODO 消息临时发送到本人
        msg.setRecvUser("LiuHongTian");
        msg.setRuoyiUser("liuhongtian");
        // TODO 消息内容：
        // http://www.liuhongtian.com:22080/flowable/task/todo/detail/index?procInsId=65&executionId=71&deployId=37&taskId=82
        String procInsId = delegateTask.getProcessInstanceId(); 
        String executionId = delegateTask.getExecutionId();
        ProcessDefinition processDefinition = repositoryService.getProcessDefinition(delegateTask.getProcessDefinitionId());
        String deployId = processDefinition.getDeploymentId();
        String taskId = delegateTask.getId();

        String url = String.format("http://www.liuhongtian.com:22080/flowable/task/todo/detail/index?procInsId=%s&executionId=%s&deployId=%s&taskId=%s", procInsId, executionId, deployId, taskId);
        String messageContent = String.format("您有【%s】的审批任务，请及时处理。\n<a href=\"%s\">点击此处进行处理</a>", processDefinition.getName(), url);
        msg.setMessageContent(messageContent);
        rtWorkwxMsgMapper.insertRtWorkwxMsg(msg);
    }
}