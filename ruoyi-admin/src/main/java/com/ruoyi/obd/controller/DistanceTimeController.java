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
import com.ruoyi.obd.domain.DistanceTime;
import com.ruoyi.obd.service.IDistanceTimeService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 距离时间Controller
 * 
 * @author ruoyi
 * @date 2025-03-31
 */
@RestController
@RequestMapping("/obd/DistanceTime")
public class DistanceTimeController extends BaseController
{
    @Autowired
    private IDistanceTimeService distanceTimeService;

    /**
     * 查询距离时间列表（不分页）
     */
    @PreAuthorize("@ss.hasPermi('obd:DistanceTime:list')")
    @GetMapping("/listall")
    public TableDataInfo listAll(DistanceTime distanceTime)
    {
        //startPage();
        List<DistanceTime> list = distanceTimeService.selectDistanceTimeList(distanceTime);
        return getDataTable(list);
    }

    /**
     * 查询距离时间列表
     */
    @PreAuthorize("@ss.hasPermi('obd:DistanceTime:list')")
    @GetMapping("/list")
    public TableDataInfo list(DistanceTime distanceTime)
    {
        startPage();
        List<DistanceTime> list = distanceTimeService.selectDistanceTimeList(distanceTime);
        return getDataTable(list);
    }

    /**
     * 导出距离时间列表
     */
    @PreAuthorize("@ss.hasPermi('obd:DistanceTime:export')")
    @Log(title = "距离时间", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DistanceTime distanceTime)
    {
        List<DistanceTime> list = distanceTimeService.selectDistanceTimeList(distanceTime);
        ExcelUtil<DistanceTime> util = new ExcelUtil<DistanceTime>(DistanceTime.class);
        util.exportExcel(response, list, "距离时间数据");
    }

    /**
     * 获取距离时间详细信息
     */
    @PreAuthorize("@ss.hasPermi('obd:DistanceTime:query')")
    @GetMapping(value = "/{pkId}")
    public AjaxResult getInfo(@PathVariable("pkId") Long pkId)
    {
        return success(distanceTimeService.selectDistanceTimeByPkId(pkId));
    }

    /**
     * 新增距离时间
     */
    @PreAuthorize("@ss.hasPermi('obd:DistanceTime:add')")
    @Log(title = "距离时间", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DistanceTime distanceTime)
    {
        return toAjax(distanceTimeService.insertDistanceTime(distanceTime));
    }

    /**
     * 修改距离时间
     */
    @PreAuthorize("@ss.hasPermi('obd:DistanceTime:edit')")
    @Log(title = "距离时间", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DistanceTime distanceTime)
    {
        return toAjax(distanceTimeService.updateDistanceTime(distanceTime));
    }

    /**
     * 删除距离时间
     */
    @PreAuthorize("@ss.hasPermi('obd:DistanceTime:remove')")
    @Log(title = "距离时间", businessType = BusinessType.DELETE)
	@DeleteMapping("/{pkIds}")
    public AjaxResult remove(@PathVariable Long[] pkIds)
    {
        return toAjax(distanceTimeService.deleteDistanceTimeByPkIds(pkIds));
    }
}
