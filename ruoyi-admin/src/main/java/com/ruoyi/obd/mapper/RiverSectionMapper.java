package com.ruoyi.obd.mapper;

import java.util.List;
import com.ruoyi.obd.domain.RiverSection;

/**
 * 断面Mapper接口
 * 
 * @author ruoyi
 * @date 2025-03-31
 */
public interface RiverSectionMapper 
{
    /**
     * 查询断面
     * 
     * @param pkId 断面主键
     * @return 断面
     */
    public RiverSection selectRiverSectionByPkId(Long pkId);

    /**
     * 查询断面列表
     * 
     * @param riverSection 断面
     * @return 断面集合
     */
    public List<RiverSection> selectRiverSectionList(RiverSection riverSection);

    /**
     * 新增断面
     * 
     * @param riverSection 断面
     * @return 结果
     */
    public int insertRiverSection(RiverSection riverSection);

    /**
     * 修改断面
     * 
     * @param riverSection 断面
     * @return 结果
     */
    public int updateRiverSection(RiverSection riverSection);

    /**
     * 删除断面
     * 
     * @param pkId 断面主键
     * @return 结果
     */
    public int deleteRiverSectionByPkId(Long pkId);

    /**
     * 批量删除断面
     * 
     * @param pkIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteRiverSectionByPkIds(Long[] pkIds);
}
