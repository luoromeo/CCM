package com.luoromeo.ccm.credit.controller;

import reactor.core.publisher.Mono;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luoromeo.ccm.base.controller.BaseController;
import com.luoromeo.ccm.base.entity.ResultList;
import com.luoromeo.ccm.credit.entity.CreditAccount;
import com.luoromeo.ccm.credit.service.CreditAccountService;

/**
 * @description
 * @author zhanghua.luo
 * @date 2018年04月23日 23:37
 * @modified By
 */
@RestController
@RequestMapping("creditAccount")
public class CreditAccountController extends BaseController<CreditAccount, CreditAccountService> {

    @GetMapping("/money")
    public Mono<ResultList<CreditAccount>> findByAvailableCreditGtEq(BigDecimal money) {
        return Mono.just(this.getS().findByAvailableCreditGtEq(money));
    }
}
