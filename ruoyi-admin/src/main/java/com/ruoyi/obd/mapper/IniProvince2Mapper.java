package com.ruoyi.obd.mapper;

import java.util.List;
import com.ruoyi.obd.domain.IniProvince2;
import com.ruoyi.obd.domain.IniCity;

/**
 * 省份信息Mapper接口
 * 
 * @author ruoyi
 * @date 2025-03-27
 */
public interface IniProvince2Mapper 
{
    /**
     * 查询省份信息
     * 
     * @param pkId 省份信息主键
     * @return 省份信息
     */
    public IniProvince2 selectIniProvince2ByPkId(Long pkId);

    /**
     * 查询省份信息列表
     * 
     * @param iniProvince2 省份信息
     * @return 省份信息集合
     */
    public List<IniProvince2> selectIniProvince2List(IniProvince2 iniProvince2);

    /**
     * 新增省份信息
     * 
     * @param iniProvince2 省份信息
     * @return 结果
     */
    public int insertIniProvince2(IniProvince2 iniProvince2);

    /**
     * 修改省份信息
     * 
     * @param iniProvince2 省份信息
     * @return 结果
     */
    public int updateIniProvince2(IniProvince2 iniProvince2);

    /**
     * 删除省份信息
     * 
     * @param pkId 省份信息主键
     * @return 结果
     */
    public int deleteIniProvince2ByPkId(Long pkId);

    /**
     * 批量删除省份信息
     * 
     * @param pkIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteIniProvince2ByPkIds(Long[] pkIds);

    /**
     * 批量删除城市信息
     * 
     * @param provinceIds 需要删除的数据省份ID集合
     * @return 结果
     */
    public int deleteIniCityByProvinceIds(String[] provinceIds);
    
    /**
     * 批量新增城市信息
     * 
     * @param iniCityList 城市信息列表
     * @return 结果
     */
    public int batchIniCity(List<IniCity> iniCityList);
    

    /**
     * 通过省份信息主键删除城市信息信息
     * 
     * @param provinceId 省份信息ID
     * @return 结果
     */
    public int deleteIniCityByProvinceId(String provinceId);
}
