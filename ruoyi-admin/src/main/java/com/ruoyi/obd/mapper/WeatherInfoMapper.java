package com.ruoyi.obd.mapper;

import java.util.List;
import com.ruoyi.obd.domain.WeatherInfo;

/**
 * 气象信息Mapper接口
 * 
 * @author ruoyi
 * @date 2025-03-26
 */
public interface WeatherInfoMapper 
{
    /**
     * 查询气象信息
     * 
     * @param pkId 气象信息主键
     * @return 气象信息
     */
    public WeatherInfo selectWeatherInfoByPkId(Long pkId);

    /**
     * 查询气象信息列表
     * 
     * @param weatherInfo 气象信息
     * @return 气象信息集合
     */
    public List<WeatherInfo> selectWeatherInfoList(WeatherInfo weatherInfo);

    /**
     * 新增气象信息
     * 
     * @param weatherInfo 气象信息
     * @return 结果
     */
    public int insertWeatherInfo(WeatherInfo weatherInfo);

    /**
     * 修改气象信息
     * 
     * @param weatherInfo 气象信息
     * @return 结果
     */
    public int updateWeatherInfo(WeatherInfo weatherInfo);

    /**
     * 删除气象信息
     * 
     * @param pkId 气象信息主键
     * @return 结果
     */
    public int deleteWeatherInfoByPkId(Long pkId);

    /**
     * 批量删除气象信息
     * 
     * @param pkIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteWeatherInfoByPkIds(Long[] pkIds);
}
