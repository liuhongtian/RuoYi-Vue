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
import com.ruoyi.obd.domain.MonitorStation;
import com.ruoyi.obd.service.IMonitorStationService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 测站Controller
 * 
 * @author ruoyi
 * @date 2025-03-31
 */
@RestController
@RequestMapping("/obd/MonitorStation")
public class MonitorStationController extends BaseController
{
    @Autowired
    private IMonitorStationService monitorStationService;

    /**
     * 查询测站列表（不分页）
     */
    @PreAuthorize("@ss.hasPermi('obd:MonitorStation:list')")
    @GetMapping("/listall")
    public TableDataInfo listAll(MonitorStation monitorStation)
    {
        //startPage();
        List<MonitorStation> list = monitorStationService.selectMonitorStationList(monitorStation);
        return getDataTable(list);
    }

    /**
     * 查询测站列表
     */
    @PreAuthorize("@ss.hasPermi('obd:MonitorStation:list')")
    @GetMapping("/list")
    public TableDataInfo list(MonitorStation monitorStation)
    {
        startPage();
        List<MonitorStation> list = monitorStationService.selectMonitorStationList(monitorStation);
        return getDataTable(list);
    }

    /**
     * 导出测站列表
     */
    @PreAuthorize("@ss.hasPermi('obd:MonitorStation:export')")
    @Log(title = "测站", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, MonitorStation monitorStation)
    {
        List<MonitorStation> list = monitorStationService.selectMonitorStationList(monitorStation);
        ExcelUtil<MonitorStation> util = new ExcelUtil<MonitorStation>(MonitorStation.class);
        util.exportExcel(response, list, "测站数据");
    }

    /**
     * 获取测站详细信息
     */
    @PreAuthorize("@ss.hasPermi('obd:MonitorStation:query')")
    @GetMapping(value = "/{pkId}")
    public AjaxResult getInfo(@PathVariable("pkId") Long pkId)
    {
        return success(monitorStationService.selectMonitorStationByPkId(pkId));
    }

    /**
     * 新增测站
     */
    @PreAuthorize("@ss.hasPermi('obd:MonitorStation:add')")
    @Log(title = "测站", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody MonitorStation monitorStation)
    {
        return toAjax(monitorStationService.insertMonitorStation(monitorStation));
    }

    /**
     * 修改测站
     */
    @PreAuthorize("@ss.hasPermi('obd:MonitorStation:edit')")
    @Log(title = "测站", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody MonitorStation monitorStation)
    {
        return toAjax(monitorStationService.updateMonitorStation(monitorStation));
    }

    /**
     * 删除测站
     */
    @PreAuthorize("@ss.hasPermi('obd:MonitorStation:remove')")
    @Log(title = "测站", businessType = BusinessType.DELETE)
	@DeleteMapping("/{pkIds}")
    public AjaxResult remove(@PathVariable Long[] pkIds)
    {
        return toAjax(monitorStationService.deleteMonitorStationByPkIds(pkIds));
    }
}
