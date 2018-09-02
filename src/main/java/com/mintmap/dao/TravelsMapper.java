package com.mintmap.dao;

import com.mintmap.pojo.Travels;

public interface TravelsMapper {
    int deleteByPrimaryKey(Integer tid);

    int insert(Travels record);

    int insertSelective(Travels record);

    Travels selectByPrimaryKey(Integer tid);

    int updateByPrimaryKeySelective(Travels record);

    int updateByPrimaryKey(Travels record);
}