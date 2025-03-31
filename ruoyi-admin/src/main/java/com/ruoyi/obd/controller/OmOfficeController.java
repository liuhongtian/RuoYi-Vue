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
import com.ruoyi.obd.domain.OmOffice;
import com.ruoyi.obd.service.IOmOfficeService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 办事处Controller
 * 
 * @author ruoyi
 * @date 2025-03-31
 */
@RestController
@RequestMapping("/obd/OmOffice")
public class OmOfficeController extends BaseController
{
    @Autowired
    private IOmOfficeService omOfficeService;

    /**
     * 查询办事处列表（不分页）
     */
    @PreAuthorize("@ss.hasPermi('obd:OmOffice:list')")
    @GetMapping("/listall")
    public TableDataInfo listAll(OmOffice omOffice)
    {
        //startPage();
        List<OmOffice> list = omOfficeService.selectOmOfficeList(omOffice);
        return getDataTable(list);
    }

    /**
     * 查询办事处列表
     */
    @PreAuthorize("@ss.hasPermi('obd:OmOffice:list')")
    @GetMapping("/list")
    public TableDataInfo list(OmOffice omOffice)
    {
        startPage();
        List<OmOffice> list = omOfficeService.selectOmOfficeList(omOffice);
        return getDataTable(list);
    }

    /**
     * 导出办事处列表
     */
    @PreAuthorize("@ss.hasPermi('obd:OmOffice:export')")
    @Log(title = "办事处", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, OmOffice omOffice)
    {
        List<OmOffice> list = omOfficeService.selectOmOfficeList(omOffice);
        ExcelUtil<OmOffice> util = new ExcelUtil<OmOffice>(OmOffice.class);
        util.exportExcel(response, list, "办事处数据");
    }

    /**
     * 获取办事处详细信息
     */
    @PreAuthorize("@ss.hasPermi('obd:OmOffice:query')")
    @GetMapping(value = "/{pkId}")
    public AjaxResult getInfo(@PathVariable("pkId") Long pkId)
    {
        return success(omOfficeService.selectOmOfficeByPkId(pkId));
    }

    /**
     * 新增办事处
     */
    @PreAuthorize("@ss.hasPermi('obd:OmOffice:add')")
    @Log(title = "办事处", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody OmOffice omOffice)
    {
        return toAjax(omOfficeService.insertOmOffice(omOffice));
    }

    /**
     * 修改办事处
     */
    @PreAuthorize("@ss.hasPermi('obd:OmOffice:edit')")
    @Log(title = "办事处", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody OmOffice omOffice)
    {
        return toAjax(omOfficeService.updateOmOffice(omOffice));
    }

    /**
     * 删除办事处
     */
    @PreAuthorize("@ss.hasPermi('obd:OmOffice:remove')")
    @Log(title = "办事处", businessType = BusinessType.DELETE)
	@DeleteMapping("/{pkIds}")
    public AjaxResult remove(@PathVariable Long[] pkIds)
    {
        return toAjax(omOfficeService.deleteOmOfficeByPkIds(pkIds));
    }
}
