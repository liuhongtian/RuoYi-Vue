package com.ruoyi.obd.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.obd.mapper.AquaticInfoMapper;
import com.ruoyi.obd.domain.AquaticInfo;
import com.ruoyi.obd.service.IAquaticInfoService;

/**
 * 水体信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-03-27
 */
@Service
public class AquaticInfoServiceImpl implements IAquaticInfoService 
{
    @Autowired
    private AquaticInfoMapper aquaticInfoMapper;

    /**
     * 查询水体信息
     * 
     * @param pkId 水体信息主键
     * @return 水体信息
     */
    @Override
    public AquaticInfo selectAquaticInfoByPkId(Long pkId)
    {
        return aquaticInfoMapper.selectAquaticInfoByPkId(pkId);
    }

    /**
     * 查询水体信息列表
     * 
     * @param aquaticInfo 水体信息
     * @return 水体信息
     */
    @Override
    public List<AquaticInfo> selectAquaticInfoList(AquaticInfo aquaticInfo)
    {
        return aquaticInfoMapper.selectAquaticInfoList(aquaticInfo);
    }

    /**
     * 新增水体信息
     * 
     * @param aquaticInfo 水体信息
     * @return 结果
     */
    @Override
    public int insertAquaticInfo(AquaticInfo aquaticInfo)
    {
        return aquaticInfoMapper.insertAquaticInfo(aquaticInfo);
    }

    /**
     * 修改水体信息
     * 
     * @param aquaticInfo 水体信息
     * @return 结果
     */
    @Override
    public int updateAquaticInfo(AquaticInfo aquaticInfo)
    {
        return aquaticInfoMapper.updateAquaticInfo(aquaticInfo);
    }

    /**
     * 批量删除水体信息
     * 
     * @param pkIds 需要删除的水体信息主键
     * @return 结果
     */
    @Override
    public int deleteAquaticInfoByPkIds(Long[] pkIds)
    {
        return aquaticInfoMapper.deleteAquaticInfoByPkIds(pkIds);
    }

    /**
     * 删除水体信息信息
     * 
     * @param pkId 水体信息主键
     * @return 结果
     */
    @Override
    public int deleteAquaticInfoByPkId(Long pkId)
    {
        return aquaticInfoMapper.deleteAquaticInfoByPkId(pkId);
    }
}
