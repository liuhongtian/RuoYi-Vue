package com.ruoyi.obd.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.obd.mapper.ObdMonthPlanMapper;
import com.ruoyi.obd.domain.ObdMonthPlan;
import com.ruoyi.obd.service.IObdMonthPlanService;

/**
 * 月度计划跟踪Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-03-27
 */
@Service
public class ObdMonthPlanServiceImpl implements IObdMonthPlanService 
{
    @Autowired
    private ObdMonthPlanMapper obdMonthPlanMapper;

    /**
     * 查询月度计划跟踪
     * 
     * @param pkId 月度计划跟踪主键
     * @return 月度计划跟踪
     */
    @Override
    public ObdMonthPlan selectObdMonthPlanByPkId(Long pkId)
    {
        return obdMonthPlanMapper.selectObdMonthPlanByPkId(pkId);
    }

    /**
     * 查询月度计划跟踪列表
     * 
     * @param obdMonthPlan 月度计划跟踪
     * @return 月度计划跟踪
     */
    @Override
    public List<ObdMonthPlan> selectObdMonthPlanList(ObdMonthPlan obdMonthPlan)
    {
        return obdMonthPlanMapper.selectObdMonthPlanList(obdMonthPlan);
    }

    /**
     * 新增月度计划跟踪
     * 
     * @param obdMonthPlan 月度计划跟踪
     * @return 结果
     */
    @Override
    public int insertObdMonthPlan(ObdMonthPlan obdMonthPlan)
    {
        return obdMonthPlanMapper.insertObdMonthPlan(obdMonthPlan);
    }

    /**
     * 修改月度计划跟踪
     * 
     * @param obdMonthPlan 月度计划跟踪
     * @return 结果
     */
    @Override
    public int updateObdMonthPlan(ObdMonthPlan obdMonthPlan)
    {
        return obdMonthPlanMapper.updateObdMonthPlan(obdMonthPlan);
    }

    /**
     * 批量删除月度计划跟踪
     * 
     * @param pkIds 需要删除的月度计划跟踪主键
     * @return 结果
     */
    @Override
    public int deleteObdMonthPlanByPkIds(Long[] pkIds)
    {
        return obdMonthPlanMapper.deleteObdMonthPlanByPkIds(pkIds);
    }

    /**
     * 删除月度计划跟踪信息
     * 
     * @param pkId 月度计划跟踪主键
     * @return 结果
     */
    @Override
    public int deleteObdMonthPlanByPkId(Long pkId)
    {
        return obdMonthPlanMapper.deleteObdMonthPlanByPkId(pkId);
    }
}
