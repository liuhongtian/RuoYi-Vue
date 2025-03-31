package com.ruoyi.obd.service;

import java.util.List;
import com.ruoyi.obd.domain.JobTime;

/**
 * 单项任务作业时间Service接口
 * 
 * @author ruoyi
 * @date 2025-03-31
 */
public interface IJobTimeService 
{
    /**
     * 查询单项任务作业时间
     * 
     * @param pkId 单项任务作业时间主键
     * @return 单项任务作业时间
     */
    public JobTime selectJobTimeByPkId(Long pkId);

    /**
     * 查询单项任务作业时间列表
     * 
     * @param jobTime 单项任务作业时间
     * @return 单项任务作业时间集合
     */
    public List<JobTime> selectJobTimeList(JobTime jobTime);

    /**
     * 新增单项任务作业时间
     * 
     * @param jobTime 单项任务作业时间
     * @return 结果
     */
    public int insertJobTime(JobTime jobTime);

    /**
     * 修改单项任务作业时间
     * 
     * @param jobTime 单项任务作业时间
     * @return 结果
     */
    public int updateJobTime(JobTime jobTime);

    /**
     * 批量删除单项任务作业时间
     * 
     * @param pkIds 需要删除的单项任务作业时间主键集合
     * @return 结果
     */
    public int deleteJobTimeByPkIds(Long[] pkIds);

    /**
     * 删除单项任务作业时间信息
     * 
     * @param pkId 单项任务作业时间主键
     * @return 结果
     */
    public int deleteJobTimeByPkId(Long pkId);
}
