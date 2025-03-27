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
import com.ruoyi.obd.domain.HjjTaskList;
import com.ruoyi.obd.service.IHjjTaskListService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 水样采样跟踪Controller
 * 
 * @author ruoyi
 * @date 2025-03-27
 */
@RestController
@RequestMapping("/obd/HjjTaskList")
public class HjjTaskListController extends BaseController
{
    @Autowired
    private IHjjTaskListService hjjTaskListService;

    /**
     * 查询水样采样跟踪列表（不分页）
     */
    @PreAuthorize("@ss.hasPermi('obd:HjjTaskList:list')")
    @GetMapping("/listall")
    public TableDataInfo listAll(HjjTaskList hjjTaskList)
    {
        //startPage();
        List<HjjTaskList> list = hjjTaskListService.selectHjjTaskListList(hjjTaskList);
        return getDataTable(list);
    }

    /**
     * 查询水样采样跟踪列表
     */
    @PreAuthorize("@ss.hasPermi('obd:HjjTaskList:list')")
    @GetMapping("/list")
    public TableDataInfo list(HjjTaskList hjjTaskList)
    {
        startPage();
        List<HjjTaskList> list = hjjTaskListService.selectHjjTaskListList(hjjTaskList);
        return getDataTable(list);
    }

    /**
     * 导出水样采样跟踪列表
     */
    @PreAuthorize("@ss.hasPermi('obd:HjjTaskList:export')")
    @Log(title = "水样采样跟踪", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, HjjTaskList hjjTaskList)
    {
        List<HjjTaskList> list = hjjTaskListService.selectHjjTaskListList(hjjTaskList);
        ExcelUtil<HjjTaskList> util = new ExcelUtil<HjjTaskList>(HjjTaskList.class);
        util.exportExcel(response, list, "水样采样跟踪数据");
    }

    /**
     * 获取水样采样跟踪详细信息
     */
    @PreAuthorize("@ss.hasPermi('obd:HjjTaskList:query')")
    @GetMapping(value = "/{pkId}")
    public AjaxResult getInfo(@PathVariable("pkId") Long pkId)
    {
        return success(hjjTaskListService.selectHjjTaskListByPkId(pkId));
    }

    /**
     * 新增水样采样跟踪
     */
    @PreAuthorize("@ss.hasPermi('obd:HjjTaskList:add')")
    @Log(title = "水样采样跟踪", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HjjTaskList hjjTaskList)
    {
        return toAjax(hjjTaskListService.insertHjjTaskList(hjjTaskList));
    }

    /**
     * 修改水样采样跟踪
     */
    @PreAuthorize("@ss.hasPermi('obd:HjjTaskList:edit')")
    @Log(title = "水样采样跟踪", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HjjTaskList hjjTaskList)
    {
        return toAjax(hjjTaskListService.updateHjjTaskList(hjjTaskList));
    }

    /**
     * 删除水样采样跟踪
     */
    @PreAuthorize("@ss.hasPermi('obd:HjjTaskList:remove')")
    @Log(title = "水样采样跟踪", businessType = BusinessType.DELETE)
	@DeleteMapping("/{pkIds}")
    public AjaxResult remove(@PathVariable Long[] pkIds)
    {
        return toAjax(hjjTaskListService.deleteHjjTaskListByPkIds(pkIds));
    }
}
