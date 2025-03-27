package com.ruoyi.obd.mapper;

import java.util.List;
import com.ruoyi.obd.domain.Vehicle;

/**
 * 车辆信息Mapper接口
 * 
 * @author ruoyi
 * @date 2025-03-27
 */
public interface VehicleMapper 
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
     * 删除车辆信息
     * 
     * @param pkId 车辆信息主键
     * @return 结果
     */
    public int deleteVehicleByPkId(Long pkId);

    /**
     * 批量删除车辆信息
     * 
     * @param pkIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteVehicleByPkIds(Long[] pkIds);
}
