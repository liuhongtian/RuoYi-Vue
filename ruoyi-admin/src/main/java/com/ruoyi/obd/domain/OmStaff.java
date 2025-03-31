package com.ruoyi.obd.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 运维人员对象 OM_Staff
 * 
 * @author ruoyi
 * @date 2025-03-31
 */
public class OmStaff extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long pkId;

    /** 人员帐号 */
    @Excel(name = "人员帐号")
    private String staffAccount;

    /** 姓名 */
    @Excel(name = "姓名")
    private String staffName;

    /** 单位 */
    @Excel(name = "单位")
    private String company;

    /** 性别 */
    private String gender;

    /** 证书编号 */
    private String licenseNumber;

    /** 联系方式 */
    @Excel(name = "联系方式")
    private String contact;

    /** 身份证号 */
    private String idNumber;

    /** 审核积分 */
    private Long auditPoints;

    /** 运维积分 */
    private Long omPoints;

    /** 任务 */
    private String capacity;

    /** 活动范围 */
    @Excel(name = "活动范围")
    private String motionRange;

    /** 角色 */
    @Excel(name = "角色")
    private String staffRole;

    /** 是否具备组长能力 */
    @Excel(name = "是否具备组长能力")
    private String leaderFlag;

    /** 负责地市 */
    @Excel(name = "负责地市")
    private String manageArea;

    /** 运维水站 */
    @Excel(name = "运维水站")
    private String manageStation;

    /** 手工采样断面 */
    private String manageSection;

    public void setPkId(Long pkId) 
    {
        this.pkId = pkId;
    }

    public Long getPkId() 
    {
        return pkId;
    }

    public void setStaffAccount(String staffAccount) 
    {
        this.staffAccount = staffAccount;
    }

    public String getStaffAccount() 
    {
        return staffAccount;
    }

    public void setStaffName(String staffName) 
    {
        this.staffName = staffName;
    }

    public String getStaffName() 
    {
        return staffName;
    }

    public void setCompany(String company) 
    {
        this.company = company;
    }

    public String getCompany() 
    {
        return company;
    }

    public void setGender(String gender) 
    {
        this.gender = gender;
    }

    public String getGender() 
    {
        return gender;
    }

    public void setLicenseNumber(String licenseNumber) 
    {
        this.licenseNumber = licenseNumber;
    }

    public String getLicenseNumber() 
    {
        return licenseNumber;
    }

    public void setContact(String contact) 
    {
        this.contact = contact;
    }

    public String getContact() 
    {
        return contact;
    }

    public void setIdNumber(String idNumber) 
    {
        this.idNumber = idNumber;
    }

    public String getIdNumber() 
    {
        return idNumber;
    }

    public void setAuditPoints(Long auditPoints) 
    {
        this.auditPoints = auditPoints;
    }

    public Long getAuditPoints() 
    {
        return auditPoints;
    }

    public void setOmPoints(Long omPoints) 
    {
        this.omPoints = omPoints;
    }

    public Long getOmPoints() 
    {
        return omPoints;
    }

    public void setCapacity(String capacity) 
    {
        this.capacity = capacity;
    }

    public String getCapacity() 
    {
        return capacity;
    }

    public void setMotionRange(String motionRange) 
    {
        this.motionRange = motionRange;
    }

    public String getMotionRange() 
    {
        return motionRange;
    }

    public void setStaffRole(String staffRole) 
    {
        this.staffRole = staffRole;
    }

    public String getStaffRole() 
    {
        return staffRole;
    }

    public void setLeaderFlag(String leaderFlag) 
    {
        this.leaderFlag = leaderFlag;
    }

    public String getLeaderFlag() 
    {
        return leaderFlag;
    }

    public void setManageArea(String manageArea) 
    {
        this.manageArea = manageArea;
    }

    public String getManageArea() 
    {
        return manageArea;
    }

    public void setManageStation(String manageStation) 
    {
        this.manageStation = manageStation;
    }

    public String getManageStation() 
    {
        return manageStation;
    }

    public void setManageSection(String manageSection) 
    {
        this.manageSection = manageSection;
    }

    public String getManageSection() 
    {
        return manageSection;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("pkId", getPkId())
            .append("staffAccount", getStaffAccount())
            .append("staffName", getStaffName())
            .append("company", getCompany())
            .append("gender", getGender())
            .append("licenseNumber", getLicenseNumber())
            .append("contact", getContact())
            .append("idNumber", getIdNumber())
            .append("auditPoints", getAuditPoints())
            .append("omPoints", getOmPoints())
            .append("capacity", getCapacity())
            .append("motionRange", getMotionRange())
            .append("staffRole", getStaffRole())
            .append("leaderFlag", getLeaderFlag())
            .append("manageArea", getManageArea())
            .append("manageStation", getManageStation())
            .append("manageSection", getManageSection())
            .toString();
    }
}
