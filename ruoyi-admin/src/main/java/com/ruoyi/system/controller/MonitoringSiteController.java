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
import com.ruoyi.system.domain.MonitoringSite;
import com.ruoyi.system.service.IMonitoringSiteService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 监测站点Controller
 * 
 * @author ruoyi
 * @date 2025-03-24
 */
@RestController
@RequestMapping("/system/site")
public class MonitoringSiteController extends BaseController
{
    @Autowired
    private IMonitoringSiteService monitoringSiteService;

    /**
     * 查询监测站点列表
     */
    @PreAuthorize("@ss.hasPermi('system:site:list')")
    @GetMapping("/list")
    public TableDataInfo list(MonitoringSite monitoringSite)
    {
        startPage();
        List<MonitoringSite> list = monitoringSiteService.selectMonitoringSiteList(monitoringSite);
        return getDataTable(list);
    }

    /**
     * 导出监测站点列表
     */
    @PreAuthorize("@ss.hasPermi('system:site:export')")
    @Log(title = "监测站点", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, MonitoringSite monitoringSite)
    {
        List<MonitoringSite> list = monitoringSiteService.selectMonitoringSiteList(monitoringSite);
        ExcelUtil<MonitoringSite> util = new ExcelUtil<MonitoringSite>(MonitoringSite.class);
        util.exportExcel(response, list, "监测站点数据");
    }

    /**
     * 获取监测站点详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:site:query')")
    @GetMapping(value = "/{siteId}")
    public AjaxResult getInfo(@PathVariable("siteId") Long siteId)
    {
        return success(monitoringSiteService.selectMonitoringSiteBySiteId(siteId));
    }

    /**
     * 新增监测站点
     */
    @PreAuthorize("@ss.hasPermi('system:site:add')")
    @Log(title = "监测站点", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody MonitoringSite monitoringSite)
    {
        return toAjax(monitoringSiteService.insertMonitoringSite(monitoringSite));
    }

    /**
     * 修改监测站点
     */
    @PreAuthorize("@ss.hasPermi('system:site:edit')")
    @Log(title = "监测站点", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody MonitoringSite monitoringSite)
    {
        return toAjax(monitoringSiteService.updateMonitoringSite(monitoringSite));
    }

    /**
     * 删除监测站点
     */
    @PreAuthorize("@ss.hasPermi('system:site:remove')")
    @Log(title = "监测站点", businessType = BusinessType.DELETE)
	@DeleteMapping("/{siteIds}")
    public AjaxResult remove(@PathVariable Long[] siteIds)
    {
        return toAjax(monitoringSiteService.deleteMonitoringSiteBySiteIds(siteIds));
    }
}
