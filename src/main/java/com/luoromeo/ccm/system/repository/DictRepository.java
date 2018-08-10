package com.luoromeo.ccm.system.repository;

import java.util.List;

import com.luoromeo.ccm.base.repository.BaseRepository;
import com.luoromeo.ccm.system.entity.Dict;

/**
 * @description
 * @author zhanghua.luo
 * @date 2018年05月08日 16:30
 * @modified By
 */
public interface DictRepository extends BaseRepository<Dict> {

    List<Dict> findAllByUpKey(Long upKey);
}
