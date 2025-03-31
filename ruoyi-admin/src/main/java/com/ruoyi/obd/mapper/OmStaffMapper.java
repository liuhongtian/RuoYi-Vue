package com.ruoyi.obd.mapper;

import java.util.List;
import com.ruoyi.obd.domain.OmStaff;

/**
 * 运维人员Mapper接口
 * 
 * @author ruoyi
 * @date 2025-03-31
 */
public interface OmStaffMapper 
{
    /**
     * 查询运维人员
     * 
     * @param pkId 运维人员主键
     * @return 运维人员
     */
    public OmStaff selectOmStaffByPkId(Long pkId);

    /**
     * 查询运维人员列表
     * 
     * @param omStaff 运维人员
     * @return 运维人员集合
     */
    public List<OmStaff> selectOmStaffList(OmStaff omStaff);

    /**
     * 新增运维人员
     * 
     * @param omStaff 运维人员
     * @return 结果
     */
    public int insertOmStaff(OmStaff omStaff);

    /**
     * 修改运维人员
     * 
     * @param omStaff 运维人员
     * @return 结果
     */
    public int updateOmStaff(OmStaff omStaff);

    /**
     * 删除运维人员
     * 
     * @param pkId 运维人员主键
     * @return 结果
     */
    public int deleteOmStaffByPkId(Long pkId);

    /**
     * 批量删除运维人员
     * 
     * @param pkIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteOmStaffByPkIds(Long[] pkIds);
}
