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
import com.ruoyi.obd.domain.OmStaff;
import com.ruoyi.obd.service.IOmStaffService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 运维人员Controller
 * 
 * @author ruoyi
 * @date 2025-03-31
 */
@RestController
@RequestMapping("/obd/OmStaff")
public class OmStaffController extends BaseController
{
    @Autowired
    private IOmStaffService omStaffService;

    /**
     * 查询运维人员列表（不分页）
     */
    @PreAuthorize("@ss.hasPermi('obd:OmStaff:list')")
    @GetMapping("/listall")
    public TableDataInfo listAll(OmStaff omStaff)
    {
        //startPage();
        List<OmStaff> list = omStaffService.selectOmStaffList(omStaff);
        return getDataTable(list);
    }

    /**
     * 查询运维人员列表
     */
    @PreAuthorize("@ss.hasPermi('obd:OmStaff:list')")
    @GetMapping("/list")
    public TableDataInfo list(OmStaff omStaff)
    {
        startPage();
        List<OmStaff> list = omStaffService.selectOmStaffList(omStaff);
        return getDataTable(list);
    }

    /**
     * 导出运维人员列表
     */
    @PreAuthorize("@ss.hasPermi('obd:OmStaff:export')")
    @Log(title = "运维人员", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, OmStaff omStaff)
    {
        List<OmStaff> list = omStaffService.selectOmStaffList(omStaff);
        ExcelUtil<OmStaff> util = new ExcelUtil<OmStaff>(OmStaff.class);
        util.exportExcel(response, list, "运维人员数据");
    }

    /**
     * 获取运维人员详细信息
     */
    @PreAuthorize("@ss.hasPermi('obd:OmStaff:query')")
    @GetMapping(value = "/{pkId}")
    public AjaxResult getInfo(@PathVariable("pkId") Long pkId)
    {
        return success(omStaffService.selectOmStaffByPkId(pkId));
    }

    /**
     * 新增运维人员
     */
    @PreAuthorize("@ss.hasPermi('obd:OmStaff:add')")
    @Log(title = "运维人员", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody OmStaff omStaff)
    {
        return toAjax(omStaffService.insertOmStaff(omStaff));
    }

    /**
     * 修改运维人员
     */
    @PreAuthorize("@ss.hasPermi('obd:OmStaff:edit')")
    @Log(title = "运维人员", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody OmStaff omStaff)
    {
        return toAjax(omStaffService.updateOmStaff(omStaff));
    }

    /**
     * 删除运维人员
     */
    @PreAuthorize("@ss.hasPermi('obd:OmStaff:remove')")
    @Log(title = "运维人员", businessType = BusinessType.DELETE)
	@DeleteMapping("/{pkIds}")
    public AjaxResult remove(@PathVariable Long[] pkIds)
    {
        return toAjax(omStaffService.deleteOmStaffByPkIds(pkIds));
    }
}
