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
import com.ruoyi.obd.domain.RiverBasin;
import com.ruoyi.obd.service.IRiverBasinService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 流域信息Controller
 * 
 * @author ruoyi
 * @date 2025-03-27
 */
@RestController
@RequestMapping("/obd/RiverBasin")
public class RiverBasinController extends BaseController
{
    @Autowired
    private IRiverBasinService riverBasinService;

    /**
     * 查询流域信息列表（不分页）
     */
    @PreAuthorize("@ss.hasPermi('obd:RiverBasin:list')")
    @GetMapping("/listall")
    public TableDataInfo listAll(RiverBasin riverBasin)
    {
        //startPage();
        List<RiverBasin> list = riverBasinService.selectRiverBasinList(riverBasin);
        return getDataTable(list);
    }

    /**
     * 查询流域信息列表
     */
    @PreAuthorize("@ss.hasPermi('obd:RiverBasin:list')")
    @GetMapping("/list")
    public TableDataInfo list(RiverBasin riverBasin)
    {
        startPage();
        List<RiverBasin> list = riverBasinService.selectRiverBasinList(riverBasin);
        return getDataTable(list);
    }

    /**
     * 导出流域信息列表
     */
    @PreAuthorize("@ss.hasPermi('obd:RiverBasin:export')")
    @Log(title = "流域信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, RiverBasin riverBasin)
    {
        List<RiverBasin> list = riverBasinService.selectRiverBasinList(riverBasin);
        ExcelUtil<RiverBasin> util = new ExcelUtil<RiverBasin>(RiverBasin.class);
        util.exportExcel(response, list, "流域信息数据");
    }

    /**
     * 获取流域信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('obd:RiverBasin:query')")
    @GetMapping(value = "/{pkId}")
    public AjaxResult getInfo(@PathVariable("pkId") Long pkId)
    {
        return success(riverBasinService.selectRiverBasinByPkId(pkId));
    }

    /**
     * 新增流域信息
     */
    @PreAuthorize("@ss.hasPermi('obd:RiverBasin:add')")
    @Log(title = "流域信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody RiverBasin riverBasin)
    {
        return toAjax(riverBasinService.insertRiverBasin(riverBasin));
    }

    /**
     * 修改流域信息
     */
    @PreAuthorize("@ss.hasPermi('obd:RiverBasin:edit')")
    @Log(title = "流域信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody RiverBasin riverBasin)
    {
        return toAjax(riverBasinService.updateRiverBasin(riverBasin));
    }

    /**
     * 删除流域信息
     */
    @PreAuthorize("@ss.hasPermi('obd:RiverBasin:remove')")
    @Log(title = "流域信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{pkIds}")
    public AjaxResult remove(@PathVariable Long[] pkIds)
    {
        return toAjax(riverBasinService.deleteRiverBasinByPkIds(pkIds));
    }
}
