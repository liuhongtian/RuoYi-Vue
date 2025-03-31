package com.ruoyi.obd.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 办事处对象 OM_Office
 * 
 * @author ruoyi
 * @date 2025-03-31
 */
public class OmOffice extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long pkId;

    /** 办事处编码 */
    @Excel(name = "办事处编码")
    private String officeCode;

    /** 办事处名称 */
    @Excel(name = "办事处名称")
    private String officeName;

    /** 所属省份 */
    @Excel(name = "所属省份")
    private String province;

    /** 所属地市 */
    @Excel(name = "所属地市")
    private String city;

    /**  */
    private String officeRole;

    /** 详细地址 */
    @Excel(name = "详细地址")
    private String address;

    /** 经度 */
    @Excel(name = "经度")
    private BigDecimal longitude;

    /** 纬度 */
    @Excel(name = "纬度")
    private BigDecimal latitude;

    /** 所属公司 */
    @Excel(name = "所属公司")
    private String company;

    public void setPkId(Long pkId) 
    {
        this.pkId = pkId;
    }

    public Long getPkId() 
    {
        return pkId;
    }

    public void setOfficeCode(String officeCode) 
    {
        this.officeCode = officeCode;
    }

    public String getOfficeCode() 
    {
        return officeCode;
    }

    public void setOfficeName(String officeName) 
    {
        this.officeName = officeName;
    }

    public String getOfficeName() 
    {
        return officeName;
    }

    public void setProvince(String province) 
    {
        this.province = province;
    }

    public String getProvince() 
    {
        return province;
    }

    public void setCity(String city) 
    {
        this.city = city;
    }

    public String getCity() 
    {
        return city;
    }

    public void setOfficeRole(String officeRole) 
    {
        this.officeRole = officeRole;
    }

    public String getOfficeRole() 
    {
        return officeRole;
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

    public void setCompany(String company) 
    {
        this.company = company;
    }

    public String getCompany() 
    {
        return company;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("pkId", getPkId())
            .append("officeCode", getOfficeCode())
            .append("officeName", getOfficeName())
            .append("province", getProvince())
            .append("city", getCity())
            .append("officeRole", getOfficeRole())
            .append("address", getAddress())
            .append("longitude", getLongitude())
            .append("latitude", getLatitude())
            .append("company", getCompany())
            .toString();
    }
}
