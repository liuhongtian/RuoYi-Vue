package com.ruoyi.obd.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.obd.mapper.OmStaffMapper;
import com.ruoyi.obd.domain.OmStaff;
import com.ruoyi.obd.service.IOmStaffService;

/**
 * 运维人员Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-03-31
 */
@Service
public class OmStaffServiceImpl implements IOmStaffService 
{
    @Autowired
    private OmStaffMapper omStaffMapper;

    /**
     * 查询运维人员
     * 
     * @param pkId 运维人员主键
     * @return 运维人员
     */
    @Override
    public OmStaff selectOmStaffByPkId(Long pkId)
    {
        return omStaffMapper.selectOmStaffByPkId(pkId);
    }

    /**
     * 查询运维人员列表
     * 
     * @param omStaff 运维人员
     * @return 运维人员
     */
    @Override
    public List<OmStaff> selectOmStaffList(OmStaff omStaff)
    {
        return omStaffMapper.selectOmStaffList(omStaff);
    }

    /**
     * 新增运维人员
     * 
     * @param omStaff 运维人员
     * @return 结果
     */
    @Override
    public int insertOmStaff(OmStaff omStaff)
    {
        return omStaffMapper.insertOmStaff(omStaff);
    }

    /**
     * 修改运维人员
     * 
     * @param omStaff 运维人员
     * @return 结果
     */
    @Override
    public int updateOmStaff(OmStaff omStaff)
    {
        return omStaffMapper.updateOmStaff(omStaff);
    }

    /**
     * 批量删除运维人员
     * 
     * @param pkIds 需要删除的运维人员主键
     * @return 结果
     */
    @Override
    public int deleteOmStaffByPkIds(Long[] pkIds)
    {
        return omStaffMapper.deleteOmStaffByPkIds(pkIds);
    }

    /**
     * 删除运维人员信息
     * 
     * @param pkId 运维人员主键
     * @return 结果
     */
    @Override
    public int deleteOmStaffByPkId(Long pkId)
    {
        return omStaffMapper.deleteOmStaffByPkId(pkId);
    }
}
