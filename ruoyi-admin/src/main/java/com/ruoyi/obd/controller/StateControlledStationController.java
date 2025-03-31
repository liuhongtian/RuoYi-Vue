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
import com.ruoyi.obd.domain.StateControlledStation;
import com.ruoyi.obd.service.IStateControlledStationService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 国控站点Controller
 * 
 * @author ruoyi
 * @date 2025-03-31
 */
@RestController
@RequestMapping("/obd/StateControlledStation")
public class StateControlledStationController extends BaseController
{
    @Autowired
    private IStateControlledStationService stateControlledStationService;

    /**
     * 查询国控站点列表（不分页）
     */
    @PreAuthorize("@ss.hasPermi('obd:StateControlledStation:list')")
    @GetMapping("/listall")
    public TableDataInfo listAll(StateControlledStation stateControlledStation)
    {
        //startPage();
        List<StateControlledStation> list = stateControlledStationService.selectStateControlledStationList(stateControlledStation);
        return getDataTable(list);
    }

    /**
     * 查询国控站点列表
     */
    @PreAuthorize("@ss.hasPermi('obd:StateControlledStation:list')")
    @GetMapping("/list")
    public TableDataInfo list(StateControlledStation stateControlledStation)
    {
        startPage();
        List<StateControlledStation> list = stateControlledStationService.selectStateControlledStationList(stateControlledStation);
        return getDataTable(list);
    }

    /**
     * 导出国控站点列表
     */
    @PreAuthorize("@ss.hasPermi('obd:StateControlledStation:export')")
    @Log(title = "国控站点", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, StateControlledStation stateControlledStation)
    {
        List<StateControlledStation> list = stateControlledStationService.selectStateControlledStationList(stateControlledStation);
        ExcelUtil<StateControlledStation> util = new ExcelUtil<StateControlledStation>(StateControlledStation.class);
        util.exportExcel(response, list, "国控站点数据");
    }

    /**
     * 获取国控站点详细信息
     */
    @PreAuthorize("@ss.hasPermi('obd:StateControlledStation:query')")
    @GetMapping(value = "/{pkId}")
    public AjaxResult getInfo(@PathVariable("pkId") Long pkId)
    {
        return success(stateControlledStationService.selectStateControlledStationByPkId(pkId));
    }

    /**
     * 新增国控站点
     */
    @PreAuthorize("@ss.hasPermi('obd:StateControlledStation:add')")
    @Log(title = "国控站点", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody StateControlledStation stateControlledStation)
    {
        return toAjax(stateControlledStationService.insertStateControlledStation(stateControlledStation));
    }

    /**
     * 修改国控站点
     */
    @PreAuthorize("@ss.hasPermi('obd:StateControlledStation:edit')")
    @Log(title = "国控站点", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody StateControlledStation stateControlledStation)
    {
        return toAjax(stateControlledStationService.updateStateControlledStation(stateControlledStation));
    }

    /**
     * 删除国控站点
     */
    @PreAuthorize("@ss.hasPermi('obd:StateControlledStation:remove')")
    @Log(title = "国控站点", businessType = BusinessType.DELETE)
	@DeleteMapping("/{pkIds}")
    public AjaxResult remove(@PathVariable Long[] pkIds)
    {
        return toAjax(stateControlledStationService.deleteStateControlledStationByPkIds(pkIds));
    }
}
