package com.ruoyi.obd.service;

import java.util.List;
import com.ruoyi.obd.domain.StateControlledStation;

/**
 * 国控站点Service接口
 * 
 * @author ruoyi
 * @date 2025-03-31
 */
public interface IStateControlledStationService 
{
    /**
     * 查询国控站点
     * 
     * @param pkId 国控站点主键
     * @return 国控站点
     */
    public StateControlledStation selectStateControlledStationByPkId(Long pkId);

    /**
     * 查询国控站点列表
     * 
     * @param stateControlledStation 国控站点
     * @return 国控站点集合
     */
    public List<StateControlledStation> selectStateControlledStationList(StateControlledStation stateControlledStation);

    /**
     * 新增国控站点
     * 
     * @param stateControlledStation 国控站点
     * @return 结果
     */
    public int insertStateControlledStation(StateControlledStation stateControlledStation);

    /**
     * 修改国控站点
     * 
     * @param stateControlledStation 国控站点
     * @return 结果
     */
    public int updateStateControlledStation(StateControlledStation stateControlledStation);

    /**
     * 批量删除国控站点
     * 
     * @param pkIds 需要删除的国控站点主键集合
     * @return 结果
     */
    public int deleteStateControlledStationByPkIds(Long[] pkIds);

    /**
     * 删除国控站点信息
     * 
     * @param pkId 国控站点主键
     * @return 结果
     */
    public int deleteStateControlledStationByPkId(Long pkId);
}
