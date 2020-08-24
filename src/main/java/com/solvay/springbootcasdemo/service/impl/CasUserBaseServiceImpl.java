package com.solvay.springbootcasdemo.service.impl;

import com.solvay.springbootcasdemo.entity.CasUserBase;
import com.solvay.springbootcasdemo.dao.CasUserBaseDao;
import com.solvay.springbootcasdemo.service.CasUserBaseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (CasUserBase)表服务实现类
 *
 * @author makejava
 * @since 2020-08-19 09:17:48
 */
@Service("casUserBaseService")
public class CasUserBaseServiceImpl implements CasUserBaseService {
    @Resource
    private CasUserBaseDao casUserBaseDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public CasUserBase queryById(Integer id) {
        return this.casUserBaseDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<CasUserBase> queryAllByLimit(int offset, int limit) {
        return this.casUserBaseDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param casUserBase 实例对象
     * @return 实例对象
     */
    @Override
    public CasUserBase insert(CasUserBase casUserBase) {
        this.casUserBaseDao.insert(casUserBase);
        return casUserBase;
    }

    /**
     * 修改数据
     *
     * @param casUserBase 实例对象
     * @return 实例对象
     */
    @Override
    public CasUserBase update(CasUserBase casUserBase) {
        this.casUserBaseDao.update(casUserBase);
        return this.queryById(casUserBase.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.casUserBaseDao.deleteById(id) > 0;
    }
}