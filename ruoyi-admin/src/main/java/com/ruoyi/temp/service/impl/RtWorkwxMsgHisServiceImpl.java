package com.ruoyi.temp.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.temp.mapper.RtWorkwxMsgHisMapper;
import com.ruoyi.temp.domain.RtWorkwxMsgHis;
import com.ruoyi.temp.service.IRtWorkwxMsgHisService;

/**
 * 消息历史Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-04-08
 */
@Service
public class RtWorkwxMsgHisServiceImpl implements IRtWorkwxMsgHisService 
{
    @Autowired
    private RtWorkwxMsgHisMapper rtWorkwxMsgHisMapper;

    /**
     * 查询消息历史
     * 
     * @param pkId 消息历史主键
     * @return 消息历史
     */
    @Override
    public RtWorkwxMsgHis selectRtWorkwxMsgHisByPkId(Long pkId)
    {
        return rtWorkwxMsgHisMapper.selectRtWorkwxMsgHisByPkId(pkId);
    }

    /**
     * 查询消息历史列表
     * 
     * @param rtWorkwxMsgHis 消息历史
     * @return 消息历史
     */
    @Override
    public List<RtWorkwxMsgHis> selectRtWorkwxMsgHisList(RtWorkwxMsgHis rtWorkwxMsgHis)
    {
        return rtWorkwxMsgHisMapper.selectRtWorkwxMsgHisList(rtWorkwxMsgHis);
    }

    /**
     * 新增消息历史
     * 
     * @param rtWorkwxMsgHis 消息历史
     * @return 结果
     */
    @Override
    public int insertRtWorkwxMsgHis(RtWorkwxMsgHis rtWorkwxMsgHis)
    {
        rtWorkwxMsgHis.setCreateTime(DateUtils.getNowDate());
        return rtWorkwxMsgHisMapper.insertRtWorkwxMsgHis(rtWorkwxMsgHis);
    }

    /**
     * 修改消息历史
     * 
     * @param rtWorkwxMsgHis 消息历史
     * @return 结果
     */
    @Override
    public int updateRtWorkwxMsgHis(RtWorkwxMsgHis rtWorkwxMsgHis)
    {
        return rtWorkwxMsgHisMapper.updateRtWorkwxMsgHis(rtWorkwxMsgHis);
    }

    /**
     * 批量删除消息历史
     * 
     * @param pkIds 需要删除的消息历史主键
     * @return 结果
     */
    @Override
    public int deleteRtWorkwxMsgHisByPkIds(Long[] pkIds)
    {
        return rtWorkwxMsgHisMapper.deleteRtWorkwxMsgHisByPkIds(pkIds);
    }

    /**
     * 删除消息历史信息
     * 
     * @param pkId 消息历史主键
     * @return 结果
     */
    @Override
    public int deleteRtWorkwxMsgHisByPkId(Long pkId)
    {
        return rtWorkwxMsgHisMapper.deleteRtWorkwxMsgHisByPkId(pkId);
    }
}
