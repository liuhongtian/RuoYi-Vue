package com.ruoyi.obd.service;

import java.util.List;
import com.ruoyi.obd.domain.IniProvince2;

/**
 * 省份信息Service接口
 * 
 * @author ruoyi
 * @date 2025-03-27
 */
public interface IIniProvince2Service 
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
     * 批量删除省份信息
     * 
     * @param pkIds 需要删除的省份信息主键集合
     * @return 结果
     */
    public int deleteIniProvince2ByPkIds(Long[] pkIds);

    /**
     * 删除省份信息信息
     * 
     * @param pkId 省份信息主键
     * @return 结果
     */
    public int deleteIniProvince2ByPkId(Long pkId);
}
