package com.ruoyi.temp.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.temp.mapper.DynamicDictTestMapper;
import com.ruoyi.temp.domain.DynamicDictTest;
import com.ruoyi.temp.service.IDynamicDictTestService;

/**
 * dynamicDictTestService业务层处理
 * 
 * @author ruoyi
 * @date 2025-03-30
 */
@Service
public class DynamicDictTestServiceImpl implements IDynamicDictTestService 
{
    @Autowired
    private DynamicDictTestMapper dynamicDictTestMapper;

    /**
     * 查询dynamicDictTest
     * 
     * @param pkId dynamicDictTest主键
     * @return dynamicDictTest
     */
    @Override
    public DynamicDictTest selectDynamicDictTestByPkId(Long pkId)
    {
        return dynamicDictTestMapper.selectDynamicDictTestByPkId(pkId);
    }

    /**
     * 查询dynamicDictTest列表
     * 
     * @param dynamicDictTest dynamicDictTest
     * @return dynamicDictTest
     */
    @Override
    public List<DynamicDictTest> selectDynamicDictTestList(DynamicDictTest dynamicDictTest)
    {
        return dynamicDictTestMapper.selectDynamicDictTestList(dynamicDictTest);
    }

    /**
     * 新增dynamicDictTest
     * 
     * @param dynamicDictTest dynamicDictTest
     * @return 结果
     */
    @Override
    public int insertDynamicDictTest(DynamicDictTest dynamicDictTest)
    {
        return dynamicDictTestMapper.insertDynamicDictTest(dynamicDictTest);
    }

    /**
     * 修改dynamicDictTest
     * 
     * @param dynamicDictTest dynamicDictTest
     * @return 结果
     */
    @Override
    public int updateDynamicDictTest(DynamicDictTest dynamicDictTest)
    {
        return dynamicDictTestMapper.updateDynamicDictTest(dynamicDictTest);
    }

    /**
     * 批量删除dynamicDictTest
     * 
     * @param pkIds 需要删除的dynamicDictTest主键
     * @return 结果
     */
    @Override
    public int deleteDynamicDictTestByPkIds(Long[] pkIds)
    {
        return dynamicDictTestMapper.deleteDynamicDictTestByPkIds(pkIds);
    }

    /**
     * 删除dynamicDictTest信息
     * 
     * @param pkId dynamicDictTest主键
     * @return 结果
     */
    @Override
    public int deleteDynamicDictTestByPkId(Long pkId)
    {
        return dynamicDictTestMapper.deleteDynamicDictTestByPkId(pkId);
    }
}
