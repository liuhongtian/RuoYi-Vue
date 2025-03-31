package com.ruoyi.obd.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 断面对象 River_Section
 * 
 * @author ruoyi
 * @date 2025-03-31
 */
public class RiverSection extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long pkId;

    /** 断面编码 */
    @Excel(name = "断面编码")
    private String sectionCode;

    /** 断面名称 */
    @Excel(name = "断面名称")
    private String sectionName;

    /** 所在流域 */
    @Excel(name = "所在流域")
    private String drainageBasin;

    /** 所在水体 */
    @Excel(name = "所在水体")
    private String waterBody;

    /** 汇入水体 */
    @Excel(name = "汇入水体")
    private String importWb;

    /** 断面类型 */
    @Excel(name = "断面类型")
    private String wbType;

    /** 特殊属性 */
    @Excel(name = "特殊属性")
    private String specialProperty;

    /** 经度 */
    @Excel(name = "经度")
    private BigDecimal longitude;

    /** 纬度 */
    @Excel(name = "纬度")
    private BigDecimal latitude;

    /** 考核省 */
    @Excel(name = "考核省")
    private String assessProvince;

    /** 考核地市 */
    @Excel(name = "考核地市")
    private String assessCity;

    /** 所在省 */
    @Excel(name = "所在省")
    private String locationProvince;

    /** 所在地市 */
    @Excel(name = "所在地市")
    private String locationCity;

    /** 是否建有自动站 */
    @Excel(name = "是否建有自动站")
    private String hasAutoSite;

    /** 自动站编码 */
    @Excel(name = "自动站编码")
    private String autoSiteCode;

    /** 是否需要盐度指标 */
    @Excel(name = "是否需要盐度指标")
    private String hasSalinityIndicator;

    /** 采样点数 */
    @Excel(name = "采样点数")
    private Long sampledPoints;

    /** 采样方式 */
    @Excel(name = "采样方式")
    private String sampledMethod;

    /** 是否自采自测 */
    @Excel(name = "是否自采自测")
    private String isSelfSampling;

    /** 水样送达时限 */
    @Excel(name = "水样送达时限")
    private Long sampleAvaliableLimit;

    /** 评估采样时 */
    @Excel(name = "评估采样时")
    private Long sampleAssessTime;

    /** 采样时间波动系数 */
    @Excel(name = "采样时间波动系数")
    private String samplingTimeFc;

    /** 估计采样成本 */
    @Excel(name = "估计采样成本")
    private Long estimateSamplingCosts;

    /** 采样成本波动系数 */
    @Excel(name = "采样成本波动系数")
    private String samplingCostsFc;

    /** 是否感潮断面 */
    @Excel(name = "是否感潮断面")
    private String isSectionSt;

    /** 包件 */
    @Excel(name = "包件")
    private String packageCode;

    /** 状态 */
    @Excel(name = "状态")
    private String sectionStatus;

    /** 是否不间断 */
    @Excel(name = "是否不间断")
    private String isUninterrupted;

    /** 运维公司 */
    @Excel(name = "运维公司")
    private String omCompanyId;

    /** 断面属性 */
    @Excel(name = "断面属性")
    private String sectionProperty;

    /**  */
    @Excel(name = "")
    private String waterCode;

    public void setPkId(Long pkId) 
    {
        this.pkId = pkId;
    }

    public Long getPkId() 
    {
        return pkId;
    }

    public void setSectionCode(String sectionCode) 
    {
        this.sectionCode = sectionCode;
    }

    public String getSectionCode() 
    {
        return sectionCode;
    }

    public void setSectionName(String sectionName) 
    {
        this.sectionName = sectionName;
    }

    public String getSectionName() 
    {
        return sectionName;
    }

    public void setDrainageBasin(String drainageBasin) 
    {
        this.drainageBasin = drainageBasin;
    }

    public String getDrainageBasin() 
    {
        return drainageBasin;
    }

    public void setWaterBody(String waterBody) 
    {
        this.waterBody = waterBody;
    }

    public String getWaterBody() 
    {
        return waterBody;
    }

    public void setImportWb(String importWb) 
    {
        this.importWb = importWb;
    }

    public String getImportWb() 
    {
        return importWb;
    }

    public void setWbType(String wbType) 
    {
        this.wbType = wbType;
    }

    public String getWbType() 
    {
        return wbType;
    }

    public void setSpecialProperty(String specialProperty) 
    {
        this.specialProperty = specialProperty;
    }

    public String getSpecialProperty() 
    {
        return specialProperty;
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

    public void setAssessProvince(String assessProvince) 
    {
        this.assessProvince = assessProvince;
    }

    public String getAssessProvince() 
    {
        return assessProvince;
    }

    public void setAssessCity(String assessCity) 
    {
        this.assessCity = assessCity;
    }

    public String getAssessCity() 
    {
        return assessCity;
    }

    public void setLocationProvince(String locationProvince) 
    {
        this.locationProvince = locationProvince;
    }

    public String getLocationProvince() 
    {
        return locationProvince;
    }

    public void setLocationCity(String locationCity) 
    {
        this.locationCity = locationCity;
    }

    public String getLocationCity() 
    {
        return locationCity;
    }

    public void setHasAutoSite(String hasAutoSite) 
    {
        this.hasAutoSite = hasAutoSite;
    }

    public String getHasAutoSite() 
    {
        return hasAutoSite;
    }

    public void setAutoSiteCode(String autoSiteCode) 
    {
        this.autoSiteCode = autoSiteCode;
    }

    public String getAutoSiteCode() 
    {
        return autoSiteCode;
    }

    public void setHasSalinityIndicator(String hasSalinityIndicator) 
    {
        this.hasSalinityIndicator = hasSalinityIndicator;
    }

    public String getHasSalinityIndicator() 
    {
        return hasSalinityIndicator;
    }

    public void setSampledPoints(Long sampledPoints) 
    {
        this.sampledPoints = sampledPoints;
    }

    public Long getSampledPoints() 
    {
        return sampledPoints;
    }

    public void setSampledMethod(String sampledMethod) 
    {
        this.sampledMethod = sampledMethod;
    }

    public String getSampledMethod() 
    {
        return sampledMethod;
    }

    public void setIsSelfSampling(String isSelfSampling) 
    {
        this.isSelfSampling = isSelfSampling;
    }

    public String getIsSelfSampling() 
    {
        return isSelfSampling;
    }

    public void setSampleAvaliableLimit(Long sampleAvaliableLimit) 
    {
        this.sampleAvaliableLimit = sampleAvaliableLimit;
    }

    public Long getSampleAvaliableLimit() 
    {
        return sampleAvaliableLimit;
    }

    public void setSampleAssessTime(Long sampleAssessTime) 
    {
        this.sampleAssessTime = sampleAssessTime;
    }

    public Long getSampleAssessTime() 
    {
        return sampleAssessTime;
    }

    public void setSamplingTimeFc(String samplingTimeFc) 
    {
        this.samplingTimeFc = samplingTimeFc;
    }

    public String getSamplingTimeFc() 
    {
        return samplingTimeFc;
    }

    public void setEstimateSamplingCosts(Long estimateSamplingCosts) 
    {
        this.estimateSamplingCosts = estimateSamplingCosts;
    }

    public Long getEstimateSamplingCosts() 
    {
        return estimateSamplingCosts;
    }

    public void setSamplingCostsFc(String samplingCostsFc) 
    {
        this.samplingCostsFc = samplingCostsFc;
    }

    public String getSamplingCostsFc() 
    {
        return samplingCostsFc;
    }

    public void setIsSectionSt(String isSectionSt) 
    {
        this.isSectionSt = isSectionSt;
    }

    public String getIsSectionSt() 
    {
        return isSectionSt;
    }

    public void setPackageCode(String packageCode) 
    {
        this.packageCode = packageCode;
    }

    public String getPackageCode() 
    {
        return packageCode;
    }

    public void setSectionStatus(String sectionStatus) 
    {
        this.sectionStatus = sectionStatus;
    }

    public String getSectionStatus() 
    {
        return sectionStatus;
    }

    public void setIsUninterrupted(String isUninterrupted) 
    {
        this.isUninterrupted = isUninterrupted;
    }

    public String getIsUninterrupted() 
    {
        return isUninterrupted;
    }

    public void setOmCompanyId(String omCompanyId) 
    {
        this.omCompanyId = omCompanyId;
    }

    public String getOmCompanyId() 
    {
        return omCompanyId;
    }

    public void setSectionProperty(String sectionProperty) 
    {
        this.sectionProperty = sectionProperty;
    }

    public String getSectionProperty() 
    {
        return sectionProperty;
    }

    public void setWaterCode(String waterCode) 
    {
        this.waterCode = waterCode;
    }

    public String getWaterCode() 
    {
        return waterCode;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("pkId", getPkId())
            .append("sectionCode", getSectionCode())
            .append("sectionName", getSectionName())
            .append("drainageBasin", getDrainageBasin())
            .append("waterBody", getWaterBody())
            .append("importWb", getImportWb())
            .append("wbType", getWbType())
            .append("specialProperty", getSpecialProperty())
            .append("longitude", getLongitude())
            .append("latitude", getLatitude())
            .append("assessProvince", getAssessProvince())
            .append("assessCity", getAssessCity())
            .append("locationProvince", getLocationProvince())
            .append("locationCity", getLocationCity())
            .append("hasAutoSite", getHasAutoSite())
            .append("autoSiteCode", getAutoSiteCode())
            .append("hasSalinityIndicator", getHasSalinityIndicator())
            .append("sampledPoints", getSampledPoints())
            .append("sampledMethod", getSampledMethod())
            .append("isSelfSampling", getIsSelfSampling())
            .append("sampleAvaliableLimit", getSampleAvaliableLimit())
            .append("sampleAssessTime", getSampleAssessTime())
            .append("samplingTimeFc", getSamplingTimeFc())
            .append("estimateSamplingCosts", getEstimateSamplingCosts())
            .append("samplingCostsFc", getSamplingCostsFc())
            .append("isSectionSt", getIsSectionSt())
            .append("packageCode", getPackageCode())
            .append("sectionStatus", getSectionStatus())
            .append("isUninterrupted", getIsUninterrupted())
            .append("omCompanyId", getOmCompanyId())
            .append("sectionProperty", getSectionProperty())
            .append("waterCode", getWaterCode())
            .toString();
    }
}
