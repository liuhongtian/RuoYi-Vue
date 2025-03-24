package com.ruoyi.system.controller;

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
import com.ruoyi.system.domain.WaterSampleTask;
import com.ruoyi.system.service.IWaterSampleTaskService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 水样采样任务Controller
 * 
 * @author ruoyi
 * @date 2025-03-24
 */
@RestController
@RequestMapping("/system/task")
public class WaterSampleTaskController extends BaseController
{
    @Autowired
    private IWaterSampleTaskService waterSampleTaskService;

    /**
     * 查询水样采样任务列表
     */
    @PreAuthorize("@ss.hasPermi('system:task:list')")
    @GetMapping("/list")
    public TableDataInfo list(WaterSampleTask waterSampleTask)
    {
        startPage();
        List<WaterSampleTask> list = waterSampleTaskService.selectWaterSampleTaskList(waterSampleTask);
        return getDataTable(list);
    }

    /**
     * 导出水样采样任务列表
     */
    @PreAuthorize("@ss.hasPermi('system:task:export')")
    @Log(title = "水样采样任务", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, WaterSampleTask waterSampleTask)
    {
        List<WaterSampleTask> list = waterSampleTaskService.selectWaterSampleTaskList(waterSampleTask);
        ExcelUtil<WaterSampleTask> util = new ExcelUtil<WaterSampleTask>(WaterSampleTask.class);
        util.exportExcel(response, list, "水样采样任务数据");
    }

    /**
     * 获取水样采样任务详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:task:query')")
    @GetMapping(value = "/{pkId}")
    public AjaxResult getInfo(@PathVariable("pkId") Long pkId)
    {
        return success(waterSampleTaskService.selectWaterSampleTaskByPkId(pkId));
    }

    /**
     * 新增水样采样任务
     */
    @PreAuthorize("@ss.hasPermi('system:task:add')")
    @Log(title = "水样采样任务", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody WaterSampleTask waterSampleTask)
    {
        return toAjax(waterSampleTaskService.insertWaterSampleTask(waterSampleTask));
    }

    /**
     * 修改水样采样任务
     */
    @PreAuthorize("@ss.hasPermi('system:task:edit')")
    @Log(title = "水样采样任务", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody WaterSampleTask waterSampleTask)
    {
        return toAjax(waterSampleTaskService.updateWaterSampleTask(waterSampleTask));
    }

    /**
     * 删除水样采样任务
     */
    @PreAuthorize("@ss.hasPermi('system:task:remove')")
    @Log(title = "水样采样任务", businessType = BusinessType.DELETE)
	@DeleteMapping("/{pkIds}")
    public AjaxResult remove(@PathVariable Long[] pkIds)
    {
        return toAjax(waterSampleTaskService.deleteWaterSampleTaskByPkIds(pkIds));
    }
}
