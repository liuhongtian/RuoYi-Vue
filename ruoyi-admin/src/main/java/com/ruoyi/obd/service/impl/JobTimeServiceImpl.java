package com.ruoyi.obd.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.obd.mapper.JobTimeMapper;
import com.ruoyi.obd.domain.JobTime;
import com.ruoyi.obd.service.IJobTimeService;

/**
 * 单项任务作业时间Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-03-31
 */
@Service
public class JobTimeServiceImpl implements IJobTimeService 
{
    @Autowired
    private JobTimeMapper jobTimeMapper;

    /**
     * 查询单项任务作业时间
     * 
     * @param pkId 单项任务作业时间主键
     * @return 单项任务作业时间
     */
    @Override
    public JobTime selectJobTimeByPkId(Long pkId)
    {
        return jobTimeMapper.selectJobTimeByPkId(pkId);
    }

    /**
     * 查询单项任务作业时间列表
     * 
     * @param jobTime 单项任务作业时间
     * @return 单项任务作业时间
     */
    @Override
    public List<JobTime> selectJobTimeList(JobTime jobTime)
    {
        return jobTimeMapper.selectJobTimeList(jobTime);
    }

    /**
     * 新增单项任务作业时间
     * 
     * @param jobTime 单项任务作业时间
     * @return 结果
     */
    @Override
    public int insertJobTime(JobTime jobTime)
    {
        return jobTimeMapper.insertJobTime(jobTime);
    }

    /**
     * 修改单项任务作业时间
     * 
     * @param jobTime 单项任务作业时间
     * @return 结果
     */
    @Override
    public int updateJobTime(JobTime jobTime)
    {
        return jobTimeMapper.updateJobTime(jobTime);
    }

    /**
     * 批量删除单项任务作业时间
     * 
     * @param pkIds 需要删除的单项任务作业时间主键
     * @return 结果
     */
    @Override
    public int deleteJobTimeByPkIds(Long[] pkIds)
    {
        return jobTimeMapper.deleteJobTimeByPkIds(pkIds);
    }

    /**
     * 删除单项任务作业时间信息
     * 
     * @param pkId 单项任务作业时间主键
     * @return 结果
     */
    @Override
    public int deleteJobTimeByPkId(Long pkId)
    {
        return jobTimeMapper.deleteJobTimeByPkId(pkId);
    }
}
