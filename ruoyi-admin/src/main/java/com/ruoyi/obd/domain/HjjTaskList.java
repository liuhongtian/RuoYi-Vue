package com.ruoyi.obd.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 水样采样跟踪对象 Hjj_Task_List
 * 
 * @author ruoyi
 * @date 2025-03-27
 */
public class HjjTaskList extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long pkId;

    /** 任务编号 */
    @Excel(name = "任务编号")
    private String taskNo;

    /** 日期 */
    @Excel(name = "日期")
    private String taskDate;

    /** 断面/站点编码 */
    @Excel(name = "断面/站点编码")
    private String sectionCode;

    /** 断面/站点名称 */
    @Excel(name = "断面/站点名称")
    private String sectionName;

    /** 状态 */
    @Excel(name = "状态")
    private String status;

    /** 任务内容 */
    private String taskContent;

    /** 运维公司 */
    @Excel(name = "运维公司")
    private String companyCode;

    /** 组长 */
    @Excel(name = "组长")
    private String teamLeader;

    /** 组员 */
    @Excel(name = "组员")
    private String teamMembers;

    /** 采样车辆牌照 */
    @Excel(name = "采样车辆牌照")
    private String vehicleLicence;

    /** 出发地点 */
    @Excel(name = "出发地点")
    private String cfPlace;

    /** 出发时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "出发时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date cfTime;

    /** 到达距离 */
    @Excel(name = "到达距离")
    private BigDecimal arrivalDistance;

    /** 计划路途时长 */
    @Excel(name = "计划路途时长")
    private BigDecimal plannedTravelDuration;

    /** 计划作业时长 */
    @Excel(name = "计划作业时长")
    private BigDecimal plannedWorkDuration;

    /** 预计开始作业时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "预计开始作业时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date plannedStartTime;

    /** 预计完成作业时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "预计完成作业时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date plannedEndTime;

    /** 送样交接地点 */
    @Excel(name = "送样交接地点")
    private String syPlace;

    /** 预计送样交接时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "预计送样交接时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date plannedSyTime;

    /** 排程时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "排程时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date apsTime;

    /** 确认时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "确认时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date confirmTime;

    /** 确认人员 */
    @Excel(name = "确认人员")
    private String confirmUser;

    /** 审核时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "审核时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date auditTime;

    /** 审核人员 */
    @Excel(name = "审核人员")
    private String auditUser;

    /** 下达时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "下达时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date releaseTime;

    /** 下达人员 */
    @Excel(name = "下达人员")
    private String releaseUser;

    /** 送样测站 */
    @Excel(name = "送样测站")
    private String testStation;

    /** 采样打卡时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "采样打卡时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date clockIn;

    /** 采样工单编号 */
    @Excel(name = "采样工单编号")
    private String cyTaskNo;

    /** 样品封箱时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "样品封箱时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date ypfxTime;

    /** 实际送样交接时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "实际送样交接时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date actualSyTime;

    /** 运输人员 */
    @Excel(name = "运输人员")
    private String transportUser;

    /** 运输车辆牌照 */
    @Excel(name = "运输车辆牌照")
    private String transportLicence;

    /** 运输工单编号 */
    @Excel(name = "运输工单编号")
    private String transportTaskNo;

    /** 预计到达测站时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "预计到达测站时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date plannedTestStationTime;

    /** 实际到达测站时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "实际到达测站时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date actualTestStationTime;

    /** 样品测试结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "样品测试结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date testResultTime;

    /** 测站工单编号 */
    @Excel(name = "测站工单编号")
    private String testTaskNo;

    /** 测样结果 */
    @Excel(name = "测样结果")
    private String testResult;

    /** 任务状态 */
    @Excel(name = "任务状态")
    private String cyTaskStatus;

    /** 工作流 */
    @Excel(name = "工作流")
    private Long docId;

    /** 卡片ID */
    @Excel(name = "Wekan卡片ID")
    private String wekanCardId;

    public void setPkId(Long pkId) 
    {
        this.pkId = pkId;
    }

    public Long getPkId() 
    {
        return pkId;
    }

    public void setTaskNo(String taskNo) 
    {
        this.taskNo = taskNo;
    }

    public String getTaskNo() 
    {
        return taskNo;
    }

    public void setTaskDate(String taskDate) 
    {
        this.taskDate = taskDate;
    }

    public String getTaskDate() 
    {
        return taskDate;
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

    public void setTaskContent(String taskContent) 
    {
        this.taskContent = taskContent;
    }

    public String getTaskContent() 
    {
        return taskContent;
    }

    public void setCompanyCode(String companyCode) 
    {
        this.companyCode = companyCode;
    }

    public String getCompanyCode() 
    {
        return companyCode;
    }

    public void setTeamLeader(String teamLeader) 
    {
        this.teamLeader = teamLeader;
    }

    public String getTeamLeader() 
    {
        return teamLeader;
    }

    public void setTeamMembers(String teamMembers) 
    {
        this.teamMembers = teamMembers;
    }

    public String getTeamMembers() 
    {
        return teamMembers;
    }

    public void setVehicleLicence(String vehicleLicence) 
    {
        this.vehicleLicence = vehicleLicence;
    }

    public String getVehicleLicence() 
    {
        return vehicleLicence;
    }

    public void setCfPlace(String cfPlace) 
    {
        this.cfPlace = cfPlace;
    }

    public String getCfPlace() 
    {
        return cfPlace;
    }

    public void setCfTime(Date cfTime) 
    {
        this.cfTime = cfTime;
    }

    public Date getCfTime() 
    {
        return cfTime;
    }

    public void setArrivalDistance(BigDecimal arrivalDistance) 
    {
        this.arrivalDistance = arrivalDistance;
    }

    public BigDecimal getArrivalDistance() 
    {
        return arrivalDistance;
    }

    public void setPlannedTravelDuration(BigDecimal plannedTravelDuration) 
    {
        this.plannedTravelDuration = plannedTravelDuration;
    }

    public BigDecimal getPlannedTravelDuration() 
    {
        return plannedTravelDuration;
    }

    public void setPlannedWorkDuration(BigDecimal plannedWorkDuration) 
    {
        this.plannedWorkDuration = plannedWorkDuration;
    }

    public BigDecimal getPlannedWorkDuration() 
    {
        return plannedWorkDuration;
    }

    public void setPlannedStartTime(Date plannedStartTime) 
    {
        this.plannedStartTime = plannedStartTime;
    }

    public Date getPlannedStartTime() 
    {
        return plannedStartTime;
    }

    public void setPlannedEndTime(Date plannedEndTime) 
    {
        this.plannedEndTime = plannedEndTime;
    }

    public Date getPlannedEndTime() 
    {
        return plannedEndTime;
    }

    public void setSyPlace(String syPlace) 
    {
        this.syPlace = syPlace;
    }

    public String getSyPlace() 
    {
        return syPlace;
    }

    public void setPlannedSyTime(Date plannedSyTime) 
    {
        this.plannedSyTime = plannedSyTime;
    }

    public Date getPlannedSyTime() 
    {
        return plannedSyTime;
    }

    public void setApsTime(Date apsTime) 
    {
        this.apsTime = apsTime;
    }

    public Date getApsTime() 
    {
        return apsTime;
    }

    public void setConfirmTime(Date confirmTime) 
    {
        this.confirmTime = confirmTime;
    }

    public Date getConfirmTime() 
    {
        return confirmTime;
    }

    public void setConfirmUser(String confirmUser) 
    {
        this.confirmUser = confirmUser;
    }

    public String getConfirmUser() 
    {
        return confirmUser;
    }

    public void setAuditTime(Date auditTime) 
    {
        this.auditTime = auditTime;
    }

    public Date getAuditTime() 
    {
        return auditTime;
    }

    public void setAuditUser(String auditUser) 
    {
        this.auditUser = auditUser;
    }

    public String getAuditUser() 
    {
        return auditUser;
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

    public void setTestStation(String testStation) 
    {
        this.testStation = testStation;
    }

    public String getTestStation() 
    {
        return testStation;
    }

    public void setClockIn(Date clockIn) 
    {
        this.clockIn = clockIn;
    }

    public Date getClockIn() 
    {
        return clockIn;
    }

    public void setCyTaskNo(String cyTaskNo) 
    {
        this.cyTaskNo = cyTaskNo;
    }

    public String getCyTaskNo() 
    {
        return cyTaskNo;
    }

    public void setYpfxTime(Date ypfxTime) 
    {
        this.ypfxTime = ypfxTime;
    }

    public Date getYpfxTime() 
    {
        return ypfxTime;
    }

    public void setActualSyTime(Date actualSyTime) 
    {
        this.actualSyTime = actualSyTime;
    }

    public Date getActualSyTime() 
    {
        return actualSyTime;
    }

    public void setTransportUser(String transportUser) 
    {
        this.transportUser = transportUser;
    }

    public String getTransportUser() 
    {
        return transportUser;
    }

    public void setTransportLicence(String transportLicence) 
    {
        this.transportLicence = transportLicence;
    }

    public String getTransportLicence() 
    {
        return transportLicence;
    }

    public void setTransportTaskNo(String transportTaskNo) 
    {
        this.transportTaskNo = transportTaskNo;
    }

    public String getTransportTaskNo() 
    {
        return transportTaskNo;
    }

    public void setPlannedTestStationTime(Date plannedTestStationTime) 
    {
        this.plannedTestStationTime = plannedTestStationTime;
    }

    public Date getPlannedTestStationTime() 
    {
        return plannedTestStationTime;
    }

    public void setActualTestStationTime(Date actualTestStationTime) 
    {
        this.actualTestStationTime = actualTestStationTime;
    }

    public Date getActualTestStationTime() 
    {
        return actualTestStationTime;
    }

    public void setTestResultTime(Date testResultTime) 
    {
        this.testResultTime = testResultTime;
    }

    public Date getTestResultTime() 
    {
        return testResultTime;
    }

    public void setTestTaskNo(String testTaskNo) 
    {
        this.testTaskNo = testTaskNo;
    }

    public String getTestTaskNo() 
    {
        return testTaskNo;
    }

    public void setTestResult(String testResult) 
    {
        this.testResult = testResult;
    }

    public String getTestResult() 
    {
        return testResult;
    }

    public void setCyTaskStatus(String cyTaskStatus) 
    {
        this.cyTaskStatus = cyTaskStatus;
    }

    public String getCyTaskStatus() 
    {
        return cyTaskStatus;
    }

    public void setDocId(Long docId) 
    {
        this.docId = docId;
    }

    public Long getDocId() 
    {
        return docId;
    }

    public void setWekanCardId(String wekanCardId) 
    {
        this.wekanCardId = wekanCardId;
    }

    public String getWekanCardId() 
    {
        return wekanCardId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("pkId", getPkId())
            .append("taskNo", getTaskNo())
            .append("taskDate", getTaskDate())
            .append("sectionCode", getSectionCode())
            .append("sectionName", getSectionName())
            .append("status", getStatus())
            .append("taskContent", getTaskContent())
            .append("companyCode", getCompanyCode())
            .append("teamLeader", getTeamLeader())
            .append("teamMembers", getTeamMembers())
            .append("vehicleLicence", getVehicleLicence())
            .append("cfPlace", getCfPlace())
            .append("cfTime", getCfTime())
            .append("arrivalDistance", getArrivalDistance())
            .append("plannedTravelDuration", getPlannedTravelDuration())
            .append("plannedWorkDuration", getPlannedWorkDuration())
            .append("plannedStartTime", getPlannedStartTime())
            .append("plannedEndTime", getPlannedEndTime())
            .append("syPlace", getSyPlace())
            .append("plannedSyTime", getPlannedSyTime())
            .append("apsTime", getApsTime())
            .append("confirmTime", getConfirmTime())
            .append("confirmUser", getConfirmUser())
            .append("auditTime", getAuditTime())
            .append("auditUser", getAuditUser())
            .append("releaseTime", getReleaseTime())
            .append("releaseUser", getReleaseUser())
            .append("testStation", getTestStation())
            .append("clockIn", getClockIn())
            .append("cyTaskNo", getCyTaskNo())
            .append("ypfxTime", getYpfxTime())
            .append("actualSyTime", getActualSyTime())
            .append("transportUser", getTransportUser())
            .append("transportLicence", getTransportLicence())
            .append("transportTaskNo", getTransportTaskNo())
            .append("plannedTestStationTime", getPlannedTestStationTime())
            .append("actualTestStationTime", getActualTestStationTime())
            .append("testResultTime", getTestResultTime())
            .append("testTaskNo", getTestTaskNo())
            .append("testResult", getTestResult())
            .append("cyTaskStatus", getCyTaskStatus())
            .append("docId", getDocId())
            .append("wekanCardId", getWekanCardId())
            .toString();
    }
}
