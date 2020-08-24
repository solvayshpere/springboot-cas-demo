package com.solvay.springbootcasdemo.service;

import com.solvay.springbootcasdemo.entity.CasUserBase;
import java.util.List;

/**
 * (CasUserBase)表服务接口
 *
 * @author makejava
 * @since 2020-08-19 09:17:46
 */
public interface CasUserBaseService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CasUserBase queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<CasUserBase> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param casUserBase 实例对象
     * @return 实例对象
     */
    CasUserBase insert(CasUserBase casUserBase);

    /**
     * 修改数据
     *
     * @param casUserBase 实例对象
     * @return 实例对象
     */
    CasUserBase update(CasUserBase casUserBase);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}