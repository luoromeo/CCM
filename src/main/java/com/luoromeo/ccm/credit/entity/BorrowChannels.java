package com.luoromeo.ccm.credit.entity;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

import com.luoromeo.ccm.base.entity.Entity;

/**
 * @description 借款渠道
 * @author zhanghua.luo
 * @date 2018年05月08日 16:23
 * @modified By
 */
@javax.persistence.Entity
@Getter
@Setter
public class BorrowChannels extends Entity {

    private String name;

    private Integer interestAccrualType;
    
    private BigDecimal interestRate;

    private BigDecimal fee;

    private Integer status;
}
