package com.ruoyi.obd.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 实验室对象 OM_Lab
 * 
 * @author ruoyi
 * @date 2025-03-31
 */
public class OmLab extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long pkId;

    /** 实验室编码 */
    @Excel(name = "实验室编码")
    private String labCode;

    /** 实验室名称 */
    @Excel(name = "实验室名称")
    private String labName;

    /** 实验室地址 */
    @Excel(name = "实验室地址")
    private String address;

    /** 所属公司 */
    @Excel(name = "所属公司")
    private Long company;

    public void setPkId(Long pkId) 
    {
        this.pkId = pkId;
    }

    public Long getPkId() 
    {
        return pkId;
    }

    public void setLabCode(String labCode) 
    {
        this.labCode = labCode;
    }

    public String getLabCode() 
    {
        return labCode;
    }

    public void setLabName(String labName) 
    {
        this.labName = labName;
    }

    public String getLabName() 
    {
        return labName;
    }

    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }

    public void setCompany(Long company) 
    {
        this.company = company;
    }

    public Long getCompany() 
    {
        return company;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("pkId", getPkId())
            .append("labCode", getLabCode())
            .append("labName", getLabName())
            .append("address", getAddress())
            .append("company", getCompany())
            .toString();
    }
}
