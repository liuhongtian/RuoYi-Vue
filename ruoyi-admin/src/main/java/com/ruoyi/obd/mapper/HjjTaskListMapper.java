package com.ruoyi.obd.mapper;

import java.util.List;
import com.ruoyi.obd.domain.HjjTaskList;

/**
 * 水样采样跟踪Mapper接口
 * 
 * @author ruoyi
 * @date 2025-03-27
 */
public interface HjjTaskListMapper 
{
    /**
     * 查询水样采样跟踪
     * 
     * @param pkId 水样采样跟踪主键
     * @return 水样采样跟踪
     */
    public HjjTaskList selectHjjTaskListByPkId(Long pkId);

    /**
     * 查询水样采样跟踪列表
     * 
     * @param hjjTaskList 水样采样跟踪
     * @return 水样采样跟踪集合
     */
    public List<HjjTaskList> selectHjjTaskListList(HjjTaskList hjjTaskList);

    /**
     * 新增水样采样跟踪
     * 
     * @param hjjTaskList 水样采样跟踪
     * @return 结果
     */
    public int insertHjjTaskList(HjjTaskList hjjTaskList);

    /**
     * 修改水样采样跟踪
     * 
     * @param hjjTaskList 水样采样跟踪
     * @return 结果
     */
    public int updateHjjTaskList(HjjTaskList hjjTaskList);

    /**
     * 删除水样采样跟踪
     * 
     * @param pkId 水样采样跟踪主键
     * @return 结果
     */
    public int deleteHjjTaskListByPkId(Long pkId);

    /**
     * 批量删除水样采样跟踪
     * 
     * @param pkIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteHjjTaskListByPkIds(Long[] pkIds);
}
