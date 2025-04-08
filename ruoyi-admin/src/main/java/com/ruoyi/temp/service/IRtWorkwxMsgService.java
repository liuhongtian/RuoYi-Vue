package com.ruoyi.temp.service;

import java.util.List;
import com.ruoyi.temp.domain.RtWorkwxMsg;

/**
 * 待发送消息Service接口
 * 
 * @author ruoyi
 * @date 2025-04-08
 */
public interface IRtWorkwxMsgService 
{
    /**
     * 查询待发送消息
     * 
     * @param pkId 待发送消息主键
     * @return 待发送消息
     */
    public RtWorkwxMsg selectRtWorkwxMsgByPkId(Long pkId);

    /**
     * 查询待发送消息列表
     * 
     * @param rtWorkwxMsg 待发送消息
     * @return 待发送消息集合
     */
    public List<RtWorkwxMsg> selectRtWorkwxMsgList(RtWorkwxMsg rtWorkwxMsg);

    /**
     * 新增待发送消息
     * 
     * @param rtWorkwxMsg 待发送消息
     * @return 结果
     */
    public int insertRtWorkwxMsg(RtWorkwxMsg rtWorkwxMsg);

    /**
     * 修改待发送消息
     * 
     * @param rtWorkwxMsg 待发送消息
     * @return 结果
     */
    public int updateRtWorkwxMsg(RtWorkwxMsg rtWorkwxMsg);

    /**
     * 批量删除待发送消息
     * 
     * @param pkIds 需要删除的待发送消息主键集合
     * @return 结果
     */
    public int deleteRtWorkwxMsgByPkIds(Long[] pkIds);

    /**
     * 删除待发送消息信息
     * 
     * @param pkId 待发送消息主键
     * @return 结果
     */
    public int deleteRtWorkwxMsgByPkId(Long pkId);
}
