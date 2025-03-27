package com.ruoyi.obd.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 流域信息对象 River_Basin
 * 
 * @author ruoyi
 * @date 2025-03-27
 */
public class RiverBasin extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long pkId;

    /** 流域编码 */
    @Excel(name = "流域编码")
    private String riverBasinCode;

    /** 流域名称 */
    @Excel(name = "流域名称")
    private String riverBasinName;

    public void setPkId(Long pkId) 
    {
        this.pkId = pkId;
    }

    public Long getPkId() 
    {
        return pkId;
    }

    public void setRiverBasinCode(String riverBasinCode) 
    {
        this.riverBasinCode = riverBasinCode;
    }

    public String getRiverBasinCode() 
    {
        return riverBasinCode;
    }

    public void setRiverBasinName(String riverBasinName) 
    {
        this.riverBasinName = riverBasinName;
    }

    public String getRiverBasinName() 
    {
        return riverBasinName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("pkId", getPkId())
            .append("riverBasinCode", getRiverBasinCode())
            .append("riverBasinName", getRiverBasinName())
            .toString();
    }
}
