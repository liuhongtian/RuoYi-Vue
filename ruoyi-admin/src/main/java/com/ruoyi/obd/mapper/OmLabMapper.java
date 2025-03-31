package com.ruoyi.obd.mapper;

import java.util.List;
import com.ruoyi.obd.domain.OmLab;

/**
 * 实验室Mapper接口
 * 
 * @author ruoyi
 * @date 2025-03-31
 */
public interface OmLabMapper 
{
    /**
     * 查询实验室
     * 
     * @param pkId 实验室主键
     * @return 实验室
     */
    public OmLab selectOmLabByPkId(Long pkId);

    /**
     * 查询实验室列表
     * 
     * @param omLab 实验室
     * @return 实验室集合
     */
    public List<OmLab> selectOmLabList(OmLab omLab);

    /**
     * 新增实验室
     * 
     * @param omLab 实验室
     * @return 结果
     */
    public int insertOmLab(OmLab omLab);

    /**
     * 修改实验室
     * 
     * @param omLab 实验室
     * @return 结果
     */
    public int updateOmLab(OmLab omLab);

    /**
     * 删除实验室
     * 
     * @param pkId 实验室主键
     * @return 结果
     */
    public int deleteOmLabByPkId(Long pkId);

    /**
     * 批量删除实验室
     * 
     * @param pkIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteOmLabByPkIds(Long[] pkIds);
}
