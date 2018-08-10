package com.luoromeo.ccm.credit.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luoromeo.ccm.base.controller.BaseController;
import com.luoromeo.ccm.credit.entity.BorrowChannels;
import com.luoromeo.ccm.credit.service.BorrowChannelsService;

/**
 * @description
 * @author zhanghua.luo
 * @date 2018年05月08日 16:34
 * @modified By
 */
@RestController
@RequestMapping("borrowChannels")
public class BorrowChannelsController extends BaseController<BorrowChannels, BorrowChannelsService> {
}
