package com.ruoyi.kanban.service;

/**
 * Wekan WebHook通知处理Service接口
 */
public interface IWekanWebhookService {
    
    /**
     * 处理WebHook通知
     * 
     * @param payload WebHook通知内容
     * @return 处理结果
     */
    boolean handleWebhook(String payload);
} 