package com.ruoyi.temp.controller;

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
import com.ruoyi.temp.domain.DynamicDictTest;
import com.ruoyi.temp.service.IDynamicDictTestService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * dynamicDictTestController
 * 
 * @author ruoyi
 * @date 2025-03-30
 */
@RestController
@RequestMapping("/temp/dynamicDictTest")
public class DynamicDictTestController extends BaseController
{
    @Autowired
    private IDynamicDictTestService dynamicDictTestService;

    /**
     * 查询dynamicDictTest列表（不分页）
     */
    @PreAuthorize("@ss.hasPermi('temp:dynamicDictTest:list')")
    @GetMapping("/listall")
    public TableDataInfo listAll(DynamicDictTest dynamicDictTest)
    {
        //startPage();
        List<DynamicDictTest> list = dynamicDictTestService.selectDynamicDictTestList(dynamicDictTest);
        return getDataTable(list);
    }

    /**
     * 查询dynamicDictTest列表
     */
    @PreAuthorize("@ss.hasPermi('temp:dynamicDictTest:list')")
    @GetMapping("/list")
    public TableDataInfo list(DynamicDictTest dynamicDictTest)
    {
        startPage();
        List<DynamicDictTest> list = dynamicDictTestService.selectDynamicDictTestList(dynamicDictTest);
        return getDataTable(list);
    }

    /**
     * 导出dynamicDictTest列表
     */
    @PreAuthorize("@ss.hasPermi('temp:dynamicDictTest:export')")
    @Log(title = "dynamicDictTest", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DynamicDictTest dynamicDictTest)
    {
        List<DynamicDictTest> list = dynamicDictTestService.selectDynamicDictTestList(dynamicDictTest);
        ExcelUtil<DynamicDictTest> util = new ExcelUtil<DynamicDictTest>(DynamicDictTest.class);
        util.exportExcel(response, list, "dynamicDictTest数据");
    }

    /**
     * 获取dynamicDictTest详细信息
     */
    @PreAuthorize("@ss.hasPermi('temp:dynamicDictTest:query')")
    @GetMapping(value = "/{pkId}")
    public AjaxResult getInfo(@PathVariable("pkId") Long pkId)
    {
        return success(dynamicDictTestService.selectDynamicDictTestByPkId(pkId));
    }

    /**
     * 新增dynamicDictTest
     */
    @PreAuthorize("@ss.hasPermi('temp:dynamicDictTest:add')")
    @Log(title = "dynamicDictTest", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DynamicDictTest dynamicDictTest)
    {
        return toAjax(dynamicDictTestService.insertDynamicDictTest(dynamicDictTest));
    }

    /**
     * 修改dynamicDictTest
     */
    @PreAuthorize("@ss.hasPermi('temp:dynamicDictTest:edit')")
    @Log(title = "dynamicDictTest", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DynamicDictTest dynamicDictTest)
    {
        return toAjax(dynamicDictTestService.updateDynamicDictTest(dynamicDictTest));
    }

    /**
     * 删除dynamicDictTest
     */
    @PreAuthorize("@ss.hasPermi('temp:dynamicDictTest:remove')")
    @Log(title = "dynamicDictTest", businessType = BusinessType.DELETE)
	@DeleteMapping("/{pkIds}")
    public AjaxResult remove(@PathVariable Long[] pkIds)
    {
        return toAjax(dynamicDictTestService.deleteDynamicDictTestByPkIds(pkIds));
    }
}
