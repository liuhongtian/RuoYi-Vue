package com.ruoyi.obd.service;

import java.util.List;
import com.ruoyi.obd.domain.Vehicle;

/**
 * 车辆信息Service接口
 * 
 * @author ruoyi
 * @date 2025-03-27
 */
public interface IVehicleService 
{
    /**
     * 查询车辆信息
     * 
     * @param pkId 车辆信息主键
     * @return 车辆信息
     */
    public Vehicle selectVehicleByPkId(Long pkId);

    /**
     * 查询车辆信息列表
     * 
     * @param vehicle 车辆信息
     * @return 车辆信息集合
     */
    public List<Vehicle> selectVehicleList(Vehicle vehicle);

    /**
     * 新增车辆信息
     * 
     * @param vehicle 车辆信息
     * @return 结果
     */
    public int insertVehicle(Vehicle vehicle);

    /**
     * 修改车辆信息
     * 
     * @param vehicle 车辆信息
     * @return 结果
     */
    public int updateVehicle(Vehicle vehicle);

    /**
     * 批量删除车辆信息
     * 
     * @param pkIds 需要删除的车辆信息主键集合
     * @return 结果
     */
    public int deleteVehicleByPkIds(Long[] pkIds);

    /**
     * 删除车辆信息信息
     * 
     * @param pkId 车辆信息主键
     * @return 结果
     */
    public int deleteVehicleByPkId(Long pkId);
}
