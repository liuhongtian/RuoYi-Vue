package com.ruoyi.obd.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 运维公司对象 OM_Company
 * 
 * @author ruoyi
 * @date 2025-03-26
 */
public class OmCompany extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long pkId;

    /** 公司编码 */
    @Excel(name = "公司编码")
    private String companyId;

    /** 公司名称 */
    @Excel(name = "公司名称")
    private String companyName;

    /** 所在省份 */
    @Excel(name = "所在省份")
    private Long province;

    /** 所在地市 */
    @Excel(name = "所在地市")
    private Long city;

    /** 公司地址 */
    @Excel(name = "公司地址")
    private String address;

    public void setPkId(Long pkId) 
    {
        this.pkId = pkId;
    }

    public Long getPkId() 
    {
        return pkId;
    }

    public void setCompanyId(String companyId) 
    {
        this.companyId = companyId;
    }

    public String getCompanyId() 
    {
        return companyId;
    }

    public void setCompanyName(String companyName) 
    {
        this.companyName = companyName;
    }

    public String getCompanyName() 
    {
        return companyName;
    }

    public void setProvince(Long province) 
    {
        this.province = province;
    }

    public Long getProvince() 
    {
        return province;
    }

    public void setCity(Long city) 
    {
        this.city = city;
    }

    public Long getCity() 
    {
        return city;
    }

    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("pkId", getPkId())
            .append("companyId", getCompanyId())
            .append("companyName", getCompanyName())
            .append("province", getProvince())
            .append("city", getCity())
            .append("address", getAddress())
            .toString();
    }
}
