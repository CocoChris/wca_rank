package com.wca.rank.dao;

import com.wca.rank.pojo.IntentKeywordPojo;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IntentKeywordMapper {

    String TABLE_NAME = "_chatops_intent_keyword";

    int deleteByPrimaryKey(Integer id);

    int insert(IntentKeywordPojo record);

    int insertSelective(IntentKeywordPojo record);

    IntentKeywordPojo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(IntentKeywordPojo record);

    int updateByPrimaryKey(IntentKeywordPojo record);

    @Select("select * from " + TABLE_NAME)
    List<IntentKeywordPojo> selectAll();
}