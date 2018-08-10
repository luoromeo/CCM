package com.luoromeo.ccm.system.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.luoromeo.ccm.base.entity.Entity;
import com.luoromeo.ccm.credit.entity.CreditAccount;

/**
 * @description
 * @author zhanghua.luo
 * @date 2018年05月16日 14:23
 * @modified By
 */
@javax.persistence.Entity
@Getter
@Setter
public class Dict extends Entity {

    /**
     * 字典code
     */
    private String dictCode;

    /**
     * 字典表value
     */
    private String dictValue;

//    @OneToMany(targetEntity = Dict.class, cascade = { CascadeType.ALL }, fetch=FetchType.EAGER)
//    @JoinColumn(name = "up_key", referencedColumnName = "id")
//    private List<Dict> children;

    private Long upKey;
}
