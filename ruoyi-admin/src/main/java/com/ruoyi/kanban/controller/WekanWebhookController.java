package com.ruoyi.kanban.controller;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.kanban.service.IWekanWebhookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Wekan WebHook通知处理
 */
@RestController
@RequestMapping("/kanban/webhook")
public class WekanWebhookController extends BaseController {
    
    @Autowired
    private IWekanWebhookService wekanWebhookService;

    /**
     * 接收Wekan WebHook通知
     */
    @PostMapping("/notify")
    public AjaxResult notify(@RequestBody String payload) {
        return toAjax(wekanWebhookService.handleWebhook(payload));
    }
} 