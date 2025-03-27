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
import com.ruoyi.obd.domain.IniProvince2;
import com.ruoyi.obd.service.IIniProvince2Service;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 省份信息Controller
 * 
 * @author ruoyi
 * @date 2025-03-27
 */
@RestController
@RequestMapping("/obd/Province2")
public class IniProvince2Controller extends BaseController
{
    @Autowired
    private IIniProvince2Service iniProvince2Service;

    /**
     * 查询省份信息列表（不分页）
     */
    @PreAuthorize("@ss.hasPermi('obd:Province2:list')")
    @GetMapping("/listall")
    public TableDataInfo listAll(IniProvince2 iniProvince2)
    {
        //startPage();
        List<IniProvince2> list = iniProvince2Service.selectIniProvince2List(iniProvince2);
        return getDataTable(list);
    }

    /**
     * 查询省份信息列表
     */
    @PreAuthorize("@ss.hasPermi('obd:Province2:list')")
    @GetMapping("/list")
    public TableDataInfo list(IniProvince2 iniProvince2)
    {
        startPage();
        List<IniProvince2> list = iniProvince2Service.selectIniProvince2List(iniProvince2);
        return getDataTable(list);
    }

    /**
     * 导出省份信息列表
     */
    @PreAuthorize("@ss.hasPermi('obd:Province2:export')")
    @Log(title = "省份信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, IniProvince2 iniProvince2)
    {
        List<IniProvince2> list = iniProvince2Service.selectIniProvince2List(iniProvince2);
        ExcelUtil<IniProvince2> util = new ExcelUtil<IniProvince2>(IniProvince2.class);
        util.exportExcel(response, list, "省份信息数据");
    }

    /**
     * 获取省份信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('obd:Province2:query')")
    @GetMapping(value = "/{pkId}")
    public AjaxResult getInfo(@PathVariable("pkId") Long pkId)
    {
        return success(iniProvince2Service.selectIniProvince2ByPkId(pkId));
    }

    /**
     * 新增省份信息
     */
    @PreAuthorize("@ss.hasPermi('obd:Province2:add')")
    @Log(title = "省份信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody IniProvince2 iniProvince2)
    {
        return toAjax(iniProvince2Service.insertIniProvince2(iniProvince2));
    }

    /**
     * 修改省份信息
     */
    @PreAuthorize("@ss.hasPermi('obd:Province2:edit')")
    @Log(title = "省份信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody IniProvince2 iniProvince2)
    {
        return toAjax(iniProvince2Service.updateIniProvince2(iniProvince2));
    }

    /**
     * 删除省份信息
     */
    @PreAuthorize("@ss.hasPermi('obd:Province2:remove')")
    @Log(title = "省份信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{pkIds}")
    public AjaxResult remove(@PathVariable Long[] pkIds)
    {
        return toAjax(iniProvince2Service.deleteIniProvince2ByPkIds(pkIds));
    }
}
