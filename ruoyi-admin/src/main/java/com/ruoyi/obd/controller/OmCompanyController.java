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
import com.ruoyi.obd.domain.OmCompany;
import com.ruoyi.obd.service.IOmCompanyService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 运维公司Controller
 * 
 * @author ruoyi
 * @date 2025-03-26
 */
@RestController
@RequestMapping("/obd/OMCompany")
public class OmCompanyController extends BaseController
{
    @Autowired
    private IOmCompanyService omCompanyService;

    /**
     * 查询运维公司列表（不分页）
     */
    @PreAuthorize("@ss.hasPermi('obd:OMCompany:list')")
    @GetMapping("/listall")
    public TableDataInfo listAll(OmCompany omCompany)
    {
        //startPage();
        List<OmCompany> list = omCompanyService.selectOmCompanyList(omCompany);
        return getDataTable(list);
    }

    /**
     * 查询运维公司列表
     */
    @PreAuthorize("@ss.hasPermi('obd:OMCompany:list')")
    @GetMapping("/list")
    public TableDataInfo list(OmCompany omCompany)
    {
        startPage();
        List<OmCompany> list = omCompanyService.selectOmCompanyList(omCompany);
        return getDataTable(list);
    }

    /**
     * 导出运维公司列表
     */
    @PreAuthorize("@ss.hasPermi('obd:OMCompany:export')")
    @Log(title = "运维公司", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, OmCompany omCompany)
    {
        List<OmCompany> list = omCompanyService.selectOmCompanyList(omCompany);
        ExcelUtil<OmCompany> util = new ExcelUtil<OmCompany>(OmCompany.class);
        util.exportExcel(response, list, "运维公司数据");
    }

    /**
     * 获取运维公司详细信息
     */
    @PreAuthorize("@ss.hasPermi('obd:OMCompany:query')")
    @GetMapping(value = "/{pkId}")
    public AjaxResult getInfo(@PathVariable("pkId") Long pkId)
    {
        return success(omCompanyService.selectOmCompanyByPkId(pkId));
    }

    /**
     * 新增运维公司
     */
    @PreAuthorize("@ss.hasPermi('obd:OMCompany:add')")
    @Log(title = "运维公司", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody OmCompany omCompany)
    {
        return toAjax(omCompanyService.insertOmCompany(omCompany));
    }

    /**
     * 修改运维公司
     */
    @PreAuthorize("@ss.hasPermi('obd:OMCompany:edit')")
    @Log(title = "运维公司", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody OmCompany omCompany)
    {
        return toAjax(omCompanyService.updateOmCompany(omCompany));
    }

    /**
     * 删除运维公司
     */
    @PreAuthorize("@ss.hasPermi('obd:OMCompany:remove')")
    @Log(title = "运维公司", businessType = BusinessType.DELETE)
	@DeleteMapping("/{pkIds}")
    public AjaxResult remove(@PathVariable Long[] pkIds)
    {
        return toAjax(omCompanyService.deleteOmCompanyByPkIds(pkIds));
    }
}
