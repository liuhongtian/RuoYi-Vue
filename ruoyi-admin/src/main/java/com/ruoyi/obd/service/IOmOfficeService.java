package com.ruoyi.obd.service;

import java.util.List;
import com.ruoyi.obd.domain.OmOffice;

/**
 * 办事处Service接口
 * 
 * @author ruoyi
 * @date 2025-03-31
 */
public interface IOmOfficeService 
{
    /**
     * 查询办事处
     * 
     * @param pkId 办事处主键
     * @return 办事处
     */
    public OmOffice selectOmOfficeByPkId(Long pkId);

    /**
     * 查询办事处列表
     * 
     * @param omOffice 办事处
     * @return 办事处集合
     */
    public List<OmOffice> selectOmOfficeList(OmOffice omOffice);

    /**
     * 新增办事处
     * 
     * @param omOffice 办事处
     * @return 结果
     */
    public int insertOmOffice(OmOffice omOffice);

    /**
     * 修改办事处
     * 
     * @param omOffice 办事处
     * @return 结果
     */
    public int updateOmOffice(OmOffice omOffice);

    /**
     * 批量删除办事处
     * 
     * @param pkIds 需要删除的办事处主键集合
     * @return 结果
     */
    public int deleteOmOfficeByPkIds(Long[] pkIds);

    /**
     * 删除办事处信息
     * 
     * @param pkId 办事处主键
     * @return 结果
     */
    public int deleteOmOfficeByPkId(Long pkId);
}
