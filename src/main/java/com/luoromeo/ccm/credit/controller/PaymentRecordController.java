package com.luoromeo.ccm.credit.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.luoromeo.ccm.base.controller.BaseController;
import com.luoromeo.ccm.base.entity.Result;
import com.luoromeo.ccm.base.entity.ResultList;
import com.luoromeo.ccm.credit.entity.BorrowRecord;
import com.luoromeo.ccm.credit.entity.CreditCardBill;
import com.luoromeo.ccm.credit.entity.PaymentRecord;
import com.luoromeo.ccm.credit.po.PaymentPo;
import com.luoromeo.ccm.credit.service.PaymentRecordService;

/**
 * @description
 * @author zhanghua.luo
 * @date 2018年04月23日 23:37
 * @modified By
 */
@RestController
@RequestMapping("paymentRecord")
public class PaymentRecordController extends BaseController<PaymentRecord, PaymentRecordService> {

    @RequestMapping(value = "/month/{month}", method = RequestMethod.GET)
    public ResultList<PaymentRecord> getByBillMonth(@PathVariable("month") String month) {
        return this.getS().getByMonth(month);
    }

    @RequestMapping(value = "/payment", method = RequestMethod.POST)
    public Result<String> payment(@RequestBody PaymentPo paymentPo) {
        return this.getS().payment(paymentPo);
    }
}
