package com.luoromeo.ccm.base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.luoromeo.ccm.base.entity.Entity;
import com.luoromeo.ccm.base.entity.Result;
import com.luoromeo.ccm.base.entity.ResultList;
import com.luoromeo.ccm.base.entity.ResultPage;
import com.luoromeo.ccm.base.service.BaseService;

/**
 * @description
 * @author zhanghua.luo
 * @date 2018年04月23日 23:27
 * @modified By
 */
public class BaseController<T extends Entity, S extends BaseService> {

    @Autowired
    S s;

    @RequestMapping(method = RequestMethod.POST)
    @SuppressWarnings("unchecked")
    public Result<T> save(@RequestBody T t) {
        return this.s.save(t);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @SuppressWarnings("unchecked")
    public Result<T> delete(@PathVariable("id") Long id) {
        return this.s.delete(id);
    }

    @RequestMapping(method = RequestMethod.PUT)
    @SuppressWarnings("unchecked")
    public Result<T> update(T t) {
        return this.s.save(t);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @SuppressWarnings("unchecked")
    public Result<T> findById(@PathVariable("id") Long id) {
        return this.s.findById(id);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    @SuppressWarnings("unchecked")
    public ResultList<T> findAll() {
        return this.s.findAll();
    }

    @RequestMapping(value = "/page", method = RequestMethod.POST)
    @SuppressWarnings("unchecked")
    public ResultPage page(Integer pageNo, Integer pageSize, String searchInfo, String sortInfo) {
        return this.s.page(pageNo, pageSize, searchInfo, sortInfo);
    }

    public S getS() {
        return s;
    }
}
