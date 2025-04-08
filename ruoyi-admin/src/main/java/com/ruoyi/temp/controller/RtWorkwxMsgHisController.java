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
import com.ruoyi.temp.domain.RtWorkwxMsgHis;
import com.ruoyi.temp.service.IRtWorkwxMsgHisService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 消息历史Controller
 * 
 * @author ruoyi
 * @date 2025-04-08
 */
@RestController
@RequestMapping("/temp/HISWXMSG")
public class RtWorkwxMsgHisController extends BaseController
{
    @Autowired
    private IRtWorkwxMsgHisService rtWorkwxMsgHisService;

    /**
     * 查询消息历史列表（不分页）
     */
    @PreAuthorize("@ss.hasPermi('temp:HISWXMSG:list')")
    @GetMapping("/listall")
    public TableDataInfo listAll(RtWorkwxMsgHis rtWorkwxMsgHis)
    {
        //startPage();
        List<RtWorkwxMsgHis> list = rtWorkwxMsgHisService.selectRtWorkwxMsgHisList(rtWorkwxMsgHis);
        return getDataTable(list);
    }

    /**
     * 查询消息历史列表
     */
    @PreAuthorize("@ss.hasPermi('temp:HISWXMSG:list')")
    @GetMapping("/list")
    public TableDataInfo list(RtWorkwxMsgHis rtWorkwxMsgHis)
    {
        startPage();
        List<RtWorkwxMsgHis> list = rtWorkwxMsgHisService.selectRtWorkwxMsgHisList(rtWorkwxMsgHis);
        return getDataTable(list);
    }

    /**
     * 导出消息历史列表
     */
    @PreAuthorize("@ss.hasPermi('temp:HISWXMSG:export')")
    @Log(title = "消息历史", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, RtWorkwxMsgHis rtWorkwxMsgHis)
    {
        List<RtWorkwxMsgHis> list = rtWorkwxMsgHisService.selectRtWorkwxMsgHisList(rtWorkwxMsgHis);
        ExcelUtil<RtWorkwxMsgHis> util = new ExcelUtil<RtWorkwxMsgHis>(RtWorkwxMsgHis.class);
        util.exportExcel(response, list, "消息历史数据");
    }

    /**
     * 获取消息历史详细信息
     */
    @PreAuthorize("@ss.hasPermi('temp:HISWXMSG:query')")
    @GetMapping(value = "/{pkId}")
    public AjaxResult getInfo(@PathVariable("pkId") Long pkId)
    {
        return success(rtWorkwxMsgHisService.selectRtWorkwxMsgHisByPkId(pkId));
    }

    /**
     * 新增消息历史
     */
    @PreAuthorize("@ss.hasPermi('temp:HISWXMSG:add')")
    @Log(title = "消息历史", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody RtWorkwxMsgHis rtWorkwxMsgHis)
    {
        return toAjax(rtWorkwxMsgHisService.insertRtWorkwxMsgHis(rtWorkwxMsgHis));
    }

    /**
     * 修改消息历史
     */
    @PreAuthorize("@ss.hasPermi('temp:HISWXMSG:edit')")
    @Log(title = "消息历史", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody RtWorkwxMsgHis rtWorkwxMsgHis)
    {
        return toAjax(rtWorkwxMsgHisService.updateRtWorkwxMsgHis(rtWorkwxMsgHis));
    }

    /**
     * 删除消息历史
     */
    @PreAuthorize("@ss.hasPermi('temp:HISWXMSG:remove')")
    @Log(title = "消息历史", businessType = BusinessType.DELETE)
	@DeleteMapping("/{pkIds}")
    public AjaxResult remove(@PathVariable Long[] pkIds)
    {
        return toAjax(rtWorkwxMsgHisService.deleteRtWorkwxMsgHisByPkIds(pkIds));
    }
}
