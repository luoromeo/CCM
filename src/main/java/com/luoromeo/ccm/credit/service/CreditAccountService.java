package com.luoromeo.ccm.credit.service;

import java.math.BigDecimal;

import com.luoromeo.ccm.base.entity.ResultList;
import com.luoromeo.ccm.base.service.BaseService;
import com.luoromeo.ccm.credit.entity.CreditAccount;

/**
 * @description
 * @author zhanghua.luo
 * @date 2018年04月23日 23:25
 * @modified By
 */
public interface CreditAccountService extends BaseService<CreditAccount> {

    /**
     * @description 获取可用额度大于money的账户
     * @author zhanghua.luo
     * @date 2018年05月07日 10:40:18
     * @param money
     * @return
     */
    ResultList<CreditAccount> findByAvailableCreditGtEq(BigDecimal money);
}
