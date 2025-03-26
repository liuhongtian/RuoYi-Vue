package com.ruoyi.obd.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.obd.mapper.IniCityMapper;
import com.ruoyi.obd.domain.IniCity;
import com.ruoyi.obd.service.IIniCityService;

/**
 * 城市信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-03-26
 */
@Service
public class IniCityServiceImpl implements IIniCityService 
{
    @Autowired
    private IniCityMapper iniCityMapper;

    /**
     * 查询城市信息
     * 
     * @param pkId 城市信息主键
     * @return 城市信息
     */
    @Override
    public IniCity selectIniCityByPkId(Long pkId)
    {
        return iniCityMapper.selectIniCityByPkId(pkId);
    }

    /**
     * 查询城市信息列表
     * 
     * @param iniCity 城市信息
     * @return 城市信息
     */
    @Override
    public List<IniCity> selectIniCityList(IniCity iniCity)
    {
        return iniCityMapper.selectIniCityList(iniCity);
    }

    /**
     * 新增城市信息
     * 
     * @param iniCity 城市信息
     * @return 结果
     */
    @Override
    public int insertIniCity(IniCity iniCity)
    {
        return iniCityMapper.insertIniCity(iniCity);
    }

    /**
     * 修改城市信息
     * 
     * @param iniCity 城市信息
     * @return 结果
     */
    @Override
    public int updateIniCity(IniCity iniCity)
    {
        return iniCityMapper.updateIniCity(iniCity);
    }

    /**
     * 批量删除城市信息
     * 
     * @param pkIds 需要删除的城市信息主键
     * @return 结果
     */
    @Override
    public int deleteIniCityByPkIds(Long[] pkIds)
    {
        return iniCityMapper.deleteIniCityByPkIds(pkIds);
    }

    /**
     * 删除城市信息信息
     * 
     * @param pkId 城市信息主键
     * @return 结果
     */
    @Override
    public int deleteIniCityByPkId(Long pkId)
    {
        return iniCityMapper.deleteIniCityByPkId(pkId);
    }
}
