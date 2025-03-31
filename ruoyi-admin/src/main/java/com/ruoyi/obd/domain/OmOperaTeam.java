package com.ruoyi.obd.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 运维小组对象 OM_Opera_Team
 * 
 * @author ruoyi
 * @date 2025-03-31
 */
public class OmOperaTeam extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 运维小组 */
    private Long pkId;

    /** 小组编码 */
    @Excel(name = "小组编码")
    private String groupCode;

    /** 办事处 */
    @Excel(name = "办事处")
    private String officeCode;

    /** 运维公司 */
    @Excel(name = "运维公司")
    private String companyCode;

    /** 可前往区域 */
    @Excel(name = "可前往区域")
    private String manageArea;

    /** 所属包件 */
    @Excel(name = "所属包件")
    private String managePackage;

    /** 组长 */
    @Excel(name = "组长")
    private String teamLeader;

    /** 组员 */
    @Excel(name = "组员")
    private String teamMembers;

    /** 小组类别 */
    @Excel(name = "小组类别")
    private String teamType;

    public void setPkId(Long pkId) 
    {
        this.pkId = pkId;
    }

    public Long getPkId() 
    {
        return pkId;
    }

    public void setGroupCode(String groupCode) 
    {
        this.groupCode = groupCode;
    }

    public String getGroupCode() 
    {
        return groupCode;
    }

    public void setOfficeCode(String officeCode) 
    {
        this.officeCode = officeCode;
    }

    public String getOfficeCode() 
    {
        return officeCode;
    }

    public void setCompanyCode(String companyCode) 
    {
        this.companyCode = companyCode;
    }

    public String getCompanyCode() 
    {
        return companyCode;
    }

    public void setManageArea(String manageArea) 
    {
        this.manageArea = manageArea;
    }

    public String getManageArea() 
    {
        return manageArea;
    }

    public void setManagePackage(String managePackage) 
    {
        this.managePackage = managePackage;
    }

    public String getManagePackage() 
    {
        return managePackage;
    }

    public void setTeamLeader(String teamLeader) 
    {
        this.teamLeader = teamLeader;
    }

    public String getTeamLeader() 
    {
        return teamLeader;
    }

    public void setTeamMembers(String teamMembers) 
    {
        this.teamMembers = teamMembers;
    }

    public String getTeamMembers() 
    {
        return teamMembers;
    }

    public void setTeamType(String teamType) 
    {
        this.teamType = teamType;
    }

    public String getTeamType() 
    {
        return teamType;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("pkId", getPkId())
            .append("groupCode", getGroupCode())
            .append("officeCode", getOfficeCode())
            .append("companyCode", getCompanyCode())
            .append("manageArea", getManageArea())
            .append("managePackage", getManagePackage())
            .append("teamLeader", getTeamLeader())
            .append("teamMembers", getTeamMembers())
            .append("teamType", getTeamType())
            .toString();
    }
}
