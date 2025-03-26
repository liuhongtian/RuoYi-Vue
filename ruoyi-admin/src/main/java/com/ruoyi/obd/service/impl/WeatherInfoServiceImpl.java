package com.ruoyi.obd.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.obd.mapper.WeatherInfoMapper;
import com.ruoyi.obd.domain.WeatherInfo;
import com.ruoyi.obd.service.IWeatherInfoService;

/**
 * 气象信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-03-26
 */
@Service
public class WeatherInfoServiceImpl implements IWeatherInfoService 
{
    @Autowired
    private WeatherInfoMapper weatherInfoMapper;

    /**
     * 查询气象信息
     * 
     * @param pkId 气象信息主键
     * @return 气象信息
     */
    @Override
    public WeatherInfo selectWeatherInfoByPkId(Long pkId)
    {
        return weatherInfoMapper.selectWeatherInfoByPkId(pkId);
    }

    /**
     * 查询气象信息列表
     * 
     * @param weatherInfo 气象信息
     * @return 气象信息
     */
    @Override
    public List<WeatherInfo> selectWeatherInfoList(WeatherInfo weatherInfo)
    {
        return weatherInfoMapper.selectWeatherInfoList(weatherInfo);
    }

    /**
     * 新增气象信息
     * 
     * @param weatherInfo 气象信息
     * @return 结果
     */
    @Override
    public int insertWeatherInfo(WeatherInfo weatherInfo)
    {
        return weatherInfoMapper.insertWeatherInfo(weatherInfo);
    }

    /**
     * 修改气象信息
     * 
     * @param weatherInfo 气象信息
     * @return 结果
     */
    @Override
    public int updateWeatherInfo(WeatherInfo weatherInfo)
    {
        return weatherInfoMapper.updateWeatherInfo(weatherInfo);
    }

    /**
     * 批量删除气象信息
     * 
     * @param pkIds 需要删除的气象信息主键
     * @return 结果
     */
    @Override
    public int deleteWeatherInfoByPkIds(Long[] pkIds)
    {
        return weatherInfoMapper.deleteWeatherInfoByPkIds(pkIds);
    }

    /**
     * 删除气象信息信息
     * 
     * @param pkId 气象信息主键
     * @return 结果
     */
    @Override
    public int deleteWeatherInfoByPkId(Long pkId)
    {
        return weatherInfoMapper.deleteWeatherInfoByPkId(pkId);
    }
}
