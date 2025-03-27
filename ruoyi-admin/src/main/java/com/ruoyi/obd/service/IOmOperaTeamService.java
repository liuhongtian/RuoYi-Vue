package com.ruoyi.obd.service;

import java.util.List;
import com.ruoyi.obd.domain.OmOperaTeam;

/**
 * 运维小组Service接口
 * 
 * @author ruoyi
 * @date 2025-03-27
 */
public interface IOmOperaTeamService 
{
    /**
     * 查询运维小组
     * 
     * @param pkId 运维小组主键
     * @return 运维小组
     */
    public OmOperaTeam selectOmOperaTeamByPkId(Long pkId);

    /**
     * 查询运维小组列表
     * 
     * @param omOperaTeam 运维小组
     * @return 运维小组集合
     */
    public List<OmOperaTeam> selectOmOperaTeamList(OmOperaTeam omOperaTeam);

    /**
     * 新增运维小组
     * 
     * @param omOperaTeam 运维小组
     * @return 结果
     */
    public int insertOmOperaTeam(OmOperaTeam omOperaTeam);

    /**
     * 修改运维小组
     * 
     * @param omOperaTeam 运维小组
     * @return 结果
     */
    public int updateOmOperaTeam(OmOperaTeam omOperaTeam);

    /**
     * 批量删除运维小组
     * 
     * @param pkIds 需要删除的运维小组主键集合
     * @return 结果
     */
    public int deleteOmOperaTeamByPkIds(Long[] pkIds);

    /**
     * 删除运维小组信息
     * 
     * @param pkId 运维小组主键
     * @return 结果
     */
    public int deleteOmOperaTeamByPkId(Long pkId);
}
