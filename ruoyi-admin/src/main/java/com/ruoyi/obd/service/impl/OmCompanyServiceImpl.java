package com.ruoyi.obd.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.obd.mapper.OmCompanyMapper;
import com.ruoyi.obd.domain.OmCompany;
import com.ruoyi.obd.service.IOmCompanyService;

/**
 * 运维公司Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-03-26
 */
@Service
public class OmCompanyServiceImpl implements IOmCompanyService 
{
    @Autowired
    private OmCompanyMapper omCompanyMapper;

    /**
     * 查询运维公司
     * 
     * @param pkId 运维公司主键
     * @return 运维公司
     */
    @Override
    public OmCompany selectOmCompanyByPkId(Long pkId)
    {
        return omCompanyMapper.selectOmCompanyByPkId(pkId);
    }

    /**
     * 查询运维公司列表
     * 
     * @param omCompany 运维公司
     * @return 运维公司
     */
    @Override
    public List<OmCompany> selectOmCompanyList(OmCompany omCompany)
    {
        return omCompanyMapper.selectOmCompanyList(omCompany);
    }

    /**
     * 新增运维公司
     * 
     * @param omCompany 运维公司
     * @return 结果
     */
    @Override
    public int insertOmCompany(OmCompany omCompany)
    {
        return omCompanyMapper.insertOmCompany(omCompany);
    }

    /**
     * 修改运维公司
     * 
     * @param omCompany 运维公司
     * @return 结果
     */
    @Override
    public int updateOmCompany(OmCompany omCompany)
    {
        return omCompanyMapper.updateOmCompany(omCompany);
    }

    /**
     * 批量删除运维公司
     * 
     * @param pkIds 需要删除的运维公司主键
     * @return 结果
     */
    @Override
    public int deleteOmCompanyByPkIds(Long[] pkIds)
    {
        return omCompanyMapper.deleteOmCompanyByPkIds(pkIds);
    }

    /**
     * 删除运维公司信息
     * 
     * @param pkId 运维公司主键
     * @return 结果
     */
    @Override
    public int deleteOmCompanyByPkId(Long pkId)
    {
        return omCompanyMapper.deleteOmCompanyByPkId(pkId);
    }
}
