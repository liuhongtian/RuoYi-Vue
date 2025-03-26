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
import com.ruoyi.obd.domain.IniCity;
import com.ruoyi.obd.service.IIniCityService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 城市信息Controller
 * 
 * @author ruoyi
 * @date 2025-03-26
 */
@RestController
@RequestMapping("/obd/City")
public class IniCityController extends BaseController
{
    @Autowired
    private IIniCityService iniCityService;

    /**
     * 查询城市信息列表（不分页）
     */
    @PreAuthorize("@ss.hasPermi('obd:City:list')")
    @GetMapping("/listall")
    public TableDataInfo listAll(IniCity iniCity)
    {
        //startPage();
        List<IniCity> list = iniCityService.selectIniCityList(iniCity);
        return getDataTable(list);
    }

    /**
     * 查询城市信息列表
     */
    @PreAuthorize("@ss.hasPermi('obd:City:list')")
    @GetMapping("/list")
    public TableDataInfo list(IniCity iniCity)
    {
        startPage();
        List<IniCity> list = iniCityService.selectIniCityList(iniCity);
        return getDataTable(list);
    }

    /**
     * 导出城市信息列表
     */
    @PreAuthorize("@ss.hasPermi('obd:City:export')")
    @Log(title = "城市信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, IniCity iniCity)
    {
        List<IniCity> list = iniCityService.selectIniCityList(iniCity);
        ExcelUtil<IniCity> util = new ExcelUtil<IniCity>(IniCity.class);
        util.exportExcel(response, list, "城市信息数据");
    }

    /**
     * 获取城市信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('obd:City:query')")
    @GetMapping(value = "/{pkId}")
    public AjaxResult getInfo(@PathVariable("pkId") Long pkId)
    {
        return success(iniCityService.selectIniCityByPkId(pkId));
    }

    /**
     * 新增城市信息
     */
    @PreAuthorize("@ss.hasPermi('obd:City:add')")
    @Log(title = "城市信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody IniCity iniCity)
    {
        return toAjax(iniCityService.insertIniCity(iniCity));
    }

    /**
     * 修改城市信息
     */
    @PreAuthorize("@ss.hasPermi('obd:City:edit')")
    @Log(title = "城市信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody IniCity iniCity)
    {
        return toAjax(iniCityService.updateIniCity(iniCity));
    }

    /**
     * 删除城市信息
     */
    @PreAuthorize("@ss.hasPermi('obd:City:remove')")
    @Log(title = "城市信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{pkIds}")
    public AjaxResult remove(@PathVariable Long[] pkIds)
    {
        return toAjax(iniCityService.deleteIniCityByPkIds(pkIds));
    }
}
