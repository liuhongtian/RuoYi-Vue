package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.WaterSampleTask;

/**
 * 水样采样任务Service接口
 * 
 * @author ruoyi
 * @date 2025-03-24
 */
public interface IWaterSampleTaskService 
{
    /**
     * 查询水样采样任务
     * 
     * @param pkId 水样采样任务主键
     * @return 水样采样任务
     */
    public WaterSampleTask selectWaterSampleTaskByPkId(Long pkId);

    /**
     * 查询水样采样任务列表
     * 
     * @param waterSampleTask 水样采样任务
     * @return 水样采样任务集合
     */
    public List<WaterSampleTask> selectWaterSampleTaskList(WaterSampleTask waterSampleTask);

    /**
     * 新增水样采样任务
     * 
     * @param waterSampleTask 水样采样任务
     * @return 结果
     */
    public int insertWaterSampleTask(WaterSampleTask waterSampleTask);

    /**
     * 修改水样采样任务
     * 
     * @param waterSampleTask 水样采样任务
     * @return 结果
     */
    public int updateWaterSampleTask(WaterSampleTask waterSampleTask);

    /**
     * 批量删除水样采样任务
     * 
     * @param pkIds 需要删除的水样采样任务主键集合
     * @return 结果
     */
    public int deleteWaterSampleTaskByPkIds(Long[] pkIds);

    /**
     * 删除水样采样任务信息
     * 
     * @param pkId 水样采样任务主键
     * @return 结果
     */
    public int deleteWaterSampleTaskByPkId(Long pkId);
}
