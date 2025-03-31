package com.ruoyi.obd.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.obd.mapper.OmOfficeMapper;
import com.ruoyi.obd.domain.OmOffice;
import com.ruoyi.obd.service.IOmOfficeService;

/**
 * 办事处Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-03-31
 */
@Service
public class OmOfficeServiceImpl implements IOmOfficeService 
{
    @Autowired
    private OmOfficeMapper omOfficeMapper;

    /**
     * 查询办事处
     * 
     * @param pkId 办事处主键
     * @return 办事处
     */
    @Override
    public OmOffice selectOmOfficeByPkId(Long pkId)
    {
        return omOfficeMapper.selectOmOfficeByPkId(pkId);
    }

    /**
     * 查询办事处列表
     * 
     * @param omOffice 办事处
     * @return 办事处
     */
    @Override
    public List<OmOffice> selectOmOfficeList(OmOffice omOffice)
    {
        return omOfficeMapper.selectOmOfficeList(omOffice);
    }

    /**
     * 新增办事处
     * 
     * @param omOffice 办事处
     * @return 结果
     */
    @Override
    public int insertOmOffice(OmOffice omOffice)
    {
        return omOfficeMapper.insertOmOffice(omOffice);
    }

    /**
     * 修改办事处
     * 
     * @param omOffice 办事处
     * @return 结果
     */
    @Override
    public int updateOmOffice(OmOffice omOffice)
    {
        return omOfficeMapper.updateOmOffice(omOffice);
    }

    /**
     * 批量删除办事处
     * 
     * @param pkIds 需要删除的办事处主键
     * @return 结果
     */
    @Override
    public int deleteOmOfficeByPkIds(Long[] pkIds)
    {
        return omOfficeMapper.deleteOmOfficeByPkIds(pkIds);
    }

    /**
     * 删除办事处信息
     * 
     * @param pkId 办事处主键
     * @return 结果
     */
    @Override
    public int deleteOmOfficeByPkId(Long pkId)
    {
        return omOfficeMapper.deleteOmOfficeByPkId(pkId);
    }
}
