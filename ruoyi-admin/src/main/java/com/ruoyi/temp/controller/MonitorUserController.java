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
import com.ruoyi.temp.domain.MonitorUser;
import com.ruoyi.temp.service.IMonitorUserService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 临时监测用户信息Controller
 * 
 * @author ruoyi
 * @date 2025-03-25
 */
@RestController
@RequestMapping("/temp/tempuser")
public class MonitorUserController extends BaseController
{
    @Autowired
    private IMonitorUserService monitorUserService;

    /**
     * 查询临时监测用户信息列表（不分页）
     */
    @PreAuthorize("@ss.hasPermi('temp:tempuser:list')")
    @GetMapping("/listall")
    public TableDataInfo listAll(MonitorUser monitorUser)
    {
        //startPage();
        List<MonitorUser> list = monitorUserService.selectMonitorUserList(monitorUser);
        return getDataTable(list);
    }

    /**
     * 查询临时监测用户信息列表
     */
    @PreAuthorize("@ss.hasPermi('temp:tempuser:list')")
    @GetMapping("/list")
    public TableDataInfo list(MonitorUser monitorUser)
    {
        startPage();
        List<MonitorUser> list = monitorUserService.selectMonitorUserList(monitorUser);
        return getDataTable(list);
    }

    /**
     * 导出临时监测用户信息列表
     */
    @PreAuthorize("@ss.hasPermi('temp:tempuser:export')")
    @Log(title = "临时监测用户信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, MonitorUser monitorUser)
    {
        List<MonitorUser> list = monitorUserService.selectMonitorUserList(monitorUser);
        ExcelUtil<MonitorUser> util = new ExcelUtil<MonitorUser>(MonitorUser.class);
        util.exportExcel(response, list, "临时监测用户信息数据");
    }

    /**
     * 获取临时监测用户信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('temp:tempuser:query')")
    @GetMapping(value = "/{userId}")
    public AjaxResult getInfo(@PathVariable("userId") Long userId)
    {
        return success(monitorUserService.selectMonitorUserByUserId(userId));
    }

    /**
     * 新增临时监测用户信息
     */
    @PreAuthorize("@ss.hasPermi('temp:tempuser:add')")
    @Log(title = "临时监测用户信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody MonitorUser monitorUser)
    {
        return toAjax(monitorUserService.insertMonitorUser(monitorUser));
    }

    /**
     * 修改临时监测用户信息
     */
    @PreAuthorize("@ss.hasPermi('temp:tempuser:edit')")
    @Log(title = "临时监测用户信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody MonitorUser monitorUser)
    {
        return toAjax(monitorUserService.updateMonitorUser(monitorUser));
    }

    /**
     * 删除临时监测用户信息
     */
    @PreAuthorize("@ss.hasPermi('temp:tempuser:remove')")
    @Log(title = "临时监测用户信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{userIds}")
    public AjaxResult remove(@PathVariable Long[] userIds)
    {
        return toAjax(monitorUserService.deleteMonitorUserByUserIds(userIds));
    }
}
