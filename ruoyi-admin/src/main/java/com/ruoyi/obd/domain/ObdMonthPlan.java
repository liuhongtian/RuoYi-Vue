package com.ruoyi.obd.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 月度计划跟踪对象 Obd_Month_Plan
 * 
 * @author ruoyi
 * @date 2025-03-27
 */
public class ObdMonthPlan extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long pkId;

    /** 计划编码 */
    @Excel(name = "计划编码")
    private String planNo;

    /** 月份 */
    @Excel(name = "月份")
    private String planMonth;

    /** 季度 */
    @Excel(name = "季度")
    private String planQuarter;

    /** 月度标识 */
    @Excel(name = "月度标识")
    private String monthFlag;

    /** 计划来源 */
    @Excel(name = "计划来源")
    private String planResource;

    /** 断面/站点编码 */
    @Excel(name = "断面/站点编码")
    private String sectionCode;

    /** 断面/站点名称 */
    @Excel(name = "断面/站点名称")
    private String sectionName;

    /** 确认状态 */
    @Excel(name = "确认状态")
    private String status;

    /** 开始日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "开始日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startDate;

    /** 结束日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "结束日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endDate;

    /** 任务内容 */
    @Excel(name = "任务内容")
    private String taskContent;

    /** 生成时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "生成时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date releaseTime;

    /** 生成人员 */
    @Excel(name = "生成人员")
    private String releaseUser;

    /** 关联日任务 */
    @Excel(name = "关联日任务")
    private String taskNo;

    /** 执行情况 */
    @Excel(name = "执行情况")
    private String executionStatus;

    /** 执行情况说明 */
    @Excel(name = "执行情况说明")
    private String executionDesc;

    public void setPkId(Long pkId) 
    {
        this.pkId = pkId;
    }

    public Long getPkId() 
    {
        return pkId;
    }

    public void setPlanNo(String planNo) 
    {
        this.planNo = planNo;
    }

    public String getPlanNo() 
    {
        return planNo;
    }

    public void setPlanMonth(String planMonth) 
    {
        this.planMonth = planMonth;
    }

    public String getPlanMonth() 
    {
        return planMonth;
    }

    public void setPlanQuarter(String planQuarter) 
    {
        this.planQuarter = planQuarter;
    }

    public String getPlanQuarter() 
    {
        return planQuarter;
    }

    public void setMonthFlag(String monthFlag) 
    {
        this.monthFlag = monthFlag;
    }

    public String getMonthFlag() 
    {
        return monthFlag;
    }

    public void setPlanResource(String planResource) 
    {
        this.planResource = planResource;
    }

    public String getPlanResource() 
    {
        return planResource;
    }

    public void setSectionCode(String sectionCode) 
    {
        this.sectionCode = sectionCode;
    }

    public String getSectionCode() 
    {
        return sectionCode;
    }

    public void setSectionName(String sectionName) 
    {
        this.sectionName = sectionName;
    }

    public String getSectionName() 
    {
        return sectionName;
    }

    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }

    public void setStartDate(Date startDate) 
    {
        this.startDate = startDate;
    }

    public Date getStartDate() 
    {
        return startDate;
    }

    public void setEndDate(Date endDate) 
    {
        this.endDate = endDate;
    }

    public Date getEndDate() 
    {
        return endDate;
    }

    public void setTaskContent(String taskContent) 
    {
        this.taskContent = taskContent;
    }

    public String getTaskContent() 
    {
        return taskContent;
    }

    public void setReleaseTime(Date releaseTime) 
    {
        this.releaseTime = releaseTime;
    }

    public Date getReleaseTime() 
    {
        return releaseTime;
    }

    public void setReleaseUser(String releaseUser) 
    {
        this.releaseUser = releaseUser;
    }

    public String getReleaseUser() 
    {
        return releaseUser;
    }

    public void setTaskNo(String taskNo) 
    {
        this.taskNo = taskNo;
    }

    public String getTaskNo() 
    {
        return taskNo;
    }

    public void setExecutionStatus(String executionStatus) 
    {
        this.executionStatus = executionStatus;
    }

    public String getExecutionStatus() 
    {
        return executionStatus;
    }

    public void setExecutionDesc(String executionDesc) 
    {
        this.executionDesc = executionDesc;
    }

    public String getExecutionDesc() 
    {
        return executionDesc;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("pkId", getPkId())
            .append("planNo", getPlanNo())
            .append("planMonth", getPlanMonth())
            .append("planQuarter", getPlanQuarter())
            .append("monthFlag", getMonthFlag())
            .append("planResource", getPlanResource())
            .append("sectionCode", getSectionCode())
            .append("sectionName", getSectionName())
            .append("status", getStatus())
            .append("startDate", getStartDate())
            .append("endDate", getEndDate())
            .append("taskContent", getTaskContent())
            .append("releaseTime", getReleaseTime())
            .append("releaseUser", getReleaseUser())
            .append("taskNo", getTaskNo())
            .append("executionStatus", getExecutionStatus())
            .append("executionDesc", getExecutionDesc())
            .toString();
    }
}
