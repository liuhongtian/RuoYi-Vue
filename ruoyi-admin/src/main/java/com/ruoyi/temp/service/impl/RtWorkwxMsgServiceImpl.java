package com.ruoyi.temp.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.temp.mapper.RtWorkwxMsgMapper;
import com.ruoyi.temp.domain.RtWorkwxMsg;
import com.ruoyi.temp.service.IRtWorkwxMsgService;

/**
 * 待发送消息Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-04-08
 */
@Service
public class RtWorkwxMsgServiceImpl implements IRtWorkwxMsgService 
{
    @Autowired
    private RtWorkwxMsgMapper rtWorkwxMsgMapper;

    /**
     * 查询待发送消息
     * 
     * @param pkId 待发送消息主键
     * @return 待发送消息
     */
    @Override
    public RtWorkwxMsg selectRtWorkwxMsgByPkId(Long pkId)
    {
        return rtWorkwxMsgMapper.selectRtWorkwxMsgByPkId(pkId);
    }

    /**
     * 查询待发送消息列表
     * 
     * @param rtWorkwxMsg 待发送消息
     * @return 待发送消息
     */
    @Override
    public List<RtWorkwxMsg> selectRtWorkwxMsgList(RtWorkwxMsg rtWorkwxMsg)
    {
        return rtWorkwxMsgMapper.selectRtWorkwxMsgList(rtWorkwxMsg);
    }

    /**
     * 新增待发送消息
     * 
     * @param rtWorkwxMsg 待发送消息
     * @return 结果
     */
    @Override
    public int insertRtWorkwxMsg(RtWorkwxMsg rtWorkwxMsg)
    {
        rtWorkwxMsg.setCreateTime(DateUtils.getNowDate());
        return rtWorkwxMsgMapper.insertRtWorkwxMsg(rtWorkwxMsg);
    }

    /**
     * 修改待发送消息
     * 
     * @param rtWorkwxMsg 待发送消息
     * @return 结果
     */
    @Override
    public int updateRtWorkwxMsg(RtWorkwxMsg rtWorkwxMsg)
    {
        return rtWorkwxMsgMapper.updateRtWorkwxMsg(rtWorkwxMsg);
    }

    /**
     * 批量删除待发送消息
     * 
     * @param pkIds 需要删除的待发送消息主键
     * @return 结果
     */
    @Override
    public int deleteRtWorkwxMsgByPkIds(Long[] pkIds)
    {
        return rtWorkwxMsgMapper.deleteRtWorkwxMsgByPkIds(pkIds);
    }

    /**
     * 删除待发送消息信息
     * 
     * @param pkId 待发送消息主键
     * @return 结果
     */
    @Override
    public int deleteRtWorkwxMsgByPkId(Long pkId)
    {
        return rtWorkwxMsgMapper.deleteRtWorkwxMsgByPkId(pkId);
    }
}
