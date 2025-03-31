package com.ruoyi.obd.mapper;

import java.util.List;
import com.ruoyi.obd.domain.MonitorStation;

/**
 * 测站Mapper接口
 * 
 * @author ruoyi
 * @date 2025-03-31
 */
public interface MonitorStationMapper 
{
    /**
     * 查询测站
     * 
     * @param pkId 测站主键
     * @return 测站
     */
    public MonitorStation selectMonitorStationByPkId(Long pkId);

    /**
     * 查询测站列表
     * 
     * @param monitorStation 测站
     * @return 测站集合
     */
    public List<MonitorStation> selectMonitorStationList(MonitorStation monitorStation);

    /**
     * 新增测站
     * 
     * @param monitorStation 测站
     * @return 结果
     */
    public int insertMonitorStation(MonitorStation monitorStation);

    /**
     * 修改测站
     * 
     * @param monitorStation 测站
     * @return 结果
     */
    public int updateMonitorStation(MonitorStation monitorStation);

    /**
     * 删除测站
     * 
     * @param pkId 测站主键
     * @return 结果
     */
    public int deleteMonitorStationByPkId(Long pkId);

    /**
     * 批量删除测站
     * 
     * @param pkIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMonitorStationByPkIds(Long[] pkIds);
}
