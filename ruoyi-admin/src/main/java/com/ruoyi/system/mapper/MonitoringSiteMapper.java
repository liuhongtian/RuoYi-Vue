package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.MonitoringSite;

/**
 * 监测站点Mapper接口
 * 
 * @author ruoyi
 * @date 2025-03-24
 */
public interface MonitoringSiteMapper 
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
     * 删除监测站点
     * 
     * @param siteId 监测站点主键
     * @return 结果
     */
    public int deleteMonitoringSiteBySiteId(Long siteId);

    /**
     * 批量删除监测站点
     * 
     * @param siteIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMonitoringSiteBySiteIds(Long[] siteIds);
}
