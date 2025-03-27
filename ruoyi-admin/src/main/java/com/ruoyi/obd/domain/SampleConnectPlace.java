package com.ruoyi.obd.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 样品交接点对象 Sample_Connect_Place
 * 
 * @author ruoyi
 * @date 2025-03-27
 */
public class SampleConnectPlace extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long pkId;

    /** 交接点编码 */
    @Excel(name = "交接点编码")
    private String placeCode;

    /** 交接点名称 */
    @Excel(name = "交接点名称")
    private String placeName;

    /** 经度 */
    @Excel(name = "经度")
    private Double longitude;

    /** 纬度 */
    @Excel(name = "纬度")
    private Double latitude;

    public void setPkId(Long pkId) 
    {
        this.pkId = pkId;
    }

    public Long getPkId() 
    {
        return pkId;
    }

    public void setPlaceCode(String placeCode) 
    {
        this.placeCode = placeCode;
    }

    public String getPlaceCode() 
    {
        return placeCode;
    }

    public void setPlaceName(String placeName) 
    {
        this.placeName = placeName;
    }

    public String getPlaceName() 
    {
        return placeName;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("pkId", getPkId())
            .append("placeCode", getPlaceCode())
            .append("placeName", getPlaceName())
            .append("longitude", getLongitude())
            .append("latitude", getLatitude())
            .toString();
    }
}
