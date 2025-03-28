package com.ruoyi.kanbanview.service;

import java.util.List;
import com.ruoyi.kanbanview.domain.WekanWebhookLogView;

/**
 * Wekan WebHook日志查看Service接口
 * 
 * @author ruoyi
 * @date 2025-03-28
 */
public interface IWekanWebhookLogViewService 
{
    /**
     * 查询Wekan WebHook日志查看
     * 
     * @param id Wekan WebHook日志查看主键
     * @return Wekan WebHook日志查看
     */
    public WekanWebhookLogView selectWekanWebhookLogViewById(Long id);

    /**
     * 查询Wekan WebHook日志查看列表
     * 
     * @param wekanWebhookLogView Wekan WebHook日志查看
     * @return Wekan WebHook日志查看集合
     */
    public List<WekanWebhookLogView> selectWekanWebhookLogViewList(WekanWebhookLogView wekanWebhookLogView);

    /**
     * 新增Wekan WebHook日志查看
     * 
     * @param wekanWebhookLogView Wekan WebHook日志查看
     * @return 结果
     */
    public int insertWekanWebhookLogView(WekanWebhookLogView wekanWebhookLogView);

    /**
     * 修改Wekan WebHook日志查看
     * 
     * @param wekanWebhookLogView Wekan WebHook日志查看
     * @return 结果
     */
    public int updateWekanWebhookLogView(WekanWebhookLogView wekanWebhookLogView);

    /**
     * 批量删除Wekan WebHook日志查看
     * 
     * @param ids 需要删除的Wekan WebHook日志查看主键集合
     * @return 结果
     */
    public int deleteWekanWebhookLogViewByIds(Long[] ids);

    /**
     * 删除Wekan WebHook日志查看信息
     * 
     * @param id Wekan WebHook日志查看主键
     * @return 结果
     */
    public int deleteWekanWebhookLogViewById(Long id);
}
