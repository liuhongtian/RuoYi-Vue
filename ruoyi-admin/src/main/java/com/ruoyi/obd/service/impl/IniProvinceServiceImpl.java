package com.ruoyi.obd.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.obd.mapper.IniProvinceMapper;
import com.ruoyi.obd.domain.IniProvince;
import com.ruoyi.obd.service.IIniProvinceService;

/**
 * 省份信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-03-26
 */
@Service
public class IniProvinceServiceImpl implements IIniProvinceService 
{
    @Autowired
    private IniProvinceMapper iniProvinceMapper;

    /**
     * 查询省份信息
     * 
     * @param pkId 省份信息主键
     * @return 省份信息
     */
    @Override
    public IniProvince selectIniProvinceByPkId(Long pkId)
    {
        return iniProvinceMapper.selectIniProvinceByPkId(pkId);
    }

    /**
     * 查询省份信息列表
     * 
     * @param iniProvince 省份信息
     * @return 省份信息
     */
    @Override
    public List<IniProvince> selectIniProvinceList(IniProvince iniProvince)
    {
        return iniProvinceMapper.selectIniProvinceList(iniProvince);
    }

    /**
     * 新增省份信息
     * 
     * @param iniProvince 省份信息
     * @return 结果
     */
    @Override
    public int insertIniProvince(IniProvince iniProvince)
    {
        return iniProvinceMapper.insertIniProvince(iniProvince);
    }

    /**
     * 修改省份信息
     * 
     * @param iniProvince 省份信息
     * @return 结果
     */
    @Override
    public int updateIniProvince(IniProvince iniProvince)
    {
        return iniProvinceMapper.updateIniProvince(iniProvince);
    }

    /**
     * 批量删除省份信息
     * 
     * @param pkIds 需要删除的省份信息主键
     * @return 结果
     */
    @Override
    public int deleteIniProvinceByPkIds(Long[] pkIds)
    {
        return iniProvinceMapper.deleteIniProvinceByPkIds(pkIds);
    }

    /**
     * 删除省份信息信息
     * 
     * @param pkId 省份信息主键
     * @return 结果
     */
    @Override
    public int deleteIniProvinceByPkId(Long pkId)
    {
        return iniProvinceMapper.deleteIniProvinceByPkId(pkId);
    }
}
