package com.ruoyi.obd.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.obd.mapper.SampleConnectPlaceMapper;
import com.ruoyi.obd.domain.SampleConnectPlace;
import com.ruoyi.obd.service.ISampleConnectPlaceService;

/**
 * 样品交接点Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-03-27
 */
@Service
public class SampleConnectPlaceServiceImpl implements ISampleConnectPlaceService 
{
    @Autowired
    private SampleConnectPlaceMapper sampleConnectPlaceMapper;

    /**
     * 查询样品交接点
     * 
     * @param pkId 样品交接点主键
     * @return 样品交接点
     */
    @Override
    public SampleConnectPlace selectSampleConnectPlaceByPkId(Long pkId)
    {
        return sampleConnectPlaceMapper.selectSampleConnectPlaceByPkId(pkId);
    }

    /**
     * 查询样品交接点列表
     * 
     * @param sampleConnectPlace 样品交接点
     * @return 样品交接点
     */
    @Override
    public List<SampleConnectPlace> selectSampleConnectPlaceList(SampleConnectPlace sampleConnectPlace)
    {
        return sampleConnectPlaceMapper.selectSampleConnectPlaceList(sampleConnectPlace);
    }

    /**
     * 新增样品交接点
     * 
     * @param sampleConnectPlace 样品交接点
     * @return 结果
     */
    @Override
    public int insertSampleConnectPlace(SampleConnectPlace sampleConnectPlace)
    {
        return sampleConnectPlaceMapper.insertSampleConnectPlace(sampleConnectPlace);
    }

    /**
     * 修改样品交接点
     * 
     * @param sampleConnectPlace 样品交接点
     * @return 结果
     */
    @Override
    public int updateSampleConnectPlace(SampleConnectPlace sampleConnectPlace)
    {
        return sampleConnectPlaceMapper.updateSampleConnectPlace(sampleConnectPlace);
    }

    /**
     * 批量删除样品交接点
     * 
     * @param pkIds 需要删除的样品交接点主键
     * @return 结果
     */
    @Override
    public int deleteSampleConnectPlaceByPkIds(Long[] pkIds)
    {
        return sampleConnectPlaceMapper.deleteSampleConnectPlaceByPkIds(pkIds);
    }

    /**
     * 删除样品交接点信息
     * 
     * @param pkId 样品交接点主键
     * @return 结果
     */
    @Override
    public int deleteSampleConnectPlaceByPkId(Long pkId)
    {
        return sampleConnectPlaceMapper.deleteSampleConnectPlaceByPkId(pkId);
    }
}
