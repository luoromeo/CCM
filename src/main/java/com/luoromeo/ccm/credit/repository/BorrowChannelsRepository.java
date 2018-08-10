package com.luoromeo.ccm.credit.repository;

import java.util.Optional;

import com.luoromeo.ccm.base.repository.BaseRepository;
import com.luoromeo.ccm.credit.entity.BorrowChannels;

/**
 * @description
 * @author zhanghua.luo
 * @date 2018年05月08日 16:30
 * @modified By
 */
public interface BorrowChannelsRepository extends BaseRepository<BorrowChannels> {

    Optional<BorrowChannels> findByName(String name);
}
