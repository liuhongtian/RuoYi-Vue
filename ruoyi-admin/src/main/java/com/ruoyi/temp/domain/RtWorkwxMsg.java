package com.ruoyi.temp.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 待发送消息对象 RT_WORKWX_MSG
 * 
 * @author ruoyi
 * @date 2025-04-08
 */
public class RtWorkwxMsg extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long pkId;

    /** 消息接收人 */
    @Excel(name = "消息接收人")
    private String recvUser;

    /** 接收人系统帐号 */
    @Excel(name = "接收人系统帐号")
    private String ruoyiUser;

    /** 消息内容 */
    @Excel(name = "消息内容")
    private String messageContent;

    /** 消息类型 */
    private String messageType;

    /** 发送时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "发送时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date sendTime;

    /** 处理状态 */
    @Excel(name = "处理状态")
    private Long operateStatus;

    /** 发送状态 */
    @Excel(name = "发送状态")
    private Long errcode;

    /** 错误信息 */
    @Excel(name = "错误信息")
    private String errmsg;

    /** 消息ID */
    @Excel(name = "消息ID")
    private String msgid;

    public void setPkId(Long pkId) 
    {
        this.pkId = pkId;
    }

    public Long getPkId() 
    {
        return pkId;
    }

    public void setRecvUser(String recvUser) 
    {
        this.recvUser = recvUser;
    }

    public String getRecvUser() 
    {
        return recvUser;
    }

    public void setRuoyiUser(String ruoyiUser) 
    {
        this.ruoyiUser = ruoyiUser;
    }

    public String getRuoyiUser() 
    {
        return ruoyiUser;
    }

    public void setMessageContent(String messageContent) 
    {
        this.messageContent = messageContent;
    }

    public String getMessageContent() 
    {
        return messageContent;
    }

    public void setMessageType(String messageType) 
    {
        this.messageType = messageType;
    }

    public String getMessageType() 
    {
        return messageType;
    }

    public void setSendTime(Date sendTime) 
    {
        this.sendTime = sendTime;
    }

    public Date getSendTime() 
    {
        return sendTime;
    }

    public void setOperateStatus(Long operateStatus) 
    {
        this.operateStatus = operateStatus;
    }

    public Long getOperateStatus() 
    {
        return operateStatus;
    }

    public void setErrcode(Long errcode) 
    {
        this.errcode = errcode;
    }

    public Long getErrcode() 
    {
        return errcode;
    }

    public void setErrmsg(String errmsg) 
    {
        this.errmsg = errmsg;
    }

    public String getErrmsg() 
    {
        return errmsg;
    }

    public void setMsgid(String msgid) 
    {
        this.msgid = msgid;
    }

    public String getMsgid() 
    {
        return msgid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("pkId", getPkId())
            .append("recvUser", getRecvUser())
            .append("ruoyiUser", getRuoyiUser())
            .append("messageContent", getMessageContent())
            .append("messageType", getMessageType())
            .append("createTime", getCreateTime())
            .append("sendTime", getSendTime())
            .append("operateStatus", getOperateStatus())
            .append("errcode", getErrcode())
            .append("errmsg", getErrmsg())
            .append("msgid", getMsgid())
            .toString();
    }
}
