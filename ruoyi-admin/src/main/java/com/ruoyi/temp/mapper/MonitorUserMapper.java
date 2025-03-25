package com.ruoyi.temp.mapper;

import java.util.List;
import com.ruoyi.temp.domain.MonitorUser;

/**
 * 临时监测用户信息Mapper接口
 * 
 * @author ruoyi
 * @date 2025-03-25
 */
public interface MonitorUserMapper 
{
    /**
     * 查询临时监测用户信息
     * 
     * @param userId 临时监测用户信息主键
     * @return 临时监测用户信息
     */
    public MonitorUser selectMonitorUserByUserId(Long userId);

    /**
     * 查询临时监测用户信息列表
     * 
     * @param monitorUser 临时监测用户信息
     * @return 临时监测用户信息集合
     */
    public List<MonitorUser> selectMonitorUserList(MonitorUser monitorUser);

    /**
     * 新增临时监测用户信息
     * 
     * @param monitorUser 临时监测用户信息
     * @return 结果
     */
    public int insertMonitorUser(MonitorUser monitorUser);

    /**
     * 修改临时监测用户信息
     * 
     * @param monitorUser 临时监测用户信息
     * @return 结果
     */
    public int updateMonitorUser(MonitorUser monitorUser);

    /**
     * 删除临时监测用户信息
     * 
     * @param userId 临时监测用户信息主键
     * @return 结果
     */
    public int deleteMonitorUserByUserId(Long userId);

    /**
     * 批量删除临时监测用户信息
     * 
     * @param userIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMonitorUserByUserIds(Long[] userIds);
}
