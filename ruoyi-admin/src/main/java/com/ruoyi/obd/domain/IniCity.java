package com.ruoyi.obd.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 城市信息对象 Ini_City
 * 
 * @author ruoyi
 * @date 2025-03-26
 */
public class IniCity extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long pkId;

    /** 序号 */
    @Excel(name = "序号")
    private Long seqNo;

    /** 省份 */
    @Excel(name = "省份")
    private String provinceId;

    /** 国家 */
    private String countryId;

    /**  */
    private String acityId;

    /** 城市编码 */
    @Excel(name = "城市编码")
    private String cityId;

    /** 城市名称 */
    @Excel(name = "城市名称")
    private String cityName;

    /**  */
    private String telDistCode;

    /**  */
    private String postCode;

    public void setPkId(Long pkId) 
    {
        this.pkId = pkId;
    }

    public Long getPkId() 
    {
        return pkId;
    }

    public void setSeqNo(Long seqNo) 
    {
        this.seqNo = seqNo;
    }

    public Long getSeqNo() 
    {
        return seqNo;
    }

    public void setProvinceId(String provinceId) 
    {
        this.provinceId = provinceId;
    }

    public String getProvinceId() 
    {
        return provinceId;
    }

    public void setCountryId(String countryId) 
    {
        this.countryId = countryId;
    }

    public String getCountryId() 
    {
        return countryId;
    }

    public void setAcityId(String acityId) 
    {
        this.acityId = acityId;
    }

    public String getAcityId() 
    {
        return acityId;
    }

    public void setCityId(String cityId) 
    {
        this.cityId = cityId;
    }

    public String getCityId() 
    {
        return cityId;
    }

    public void setCityName(String cityName) 
    {
        this.cityName = cityName;
    }

    public String getCityName() 
    {
        return cityName;
    }

    public void setTelDistCode(String telDistCode) 
    {
        this.telDistCode = telDistCode;
    }

    public String getTelDistCode() 
    {
        return telDistCode;
    }

    public void setPostCode(String postCode) 
    {
        this.postCode = postCode;
    }

    public String getPostCode() 
    {
        return postCode;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("pkId", getPkId())
            .append("seqNo", getSeqNo())
            .append("provinceId", getProvinceId())
            .append("countryId", getCountryId())
            .append("acityId", getAcityId())
            .append("cityId", getCityId())
            .append("cityName", getCityName())
            .append("telDistCode", getTelDistCode())
            .append("postCode", getPostCode())
            .toString();
    }
}
