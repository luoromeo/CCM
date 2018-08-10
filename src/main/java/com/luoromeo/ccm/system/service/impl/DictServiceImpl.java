package com.luoromeo.ccm.system.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luoromeo.ccm.base.service.impl.BaseServiceImpl;
import com.luoromeo.ccm.system.entity.Dict;
import com.luoromeo.ccm.system.repository.DictRepository;
import com.luoromeo.ccm.system.service.DictService;

/**
 * @description
 * @author zhanghua.luo
 * @date 2018年05月08日 16:32
 * @modified By
 */
@Service
@Transactional
public class DictServiceImpl extends BaseServiceImpl<Dict, DictRepository> implements DictService {
}
