package com.ruoyi.obd.mapper;

import java.util.List;
import com.ruoyi.obd.domain.DistanceTime;

/**
 * 距离时间Mapper接口
 * 
 * @author ruoyi
 * @date 2025-03-31
 */
public interface DistanceTimeMapper 
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
     * 删除距离时间
     * 
     * @param pkId 距离时间主键
     * @return 结果
     */
    public int deleteDistanceTimeByPkId(Long pkId);

    /**
     * 批量删除距离时间
     * 
     * @param pkIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDistanceTimeByPkIds(Long[] pkIds);
}
