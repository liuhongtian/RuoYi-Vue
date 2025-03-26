package com.ruoyi.obd.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 气象信息对象 Weather_Info
 * 
 * @author ruoyi
 * @date 2025-03-26
 */
public class WeatherInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long pkId;

    /** 日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date weatherDate;

    /** 区县 */
    @Excel(name = "区县")
    private String County;

    /** 天气 */
    @Excel(name = "天气")
    private String Weather;

    /** 昨天天气 */
    @Excel(name = "昨天天气")
    private String weatherPrevday;

    /** 降雨量 */
    @Excel(name = "降雨量")
    private String Rainfall;

    /** 风力 */
    @Excel(name = "风力")
    private String Wind;

    public void setPkId(Long pkId) 
    {
        this.pkId = pkId;
    }

    public Long getPkId() 
    {
        return pkId;
    }

    public void setWeatherDate(Date weatherDate) 
    {
        this.weatherDate = weatherDate;
    }

    public Date getWeatherDate() 
    {
        return weatherDate;
    }

    public void setCounty(String County) 
    {
        this.County = County;
    }

    public String getCounty() 
    {
        return County;
    }

    public void setWeather(String Weather) 
    {
        this.Weather = Weather;
    }

    public String getWeather() 
    {
        return Weather;
    }

    public void setWeatherPrevday(String weatherPrevday) 
    {
        this.weatherPrevday = weatherPrevday;
    }

    public String getWeatherPrevday() 
    {
        return weatherPrevday;
    }

    public void setRainfall(String Rainfall) 
    {
        this.Rainfall = Rainfall;
    }

    public String getRainfall() 
    {
        return Rainfall;
    }

    public void setWind(String Wind) 
    {
        this.Wind = Wind;
    }

    public String getWind() 
    {
        return Wind;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("pkId", getPkId())
            .append("weatherDate", getWeatherDate())
            .append("County", getCounty())
            .append("Weather", getWeather())
            .append("weatherPrevday", getWeatherPrevday())
            .append("Rainfall", getRainfall())
            .append("Wind", getWind())
            .toString();
    }
}
