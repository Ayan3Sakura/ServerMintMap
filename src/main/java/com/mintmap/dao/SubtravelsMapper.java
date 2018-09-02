package com.mintmap.dao;

import com.mintmap.pojo.Subtravels;

public interface SubtravelsMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(Subtravels record);

    int insertSelective(Subtravels record);

    Subtravels selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(Subtravels record);

    int updateByPrimaryKey(Subtravels record);
}