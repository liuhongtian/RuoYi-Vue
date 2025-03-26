package com.ruoyi.obd.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 省份信息对象 Ini_Province
 * 
 * @author ruoyi
 * @date 2025-03-26
 */
public class IniProvince extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long pkId;

    /** 序号 */
    @Excel(name = "序号")
    private Long seqNo;

    /** 国家 */
    private String countryId;

    /** 省份编码 */
    @Excel(name = "省份编码")
    private String provinceId;

    /** 省份名称 */
    @Excel(name = "省份名称")
    private String provinceName;

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

    public void setCountryId(String countryId) 
    {
        this.countryId = countryId;
    }

    public String getCountryId() 
    {
        return countryId;
    }

    public void setProvinceId(String provinceId) 
    {
        this.provinceId = provinceId;
    }

    public String getProvinceId() 
    {
        return provinceId;
    }

    public void setProvinceName(String provinceName) 
    {
        this.provinceName = provinceName;
    }

    public String getProvinceName() 
    {
        return provinceName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("pkId", getPkId())
            .append("seqNo", getSeqNo())
            .append("countryId", getCountryId())
            .append("provinceId", getProvinceId())
            .append("provinceName", getProvinceName())
            .toString();
    }
}
