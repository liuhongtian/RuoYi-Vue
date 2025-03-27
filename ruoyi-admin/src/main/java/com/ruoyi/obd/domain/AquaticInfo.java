package com.ruoyi.obd.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 水体信息对象 Aquatic_Info
 * 
 * @author ruoyi
 * @date 2025-03-27
 */
public class AquaticInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long pkId;

    /** 水体编码 */
    @Excel(name = "水体编码")
    private String aquaticCode;

    /** 水体名称 */
    @Excel(name = "水体名称")
    private String aquaticName;

    public void setPkId(Long pkId) 
    {
        this.pkId = pkId;
    }

    public Long getPkId() 
    {
        return pkId;
    }

    public void setAquaticCode(String aquaticCode) 
    {
        this.aquaticCode = aquaticCode;
    }

    public String getAquaticCode() 
    {
        return aquaticCode;
    }

    public void setAquaticName(String aquaticName) 
    {
        this.aquaticName = aquaticName;
    }

    public String getAquaticName() 
    {
        return aquaticName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("pkId", getPkId())
            .append("aquaticCode", getAquaticCode())
            .append("aquaticName", getAquaticName())
            .toString();
    }
}
