package com.solvay.springbootcasdemo.dao;

import com.solvay.springbootcasdemo.entity.CasUserBase;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (CasUserBase)表数据库访问层
 *
 * @author makejava
 * @since 2020-08-19 09:17:44
 */
public interface CasUserBaseDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CasUserBase queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<CasUserBase> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param casUserBase 实例对象
     * @return 对象列表
     */
    List<CasUserBase> queryAll(CasUserBase casUserBase);

    /**
     * 新增数据
     *
     * @param casUserBase 实例对象
     * @return 影响行数
     */
    int insert(CasUserBase casUserBase);

    /**
     * 修改数据
     *
     * @param casUserBase 实例对象
     * @return 影响行数
     */
    int update(CasUserBase casUserBase);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}