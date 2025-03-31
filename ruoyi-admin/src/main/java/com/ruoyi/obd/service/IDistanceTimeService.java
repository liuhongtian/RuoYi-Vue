package com.ruoyi.obd.service;

import java.util.List;
import com.ruoyi.obd.domain.DistanceTime;

/**
 * 距离时间Service接口
 * 
 * @author ruoyi
 * @date 2025-03-31
 */
public interface IDistanceTimeService 
{
    /**
     * 查询距离时间
     * 
     * @param pkId 距离时间主键
     * @return 距离时间
     */
    public DistanceTime selectDistanceTimeByPkId(Long pkId);

    /**
     * 查询距离时间列表
     * 
     * @param distanceTime 距离时间
     * @return 距离时间集合
     */
    public List<DistanceTime> selectDistanceTimeList(DistanceTime distanceTime);

    /**
     * 新增距离时间
     * 
     * @param distanceTime 距离时间
     * @return 结果
     */
    public int insertDistanceTime(DistanceTime distanceTime);

    /**
     * 修改距离时间
     * 
     * @param distanceTime 距离时间
     * @return 结果
     */
    public int updateDistanceTime(DistanceTime distanceTime);

    /**
     * 批量删除距离时间
     * 
     * @param pkIds 需要删除的距离时间主键集合
     * @return 结果
     */
    public int deleteDistanceTimeByPkIds(Long[] pkIds);

    /**
     * 删除距离时间信息
     * 
     * @param pkId 距离时间主键
     * @return 结果
     */
    public int deleteDistanceTimeByPkId(Long pkId);
}
