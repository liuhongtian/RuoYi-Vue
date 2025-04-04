package com.ruoyi.obd.service;

import java.util.List;
import com.ruoyi.obd.domain.AquaticInfo;

/**
 * 水体信息Service接口
 * 
 * @author ruoyi
 * @date 2025-03-27
 */
public interface IAquaticInfoService 
{
    /**
     * 查询水体信息
     * 
     * @param pkId 水体信息主键
     * @return 水体信息
     */
    public AquaticInfo selectAquaticInfoByPkId(Long pkId);

    /**
     * 查询水体信息列表
     * 
     * @param aquaticInfo 水体信息
     * @return 水体信息集合
     */
    public List<AquaticInfo> selectAquaticInfoList(AquaticInfo aquaticInfo);

    /**
     * 新增水体信息
     * 
     * @param aquaticInfo 水体信息
     * @return 结果
     */
    public int insertAquaticInfo(AquaticInfo aquaticInfo);

    /**
     * 修改水体信息
     * 
     * @param aquaticInfo 水体信息
     * @return 结果
     */
    public int updateAquaticInfo(AquaticInfo aquaticInfo);

    /**
     * 批量删除水体信息
     * 
     * @param pkIds 需要删除的水体信息主键集合
     * @return 结果
     */
    public int deleteAquaticInfoByPkIds(Long[] pkIds);

    /**
     * 删除水体信息信息
     * 
     * @param pkId 水体信息主键
     * @return 结果
     */
    public int deleteAquaticInfoByPkId(Long pkId);
}
