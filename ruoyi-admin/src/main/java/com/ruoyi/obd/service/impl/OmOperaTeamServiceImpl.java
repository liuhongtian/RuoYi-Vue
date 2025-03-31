package com.ruoyi.obd.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.obd.mapper.OmOperaTeamMapper;
import com.ruoyi.obd.domain.OmOperaTeam;
import com.ruoyi.obd.service.IOmOperaTeamService;

/**
 * 运维小组Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-03-31
 */
@Service
public class OmOperaTeamServiceImpl implements IOmOperaTeamService 
{
    @Autowired
    private OmOperaTeamMapper omOperaTeamMapper;

    /**
     * 查询运维小组
     * 
     * @param pkId 运维小组主键
     * @return 运维小组
     */
    @Override
    public OmOperaTeam selectOmOperaTeamByPkId(Long pkId)
    {
        return omOperaTeamMapper.selectOmOperaTeamByPkId(pkId);
    }

    /**
     * 查询运维小组列表
     * 
     * @param omOperaTeam 运维小组
     * @return 运维小组
     */
    @Override
    public List<OmOperaTeam> selectOmOperaTeamList(OmOperaTeam omOperaTeam)
    {
        return omOperaTeamMapper.selectOmOperaTeamList(omOperaTeam);
    }

    /**
     * 新增运维小组
     * 
     * @param omOperaTeam 运维小组
     * @return 结果
     */
    @Override
    public int insertOmOperaTeam(OmOperaTeam omOperaTeam)
    {
        return omOperaTeamMapper.insertOmOperaTeam(omOperaTeam);
    }

    /**
     * 修改运维小组
     * 
     * @param omOperaTeam 运维小组
     * @return 结果
     */
    @Override
    public int updateOmOperaTeam(OmOperaTeam omOperaTeam)
    {
        return omOperaTeamMapper.updateOmOperaTeam(omOperaTeam);
    }

    /**
     * 批量删除运维小组
     * 
     * @param pkIds 需要删除的运维小组主键
     * @return 结果
     */
    @Override
    public int deleteOmOperaTeamByPkIds(Long[] pkIds)
    {
        return omOperaTeamMapper.deleteOmOperaTeamByPkIds(pkIds);
    }

    /**
     * 删除运维小组信息
     * 
     * @param pkId 运维小组主键
     * @return 结果
     */
    @Override
    public int deleteOmOperaTeamByPkId(Long pkId)
    {
        return omOperaTeamMapper.deleteOmOperaTeamByPkId(pkId);
    }
}
