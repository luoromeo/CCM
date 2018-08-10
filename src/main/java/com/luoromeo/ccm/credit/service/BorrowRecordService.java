package com.luoromeo.ccm.credit.service;

import java.math.BigDecimal;

import com.luoromeo.ccm.base.entity.ResultList;
import com.luoromeo.ccm.base.service.BaseService;
import com.luoromeo.ccm.credit.entity.BorrowRecord;

/**
 * @description
 * @author zhanghua.luo
 * @date 2018年04月23日 23:25
 * @modified By
 */
public interface BorrowRecordService extends BaseService<BorrowRecord> {

    ResultList<BorrowRecord> getByMonth(String month);

    ResultList<BigDecimal> getInterestTrends();
}
