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
import com.ruoyi.temp.domain.RtWorkwxMsg;
import com.ruoyi.temp.service.IRtWorkwxMsgService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 待发送消息Controller
 * 
 * @author ruoyi
 * @date 2025-04-08
 */
@RestController
@RequestMapping("/temp/WXMSG")
public class RtWorkwxMsgController extends BaseController
{
    @Autowired
    private IRtWorkwxMsgService rtWorkwxMsgService;

    /**
     * 查询待发送消息列表（不分页）
     */
    @PreAuthorize("@ss.hasPermi('temp:WXMSG:list')")
    @GetMapping("/listall")
    public TableDataInfo listAll(RtWorkwxMsg rtWorkwxMsg)
    {
        //startPage();
        List<RtWorkwxMsg> list = rtWorkwxMsgService.selectRtWorkwxMsgList(rtWorkwxMsg);
        return getDataTable(list);
    }

    /**
     * 查询待发送消息列表
     */
    @PreAuthorize("@ss.hasPermi('temp:WXMSG:list')")
    @GetMapping("/list")
    public TableDataInfo list(RtWorkwxMsg rtWorkwxMsg)
    {
        startPage();
        List<RtWorkwxMsg> list = rtWorkwxMsgService.selectRtWorkwxMsgList(rtWorkwxMsg);
        return getDataTable(list);
    }

    /**
     * 导出待发送消息列表
     */
    @PreAuthorize("@ss.hasPermi('temp:WXMSG:export')")
    @Log(title = "待发送消息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, RtWorkwxMsg rtWorkwxMsg)
    {
        List<RtWorkwxMsg> list = rtWorkwxMsgService.selectRtWorkwxMsgList(rtWorkwxMsg);
        ExcelUtil<RtWorkwxMsg> util = new ExcelUtil<RtWorkwxMsg>(RtWorkwxMsg.class);
        util.exportExcel(response, list, "待发送消息数据");
    }

    /**
     * 获取待发送消息详细信息
     */
    @PreAuthorize("@ss.hasPermi('temp:WXMSG:query')")
    @GetMapping(value = "/{pkId}")
    public AjaxResult getInfo(@PathVariable("pkId") Long pkId)
    {
        return success(rtWorkwxMsgService.selectRtWorkwxMsgByPkId(pkId));
    }

    /**
     * 新增待发送消息
     */
    @PreAuthorize("@ss.hasPermi('temp:WXMSG:add')")
    @Log(title = "待发送消息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody RtWorkwxMsg rtWorkwxMsg)
    {
        return toAjax(rtWorkwxMsgService.insertRtWorkwxMsg(rtWorkwxMsg));
    }

    /**
     * 修改待发送消息
     */
    @PreAuthorize("@ss.hasPermi('temp:WXMSG:edit')")
    @Log(title = "待发送消息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody RtWorkwxMsg rtWorkwxMsg)
    {
        return toAjax(rtWorkwxMsgService.updateRtWorkwxMsg(rtWorkwxMsg));
    }

    /**
     * 删除待发送消息
     */
    @PreAuthorize("@ss.hasPermi('temp:WXMSG:remove')")
    @Log(title = "待发送消息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{pkIds}")
    public AjaxResult remove(@PathVariable Long[] pkIds)
    {
        return toAjax(rtWorkwxMsgService.deleteRtWorkwxMsgByPkIds(pkIds));
    }
}
