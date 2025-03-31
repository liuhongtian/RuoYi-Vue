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
import com.ruoyi.obd.domain.OmLab;
import com.ruoyi.obd.service.IOmLabService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 实验室Controller
 * 
 * @author ruoyi
 * @date 2025-03-31
 */
@RestController
@RequestMapping("/obd/OmLab")
public class OmLabController extends BaseController
{
    @Autowired
    private IOmLabService omLabService;

    /**
     * 查询实验室列表（不分页）
     */
    @PreAuthorize("@ss.hasPermi('obd:OmLab:list')")
    @GetMapping("/listall")
    public TableDataInfo listAll(OmLab omLab)
    {
        //startPage();
        List<OmLab> list = omLabService.selectOmLabList(omLab);
        return getDataTable(list);
    }

    /**
     * 查询实验室列表
     */
    @PreAuthorize("@ss.hasPermi('obd:OmLab:list')")
    @GetMapping("/list")
    public TableDataInfo list(OmLab omLab)
    {
        startPage();
        List<OmLab> list = omLabService.selectOmLabList(omLab);
        return getDataTable(list);
    }

    /**
     * 导出实验室列表
     */
    @PreAuthorize("@ss.hasPermi('obd:OmLab:export')")
    @Log(title = "实验室", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, OmLab omLab)
    {
        List<OmLab> list = omLabService.selectOmLabList(omLab);
        ExcelUtil<OmLab> util = new ExcelUtil<OmLab>(OmLab.class);
        util.exportExcel(response, list, "实验室数据");
    }

    /**
     * 获取实验室详细信息
     */
    @PreAuthorize("@ss.hasPermi('obd:OmLab:query')")
    @GetMapping(value = "/{pkId}")
    public AjaxResult getInfo(@PathVariable("pkId") Long pkId)
    {
        return success(omLabService.selectOmLabByPkId(pkId));
    }

    /**
     * 新增实验室
     */
    @PreAuthorize("@ss.hasPermi('obd:OmLab:add')")
    @Log(title = "实验室", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody OmLab omLab)
    {
        return toAjax(omLabService.insertOmLab(omLab));
    }

    /**
     * 修改实验室
     */
    @PreAuthorize("@ss.hasPermi('obd:OmLab:edit')")
    @Log(title = "实验室", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody OmLab omLab)
    {
        return toAjax(omLabService.updateOmLab(omLab));
    }

    /**
     * 删除实验室
     */
    @PreAuthorize("@ss.hasPermi('obd:OmLab:remove')")
    @Log(title = "实验室", businessType = BusinessType.DELETE)
	@DeleteMapping("/{pkIds}")
    public AjaxResult remove(@PathVariable Long[] pkIds)
    {
        return toAjax(omLabService.deleteOmLabByPkIds(pkIds));
    }
}
