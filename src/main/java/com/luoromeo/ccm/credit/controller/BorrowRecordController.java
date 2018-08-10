package com.luoromeo.ccm.credit.controller;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.luoromeo.ccm.base.controller.BaseController;
import com.luoromeo.ccm.base.entity.ResultList;
import com.luoromeo.ccm.credit.entity.BorrowRecord;
import com.luoromeo.ccm.credit.service.BorrowRecordService;

import reactor.core.publisher.Mono;

/**
 * @description
 * @author zhanghua.luo
 * @date 2018年04月23日 23:37
 * @modified By
 */
@RestController
@RequestMapping("borrowRecord")
public class BorrowRecordController extends BaseController<BorrowRecord, BorrowRecordService> {

    @RequestMapping(value = "/month/{month}", method = RequestMethod.GET)
    public Mono<ResultList<BorrowRecord>> getByBillMonth(@PathVariable("month") String month) {
        return Mono.just(this.getS().getByMonth(month));
    }

    @GetMapping(value = "interestTrends")
    public Mono<ResultList<BigDecimal>> getBillTrends() {
        return Mono.just(this.getS().getInterestTrends());
    }
}
