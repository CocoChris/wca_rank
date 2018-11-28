package com.wca.rank.controller;

import com.wca.rank.pojo.IntentKeywordPojo;
import com.wca.rank.service.IntentKeywordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by liuxingxin on 2018/11/22.
 */

@RestController
public class rankController {

    @Autowired
    IntentKeywordService intentKeywordService;

    @RequestMapping({"/rank"})
    public String showRank() {

        List<IntentKeywordPojo> res = intentKeywordService.selectAll();

        return res.toString();
    }
}
