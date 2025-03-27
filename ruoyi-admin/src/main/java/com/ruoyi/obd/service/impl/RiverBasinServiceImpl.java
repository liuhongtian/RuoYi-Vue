package com.ruoyi.obd.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.obd.mapper.RiverBasinMapper;
import com.ruoyi.obd.domain.RiverBasin;
import com.ruoyi.obd.service.IRiverBasinService;

/**
 * 流域信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-03-27
 */
@Service
public class RiverBasinServiceImpl implements IRiverBasinService 
{
    @Autowired
    private RiverBasinMapper riverBasinMapper;

    /**
     * 查询流域信息
     * 
     * @param pkId 流域信息主键
     * @return 流域信息
     */
    @Override
    public RiverBasin selectRiverBasinByPkId(Long pkId)
    {
        return riverBasinMapper.selectRiverBasinByPkId(pkId);
    }

    /**
     * 查询流域信息列表
     * 
     * @param riverBasin 流域信息
     * @return 流域信息
     */
    @Override
    public List<RiverBasin> selectRiverBasinList(RiverBasin riverBasin)
    {
        return riverBasinMapper.selectRiverBasinList(riverBasin);
    }

    /**
     * 新增流域信息
     * 
     * @param riverBasin 流域信息
     * @return 结果
     */
    @Override
    public int insertRiverBasin(RiverBasin riverBasin)
    {
        return riverBasinMapper.insertRiverBasin(riverBasin);
    }

    /**
     * 修改流域信息
     * 
     * @param riverBasin 流域信息
     * @return 结果
     */
    @Override
    public int updateRiverBasin(RiverBasin riverBasin)
    {
        return riverBasinMapper.updateRiverBasin(riverBasin);
    }

    /**
     * 批量删除流域信息
     * 
     * @param pkIds 需要删除的流域信息主键
     * @return 结果
     */
    @Override
    public int deleteRiverBasinByPkIds(Long[] pkIds)
    {
        return riverBasinMapper.deleteRiverBasinByPkIds(pkIds);
    }

    /**
     * 删除流域信息信息
     * 
     * @param pkId 流域信息主键
     * @return 结果
     */
    @Override
    public int deleteRiverBasinByPkId(Long pkId)
    {
        return riverBasinMapper.deleteRiverBasinByPkId(pkId);
    }
}
