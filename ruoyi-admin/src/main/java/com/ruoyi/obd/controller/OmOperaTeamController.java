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
import com.ruoyi.obd.domain.OmOperaTeam;
import com.ruoyi.obd.service.IOmOperaTeamService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 运维小组Controller
 * 
 * @author ruoyi
 * @date 2025-03-31
 */
@RestController
@RequestMapping("/obd/OmOperaTeam")
public class OmOperaTeamController extends BaseController
{
    @Autowired
    private IOmOperaTeamService omOperaTeamService;

    /**
     * 查询运维小组列表（不分页）
     */
    @PreAuthorize("@ss.hasPermi('obd:OmOperaTeam:list')")
    @GetMapping("/listall")
    public TableDataInfo listAll(OmOperaTeam omOperaTeam)
    {
        //startPage();
        List<OmOperaTeam> list = omOperaTeamService.selectOmOperaTeamList(omOperaTeam);
        return getDataTable(list);
    }

    /**
     * 查询运维小组列表
     */
    @PreAuthorize("@ss.hasPermi('obd:OmOperaTeam:list')")
    @GetMapping("/list")
    public TableDataInfo list(OmOperaTeam omOperaTeam)
    {
        startPage();
        List<OmOperaTeam> list = omOperaTeamService.selectOmOperaTeamList(omOperaTeam);
        return getDataTable(list);
    }

    /**
     * 导出运维小组列表
     */
    @PreAuthorize("@ss.hasPermi('obd:OmOperaTeam:export')")
    @Log(title = "运维小组", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, OmOperaTeam omOperaTeam)
    {
        List<OmOperaTeam> list = omOperaTeamService.selectOmOperaTeamList(omOperaTeam);
        ExcelUtil<OmOperaTeam> util = new ExcelUtil<OmOperaTeam>(OmOperaTeam.class);
        util.exportExcel(response, list, "运维小组数据");
    }

    /**
     * 获取运维小组详细信息
     */
    @PreAuthorize("@ss.hasPermi('obd:OmOperaTeam:query')")
    @GetMapping(value = "/{pkId}")
    public AjaxResult getInfo(@PathVariable("pkId") Long pkId)
    {
        return success(omOperaTeamService.selectOmOperaTeamByPkId(pkId));
    }

    /**
     * 新增运维小组
     */
    @PreAuthorize("@ss.hasPermi('obd:OmOperaTeam:add')")
    @Log(title = "运维小组", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody OmOperaTeam omOperaTeam)
    {
        return toAjax(omOperaTeamService.insertOmOperaTeam(omOperaTeam));
    }

    /**
     * 修改运维小组
     */
    @PreAuthorize("@ss.hasPermi('obd:OmOperaTeam:edit')")
    @Log(title = "运维小组", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody OmOperaTeam omOperaTeam)
    {
        return toAjax(omOperaTeamService.updateOmOperaTeam(omOperaTeam));
    }

    /**
     * 删除运维小组
     */
    @PreAuthorize("@ss.hasPermi('obd:OmOperaTeam:remove')")
    @Log(title = "运维小组", businessType = BusinessType.DELETE)
	@DeleteMapping("/{pkIds}")
    public AjaxResult remove(@PathVariable Long[] pkIds)
    {
        return toAjax(omOperaTeamService.deleteOmOperaTeamByPkIds(pkIds));
    }
}
