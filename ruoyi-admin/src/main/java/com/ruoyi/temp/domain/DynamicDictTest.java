package com.ruoyi.temp.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * dynamicDictTest对象 dynamic_dict_test
 * 
 * @author ruoyi
 * @date 2025-03-30
 */
public class DynamicDictTest extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long pkId;

    /** 数据编码 */
    @Excel(name = "数据编码")
    private String dataCode;

    /** 数据值 */
    @Excel(name = "数据值")
    private String dataValue;

    /** 所属省份 */
    @Excel(name = "所属省份")
    private String provinceId;

    public void setPkId(Long pkId) 
    {
        this.pkId = pkId;
    }

    public Long getPkId() 
    {
        return pkId;
    }

    public void setDataCode(String dataCode) 
    {
        this.dataCode = dataCode;
    }

    public String getDataCode() 
    {
        return dataCode;
    }

    public void setDataValue(String dataValue) 
    {
        this.dataValue = dataValue;
    }

    public String getDataValue() 
    {
        return dataValue;
    }

    public void setProvinceId(String provinceId) 
    {
        this.provinceId = provinceId;
    }

    public String getProvinceId() 
    {
        return provinceId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("pkId", getPkId())
            .append("dataCode", getDataCode())
            .append("dataValue", getDataValue())
            .append("provinceId", getProvinceId())
            .toString();
    }
}
