package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.MonitoringSiteMapper;
import com.ruoyi.system.domain.MonitoringSite;
import com.ruoyi.system.service.IMonitoringSiteService;

/**
 * 监测站点Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-03-25
 */
@Service
public class MonitoringSiteServiceImpl implements IMonitoringSiteService 
{
    @Autowired
    private MonitoringSiteMapper monitoringSiteMapper;

    /**
     * 查询监测站点
     * 
     * @param siteId 监测站点主键
     * @return 监测站点
     */
    @Override
    public MonitoringSite selectMonitoringSiteBySiteId(Long siteId)
    {
        return monitoringSiteMapper.selectMonitoringSiteBySiteId(siteId);
    }

    /**
     * 查询监测站点列表
     * 
     * @param monitoringSite 监测站点
     * @return 监测站点
     */
    @Override
    public List<MonitoringSite> selectMonitoringSiteList(MonitoringSite monitoringSite)
    {
        return monitoringSiteMapper.selectMonitoringSiteList(monitoringSite);
    }

    /**
     * 新增监测站点
     * 
     * @param monitoringSite 监测站点
     * @return 结果
     */
    @Override
    public int insertMonitoringSite(MonitoringSite monitoringSite)
    {
        monitoringSite.setCreateTime(DateUtils.getNowDate());
        return monitoringSiteMapper.insertMonitoringSite(monitoringSite);
    }

    /**
     * 修改监测站点
     * 
     * @param monitoringSite 监测站点
     * @return 结果
     */
    @Override
    public int updateMonitoringSite(MonitoringSite monitoringSite)
    {
        monitoringSite.setUpdateTime(DateUtils.getNowDate());
        return monitoringSiteMapper.updateMonitoringSite(monitoringSite);
    }

    /**
     * 批量删除监测站点
     * 
     * @param siteIds 需要删除的监测站点主键
     * @return 结果
     */
    @Override
    public int deleteMonitoringSiteBySiteIds(Long[] siteIds)
    {
        return monitoringSiteMapper.deleteMonitoringSiteBySiteIds(siteIds);
    }

    /**
     * 删除监测站点信息
     * 
     * @param siteId 监测站点主键
     * @return 结果
     */
    @Override
    public int deleteMonitoringSiteBySiteId(Long siteId)
    {
        return monitoringSiteMapper.deleteMonitoringSiteBySiteId(siteId);
    }
}
