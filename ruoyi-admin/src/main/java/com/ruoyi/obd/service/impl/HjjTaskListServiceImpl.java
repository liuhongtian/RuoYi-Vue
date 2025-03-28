package com.ruoyi.obd.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.obd.mapper.HjjTaskListMapper;
import com.ruoyi.kanban.client.WekanRestfulClient;
import com.ruoyi.kanban.client.model.NewCard;
import com.ruoyi.obd.domain.HjjTaskList;
import com.ruoyi.obd.service.IHjjTaskListService;

/**
 * 水样采样跟踪Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-03-27
 */
@Service
public class HjjTaskListServiceImpl implements IHjjTaskListService 
{
    @Autowired
    private HjjTaskListMapper hjjTaskListMapper;

    @Autowired
    private WekanRestfulClient wekanRestfulClient;

    /**
     * 查询水样采样跟踪
     * 
     * @param pkId 水样采样跟踪主键
     * @return 水样采样跟踪
     */
    @Override
    public HjjTaskList selectHjjTaskListByPkId(Long pkId)
    {
        return hjjTaskListMapper.selectHjjTaskListByPkId(pkId);
    }

    /**
     * 查询水样采样跟踪列表
     * 
     * @param hjjTaskList 水样采样跟踪
     * @return 水样采样跟踪
     */
    @Override
    public List<HjjTaskList> selectHjjTaskListList(HjjTaskList hjjTaskList)
    {
        return hjjTaskListMapper.selectHjjTaskListList(hjjTaskList);
    }

    /**
     * 新增水样采样跟踪
     * 
     * @param hjjTaskList 水样采样跟踪
     * @return 结果
     */
    @Override
    public int insertHjjTaskList(HjjTaskList hjjTaskList)
    {
        // TODO: 演示样例：新增水样采样任务时，创建Wekan卡片
        NewCard c = new NewCard();
        c.setTitle(hjjTaskList.getTaskNo());
        c.setDescription(hjjTaskList.getTaskContent());
        String cardId = wekanRestfulClient.newCard(c);
        hjjTaskList.setWekanCardId(cardId);
        
        return hjjTaskListMapper.insertHjjTaskList(hjjTaskList);
    }

    /**
     * 修改水样采样跟踪
     * 
     * @param hjjTaskList 水样采样跟踪
     * @return 结果
     */
    @Override
    public int updateHjjTaskList(HjjTaskList hjjTaskList)
    {
        return hjjTaskListMapper.updateHjjTaskList(hjjTaskList);
    }

    /**
     * 批量删除水样采样跟踪
     * 
     * @param pkIds 需要删除的水样采样跟踪主键
     * @return 结果
     */
    @Override
    public int deleteHjjTaskListByPkIds(Long[] pkIds)
    {
        return hjjTaskListMapper.deleteHjjTaskListByPkIds(pkIds);
    }

    /**
     * 删除水样采样跟踪信息
     * 
     * @param pkId 水样采样跟踪主键
     * @return 结果
     */
    @Override
    public int deleteHjjTaskListByPkId(Long pkId)
    {
        return hjjTaskListMapper.deleteHjjTaskListByPkId(pkId);
    }
}
