package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.WaterSampleTaskMapper;
import com.ruoyi.system.domain.WaterSampleTask;
import com.ruoyi.system.service.IWaterSampleTaskService;

/**
 * 水样采样任务Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-03-24
 */
@Service
public class WaterSampleTaskServiceImpl implements IWaterSampleTaskService 
{
    @Autowired
    private WaterSampleTaskMapper waterSampleTaskMapper;

    /**
     * 查询水样采样任务
     * 
     * @param pkId 水样采样任务主键
     * @return 水样采样任务
     */
    @Override
    public WaterSampleTask selectWaterSampleTaskByPkId(Long pkId)
    {
        return waterSampleTaskMapper.selectWaterSampleTaskByPkId(pkId);
    }

    /**
     * 查询水样采样任务列表
     * 
     * @param waterSampleTask 水样采样任务
     * @return 水样采样任务
     */
    @Override
    public List<WaterSampleTask> selectWaterSampleTaskList(WaterSampleTask waterSampleTask)
    {
        return waterSampleTaskMapper.selectWaterSampleTaskList(waterSampleTask);
    }

    /**
     * 新增水样采样任务
     * 
     * @param waterSampleTask 水样采样任务
     * @return 结果
     */
    @Override
    public int insertWaterSampleTask(WaterSampleTask waterSampleTask)
    {
        waterSampleTask.setCreateTime(DateUtils.getNowDate());
        return waterSampleTaskMapper.insertWaterSampleTask(waterSampleTask);
    }

    /**
     * 修改水样采样任务
     * 
     * @param waterSampleTask 水样采样任务
     * @return 结果
     */
    @Override
    public int updateWaterSampleTask(WaterSampleTask waterSampleTask)
    {
        return waterSampleTaskMapper.updateWaterSampleTask(waterSampleTask);
    }

    /**
     * 批量删除水样采样任务
     * 
     * @param pkIds 需要删除的水样采样任务主键
     * @return 结果
     */
    @Override
    public int deleteWaterSampleTaskByPkIds(Long[] pkIds)
    {
        return waterSampleTaskMapper.deleteWaterSampleTaskByPkIds(pkIds);
    }

    /**
     * 删除水样采样任务信息
     * 
     * @param pkId 水样采样任务主键
     * @return 结果
     */
    @Override
    public int deleteWaterSampleTaskByPkId(Long pkId)
    {
        return waterSampleTaskMapper.deleteWaterSampleTaskByPkId(pkId);
    }
}
