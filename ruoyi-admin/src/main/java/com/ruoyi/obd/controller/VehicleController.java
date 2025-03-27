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
import com.ruoyi.obd.domain.Vehicle;
import com.ruoyi.obd.service.IVehicleService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 车辆信息Controller
 * 
 * @author ruoyi
 * @date 2025-03-27
 */
@RestController
@RequestMapping("/obd/Vehicle")
public class VehicleController extends BaseController
{
    @Autowired
    private IVehicleService vehicleService;

    /**
     * 查询车辆信息列表（不分页）
     */
    @PreAuthorize("@ss.hasPermi('obd:Vehicle:list')")
    @GetMapping("/listall")
    public TableDataInfo listAll(Vehicle vehicle)
    {
        //startPage();
        List<Vehicle> list = vehicleService.selectVehicleList(vehicle);
        return getDataTable(list);
    }

    /**
     * 查询车辆信息列表
     */
    @PreAuthorize("@ss.hasPermi('obd:Vehicle:list')")
    @GetMapping("/list")
    public TableDataInfo list(Vehicle vehicle)
    {
        startPage();
        List<Vehicle> list = vehicleService.selectVehicleList(vehicle);
        return getDataTable(list);
    }

    /**
     * 导出车辆信息列表
     */
    @PreAuthorize("@ss.hasPermi('obd:Vehicle:export')")
    @Log(title = "车辆信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Vehicle vehicle)
    {
        List<Vehicle> list = vehicleService.selectVehicleList(vehicle);
        ExcelUtil<Vehicle> util = new ExcelUtil<Vehicle>(Vehicle.class);
        util.exportExcel(response, list, "车辆信息数据");
    }

    /**
     * 获取车辆信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('obd:Vehicle:query')")
    @GetMapping(value = "/{pkId}")
    public AjaxResult getInfo(@PathVariable("pkId") Long pkId)
    {
        return success(vehicleService.selectVehicleByPkId(pkId));
    }

    /**
     * 新增车辆信息
     */
    @PreAuthorize("@ss.hasPermi('obd:Vehicle:add')")
    @Log(title = "车辆信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Vehicle vehicle)
    {
        return toAjax(vehicleService.insertVehicle(vehicle));
    }

    /**
     * 修改车辆信息
     */
    @PreAuthorize("@ss.hasPermi('obd:Vehicle:edit')")
    @Log(title = "车辆信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Vehicle vehicle)
    {
        return toAjax(vehicleService.updateVehicle(vehicle));
    }

    /**
     * 删除车辆信息
     */
    @PreAuthorize("@ss.hasPermi('obd:Vehicle:remove')")
    @Log(title = "车辆信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{pkIds}")
    public AjaxResult remove(@PathVariable Long[] pkIds)
    {
        return toAjax(vehicleService.deleteVehicleByPkIds(pkIds));
    }
}
