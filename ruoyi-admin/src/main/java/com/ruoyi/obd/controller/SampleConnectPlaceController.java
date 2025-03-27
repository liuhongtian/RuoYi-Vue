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
import com.ruoyi.obd.domain.SampleConnectPlace;
import com.ruoyi.obd.service.ISampleConnectPlaceService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 样品交接点Controller
 * 
 * @author ruoyi
 * @date 2025-03-27
 */
@RestController
@RequestMapping("/obd/SampleConnectPlace")
public class SampleConnectPlaceController extends BaseController
{
    @Autowired
    private ISampleConnectPlaceService sampleConnectPlaceService;

    /**
     * 查询样品交接点列表（不分页）
     */
    @PreAuthorize("@ss.hasPermi('obd:SampleConnectPlace:list')")
    @GetMapping("/listall")
    public TableDataInfo listAll(SampleConnectPlace sampleConnectPlace)
    {
        //startPage();
        List<SampleConnectPlace> list = sampleConnectPlaceService.selectSampleConnectPlaceList(sampleConnectPlace);
        return getDataTable(list);
    }

    /**
     * 查询样品交接点列表
     */
    @PreAuthorize("@ss.hasPermi('obd:SampleConnectPlace:list')")
    @GetMapping("/list")
    public TableDataInfo list(SampleConnectPlace sampleConnectPlace)
    {
        startPage();
        List<SampleConnectPlace> list = sampleConnectPlaceService.selectSampleConnectPlaceList(sampleConnectPlace);
        return getDataTable(list);
    }

    /**
     * 导出样品交接点列表
     */
    @PreAuthorize("@ss.hasPermi('obd:SampleConnectPlace:export')")
    @Log(title = "样品交接点", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SampleConnectPlace sampleConnectPlace)
    {
        List<SampleConnectPlace> list = sampleConnectPlaceService.selectSampleConnectPlaceList(sampleConnectPlace);
        ExcelUtil<SampleConnectPlace> util = new ExcelUtil<SampleConnectPlace>(SampleConnectPlace.class);
        util.exportExcel(response, list, "样品交接点数据");
    }

    /**
     * 获取样品交接点详细信息
     */
    @PreAuthorize("@ss.hasPermi('obd:SampleConnectPlace:query')")
    @GetMapping(value = "/{pkId}")
    public AjaxResult getInfo(@PathVariable("pkId") Long pkId)
    {
        return success(sampleConnectPlaceService.selectSampleConnectPlaceByPkId(pkId));
    }

    /**
     * 新增样品交接点
     */
    @PreAuthorize("@ss.hasPermi('obd:SampleConnectPlace:add')")
    @Log(title = "样品交接点", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SampleConnectPlace sampleConnectPlace)
    {
        return toAjax(sampleConnectPlaceService.insertSampleConnectPlace(sampleConnectPlace));
    }

    /**
     * 修改样品交接点
     */
    @PreAuthorize("@ss.hasPermi('obd:SampleConnectPlace:edit')")
    @Log(title = "样品交接点", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SampleConnectPlace sampleConnectPlace)
    {
        return toAjax(sampleConnectPlaceService.updateSampleConnectPlace(sampleConnectPlace));
    }

    /**
     * 删除样品交接点
     */
    @PreAuthorize("@ss.hasPermi('obd:SampleConnectPlace:remove')")
    @Log(title = "样品交接点", businessType = BusinessType.DELETE)
	@DeleteMapping("/{pkIds}")
    public AjaxResult remove(@PathVariable Long[] pkIds)
    {
        return toAjax(sampleConnectPlaceService.deleteSampleConnectPlaceByPkIds(pkIds));
    }
}
