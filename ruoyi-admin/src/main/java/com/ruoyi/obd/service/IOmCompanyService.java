package com.ruoyi.obd.service;

import java.util.List;
import com.ruoyi.obd.domain.OmCompany;

/**
 * 运维公司Service接口
 * 
 * @author ruoyi
 * @date 2025-03-26
 */
public interface IOmCompanyService 
{
    /**
     * 查询运维公司
     * 
     * @param pkId 运维公司主键
     * @return 运维公司
     */
    public OmCompany selectOmCompanyByPkId(Long pkId);

    /**
     * 查询运维公司列表
     * 
     * @param omCompany 运维公司
     * @return 运维公司集合
     */
    public List<OmCompany> selectOmCompanyList(OmCompany omCompany);

    /**
     * 新增运维公司
     * 
     * @param omCompany 运维公司
     * @return 结果
     */
    public int insertOmCompany(OmCompany omCompany);

    /**
     * 修改运维公司
     * 
     * @param omCompany 运维公司
     * @return 结果
     */
    public int updateOmCompany(OmCompany omCompany);

    /**
     * 批量删除运维公司
     * 
     * @param pkIds 需要删除的运维公司主键集合
     * @return 结果
     */
    public int deleteOmCompanyByPkIds(Long[] pkIds);

    /**
     * 删除运维公司信息
     * 
     * @param pkId 运维公司主键
     * @return 结果
     */
    public int deleteOmCompanyByPkId(Long pkId);
}
