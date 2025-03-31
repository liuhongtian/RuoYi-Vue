package com.ruoyi.obd.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 测站对象 Monitor_Station
 * 
 * @author ruoyi
 * @date 2025-03-31
 */
public class MonitorStation extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long pkId;

    /** 测站编码 */
    @Excel(name = "测站编码")
    private String stationCode;

    /** 测站名称 */
    @Excel(name = "测站名称")
    private String stationName;

    /** 所属省份 */
    @Excel(name = "所属省份")
    private String province;

    /** 测站地址 */
    @Excel(name = "测站地址")
    private String address;

    /** 经度 */
    @Excel(name = "经度")
    private BigDecimal longitude;

    /** 纬度 */
    @Excel(name = "纬度")
    private BigDecimal latitude;

    /** 分析能力 */
    @Excel(name = "分析能力")
    private String analyticalSkills;

    /** 每月可接样量 */
    @Excel(name = "每月可接样量")
    private Long acceptableCapacity;

    /** 可接样时间 */
    @Excel(name = "可接样时间")
    private String acceptableDays;

    /** 测站状态 */
    @Excel(name = "测站状态")
    private String status;

    public void setPkId(Long pkId) 
    {
        this.pkId = pkId;
    }

    public Long getPkId() 
    {
        return pkId;
    }

    public void setStationCode(String stationCode) 
    {
        this.stationCode = stationCode;
    }

    public String getStationCode() 
    {
        return stationCode;
    }

    public void setStationName(String stationName) 
    {
        this.stationName = stationName;
    }

    public String getStationName() 
    {
        return stationName;
    }

    public void setProvince(String province) 
    {
        this.province = province;
    }

    public String getProvince() 
    {
        return province;
    }

    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }

    public void setLongitude(BigDecimal longitude) 
    {
        this.longitude = longitude;
    }

    public BigDecimal getLongitude() 
    {
        return longitude;
    }

    public void setLatitude(BigDecimal latitude) 
    {
        this.latitude = latitude;
    }

    public BigDecimal getLatitude() 
    {
        return latitude;
    }

    public void setAnalyticalSkills(String analyticalSkills) 
    {
        this.analyticalSkills = analyticalSkills;
    }

    public String getAnalyticalSkills() 
    {
        return analyticalSkills;
    }

    public void setAcceptableCapacity(Long acceptableCapacity) 
    {
        this.acceptableCapacity = acceptableCapacity;
    }

    public Long getAcceptableCapacity() 
    {
        return acceptableCapacity;
    }

    public void setAcceptableDays(String acceptableDays) 
    {
        this.acceptableDays = acceptableDays;
    }

    public String getAcceptableDays() 
    {
        return acceptableDays;
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
            .append("pkId", getPkId())
            .append("stationCode", getStationCode())
            .append("stationName", getStationName())
            .append("province", getProvince())
            .append("address", getAddress())
            .append("longitude", getLongitude())
            .append("latitude", getLatitude())
            .append("analyticalSkills", getAnalyticalSkills())
            .append("acceptableCapacity", getAcceptableCapacity())
            .append("acceptableDays", getAcceptableDays())
            .append("status", getStatus())
            .toString();
    }
}
