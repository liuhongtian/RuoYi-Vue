package com.ruoyi.obd.service;

import java.util.List;
import com.ruoyi.obd.domain.SampleConnectPlace;

/**
 * 样品交接点Service接口
 * 
 * @author ruoyi
 * @date 2025-03-27
 */
public interface ISampleConnectPlaceService 
{
    /**
     * 查询样品交接点
     * 
     * @param pkId 样品交接点主键
     * @return 样品交接点
     */
    public SampleConnectPlace selectSampleConnectPlaceByPkId(Long pkId);

    /**
     * 查询样品交接点列表
     * 
     * @param sampleConnectPlace 样品交接点
     * @return 样品交接点集合
     */
    public List<SampleConnectPlace> selectSampleConnectPlaceList(SampleConnectPlace sampleConnectPlace);

    /**
     * 新增样品交接点
     * 
     * @param sampleConnectPlace 样品交接点
     * @return 结果
     */
    public int insertSampleConnectPlace(SampleConnectPlace sampleConnectPlace);

    /**
     * 修改样品交接点
     * 
     * @param sampleConnectPlace 样品交接点
     * @return 结果
     */
    public int updateSampleConnectPlace(SampleConnectPlace sampleConnectPlace);

    /**
     * 批量删除样品交接点
     * 
     * @param pkIds 需要删除的样品交接点主键集合
     * @return 结果
     */
    public int deleteSampleConnectPlaceByPkIds(Long[] pkIds);

    /**
     * 删除样品交接点信息
     * 
     * @param pkId 样品交接点主键
     * @return 结果
     */
    public int deleteSampleConnectPlaceByPkId(Long pkId);
}
