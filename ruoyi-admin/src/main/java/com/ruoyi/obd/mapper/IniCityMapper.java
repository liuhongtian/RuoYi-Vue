package com.ruoyi.obd.mapper;

import java.util.List;
import com.ruoyi.obd.domain.IniCity;

/**
 * 城市信息Mapper接口
 * 
 * @author ruoyi
 * @date 2025-03-26
 */
public interface IniCityMapper 
{
    /**
     * 查询城市信息
     * 
     * @param pkId 城市信息主键
     * @return 城市信息
     */
    public IniCity selectIniCityByPkId(Long pkId);

    /**
     * 查询城市信息列表
     * 
     * @param iniCity 城市信息
     * @return 城市信息集合
     */
    public List<IniCity> selectIniCityList(IniCity iniCity);

    /**
     * 新增城市信息
     * 
     * @param iniCity 城市信息
     * @return 结果
     */
    public int insertIniCity(IniCity iniCity);

    /**
     * 修改城市信息
     * 
     * @param iniCity 城市信息
     * @return 结果
     */
    public int updateIniCity(IniCity iniCity);

    /**
     * 删除城市信息
     * 
     * @param pkId 城市信息主键
     * @return 结果
     */
    public int deleteIniCityByPkId(Long pkId);

    /**
     * 批量删除城市信息
     * 
     * @param pkIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteIniCityByPkIds(Long[] pkIds);
}
