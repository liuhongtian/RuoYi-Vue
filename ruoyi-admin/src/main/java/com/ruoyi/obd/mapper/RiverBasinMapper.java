package com.ruoyi.obd.mapper;

import java.util.List;
import com.ruoyi.obd.domain.RiverBasin;

/**
 * 流域信息Mapper接口
 * 
 * @author ruoyi
 * @date 2025-03-27
 */
public interface RiverBasinMapper 
{
    /**
     * 查询流域信息
     * 
     * @param pkId 流域信息主键
     * @return 流域信息
     */
    public RiverBasin selectRiverBasinByPkId(Long pkId);

    /**
     * 查询流域信息列表
     * 
     * @param riverBasin 流域信息
     * @return 流域信息集合
     */
    public List<RiverBasin> selectRiverBasinList(RiverBasin riverBasin);

    /**
     * 新增流域信息
     * 
     * @param riverBasin 流域信息
     * @return 结果
     */
    public int insertRiverBasin(RiverBasin riverBasin);

    /**
     * 修改流域信息
     * 
     * @param riverBasin 流域信息
     * @return 结果
     */
    public int updateRiverBasin(RiverBasin riverBasin);

    /**
     * 删除流域信息
     * 
     * @param pkId 流域信息主键
     * @return 结果
     */
    public int deleteRiverBasinByPkId(Long pkId);

    /**
     * 批量删除流域信息
     * 
     * @param pkIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteRiverBasinByPkIds(Long[] pkIds);
}
