package com.luoromeo.ccm.base.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

/**
 * @description
 * @author zhanghua.luo
 * @date 2018年04月23日 22:22
 * @modified By
 */
@MappedSuperclass
@Getter
@Setter
public class Entity {

    @Id
    @Column(name="id",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    @Version
    protected Integer version;

    @Column
    protected Date gmtCreate;

    @Column
    protected Date gmtModified;
}
