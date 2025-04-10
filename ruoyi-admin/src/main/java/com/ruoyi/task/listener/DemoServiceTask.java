package com.ruoyi.task.listener;

import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;

public class DemoServiceTask implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) {
        System.out.println("========MyServiceTask==========");
    }
}