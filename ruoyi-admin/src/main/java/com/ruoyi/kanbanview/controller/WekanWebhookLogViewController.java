package com.ruoyi.kanbanview.controller;

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
import com.ruoyi.kanbanview.domain.WekanWebhookLogView;
import com.ruoyi.kanbanview.service.IWekanWebhookLogViewService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * Wekan WebHook日志查看Controller
 * 
 * @author ruoyi
 * @date 2025-03-28
 */
@RestController
@RequestMapping("/kanbanview/webhooklogview")
public class WekanWebhookLogViewController extends BaseController
{
    @Autowired
    private IWekanWebhookLogViewService wekanWebhookLogViewService;

    /**
     * 查询Wekan WebHook日志查看列表（不分页）
     */
    @PreAuthorize("@ss.hasPermi('kanbanview:webhooklogview:list')")
    @GetMapping("/listall")
    public TableDataInfo listAll(WekanWebhookLogView wekanWebhookLogView)
    {
        //startPage();
        List<WekanWebhookLogView> list = wekanWebhookLogViewService.selectWekanWebhookLogViewList(wekanWebhookLogView);
        return getDataTable(list);
    }

    /**
     * 查询Wekan WebHook日志查看列表
     */
    @PreAuthorize("@ss.hasPermi('kanbanview:webhooklogview:list')")
    @GetMapping("/list")
    public TableDataInfo list(WekanWebhookLogView wekanWebhookLogView)
    {
        startPage();
        List<WekanWebhookLogView> list = wekanWebhookLogViewService.selectWekanWebhookLogViewList(wekanWebhookLogView);
        return getDataTable(list);
    }

    /**
     * 导出Wekan WebHook日志查看列表
     */
    @PreAuthorize("@ss.hasPermi('kanbanview:webhooklogview:export')")
    @Log(title = "Wekan WebHook日志查看", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, WekanWebhookLogView wekanWebhookLogView)
    {
        List<WekanWebhookLogView> list = wekanWebhookLogViewService.selectWekanWebhookLogViewList(wekanWebhookLogView);
        ExcelUtil<WekanWebhookLogView> util = new ExcelUtil<WekanWebhookLogView>(WekanWebhookLogView.class);
        util.exportExcel(response, list, "Wekan WebHook日志查看数据");
    }

    /**
     * 获取Wekan WebHook日志查看详细信息
     */
    @PreAuthorize("@ss.hasPermi('kanbanview:webhooklogview:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(wekanWebhookLogViewService.selectWekanWebhookLogViewById(id));
    }

    /**
     * 新增Wekan WebHook日志查看
     */
    @PreAuthorize("@ss.hasPermi('kanbanview:webhooklogview:add')")
    @Log(title = "Wekan WebHook日志查看", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody WekanWebhookLogView wekanWebhookLogView)
    {
        return toAjax(wekanWebhookLogViewService.insertWekanWebhookLogView(wekanWebhookLogView));
    }

    /**
     * 修改Wekan WebHook日志查看
     */
    @PreAuthorize("@ss.hasPermi('kanbanview:webhooklogview:edit')")
    @Log(title = "Wekan WebHook日志查看", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody WekanWebhookLogView wekanWebhookLogView)
    {
        return toAjax(wekanWebhookLogViewService.updateWekanWebhookLogView(wekanWebhookLogView));
    }

    /**
     * 删除Wekan WebHook日志查看
     */
    @PreAuthorize("@ss.hasPermi('kanbanview:webhooklogview:remove')")
    @Log(title = "Wekan WebHook日志查看", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(wekanWebhookLogViewService.deleteWekanWebhookLogViewByIds(ids));
    }
}
