package com.ruoyi.obd.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.obd.mapper.VehicleMapper;
import com.ruoyi.obd.domain.Vehicle;
import com.ruoyi.obd.service.IVehicleService;

/**
 * 车辆信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-03-27
 */
@Service
public class VehicleServiceImpl implements IVehicleService 
{
    @Autowired
    private VehicleMapper vehicleMapper;

    /**
     * 查询车辆信息
     * 
     * @param pkId 车辆信息主键
     * @return 车辆信息
     */
    @Override
    public Vehicle selectVehicleByPkId(Long pkId)
    {
        return vehicleMapper.selectVehicleByPkId(pkId);
    }

    /**
     * 查询车辆信息列表
     * 
     * @param vehicle 车辆信息
     * @return 车辆信息
     */
    @Override
    public List<Vehicle> selectVehicleList(Vehicle vehicle)
    {
        return vehicleMapper.selectVehicleList(vehicle);
    }

    /**
     * 新增车辆信息
     * 
     * @param vehicle 车辆信息
     * @return 结果
     */
    @Override
    public int insertVehicle(Vehicle vehicle)
    {
        return vehicleMapper.insertVehicle(vehicle);
    }

    /**
     * 修改车辆信息
     * 
     * @param vehicle 车辆信息
     * @return 结果
     */
    @Override
    public int updateVehicle(Vehicle vehicle)
    {
        return vehicleMapper.updateVehicle(vehicle);
    }

    /**
     * 批量删除车辆信息
     * 
     * @param pkIds 需要删除的车辆信息主键
     * @return 结果
     */
    @Override
    public int deleteVehicleByPkIds(Long[] pkIds)
    {
        return vehicleMapper.deleteVehicleByPkIds(pkIds);
    }

    /**
     * 删除车辆信息信息
     * 
     * @param pkId 车辆信息主键
     * @return 结果
     */
    @Override
    public int deleteVehicleByPkId(Long pkId)
    {
        return vehicleMapper.deleteVehicleByPkId(pkId);
    }
}
