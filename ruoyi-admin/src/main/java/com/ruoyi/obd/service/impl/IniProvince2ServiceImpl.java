package com.ruoyi.obd.service.impl;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.ruoyi.common.utils.StringUtils;
import org.springframework.transaction.annotation.Transactional;
import com.ruoyi.obd.domain.IniCity;
import com.ruoyi.obd.mapper.IniProvince2Mapper;
import com.ruoyi.obd.domain.IniProvince2;
import com.ruoyi.obd.service.IIniProvince2Service;

/**
 * 省份信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-03-27
 */
@Service
public class IniProvince2ServiceImpl implements IIniProvince2Service 
{
    @Autowired
    private IniProvince2Mapper iniProvince2Mapper;

    /**
     * 查询省份信息
     * 
     * @param pkId 省份信息主键
     * @return 省份信息
     */
    @Override
    public IniProvince2 selectIniProvince2ByPkId(Long pkId)
    {
        return iniProvince2Mapper.selectIniProvince2ByPkId(pkId);
    }

    /**
     * 查询省份信息列表
     * 
     * @param iniProvince2 省份信息
     * @return 省份信息
     */
    @Override
    public List<IniProvince2> selectIniProvince2List(IniProvince2 iniProvince2)
    {
        return iniProvince2Mapper.selectIniProvince2List(iniProvince2);
    }

    /**
     * 新增省份信息
     * 
     * @param iniProvince2 省份信息
     * @return 结果
     */
    @Transactional
    @Override
    public int insertIniProvince2(IniProvince2 iniProvince2)
    {
        int rows = iniProvince2Mapper.insertIniProvince2(iniProvince2);
        insertIniCity(iniProvince2);
        return rows;
    }

    /**
     * 修改省份信息
     * 
     * @param iniProvince2 省份信息
     * @return 结果
     */
    @Transactional
    @Override
    public int updateIniProvince2(IniProvince2 iniProvince2)
    {
        iniProvince2Mapper.deleteIniCityByProvinceId(iniProvince2.getProvinceId());
        insertIniCity(iniProvince2);
        return iniProvince2Mapper.updateIniProvince2(iniProvince2);
    }

    /**
     * 批量删除省份信息
     * 
     * @param pkIds 需要删除的省份信息主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteIniProvince2ByPkIds(Long[] pkIds)
    {
        List<String> provinceIds = Stream.of(pkIds).map(pkId -> iniProvince2Mapper.selectIniProvince2ByPkId(pkId).getProvinceId()).collect(Collectors.toList());
        iniProvince2Mapper.deleteIniCityByProvinceIds(provinceIds.toArray(new String[provinceIds.size()]));
        return iniProvince2Mapper.deleteIniProvince2ByPkIds(pkIds);
    }

    /**
     * 删除省份信息信息
     * 
     * @param pkId 省份信息主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteIniProvince2ByPkId(Long pkId)
    {
        iniProvince2Mapper.deleteIniCityByProvinceId(iniProvince2Mapper.selectIniProvince2ByPkId(pkId).getProvinceId());
        return iniProvince2Mapper.deleteIniProvince2ByPkId(pkId);
    }

    /**
     * 新增城市信息信息
     * 
     * @param iniProvince2 省份信息对象
     */
    public void insertIniCity(IniProvince2 iniProvince2)
    {
        List<IniCity> iniCityList = iniProvince2.getIniCityList();
        String provinceId = iniProvince2.getProvinceId();
        if (StringUtils.isNotNull(iniCityList))
        {
            List<IniCity> list = new ArrayList<IniCity>();
            for (IniCity iniCity : iniCityList)
            {
                iniCity.setProvinceId(provinceId);
                list.add(iniCity);
            }
            if (list.size() > 0)
            {
                iniProvince2Mapper.batchIniCity(list);
            }
        }
    }
}
