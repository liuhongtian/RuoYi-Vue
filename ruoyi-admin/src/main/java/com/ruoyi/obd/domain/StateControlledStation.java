package com.ruoyi.obd.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 国控站点对象 State_Controlled_Station
 * 
 * @author ruoyi
 * @date 2025-03-31
 */
public class StateControlledStation extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long pkId;

    /** 站点编码 */
    @Excel(name = "站点编码")
    private String stationCode;

    /** 站点名称 */
    @Excel(name = "站点名称")
    private String stationName;

    /** 断面 */
    @Excel(name = "断面")
    private String section;

    /** 经度 */
    @Excel(name = "经度")
    private String longitude;

    /** 纬度 */
    @Excel(name = "纬度")
    private String latitude;

    /** 监测项目 */
    @Excel(name = "监测项目")
    private Long monitorItems;

    /** 自动采样频率 */
    @Excel(name = "自动采样频率")
    private String samplingFrequency;

    /** 水质目标等级 */
    @Excel(name = "水质目标等级")
    private Long qualityGrade;

    /** 站点地址 */
    @Excel(name = "站点地址")
    private String address;

    /** 站点状态 */
    @Excel(name = "站点状态")
    private Long status;

    /** 联网情况 */
    @Excel(name = "联网情况")
    private Long onlineStatus;

    /** 一站一策浊度上阈值 */
    @Excel(name = "一站一策浊度上阈值")
    private String higherThreshold;

    /** 一站一策浊度下阈值 */
    @Excel(name = "一站一策浊度下阈值")
    private String lowerThreshold;

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

    public void setSection(String section) 
    {
        this.section = section;
    }

    public String getSection() 
    {
        return section;
    }

    public void setLongitude(String longitude) 
    {
        this.longitude = longitude;
    }

    public String getLongitude() 
    {
        return longitude;
    }

    public void setLatitude(String latitude) 
    {
        this.latitude = latitude;
    }

    public String getLatitude() 
    {
        return latitude;
    }

    public void setMonitorItems(Long monitorItems) 
    {
        this.monitorItems = monitorItems;
    }

    public Long getMonitorItems() 
    {
        return monitorItems;
    }

    public void setSamplingFrequency(String samplingFrequency) 
    {
        this.samplingFrequency = samplingFrequency;
    }

    public String getSamplingFrequency() 
    {
        return samplingFrequency;
    }

    public void setQualityGrade(Long qualityGrade) 
    {
        this.qualityGrade = qualityGrade;
    }

    public Long getQualityGrade() 
    {
        return qualityGrade;
    }

    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }

    public void setStatus(Long status) 
    {
        this.status = status;
    }

    public Long getStatus() 
    {
        return status;
    }

    public void setOnlineStatus(Long onlineStatus) 
    {
        this.onlineStatus = onlineStatus;
    }

    public Long getOnlineStatus() 
    {
        return onlineStatus;
    }

    public void setHigherThreshold(String higherThreshold) 
    {
        this.higherThreshold = higherThreshold;
    }

    public String getHigherThreshold() 
    {
        return higherThreshold;
    }

    public void setLowerThreshold(String lowerThreshold) 
    {
        this.lowerThreshold = lowerThreshold;
    }

    public String getLowerThreshold() 
    {
        return lowerThreshold;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("pkId", getPkId())
            .append("stationCode", getStationCode())
            .append("stationName", getStationName())
            .append("section", getSection())
            .append("longitude", getLongitude())
            .append("latitude", getLatitude())
            .append("monitorItems", getMonitorItems())
            .append("samplingFrequency", getSamplingFrequency())
            .append("qualityGrade", getQualityGrade())
            .append("address", getAddress())
            .append("status", getStatus())
            .append("onlineStatus", getOnlineStatus())
            .append("higherThreshold", getHigherThreshold())
            .append("lowerThreshold", getLowerThreshold())
            .toString();
    }
}
