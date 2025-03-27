package com.ruoyi.obd.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.obd.domain.ObdMonthPlan;
import com.ruoyi.obd.service.IObdMonthPlanService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 月度计划跟踪Controller
 * 
 * @author ruoyi
 * @date 2025-03-27
 */
@RestController
@RequestMapping("/obd/ObdMonthPlan")
public class ObdMonthPlanController extends BaseController
{
    @Autowired
    private IObdMonthPlanService obdMonthPlanService;

    /**
     * 查询月度计划跟踪列表（不分页）
     */
    @PreAuthorize("@ss.hasPermi('obd:ObdMonthPlan:list')")
    @GetMapping("/listall")
    public TableDataInfo listAll(ObdMonthPlan obdMonthPlan)
    {
        //startPage();
        List<ObdMonthPlan> list = obdMonthPlanService.selectObdMonthPlanList(obdMonthPlan);
        return getDataTable(list);
    }

    /**
     * 查询月度计划跟踪列表
     */
    @PreAuthorize("@ss.hasPermi('obd:ObdMonthPlan:list')")
    @GetMapping("/list")
    public TableDataInfo list(ObdMonthPlan obdMonthPlan)
    {
        startPage();
        List<ObdMonthPlan> list = obdMonthPlanService.selectObdMonthPlanList(obdMonthPlan);
        return getDataTable(list);
    }

    /**
     * 导出月度计划跟踪列表
     */
    @PreAuthorize("@ss.hasPermi('obd:ObdMonthPlan:export')")
    @Log(title = "月度计划跟踪", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ObdMonthPlan obdMonthPlan)
    {
        List<ObdMonthPlan> list = obdMonthPlanService.selectObdMonthPlanList(obdMonthPlan);
        ExcelUtil<ObdMonthPlan> util = new ExcelUtil<ObdMonthPlan>(ObdMonthPlan.class);
        util.exportExcel(response, list, "月度计划跟踪数据");
    }

    /**
     * 获取月度计划跟踪详细信息
     */
    @PreAuthorize("@ss.hasPermi('obd:ObdMonthPlan:query')")
    @GetMapping(value = "/{pkId}")
    public AjaxResult getInfo(@PathVariable("pkId") Long pkId)
    {
        return success(obdMonthPlanService.selectObdMonthPlanByPkId(pkId));
    }

    /**
     * 新增月度计划跟踪
     */
    @PreAuthorize("@ss.hasPermi('obd:ObdMonthPlan:add')")
    @Log(title = "月度计划跟踪", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ObdMonthPlan obdMonthPlan)
    {
        return toAjax(obdMonthPlanService.insertObdMonthPlan(obdMonthPlan));
    }

    /**
     * 修改月度计划跟踪
     */
    @PreAuthorize("@ss.hasPermi('obd:ObdMonthPlan:edit')")
    @Log(title = "月度计划跟踪", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ObdMonthPlan obdMonthPlan)
    {
        return toAjax(obdMonthPlanService.updateObdMonthPlan(obdMonthPlan));
    }

    /**
     * 删除月度计划跟踪
     */
    @PreAuthorize("@ss.hasPermi('obd:ObdMonthPlan:remove')")
    @Log(title = "月度计划跟踪", businessType = BusinessType.DELETE)
	@DeleteMapping("/{pkIds}")
    public AjaxResult remove(@PathVariable Long[] pkIds)
    {
        return toAjax(obdMonthPlanService.deleteObdMonthPlanByPkIds(pkIds));
    }
}
