package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.MonitoringSite;

/**
 * 监测站点Service接口
 * 
 * @author ruoyi
 * @date 2025-03-25
 */
public interface IMonitoringSiteService 
{
    /**
     * 查询监测站点
     * 
     * @param siteId 监测站点主键
     * @return 监测站点
     */
    public MonitoringSite selectMonitoringSiteBySiteId(Long siteId);

    /**
     * 查询监测站点列表
     * 
     * @param monitoringSite 监测站点
     * @return 监测站点集合
     */
    public List<MonitoringSite> selectMonitoringSiteList(MonitoringSite monitoringSite);

    /**
     * 新增监测站点
     * 
     * @param monitoringSite 监测站点
     * @return 结果
     */
    public int insertMonitoringSite(MonitoringSite monitoringSite);

    /**
     * 修改监测站点
     * 
     * @param monitoringSite 监测站点
     * @return 结果
     */
    public int updateMonitoringSite(MonitoringSite monitoringSite);

    /**
     * 批量删除监测站点
     * 
     * @param siteIds 需要删除的监测站点主键集合
     * @return 结果
     */
    public int deleteMonitoringSiteBySiteIds(Long[] siteIds);

    /**
     * 删除监测站点信息
     * 
     * @param siteId 监测站点主键
     * @return 结果
     */
    public int deleteMonitoringSiteBySiteId(Long siteId);
}
