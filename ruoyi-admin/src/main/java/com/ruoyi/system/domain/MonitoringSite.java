package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 监测站点对象 monitoring_site
 * 
 * @author ruoyi
 * @date 2025-03-25
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

    /** 经度 */
    @Excel(name = "经度")
    private Double longitude;

    /** 纬度 */
    @Excel(name = "纬度")
    private Double latitude;

    /** 站点编码 */
    @Excel(name = "站点编码")
    private String siteCode;

    /** 地址 */
    @Excel(name = "地址")
    private String address;

    /** 负责人 */
    @Excel(name = "负责人")
    private String manager;

    /** 电话 */
    @Excel(name = "电话")
    private String phone;

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

    public void setLongitude(Double longitude) 
    {
        this.longitude = longitude;
    }

    public Double getLongitude() 
    {
        return longitude;
    }

    public void setLatitude(Double latitude) 
    {
        this.latitude = latitude;
    }

    public Double getLatitude() 
    {
        return latitude;
    }

    public void setSiteCode(String siteCode) 
    {
        this.siteCode = siteCode;
    }

    public String getSiteCode() 
    {
        return siteCode;
    }

    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }

    public void setManager(String manager) 
    {
        this.manager = manager;
    }

    public String getManager() 
    {
        return manager;
    }

    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
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
            .append("longitude", getLongitude())
            .append("latitude", getLatitude())
            .append("siteCode", getSiteCode())
            .append("address", getAddress())
            .append("manager", getManager())
            .append("phone", getPhone())
            .toString();
    }
}
