package com.solvay.springbootcasdemo.controller;

import com.solvay.springbootcasdemo.entity.CasUserBase;
import com.solvay.springbootcasdemo.service.CasUserBaseService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (CasUserBase)表控制层
 *
 * @author makejava
 * @since 2020-08-19 09:17:50
 */
@RestController
@RequestMapping("casUserBase")
public class CasUserBaseController {
    /**
     * 服务对象
     */
    @Resource
    private CasUserBaseService casUserBaseService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public CasUserBase selectOne(Integer id) {
        return this.casUserBaseService.queryById(id);
    }

}