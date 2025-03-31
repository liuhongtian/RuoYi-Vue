package com.ruoyi.obd.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 距离时间对象 Distance_Time
 * 
 * @author ruoyi
 * @date 2025-03-31
 */
public class DistanceTime extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long pkId;

    /** 出发点名称 */
    @Excel(name = "出发点名称")
    private String departureName;

    /** 出发点经纬度 */
    @Excel(name = "出发点经纬度")
    private String departureLatiLong;

    /** 出发点属性 */
    @Excel(name = "出发点属性")
    private String departureType;

    /** 到达点名称 */
    @Excel(name = "到达点名称")
    private String arriveName;

    /** 到达点经纬度 */
    @Excel(name = "到达点经纬度")
    private String arriveLatiLong;

    /** 到达点属性 */
    @Excel(name = "到达点属性")
    private String arriveType;

    /** 距离 */
    @Excel(name = "距离")
    private Long distance;

    /** 所需时间 */
    @Excel(name = "所需时间")
    private Long timeRequired;

    /** 数据获取时间 */
    @Excel(name = "数据获取时间")
    private String dataTime;

    public void setPkId(Long pkId) 
    {
        this.pkId = pkId;
    }

    public Long getPkId() 
    {
        return pkId;
    }

    public void setDepartureName(String departureName) 
    {
        this.departureName = departureName;
    }

    public String getDepartureName() 
    {
        return departureName;
    }

    public void setDepartureLatiLong(String departureLatiLong) 
    {
        this.departureLatiLong = departureLatiLong;
    }

    public String getDepartureLatiLong() 
    {
        return departureLatiLong;
    }

    public void setDepartureType(String departureType) 
    {
        this.departureType = departureType;
    }

    public String getDepartureType() 
    {
        return departureType;
    }

    public void setArriveName(String arriveName) 
    {
        this.arriveName = arriveName;
    }

    public String getArriveName() 
    {
        return arriveName;
    }

    public void setArriveLatiLong(String arriveLatiLong) 
    {
        this.arriveLatiLong = arriveLatiLong;
    }

    public String getArriveLatiLong() 
    {
        return arriveLatiLong;
    }

    public void setArriveType(String arriveType) 
    {
        this.arriveType = arriveType;
    }

    public String getArriveType() 
    {
        return arriveType;
    }

    public void setDistance(Long distance) 
    {
        this.distance = distance;
    }

    public Long getDistance() 
    {
        return distance;
    }

    public void setTimeRequired(Long timeRequired) 
    {
        this.timeRequired = timeRequired;
    }

    public Long getTimeRequired() 
    {
        return timeRequired;
    }

    public void setDataTime(String dataTime) 
    {
        this.dataTime = dataTime;
    }

    public String getDataTime() 
    {
        return dataTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("pkId", getPkId())
            .append("departureName", getDepartureName())
            .append("departureLatiLong", getDepartureLatiLong())
            .append("departureType", getDepartureType())
            .append("arriveName", getArriveName())
            .append("arriveLatiLong", getArriveLatiLong())
            .append("arriveType", getArriveType())
            .append("distance", getDistance())
            .append("timeRequired", getTimeRequired())
            .append("dataTime", getDataTime())
            .toString();
    }
}
