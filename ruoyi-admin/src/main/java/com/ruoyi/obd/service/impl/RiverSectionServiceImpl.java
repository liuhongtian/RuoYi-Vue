package com.ruoyi.obd.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.obd.mapper.RiverSectionMapper;
import com.ruoyi.obd.domain.RiverSection;
import com.ruoyi.obd.service.IRiverSectionService;

/**
 * 断面Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-03-31
 */
@Service
public class RiverSectionServiceImpl implements IRiverSectionService 
{
    @Autowired
    private RiverSectionMapper riverSectionMapper;

    /**
     * 查询断面
     * 
     * @param pkId 断面主键
     * @return 断面
     */
    @Override
    public RiverSection selectRiverSectionByPkId(Long pkId)
    {
        return riverSectionMapper.selectRiverSectionByPkId(pkId);
    }

    /**
     * 查询断面列表
     * 
     * @param riverSection 断面
     * @return 断面
     */
    @Override
    public List<RiverSection> selectRiverSectionList(RiverSection riverSection)
    {
        return riverSectionMapper.selectRiverSectionList(riverSection);
    }

    /**
     * 新增断面
     * 
     * @param riverSection 断面
     * @return 结果
     */
    @Override
    public int insertRiverSection(RiverSection riverSection)
    {
        return riverSectionMapper.insertRiverSection(riverSection);
    }

    /**
     * 修改断面
     * 
     * @param riverSection 断面
     * @return 结果
     */
    @Override
    public int updateRiverSection(RiverSection riverSection)
    {
        return riverSectionMapper.updateRiverSection(riverSection);
    }

    /**
     * 批量删除断面
     * 
     * @param pkIds 需要删除的断面主键
     * @return 结果
     */
    @Override
    public int deleteRiverSectionByPkIds(Long[] pkIds)
    {
        return riverSectionMapper.deleteRiverSectionByPkIds(pkIds);
    }

    /**
     * 删除断面信息
     * 
     * @param pkId 断面主键
     * @return 结果
     */
    @Override
    public int deleteRiverSectionByPkId(Long pkId)
    {
        return riverSectionMapper.deleteRiverSectionByPkId(pkId);
    }
}
