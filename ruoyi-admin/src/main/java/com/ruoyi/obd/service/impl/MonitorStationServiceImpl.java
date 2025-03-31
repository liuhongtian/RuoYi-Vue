package com.ruoyi.obd.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.obd.mapper.MonitorStationMapper;
import com.ruoyi.obd.domain.MonitorStation;
import com.ruoyi.obd.service.IMonitorStationService;

/**
 * 测站Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-03-31
 */
@Service
public class MonitorStationServiceImpl implements IMonitorStationService 
{
    @Autowired
    private MonitorStationMapper monitorStationMapper;

    /**
     * 查询测站
     * 
     * @param pkId 测站主键
     * @return 测站
     */
    @Override
    public MonitorStation selectMonitorStationByPkId(Long pkId)
    {
        return monitorStationMapper.selectMonitorStationByPkId(pkId);
    }

    /**
     * 查询测站列表
     * 
     * @param monitorStation 测站
     * @return 测站
     */
    @Override
    public List<MonitorStation> selectMonitorStationList(MonitorStation monitorStation)
    {
        return monitorStationMapper.selectMonitorStationList(monitorStation);
    }

    /**
     * 新增测站
     * 
     * @param monitorStation 测站
     * @return 结果
     */
    @Override
    public int insertMonitorStation(MonitorStation monitorStation)
    {
        return monitorStationMapper.insertMonitorStation(monitorStation);
    }

    /**
     * 修改测站
     * 
     * @param monitorStation 测站
     * @return 结果
     */
    @Override
    public int updateMonitorStation(MonitorStation monitorStation)
    {
        return monitorStationMapper.updateMonitorStation(monitorStation);
    }

    /**
     * 批量删除测站
     * 
     * @param pkIds 需要删除的测站主键
     * @return 结果
     */
    @Override
    public int deleteMonitorStationByPkIds(Long[] pkIds)
    {
        return monitorStationMapper.deleteMonitorStationByPkIds(pkIds);
    }

    /**
     * 删除测站信息
     * 
     * @param pkId 测站主键
     * @return 结果
     */
    @Override
    public int deleteMonitorStationByPkId(Long pkId)
    {
        return monitorStationMapper.deleteMonitorStationByPkId(pkId);
    }
}
