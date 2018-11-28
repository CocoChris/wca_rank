package com.wca.rank.service;

import com.wca.rank.dao.IntentKeywordMapper;
import com.wca.rank.pojo.IntentKeywordPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by liuxingxin on 2018/11/22.
 */

@Service
public class IntentKeywordService {

    @Autowired
    IntentKeywordMapper intentKeywordMapper;

    public List<IntentKeywordPojo> selectAll() {
        return intentKeywordMapper.selectAll();
    }
}
