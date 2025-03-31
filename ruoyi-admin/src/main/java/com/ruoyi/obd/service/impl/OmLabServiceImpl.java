package com.ruoyi.obd.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.obd.mapper.OmLabMapper;
import com.ruoyi.obd.domain.OmLab;
import com.ruoyi.obd.service.IOmLabService;

/**
 * 实验室Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-03-31
 */
@Service
public class OmLabServiceImpl implements IOmLabService 
{
    @Autowired
    private OmLabMapper omLabMapper;

    /**
     * 查询实验室
     * 
     * @param pkId 实验室主键
     * @return 实验室
     */
    @Override
    public OmLab selectOmLabByPkId(Long pkId)
    {
        return omLabMapper.selectOmLabByPkId(pkId);
    }

    /**
     * 查询实验室列表
     * 
     * @param omLab 实验室
     * @return 实验室
     */
    @Override
    public List<OmLab> selectOmLabList(OmLab omLab)
    {
        return omLabMapper.selectOmLabList(omLab);
    }

    /**
     * 新增实验室
     * 
     * @param omLab 实验室
     * @return 结果
     */
    @Override
    public int insertOmLab(OmLab omLab)
    {
        return omLabMapper.insertOmLab(omLab);
    }

    /**
     * 修改实验室
     * 
     * @param omLab 实验室
     * @return 结果
     */
    @Override
    public int updateOmLab(OmLab omLab)
    {
        return omLabMapper.updateOmLab(omLab);
    }

    /**
     * 批量删除实验室
     * 
     * @param pkIds 需要删除的实验室主键
     * @return 结果
     */
    @Override
    public int deleteOmLabByPkIds(Long[] pkIds)
    {
        return omLabMapper.deleteOmLabByPkIds(pkIds);
    }

    /**
     * 删除实验室信息
     * 
     * @param pkId 实验室主键
     * @return 结果
     */
    @Override
    public int deleteOmLabByPkId(Long pkId)
    {
        return omLabMapper.deleteOmLabByPkId(pkId);
    }
}
