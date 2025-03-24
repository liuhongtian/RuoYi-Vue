package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 水样采样任务对象 water_sample_task
 * 
 * @author ruoyi
 * @date 2025-03-24
 */
public class WaterSampleTask extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long pkId;

    /** 任务编码 */
    @Excel(name = "任务编码")
    private String taskCode;

    /** 任务名称 */
    @Excel(name = "任务名称")
    private String taskName;

    /** 运维人员 */
    @Excel(name = "运维人员")
    private String operator;

    /** 调度时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "调度时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date scheduleTime;

    /** 开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startTime;

    /** 结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date finishTime;

    /** 任务状态 */
    @Excel(name = "任务状态")
    private Long taskStatus;

    public void setPkId(Long pkId) 
    {
        this.pkId = pkId;
    }

    public Long getPkId() 
    {
        return pkId;
    }

    public void setTaskCode(String taskCode) 
    {
        this.taskCode = taskCode;
    }

    public String getTaskCode() 
    {
        return taskCode;
    }

    public void setTaskName(String taskName) 
    {
        this.taskName = taskName;
    }

    public String getTaskName() 
    {
        return taskName;
    }

    public void setOperator(String operator) 
    {
        this.operator = operator;
    }

    public String getOperator() 
    {
        return operator;
    }

    public void setScheduleTime(Date scheduleTime) 
    {
        this.scheduleTime = scheduleTime;
    }

    public Date getScheduleTime() 
    {
        return scheduleTime;
    }

    public void setStartTime(Date startTime) 
    {
        this.startTime = startTime;
    }

    public Date getStartTime() 
    {
        return startTime;
    }

    public void setFinishTime(Date finishTime) 
    {
        this.finishTime = finishTime;
    }

    public Date getFinishTime() 
    {
        return finishTime;
    }

    public void setTaskStatus(Long taskStatus) 
    {
        this.taskStatus = taskStatus;
    }

    public Long getTaskStatus() 
    {
        return taskStatus;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("pkId", getPkId())
            .append("taskCode", getTaskCode())
            .append("taskName", getTaskName())
            .append("operator", getOperator())
            .append("createTime", getCreateTime())
            .append("scheduleTime", getScheduleTime())
            .append("startTime", getStartTime())
            .append("finishTime", getFinishTime())
            .append("taskStatus", getTaskStatus())
            .toString();
    }
}
