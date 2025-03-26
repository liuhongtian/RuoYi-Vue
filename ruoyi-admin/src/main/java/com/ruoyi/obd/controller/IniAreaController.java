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
import com.ruoyi.obd.domain.IniArea;
import com.ruoyi.obd.service.IIniAreaService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 地区信息Controller
 * 
 * @author ruoyi
 * @date 2025-03-26
 */
@RestController
@RequestMapping("/obd/Area")
public class IniAreaController extends BaseController
{
    @Autowired
    private IIniAreaService iniAreaService;

    /**
     * 查询地区信息列表（不分页）
     */
    @PreAuthorize("@ss.hasPermi('obd:Area:list')")
    @GetMapping("/listall")
    public TableDataInfo listAll(IniArea iniArea)
    {
        //startPage();
        List<IniArea> list = iniAreaService.selectIniAreaList(iniArea);
        return getDataTable(list);
    }

    /**
     * 查询地区信息列表
     */
    @PreAuthorize("@ss.hasPermi('obd:Area:list')")
    @GetMapping("/list")
    public TableDataInfo list(IniArea iniArea)
    {
        startPage();
        List<IniArea> list = iniAreaService.selectIniAreaList(iniArea);
        return getDataTable(list);
    }

    /**
     * 导出地区信息列表
     */
    @PreAuthorize("@ss.hasPermi('obd:Area:export')")
    @Log(title = "地区信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, IniArea iniArea)
    {
        List<IniArea> list = iniAreaService.selectIniAreaList(iniArea);
        ExcelUtil<IniArea> util = new ExcelUtil<IniArea>(IniArea.class);
        util.exportExcel(response, list, "地区信息数据");
    }

    /**
     * 获取地区信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('obd:Area:query')")
    @GetMapping(value = "/{pkId}")
    public AjaxResult getInfo(@PathVariable("pkId") Long pkId)
    {
        return success(iniAreaService.selectIniAreaByPkId(pkId));
    }

    /**
     * 新增地区信息
     */
    @PreAuthorize("@ss.hasPermi('obd:Area:add')")
    @Log(title = "地区信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody IniArea iniArea)
    {
        return toAjax(iniAreaService.insertIniArea(iniArea));
    }

    /**
     * 修改地区信息
     */
    @PreAuthorize("@ss.hasPermi('obd:Area:edit')")
    @Log(title = "地区信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody IniArea iniArea)
    {
        return toAjax(iniAreaService.updateIniArea(iniArea));
    }

    /**
     * 删除地区信息
     */
    @PreAuthorize("@ss.hasPermi('obd:Area:remove')")
    @Log(title = "地区信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{pkIds}")
    public AjaxResult remove(@PathVariable Long[] pkIds)
    {
        return toAjax(iniAreaService.deleteIniAreaByPkIds(pkIds));
    }
}
