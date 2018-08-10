package com.luoromeo.ccm.credit.controller;

import reactor.core.publisher.Mono;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.luoromeo.ccm.base.controller.BaseController;
import com.luoromeo.ccm.base.entity.Result;
import com.luoromeo.ccm.base.entity.ResultList;
import com.luoromeo.ccm.credit.entity.CreditCardBill;
import com.luoromeo.ccm.credit.service.CreditCardBillService;

/**
 * @description
 * @author zhanghua.luo
 * @date 2018年04月23日 23:37
 * @modified By
 */
@RestController
@RequestMapping("creditCardBill")
public class CreditCardBillController extends BaseController<CreditCardBill, CreditCardBillService> {


    @RequestMapping(value = "/billMonth/{billMonth}", method = RequestMethod.GET)
    public Mono<ResultList<CreditCardBill>> getByBillMonth(@PathVariable("billMonth") String billMonth) {
        return Mono.just(this.getS().getByBillMonth(billMonth));
    }

    @RequestMapping(value = "/paymentStatus/{paymentStatus}", method = RequestMethod.GET)
    public ResultList<CreditCardBill> getByPaymentStatus(@PathVariable("paymentStatus") Integer paymentStatus) {
        return this.getS().getByPaymentStatus(paymentStatus);
    }

    @GetMapping(value = "billTrends")
    public Result<List<BigDecimal>> getBillTrends() {
        return this.getS().getBillTrends();
    }

}
