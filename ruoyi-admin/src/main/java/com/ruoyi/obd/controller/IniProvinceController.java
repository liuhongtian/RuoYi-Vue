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
import com.ruoyi.obd.domain.IniProvince;
import com.ruoyi.obd.service.IIniProvinceService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 省份信息Controller
 * 
 * @author ruoyi
 * @date 2025-03-26
 */
@RestController
@RequestMapping("/obd/Province")
public class IniProvinceController extends BaseController
{
    @Autowired
    private IIniProvinceService iniProvinceService;

    /**
     * 查询省份信息列表（不分页）
     */
    @PreAuthorize("@ss.hasPermi('obd:Province:list')")
    @GetMapping("/listall")
    public TableDataInfo listAll(IniProvince iniProvince)
    {
        //startPage();
        List<IniProvince> list = iniProvinceService.selectIniProvinceList(iniProvince);
        return getDataTable(list);
    }

    /**
     * 查询省份信息列表
     */
    @PreAuthorize("@ss.hasPermi('obd:Province:list')")
    @GetMapping("/list")
    public TableDataInfo list(IniProvince iniProvince)
    {
        startPage();
        List<IniProvince> list = iniProvinceService.selectIniProvinceList(iniProvince);
        return getDataTable(list);
    }

    /**
     * 导出省份信息列表
     */
    @PreAuthorize("@ss.hasPermi('obd:Province:export')")
    @Log(title = "省份信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, IniProvince iniProvince)
    {
        List<IniProvince> list = iniProvinceService.selectIniProvinceList(iniProvince);
        ExcelUtil<IniProvince> util = new ExcelUtil<IniProvince>(IniProvince.class);
        util.exportExcel(response, list, "省份信息数据");
    }

    /**
     * 获取省份信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('obd:Province:query')")
    @GetMapping(value = "/{pkId}")
    public AjaxResult getInfo(@PathVariable("pkId") Long pkId)
    {
        return success(iniProvinceService.selectIniProvinceByPkId(pkId));
    }

    /**
     * 新增省份信息
     */
    @PreAuthorize("@ss.hasPermi('obd:Province:add')")
    @Log(title = "省份信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody IniProvince iniProvince)
    {
        return toAjax(iniProvinceService.insertIniProvince(iniProvince));
    }

    /**
     * 修改省份信息
     */
    @PreAuthorize("@ss.hasPermi('obd:Province:edit')")
    @Log(title = "省份信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody IniProvince iniProvince)
    {
        return toAjax(iniProvinceService.updateIniProvince(iniProvince));
    }

    /**
     * 删除省份信息
     */
    @PreAuthorize("@ss.hasPermi('obd:Province:remove')")
    @Log(title = "省份信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{pkIds}")
    public AjaxResult remove(@PathVariable Long[] pkIds)
    {
        return toAjax(iniProvinceService.deleteIniProvinceByPkIds(pkIds));
    }
}
