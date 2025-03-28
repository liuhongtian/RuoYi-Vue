package com.ruoyi.kanbanview.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.kanbanview.mapper.WekanWebhookLogViewMapper;
import com.ruoyi.kanbanview.domain.WekanWebhookLogView;
import com.ruoyi.kanbanview.service.IWekanWebhookLogViewService;

/**
 * Wekan WebHook日志查看Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-03-28
 */
@Service
public class WekanWebhookLogViewServiceImpl implements IWekanWebhookLogViewService 
{
    @Autowired
    private WekanWebhookLogViewMapper wekanWebhookLogViewMapper;

    /**
     * 查询Wekan WebHook日志查看
     * 
     * @param id Wekan WebHook日志查看主键
     * @return Wekan WebHook日志查看
     */
    @Override
    public WekanWebhookLogView selectWekanWebhookLogViewById(Long id)
    {
        return wekanWebhookLogViewMapper.selectWekanWebhookLogViewById(id);
    }

    /**
     * 查询Wekan WebHook日志查看列表
     * 
     * @param wekanWebhookLogView Wekan WebHook日志查看
     * @return Wekan WebHook日志查看
     */
    @Override
    public List<WekanWebhookLogView> selectWekanWebhookLogViewList(WekanWebhookLogView wekanWebhookLogView)
    {
        return wekanWebhookLogViewMapper.selectWekanWebhookLogViewList(wekanWebhookLogView);
    }

    /**
     * 新增Wekan WebHook日志查看
     * 
     * @param wekanWebhookLogView Wekan WebHook日志查看
     * @return 结果
     */
    @Override
    public int insertWekanWebhookLogView(WekanWebhookLogView wekanWebhookLogView)
    {
        wekanWebhookLogView.setCreateTime(DateUtils.getNowDate());
        return wekanWebhookLogViewMapper.insertWekanWebhookLogView(wekanWebhookLogView);
    }

    /**
     * 修改Wekan WebHook日志查看
     * 
     * @param wekanWebhookLogView Wekan WebHook日志查看
     * @return 结果
     */
    @Override
    public int updateWekanWebhookLogView(WekanWebhookLogView wekanWebhookLogView)
    {
        wekanWebhookLogView.setUpdateTime(DateUtils.getNowDate());
        return wekanWebhookLogViewMapper.updateWekanWebhookLogView(wekanWebhookLogView);
    }

    /**
     * 批量删除Wekan WebHook日志查看
     * 
     * @param ids 需要删除的Wekan WebHook日志查看主键
     * @return 结果
     */
    @Override
    public int deleteWekanWebhookLogViewByIds(Long[] ids)
    {
        return wekanWebhookLogViewMapper.deleteWekanWebhookLogViewByIds(ids);
    }

    /**
     * 删除Wekan WebHook日志查看信息
     * 
     * @param id Wekan WebHook日志查看主键
     * @return 结果
     */
    @Override
    public int deleteWekanWebhookLogViewById(Long id)
    {
        return wekanWebhookLogViewMapper.deleteWekanWebhookLogViewById(id);
    }
}
