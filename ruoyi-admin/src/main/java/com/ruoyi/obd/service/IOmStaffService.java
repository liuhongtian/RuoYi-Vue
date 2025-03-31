package com.ruoyi.obd.service;

import java.util.List;
import com.ruoyi.obd.domain.OmStaff;

/**
 * 运维人员Service接口
 * 
 * @author ruoyi
 * @date 2025-03-31
 */
public interface IOmStaffService 
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
     * 批量删除运维人员
     * 
     * @param pkIds 需要删除的运维人员主键集合
     * @return 结果
     */
    public int deleteOmStaffByPkIds(Long[] pkIds);

    /**
     * 删除运维人员信息
     * 
     * @param pkId 运维人员主键
     * @return 结果
     */
    public int deleteOmStaffByPkId(Long pkId);
}
