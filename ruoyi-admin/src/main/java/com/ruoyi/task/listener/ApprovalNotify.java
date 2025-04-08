package com.ruoyi.task.listener;

import org.flowable.task.service.delegate.DelegateTask;
import org.flowable.task.service.delegate.TaskListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ApprovalNotify implements TaskListener {

    private static final Logger log = LoggerFactory.getLogger(ApprovalNotify.class);

    @Override
    public void notify(DelegateTask delegateTask) {
        log.info("任务监听器:{}", delegateTask);
    }

}