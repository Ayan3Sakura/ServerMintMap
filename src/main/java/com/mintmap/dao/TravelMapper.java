package com.mintmap.dao;

import com.mintmap.pojo.Travel;

public interface TravelMapper {
    int deleteByPrimaryKey(Integer tid);

    int insert(Travel record);

    int insertSelective(Travel record);

    Travel selectByPrimaryKey(Integer tid);

    int updateByPrimaryKeySelective(Travel record);

    int updateByPrimaryKey(Travel record);
}