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
import com.ruoyi.obd.domain.JobTime;
import com.ruoyi.obd.service.IJobTimeService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 单项任务作业时间Controller
 * 
 * @author ruoyi
 * @date 2025-03-31
 */
@RestController
@RequestMapping("/obd/JobTime")
public class JobTimeController extends BaseController
{
    @Autowired
    private IJobTimeService jobTimeService;

    /**
     * 查询单项任务作业时间列表（不分页）
     */
    @PreAuthorize("@ss.hasPermi('obd:JobTime:list')")
    @GetMapping("/listall")
    public TableDataInfo listAll(JobTime jobTime)
    {
        //startPage();
        List<JobTime> list = jobTimeService.selectJobTimeList(jobTime);
        return getDataTable(list);
    }

    /**
     * 查询单项任务作业时间列表
     */
    @PreAuthorize("@ss.hasPermi('obd:JobTime:list')")
    @GetMapping("/list")
    public TableDataInfo list(JobTime jobTime)
    {
        startPage();
        List<JobTime> list = jobTimeService.selectJobTimeList(jobTime);
        return getDataTable(list);
    }

    /**
     * 导出单项任务作业时间列表
     */
    @PreAuthorize("@ss.hasPermi('obd:JobTime:export')")
    @Log(title = "单项任务作业时间", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, JobTime jobTime)
    {
        List<JobTime> list = jobTimeService.selectJobTimeList(jobTime);
        ExcelUtil<JobTime> util = new ExcelUtil<JobTime>(JobTime.class);
        util.exportExcel(response, list, "单项任务作业时间数据");
    }

    /**
     * 获取单项任务作业时间详细信息
     */
    @PreAuthorize("@ss.hasPermi('obd:JobTime:query')")
    @GetMapping(value = "/{pkId}")
    public AjaxResult getInfo(@PathVariable("pkId") Long pkId)
    {
        return success(jobTimeService.selectJobTimeByPkId(pkId));
    }

    /**
     * 新增单项任务作业时间
     */
    @PreAuthorize("@ss.hasPermi('obd:JobTime:add')")
    @Log(title = "单项任务作业时间", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody JobTime jobTime)
    {
        return toAjax(jobTimeService.insertJobTime(jobTime));
    }

    /**
     * 修改单项任务作业时间
     */
    @PreAuthorize("@ss.hasPermi('obd:JobTime:edit')")
    @Log(title = "单项任务作业时间", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody JobTime jobTime)
    {
        return toAjax(jobTimeService.updateJobTime(jobTime));
    }

    /**
     * 删除单项任务作业时间
     */
    @PreAuthorize("@ss.hasPermi('obd:JobTime:remove')")
    @Log(title = "单项任务作业时间", businessType = BusinessType.DELETE)
	@DeleteMapping("/{pkIds}")
    public AjaxResult remove(@PathVariable Long[] pkIds)
    {
        return toAjax(jobTimeService.deleteJobTimeByPkIds(pkIds));
    }
}
