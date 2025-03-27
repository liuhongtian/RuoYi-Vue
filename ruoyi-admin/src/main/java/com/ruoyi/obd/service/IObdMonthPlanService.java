package com.ruoyi.obd.service;

import java.util.List;
import com.ruoyi.obd.domain.ObdMonthPlan;

/**
 * 月度计划跟踪Service接口
 * 
 * @author ruoyi
 * @date 2025-03-27
 */
public interface IObdMonthPlanService 
{
    /**
     * 查询月度计划跟踪
     * 
     * @param pkId 月度计划跟踪主键
     * @return 月度计划跟踪
     */
    public ObdMonthPlan selectObdMonthPlanByPkId(Long pkId);

    /**
     * 查询月度计划跟踪列表
     * 
     * @param obdMonthPlan 月度计划跟踪
     * @return 月度计划跟踪集合
     */
    public List<ObdMonthPlan> selectObdMonthPlanList(ObdMonthPlan obdMonthPlan);

    /**
     * 新增月度计划跟踪
     * 
     * @param obdMonthPlan 月度计划跟踪
     * @return 结果
     */
    public int insertObdMonthPlan(ObdMonthPlan obdMonthPlan);

    /**
     * 修改月度计划跟踪
     * 
     * @param obdMonthPlan 月度计划跟踪
     * @return 结果
     */
    public int updateObdMonthPlan(ObdMonthPlan obdMonthPlan);

    /**
     * 批量删除月度计划跟踪
     * 
     * @param pkIds 需要删除的月度计划跟踪主键集合
     * @return 结果
     */
    public int deleteObdMonthPlanByPkIds(Long[] pkIds);

    /**
     * 删除月度计划跟踪信息
     * 
     * @param pkId 月度计划跟踪主键
     * @return 结果
     */
    public int deleteObdMonthPlanByPkId(Long pkId);
}
