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
import com.ruoyi.obd.domain.AquaticInfo;
import com.ruoyi.obd.service.IAquaticInfoService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 水体信息Controller
 * 
 * @author ruoyi
 * @date 2025-03-27
 */
@RestController
@RequestMapping("/obd/AquaticInfo")
public class AquaticInfoController extends BaseController
{
    @Autowired
    private IAquaticInfoService aquaticInfoService;

    /**
     * 查询水体信息列表（不分页）
     */
    @PreAuthorize("@ss.hasPermi('obd:AquaticInfo:list')")
    @GetMapping("/listall")
    public TableDataInfo listAll(AquaticInfo aquaticInfo)
    {
        //startPage();
        List<AquaticInfo> list = aquaticInfoService.selectAquaticInfoList(aquaticInfo);
        return getDataTable(list);
    }

    /**
     * 查询水体信息列表
     */
    @PreAuthorize("@ss.hasPermi('obd:AquaticInfo:list')")
    @GetMapping("/list")
    public TableDataInfo list(AquaticInfo aquaticInfo)
    {
        startPage();
        List<AquaticInfo> list = aquaticInfoService.selectAquaticInfoList(aquaticInfo);
        return getDataTable(list);
    }

    /**
     * 导出水体信息列表
     */
    @PreAuthorize("@ss.hasPermi('obd:AquaticInfo:export')")
    @Log(title = "水体信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, AquaticInfo aquaticInfo)
    {
        List<AquaticInfo> list = aquaticInfoService.selectAquaticInfoList(aquaticInfo);
        ExcelUtil<AquaticInfo> util = new ExcelUtil<AquaticInfo>(AquaticInfo.class);
        util.exportExcel(response, list, "水体信息数据");
    }

    /**
     * 获取水体信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('obd:AquaticInfo:query')")
    @GetMapping(value = "/{pkId}")
    public AjaxResult getInfo(@PathVariable("pkId") Long pkId)
    {
        return success(aquaticInfoService.selectAquaticInfoByPkId(pkId));
    }

    /**
     * 新增水体信息
     */
    @PreAuthorize("@ss.hasPermi('obd:AquaticInfo:add')")
    @Log(title = "水体信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody AquaticInfo aquaticInfo)
    {
        return toAjax(aquaticInfoService.insertAquaticInfo(aquaticInfo));
    }

    /**
     * 修改水体信息
     */
    @PreAuthorize("@ss.hasPermi('obd:AquaticInfo:edit')")
    @Log(title = "水体信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody AquaticInfo aquaticInfo)
    {
        return toAjax(aquaticInfoService.updateAquaticInfo(aquaticInfo));
    }

    /**
     * 删除水体信息
     */
    @PreAuthorize("@ss.hasPermi('obd:AquaticInfo:remove')")
    @Log(title = "水体信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{pkIds}")
    public AjaxResult remove(@PathVariable Long[] pkIds)
    {
        return toAjax(aquaticInfoService.deleteAquaticInfoByPkIds(pkIds));
    }
}
