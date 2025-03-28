package com.ruoyi.kanban.mapper;

import java.util.List;
import com.ruoyi.kanban.domain.WekanWebhookLog;

/**
 * Wekan WebHook日志Mapper接口
 */
public interface WekanWebhookLogMapper {
    /**
     * 查询WebHook日志
     * 
     * @param id WebHook日志ID
     * @return WebHook日志
     */
    public WekanWebhookLog selectWekanWebhookLogById(Long id);

    /**
     * 查询WebHook日志列表
     * 
     * @param wekanWebhookLog WebHook日志
     * @return WebHook日志集合
     */
    public List<WekanWebhookLog> selectWekanWebhookLogList(WekanWebhookLog wekanWebhookLog);

    /**
     * 新增WebHook日志
     * 
     * @param wekanWebhookLog WebHook日志
     * @return 结果
     */
    public int insertWekanWebhookLog(WekanWebhookLog wekanWebhookLog);

    /**
     * 修改WebHook日志
     * 
     * @param wekanWebhookLog WebHook日志
     * @return 结果
     */
    public int updateWekanWebhookLog(WekanWebhookLog wekanWebhookLog);

    /**
     * 删除WebHook日志
     * 
     * @param id WebHook日志ID
     * @return 结果
     */
    public int deleteWekanWebhookLogById(Long id);

    /**
     * 批量删除WebHook日志
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteWekanWebhookLogByIds(Long[] ids);
} 