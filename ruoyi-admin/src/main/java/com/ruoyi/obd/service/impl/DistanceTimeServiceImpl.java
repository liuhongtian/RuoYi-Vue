package com.ruoyi.obd.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.obd.mapper.DistanceTimeMapper;
import com.ruoyi.obd.domain.DistanceTime;
import com.ruoyi.obd.service.IDistanceTimeService;

/**
 * 距离时间Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-03-31
 */
@Service
public class DistanceTimeServiceImpl implements IDistanceTimeService 
{
    @Autowired
    private DistanceTimeMapper distanceTimeMapper;

    /**
     * 查询距离时间
     * 
     * @param pkId 距离时间主键
     * @return 距离时间
     */
    @Override
    public DistanceTime selectDistanceTimeByPkId(Long pkId)
    {
        return distanceTimeMapper.selectDistanceTimeByPkId(pkId);
    }

    /**
     * 查询距离时间列表
     * 
     * @param distanceTime 距离时间
     * @return 距离时间
     */
    @Override
    public List<DistanceTime> selectDistanceTimeList(DistanceTime distanceTime)
    {
        return distanceTimeMapper.selectDistanceTimeList(distanceTime);
    }

    /**
     * 新增距离时间
     * 
     * @param distanceTime 距离时间
     * @return 结果
     */
    @Override
    public int insertDistanceTime(DistanceTime distanceTime)
    {
        return distanceTimeMapper.insertDistanceTime(distanceTime);
    }

    /**
     * 修改距离时间
     * 
     * @param distanceTime 距离时间
     * @return 结果
     */
    @Override
    public int updateDistanceTime(DistanceTime distanceTime)
    {
        return distanceTimeMapper.updateDistanceTime(distanceTime);
    }

    /**
     * 批量删除距离时间
     * 
     * @param pkIds 需要删除的距离时间主键
     * @return 结果
     */
    @Override
    public int deleteDistanceTimeByPkIds(Long[] pkIds)
    {
        return distanceTimeMapper.deleteDistanceTimeByPkIds(pkIds);
    }

    /**
     * 删除距离时间信息
     * 
     * @param pkId 距离时间主键
     * @return 结果
     */
    @Override
    public int deleteDistanceTimeByPkId(Long pkId)
    {
        return distanceTimeMapper.deleteDistanceTimeByPkId(pkId);
    }
}
