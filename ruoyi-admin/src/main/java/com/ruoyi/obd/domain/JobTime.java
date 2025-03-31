package com.ruoyi.obd.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 单项任务作业时间对象 Job_Time
 * 
 * @author ruoyi
 * @date 2025-03-31
 */
public class JobTime extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long pkId;

    /** 断面/站点 */
    @Excel(name = "断面/站点")
    private String addressCode;

    /** 任务名称 */
    @Excel(name = "任务名称")
    private String jobName;

    /** 预计作业时间 */
    @Excel(name = "预计作业时间")
    private Long estimateDuration;

    /** 维护人 */
    @Excel(name = "维护人")
    private String maintainer;

    /** 维护时间 */
    @Excel(name = "维护时间")
    private String maintainTime;

    public void setPkId(Long pkId) 
    {
        this.pkId = pkId;
    }

    public Long getPkId() 
    {
        return pkId;
    }

    public void setAddressCode(String addressCode) 
    {
        this.addressCode = addressCode;
    }

    public String getAddressCode() 
    {
        return addressCode;
    }

    public void setJobName(String jobName) 
    {
        this.jobName = jobName;
    }

    public String getJobName() 
    {
        return jobName;
    }

    public void setEstimateDuration(Long estimateDuration) 
    {
        this.estimateDuration = estimateDuration;
    }

    public Long getEstimateDuration() 
    {
        return estimateDuration;
    }

    public void setMaintainer(String maintainer) 
    {
        this.maintainer = maintainer;
    }

    public String getMaintainer() 
    {
        return maintainer;
    }

    public void setMaintainTime(String maintainTime) 
    {
        this.maintainTime = maintainTime;
    }

    public String getMaintainTime() 
    {
        return maintainTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("pkId", getPkId())
            .append("addressCode", getAddressCode())
            .append("jobName", getJobName())
            .append("estimateDuration", getEstimateDuration())
            .append("maintainer", getMaintainer())
            .append("maintainTime", getMaintainTime())
            .toString();
    }
}
