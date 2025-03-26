package com.ruoyi.obd.mapper;

import java.util.List;
import com.ruoyi.obd.domain.IniArea;

/**
 * 地区信息Mapper接口
 * 
 * @author ruoyi
 * @date 2025-03-26
 */
public interface IniAreaMapper 
{
    /**
     * 查询地区信息
     * 
     * @param pkId 地区信息主键
     * @return 地区信息
     */
    public IniArea selectIniAreaByPkId(Long pkId);

    /**
     * 查询地区信息列表
     * 
     * @param iniArea 地区信息
     * @return 地区信息集合
     */
    public List<IniArea> selectIniAreaList(IniArea iniArea);

    /**
     * 新增地区信息
     * 
     * @param iniArea 地区信息
     * @return 结果
     */
    public int insertIniArea(IniArea iniArea);

    /**
     * 修改地区信息
     * 
     * @param iniArea 地区信息
     * @return 结果
     */
    public int updateIniArea(IniArea iniArea);

    /**
     * 删除地区信息
     * 
     * @param pkId 地区信息主键
     * @return 结果
     */
    public int deleteIniAreaByPkId(Long pkId);

    /**
     * 批量删除地区信息
     * 
     * @param pkIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteIniAreaByPkIds(Long[] pkIds);
}
