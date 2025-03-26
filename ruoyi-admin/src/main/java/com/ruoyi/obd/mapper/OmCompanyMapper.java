package com.ruoyi.obd.mapper;

import java.util.List;
import com.ruoyi.obd.domain.OmCompany;

/**
 * 运维公司Mapper接口
 * 
 * @author ruoyi
 * @date 2025-03-26
 */
public interface OmCompanyMapper 
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
     * 删除运维公司
     * 
     * @param pkId 运维公司主键
     * @return 结果
     */
    public int deleteOmCompanyByPkId(Long pkId);

    /**
     * 批量删除运维公司
     * 
     * @param pkIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteOmCompanyByPkIds(Long[] pkIds);
}
