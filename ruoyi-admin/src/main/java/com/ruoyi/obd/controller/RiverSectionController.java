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
import com.ruoyi.obd.domain.RiverSection;
import com.ruoyi.obd.service.IRiverSectionService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 断面Controller
 * 
 * @author ruoyi
 * @date 2025-03-31
 */
@RestController
@RequestMapping("/obd/RiverSection")
public class RiverSectionController extends BaseController
{
    @Autowired
    private IRiverSectionService riverSectionService;

    /**
     * 查询断面列表（不分页）
     */
    @PreAuthorize("@ss.hasPermi('obd:RiverSection:list')")
    @GetMapping("/listall")
    public TableDataInfo listAll(RiverSection riverSection)
    {
        //startPage();
        List<RiverSection> list = riverSectionService.selectRiverSectionList(riverSection);
        return getDataTable(list);
    }

    /**
     * 查询断面列表
     */
    @PreAuthorize("@ss.hasPermi('obd:RiverSection:list')")
    @GetMapping("/list")
    public TableDataInfo list(RiverSection riverSection)
    {
        startPage();
        List<RiverSection> list = riverSectionService.selectRiverSectionList(riverSection);
        return getDataTable(list);
    }

    /**
     * 导出断面列表
     */
    @PreAuthorize("@ss.hasPermi('obd:RiverSection:export')")
    @Log(title = "断面", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, RiverSection riverSection)
    {
        List<RiverSection> list = riverSectionService.selectRiverSectionList(riverSection);
        ExcelUtil<RiverSection> util = new ExcelUtil<RiverSection>(RiverSection.class);
        util.exportExcel(response, list, "断面数据");
    }

    /**
     * 获取断面详细信息
     */
    @PreAuthorize("@ss.hasPermi('obd:RiverSection:query')")
    @GetMapping(value = "/{pkId}")
    public AjaxResult getInfo(@PathVariable("pkId") Long pkId)
    {
        return success(riverSectionService.selectRiverSectionByPkId(pkId));
    }

    /**
     * 新增断面
     */
    @PreAuthorize("@ss.hasPermi('obd:RiverSection:add')")
    @Log(title = "断面", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody RiverSection riverSection)
    {
        return toAjax(riverSectionService.insertRiverSection(riverSection));
    }

    /**
     * 修改断面
     */
    @PreAuthorize("@ss.hasPermi('obd:RiverSection:edit')")
    @Log(title = "断面", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody RiverSection riverSection)
    {
        return toAjax(riverSectionService.updateRiverSection(riverSection));
    }

    /**
     * 删除断面
     */
    @PreAuthorize("@ss.hasPermi('obd:RiverSection:remove')")
    @Log(title = "断面", businessType = BusinessType.DELETE)
	@DeleteMapping("/{pkIds}")
    public AjaxResult remove(@PathVariable Long[] pkIds)
    {
        return toAjax(riverSectionService.deleteRiverSectionByPkIds(pkIds));
    }
}
