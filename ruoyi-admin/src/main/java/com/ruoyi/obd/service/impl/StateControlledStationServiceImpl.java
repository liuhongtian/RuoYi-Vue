package com.ruoyi.obd.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.obd.mapper.StateControlledStationMapper;
import com.ruoyi.obd.domain.StateControlledStation;
import com.ruoyi.obd.service.IStateControlledStationService;

/**
 * 国控站点Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-03-31
 */
@Service
public class StateControlledStationServiceImpl implements IStateControlledStationService 
{
    @Autowired
    private StateControlledStationMapper stateControlledStationMapper;

    /**
     * 查询国控站点
     * 
     * @param pkId 国控站点主键
     * @return 国控站点
     */
    @Override
    public StateControlledStation selectStateControlledStationByPkId(Long pkId)
    {
        return stateControlledStationMapper.selectStateControlledStationByPkId(pkId);
    }

    /**
     * 查询国控站点列表
     * 
     * @param stateControlledStation 国控站点
     * @return 国控站点
     */
    @Override
    public List<StateControlledStation> selectStateControlledStationList(StateControlledStation stateControlledStation)
    {
        return stateControlledStationMapper.selectStateControlledStationList(stateControlledStation);
    }

    /**
     * 新增国控站点
     * 
     * @param stateControlledStation 国控站点
     * @return 结果
     */
    @Override
    public int insertStateControlledStation(StateControlledStation stateControlledStation)
    {
        return stateControlledStationMapper.insertStateControlledStation(stateControlledStation);
    }

    /**
     * 修改国控站点
     * 
     * @param stateControlledStation 国控站点
     * @return 结果
     */
    @Override
    public int updateStateControlledStation(StateControlledStation stateControlledStation)
    {
        return stateControlledStationMapper.updateStateControlledStation(stateControlledStation);
    }

    /**
     * 批量删除国控站点
     * 
     * @param pkIds 需要删除的国控站点主键
     * @return 结果
     */
    @Override
    public int deleteStateControlledStationByPkIds(Long[] pkIds)
    {
        return stateControlledStationMapper.deleteStateControlledStationByPkIds(pkIds);
    }

    /**
     * 删除国控站点信息
     * 
     * @param pkId 国控站点主键
     * @return 结果
     */
    @Override
    public int deleteStateControlledStationByPkId(Long pkId)
    {
        return stateControlledStationMapper.deleteStateControlledStationByPkId(pkId);
    }
}
