package com.ruoyi.temp.mapper;

import java.util.List;
import com.ruoyi.temp.domain.DynamicDictTest;

/**
 * dynamicDictTestMapper接口
 * 
 * @author ruoyi
 * @date 2025-03-30
 */
public interface DynamicDictTestMapper 
{
    /**
     * 查询dynamicDictTest
     * 
     * @param pkId dynamicDictTest主键
     * @return dynamicDictTest
     */
    public DynamicDictTest selectDynamicDictTestByPkId(Long pkId);

    /**
     * 查询dynamicDictTest列表
     * 
     * @param dynamicDictTest dynamicDictTest
     * @return dynamicDictTest集合
     */
    public List<DynamicDictTest> selectDynamicDictTestList(DynamicDictTest dynamicDictTest);

    /**
     * 新增dynamicDictTest
     * 
     * @param dynamicDictTest dynamicDictTest
     * @return 结果
     */
    public int insertDynamicDictTest(DynamicDictTest dynamicDictTest);

    /**
     * 修改dynamicDictTest
     * 
     * @param dynamicDictTest dynamicDictTest
     * @return 结果
     */
    public int updateDynamicDictTest(DynamicDictTest dynamicDictTest);

    /**
     * 删除dynamicDictTest
     * 
     * @param pkId dynamicDictTest主键
     * @return 结果
     */
    public int deleteDynamicDictTestByPkId(Long pkId);

    /**
     * 批量删除dynamicDictTest
     * 
     * @param pkIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDynamicDictTestByPkIds(Long[] pkIds);
}
