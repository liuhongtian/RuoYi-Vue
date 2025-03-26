package com.ruoyi.obd.service;

import java.util.List;
import com.ruoyi.obd.domain.IniProvince;

/**
 * 省份信息Service接口
 * 
 * @author ruoyi
 * @date 2025-03-26
 */
public interface IIniProvinceService 
{
    /**
     * 查询省份信息
     * 
     * @param pkId 省份信息主键
     * @return 省份信息
     */
    public IniProvince selectIniProvinceByPkId(Long pkId);

    /**
     * 查询省份信息列表
     * 
     * @param iniProvince 省份信息
     * @return 省份信息集合
     */
    public List<IniProvince> selectIniProvinceList(IniProvince iniProvince);

    /**
     * 新增省份信息
     * 
     * @param iniProvince 省份信息
     * @return 结果
     */
    public int insertIniProvince(IniProvince iniProvince);

    /**
     * 修改省份信息
     * 
     * @param iniProvince 省份信息
     * @return 结果
     */
    public int updateIniProvince(IniProvince iniProvince);

    /**
     * 批量删除省份信息
     * 
     * @param pkIds 需要删除的省份信息主键集合
     * @return 结果
     */
    public int deleteIniProvinceByPkIds(Long[] pkIds);

    /**
     * 删除省份信息信息
     * 
     * @param pkId 省份信息主键
     * @return 结果
     */
    public int deleteIniProvinceByPkId(Long pkId);
}
