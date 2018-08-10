package com.luoromeo.ccm.base.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.luoromeo.ccm.base.entity.Entity;

/**
 * @description
 * @author zhanghua.luo
 * @date 2018年04月23日 22:50
 * @modified By
 */
public interface BaseRepository<T extends Entity> extends JpaRepository<T, Long>, JpaSpecificationExecutor<T> {
}
