package com.ruoyi.obd.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 车辆信息对象 Vehicle
 * 
 * @author ruoyi
 * @date 2025-03-27
 */
public class Vehicle extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long pkId;

    /** 车牌号 */
    @Excel(name = "车牌号")
    private String licenseNumber;

    /** 车辆类型 */
    @Excel(name = "车辆类型")
    private Long vehicleType;

    /** 所属公司 */
    @Excel(name = "所属公司")
    private String Firm;

    /** 驻地位置 */
    @Excel(name = "驻地位置")
    private String Station;

    /** 所属办事处 */
    @Excel(name = "所属办事处")
    private String officeCode;

    /** 车辆状态 */
    @Excel(name = "车辆状态")
    private Long vehicleStatus;

    /** 使用年限 */
    @Excel(name = "使用年限")
    private Long serviceLife;

    /** 容量 */
    @Excel(name = "容量")
    private BigDecimal capacity;

    public void setPkId(Long pkId) 
    {
        this.pkId = pkId;
    }

    public Long getPkId() 
    {
        return pkId;
    }

    public void setLicenseNumber(String licenseNumber) 
    {
        this.licenseNumber = licenseNumber;
    }

    public String getLicenseNumber() 
    {
        return licenseNumber;
    }

    public void setVehicleType(Long vehicleType) 
    {
        this.vehicleType = vehicleType;
    }

    public Long getVehicleType() 
    {
        return vehicleType;
    }

    public void setFirm(String Firm) 
    {
        this.Firm = Firm;
    }

    public String getFirm() 
    {
        return Firm;
    }

    public void setStation(String Station) 
    {
        this.Station = Station;
    }

    public String getStation() 
    {
        return Station;
    }

    public void setOfficeCode(String officeCode) 
    {
        this.officeCode = officeCode;
    }

    public String getOfficeCode() 
    {
        return officeCode;
    }

    public void setVehicleStatus(Long vehicleStatus) 
    {
        this.vehicleStatus = vehicleStatus;
    }

    public Long getVehicleStatus() 
    {
        return vehicleStatus;
    }

    public void setServiceLife(Long serviceLife) 
    {
        this.serviceLife = serviceLife;
    }

    public Long getServiceLife() 
    {
        return serviceLife;
    }

    public void setCapacity(BigDecimal capacity) 
    {
        this.capacity = capacity;
    }

    public BigDecimal getCapacity() 
    {
        return capacity;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("pkId", getPkId())
            .append("licenseNumber", getLicenseNumber())
            .append("vehicleType", getVehicleType())
            .append("Firm", getFirm())
            .append("Station", getStation())
            .append("officeCode", getOfficeCode())
            .append("vehicleStatus", getVehicleStatus())
            .append("serviceLife", getServiceLife())
            .append("capacity", getCapacity())
            .toString();
    }
}
