package com.ruoyi.flowable.domain.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.common.core.domain.entity.SysUser;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * <p>工作流任务<p>
 *
 * @author Tony
 * @date 2021-04-03
 */
@ApiModel("工作流任务相关-返回参数")
public class FlowTaskDto implements Serializable {

    @ApiModelProperty("任务编号")
    private String taskId;

    @ApiModelProperty("任务执行编号")
    private String executionId;

    @ApiModelProperty("任务名称")
    private String taskName;

    @ApiModelProperty("任务Key")
    private String taskDefKey;

    @ApiModelProperty("任务执行人Id")
    private Long assigneeId;

    @ApiModelProperty("部门名称")
    private String deptName;

    @ApiModelProperty("流程发起人部门名称")
    private String startDeptName;

    @ApiModelProperty("任务执行人名称")
    private String assigneeName;
    @ApiModelProperty("任务执行人部门")
    private String assigneeDeptName;;

    @ApiModelProperty("流程发起人Id")
    private String startUserId;

    @ApiModelProperty("流程发起人名称")
    private String startUserName;

    @ApiModelProperty("流程类型")
    private String category;

    @ApiModelProperty("流程变量信息")
    private Object variables;

    @ApiModelProperty("局部变量信息")
    private Object taskLocalVars;

    @ApiModelProperty("流程部署编号")
    private String deployId;

    @ApiModelProperty("流程ID")
    private String procDefId;

    @ApiModelProperty("流程key")
    private String procDefKey;

    @ApiModelProperty("流程定义名称")
    private String procDefName;

    @ApiModelProperty("流程定义内置使用版本")
    private int procDefVersion;

    @ApiModelProperty("流程实例ID")
    private String procInsId;

    @ApiModelProperty("历史流程实例ID")
    private String hisProcInsId;

    @ApiModelProperty("任务耗时")
    private String duration;

    @ApiModelProperty("任务意见")
    private FlowCommentDto comment;

    @ApiModelProperty("候选执行人")
    private String candidate;

    @ApiModelProperty("任务创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    @ApiModelProperty("任务完成时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date finishTime;

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDefKey() {
        return taskDefKey;
    }

    public void setTaskDefKey(String taskDefKey) {
        this.taskDefKey = taskDefKey;
    }

    public Long getAssigneeId() {
        return assigneeId;
    }

    public void setAssigneeId(Long assigneeId) {
        this.assigneeId = assigneeId;
    }

    public String getAssigneeName() {
        return assigneeName;
    }

    public void setAssigneeName(String assigneeName) {
        this.assigneeName = assigneeName;
    }

    public String getStartUserId() {
        return startUserId;
    }

    public void setStartUserId(String startUserId) {
        this.startUserId = startUserId;
    }

    public String getStartUserName() {
        return startUserName;
    }

    public void setStartUserName(String startUserName) {
        this.startUserName = startUserName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Object getVariables() {
        return variables;
    }

    public void setVariables(Object variables) {
        this.variables = variables;
    }

    public Object getTaskLocalVars() {
        return taskLocalVars;
    }

    public void setTaskLocalVars(Object taskLocalVars) {
        this.taskLocalVars = taskLocalVars;
    }

    public String getDeployId() {
        return deployId;
    }

    public void setDeployId(String deployId) {
        this.deployId = deployId;
    }

    public String getProcDefId() {
        return procDefId;
    }

    public void setProcDefId(String procDefId) {
        this.procDefId = procDefId;
    }

    public String getProcDefKey() {
        return procDefKey;
    }

    public void setProcDefKey(String procDefKey) {
        this.procDefKey = procDefKey;
    }

    public String getProcDefName() {
        return procDefName;
    }

    public void setProcDefName(String procDefName) {
        this.procDefName = procDefName;
    }

    public int getProcDefVersion() {
        return procDefVersion;
    }

    public void setProcDefVersion(int procDefVersion) {
        this.procDefVersion = procDefVersion;
    }

    public String getProcInsId() {
        return procInsId;
    }

    public void setProcInsId(String procInsId) {
        this.procInsId = procInsId;
    }

    public String getHisProcInsId() {
        return hisProcInsId;
    }

    public void setHisProcInsId(String hisProcInsId) {
        this.hisProcInsId = hisProcInsId;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public FlowCommentDto getComment() {
        return comment;
    }

    public void setComment(FlowCommentDto comment) {
        this.comment = comment;
    }

    public String getCandidate() {
        return candidate;
    }

    public void setCandidate(String candidate) {
        this.candidate = candidate;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getAssigneeDeptName() {
        return assigneeDeptName;
    }

    public void setAssigneeDeptName(String assigneeDeptName) {
        this.assigneeDeptName = assigneeDeptName;
    }

    public String getStartDeptName() {
        return startDeptName;
    }

    public void setStartDeptName(String startDeptName) {
        this.startDeptName = startDeptName;
    }

    public String getExecutionId() {
        return executionId;
    }

    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

}
