package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 监测站点对象 monitoring_site
 * 
 * @author ruoyi
 * @date 2025-03-24
 */
public class MonitoringSite extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long siteId;

    /** 监测站名称 */
    @Excel(name = "监测站名称")
    private String siteName;

    /** 监测站类型 */
    @Excel(name = "监测站类型")
    private String siteType;

    /** 状态（0正常 1停用） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=停用")
    private String status;

    public void setSiteId(Long siteId) 
    {
        this.siteId = siteId;
    }

    public Long getSiteId() 
    {
        return siteId;
    }

    public void setSiteName(String siteName) 
    {
        this.siteName = siteName;
    }

    public String getSiteName() 
    {
        return siteName;
    }

    public void setSiteType(String siteType) 
    {
        this.siteType = siteType;
    }

    public String getSiteType() 
    {
        return siteType;
    }

    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("siteId", getSiteId())
            .append("siteName", getSiteName())
            .append("siteType", getSiteType())
            .append("status", getStatus())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
