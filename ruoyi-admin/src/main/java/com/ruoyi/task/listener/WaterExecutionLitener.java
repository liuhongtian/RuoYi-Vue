package com.ruoyi.task.listener;

import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.ExecutionListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WaterExecutionLitener implements ExecutionListener {

    private static final Logger log = LoggerFactory.getLogger(WaterExecutionLitener.class);

    @Override
    public void notify(DelegateExecution execution) {
        log.info("执行监听器:{}", execution);
    }
}
