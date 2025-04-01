package com.ruoyi.flowable.factory;

import org.flowable.engine.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * flowable 引擎注入封装
 * @author Tony
 * @date 2021-04-03
 */
@Component
public class FlowServiceFactory {

    @Resource
    protected RepositoryService repositoryService;

    @Resource
    protected RuntimeService runtimeService;

    @Resource
    protected IdentityService identityService;

    @Resource
    protected TaskService taskService;

    @Resource
    protected HistoryService historyService;

    @Resource
    protected ManagementService managementService;

    @Qualifier("processEngine")
    @Resource
    protected ProcessEngine processEngine;

    public RepositoryService getRepositoryService() {
        return repositoryService;
    }

    public RuntimeService getRuntimeService() {
        return runtimeService;
    }

    public IdentityService getIdentityService() {
        return identityService;
    }

    public TaskService getTaskService() {
        return taskService;
    }

    public HistoryService getHistoryService() {
        return historyService;
    }

    public ManagementService getManagementService() {
        return managementService;
    }

    public ProcessEngine getProcessEngine() {
        return processEngine;
    }
    
}
