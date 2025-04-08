package com.ruoyi.temp.mapper;

import java.util.List;
import com.ruoyi.temp.domain.RtWorkwxMsgHis;

/**
 * 消息历史Mapper接口
 * 
 * @author ruoyi
 * @date 2025-04-08
 */
public interface RtWorkwxMsgHisMapper 
{
    /**
     * 查询消息历史
     * 
     * @param pkId 消息历史主键
     * @return 消息历史
     */
    public RtWorkwxMsgHis selectRtWorkwxMsgHisByPkId(Long pkId);

    /**
     * 查询消息历史列表
     * 
     * @param rtWorkwxMsgHis 消息历史
     * @return 消息历史集合
     */
    public List<RtWorkwxMsgHis> selectRtWorkwxMsgHisList(RtWorkwxMsgHis rtWorkwxMsgHis);

    /**
     * 新增消息历史
     * 
     * @param rtWorkwxMsgHis 消息历史
     * @return 结果
     */
    public int insertRtWorkwxMsgHis(RtWorkwxMsgHis rtWorkwxMsgHis);

    /**
     * 修改消息历史
     * 
     * @param rtWorkwxMsgHis 消息历史
     * @return 结果
     */
    public int updateRtWorkwxMsgHis(RtWorkwxMsgHis rtWorkwxMsgHis);

    /**
     * 删除消息历史
     * 
     * @param pkId 消息历史主键
     * @return 结果
     */
    public int deleteRtWorkwxMsgHisByPkId(Long pkId);

    /**
     * 批量删除消息历史
     * 
     * @param pkIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteRtWorkwxMsgHisByPkIds(Long[] pkIds);
}
