package com.ruoyi.temp.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.temp.mapper.MonitorUserMapper;
import com.ruoyi.temp.domain.MonitorUser;
import com.ruoyi.temp.service.IMonitorUserService;

/**
 * 临时监测用户信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-03-25
 */
@Service
public class MonitorUserServiceImpl implements IMonitorUserService 
{
    @Autowired
    private MonitorUserMapper monitorUserMapper;

    /**
     * 查询临时监测用户信息
     * 
     * @param userId 临时监测用户信息主键
     * @return 临时监测用户信息
     */
    @Override
    public MonitorUser selectMonitorUserByUserId(Long userId)
    {
        return monitorUserMapper.selectMonitorUserByUserId(userId);
    }

    /**
     * 查询临时监测用户信息列表
     * 
     * @param monitorUser 临时监测用户信息
     * @return 临时监测用户信息
     */
    @Override
    public List<MonitorUser> selectMonitorUserList(MonitorUser monitorUser)
    {
        return monitorUserMapper.selectMonitorUserList(monitorUser);
    }

    /**
     * 新增临时监测用户信息
     * 
     * @param monitorUser 临时监测用户信息
     * @return 结果
     */
    @Override
    public int insertMonitorUser(MonitorUser monitorUser)
    {
        monitorUser.setCreateTime(DateUtils.getNowDate());
        return monitorUserMapper.insertMonitorUser(monitorUser);
    }

    /**
     * 修改临时监测用户信息
     * 
     * @param monitorUser 临时监测用户信息
     * @return 结果
     */
    @Override
    public int updateMonitorUser(MonitorUser monitorUser)
    {
        monitorUser.setUpdateTime(DateUtils.getNowDate());
        return monitorUserMapper.updateMonitorUser(monitorUser);
    }

    /**
     * 批量删除临时监测用户信息
     * 
     * @param userIds 需要删除的临时监测用户信息主键
     * @return 结果
     */
    @Override
    public int deleteMonitorUserByUserIds(Long[] userIds)
    {
        return monitorUserMapper.deleteMonitorUserByUserIds(userIds);
    }

    /**
     * 删除临时监测用户信息信息
     * 
     * @param userId 临时监测用户信息主键
     * @return 结果
     */
    @Override
    public int deleteMonitorUserByUserId(Long userId)
    {
        return monitorUserMapper.deleteMonitorUserByUserId(userId);
    }
}
