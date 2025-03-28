package com.ruoyi.kanbanview.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * Wekan WebHook日志查看对象 wekan_webhook_log
 * 
 * @author ruoyi
 * @date 2025-03-28
 */
public class WekanWebhookLogView extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 日志ID */
    @Excel(name = "日志ID")
    private Long id;

    /** 通知类型 */
    @Excel(name = "通知类型")
    private String type;

    /** 通知内容 */
    @Excel(name = "通知内容")
    private String payload;

    /** 处理状态 */
    @Excel(name = "处理状态")
    private String status;

    /** 错误信息 */
    @Excel(name = "错误信息")
    private String errorMsg;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setType(String type) 
    {
        this.type = type;
    }

    public String getType() 
    {
        return type;
    }

    public void setPayload(String payload) 
    {
        this.payload = payload;
    }

    public String getPayload() 
    {
        return payload;
    }

    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }

    public void setErrorMsg(String errorMsg) 
    {
        this.errorMsg = errorMsg;
    }

    public String getErrorMsg() 
    {
        return errorMsg;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("type", getType())
            .append("payload", getPayload())
            .append("status", getStatus())
            .append("errorMsg", getErrorMsg())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
