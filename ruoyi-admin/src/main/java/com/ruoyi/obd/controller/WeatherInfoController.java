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
import com.ruoyi.obd.domain.WeatherInfo;
import com.ruoyi.obd.service.IWeatherInfoService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 气象信息Controller
 * 
 * @author ruoyi
 * @date 2025-03-26
 */
@RestController
@RequestMapping("/obd/WeatherInfo")
public class WeatherInfoController extends BaseController
{
    @Autowired
    private IWeatherInfoService weatherInfoService;

    /**
     * 查询气象信息列表（不分页）
     */
    @PreAuthorize("@ss.hasPermi('obd:WeatherInfo:list')")
    @GetMapping("/listall")
    public TableDataInfo listAll(WeatherInfo weatherInfo)
    {
        //startPage();
        List<WeatherInfo> list = weatherInfoService.selectWeatherInfoList(weatherInfo);
        return getDataTable(list);
    }

    /**
     * 查询气象信息列表
     */
    @PreAuthorize("@ss.hasPermi('obd:WeatherInfo:list')")
    @GetMapping("/list")
    public TableDataInfo list(WeatherInfo weatherInfo)
    {
        startPage();
        List<WeatherInfo> list = weatherInfoService.selectWeatherInfoList(weatherInfo);
        return getDataTable(list);
    }

    /**
     * 导出气象信息列表
     */
    @PreAuthorize("@ss.hasPermi('obd:WeatherInfo:export')")
    @Log(title = "气象信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, WeatherInfo weatherInfo)
    {
        List<WeatherInfo> list = weatherInfoService.selectWeatherInfoList(weatherInfo);
        ExcelUtil<WeatherInfo> util = new ExcelUtil<WeatherInfo>(WeatherInfo.class);
        util.exportExcel(response, list, "气象信息数据");
    }

    /**
     * 获取气象信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('obd:WeatherInfo:query')")
    @GetMapping(value = "/{pkId}")
    public AjaxResult getInfo(@PathVariable("pkId") Long pkId)
    {
        return success(weatherInfoService.selectWeatherInfoByPkId(pkId));
    }

    /**
     * 新增气象信息
     */
    @PreAuthorize("@ss.hasPermi('obd:WeatherInfo:add')")
    @Log(title = "气象信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody WeatherInfo weatherInfo)
    {
        return toAjax(weatherInfoService.insertWeatherInfo(weatherInfo));
    }

    /**
     * 修改气象信息
     */
    @PreAuthorize("@ss.hasPermi('obd:WeatherInfo:edit')")
    @Log(title = "气象信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody WeatherInfo weatherInfo)
    {
        return toAjax(weatherInfoService.updateWeatherInfo(weatherInfo));
    }

    /**
     * 删除气象信息
     */
    @PreAuthorize("@ss.hasPermi('obd:WeatherInfo:remove')")
    @Log(title = "气象信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{pkIds}")
    public AjaxResult remove(@PathVariable Long[] pkIds)
    {
        return toAjax(weatherInfoService.deleteWeatherInfoByPkIds(pkIds));
    }
}
