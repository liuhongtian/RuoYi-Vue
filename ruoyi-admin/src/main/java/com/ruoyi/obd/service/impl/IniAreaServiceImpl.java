package com.ruoyi.obd.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.obd.mapper.IniAreaMapper;
import com.ruoyi.obd.domain.IniArea;
import com.ruoyi.obd.service.IIniAreaService;

/**
 * 地区信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-03-26
 */
@Service
public class IniAreaServiceImpl implements IIniAreaService 
{
    @Autowired
    private IniAreaMapper iniAreaMapper;

    /**
     * 查询地区信息
     * 
     * @param pkId 地区信息主键
     * @return 地区信息
     */
    @Override
    public IniArea selectIniAreaByPkId(Long pkId)
    {
        return iniAreaMapper.selectIniAreaByPkId(pkId);
    }

    /**
     * 查询地区信息列表
     * 
     * @param iniArea 地区信息
     * @return 地区信息
     */
    @Override
    public List<IniArea> selectIniAreaList(IniArea iniArea)
    {
        return iniAreaMapper.selectIniAreaList(iniArea);
    }

    /**
     * 新增地区信息
     * 
     * @param iniArea 地区信息
     * @return 结果
     */
    @Override
    public int insertIniArea(IniArea iniArea)
    {
        return iniAreaMapper.insertIniArea(iniArea);
    }

    /**
     * 修改地区信息
     * 
     * @param iniArea 地区信息
     * @return 结果
     */
    @Override
    public int updateIniArea(IniArea iniArea)
    {
        return iniAreaMapper.updateIniArea(iniArea);
    }

    /**
     * 批量删除地区信息
     * 
     * @param pkIds 需要删除的地区信息主键
     * @return 结果
     */
    @Override
    public int deleteIniAreaByPkIds(Long[] pkIds)
    {
        return iniAreaMapper.deleteIniAreaByPkIds(pkIds);
    }

    /**
     * 删除地区信息信息
     * 
     * @param pkId 地区信息主键
     * @return 结果
     */
    @Override
    public int deleteIniAreaByPkId(Long pkId)
    {
        return iniAreaMapper.deleteIniAreaByPkId(pkId);
    }
}
