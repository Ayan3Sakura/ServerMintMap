package com.mintmap.dao;

import com.mintmap.pojo.Favour;

public interface FavourMapper {
    int deleteByPrimaryKey(Integer favourid);

    int insert(Favour record);

    int insertSelective(Favour record);

    Favour selectByPrimaryKey(Integer favourid);

    int updateByPrimaryKeySelective(Favour record);

    int updateByPrimaryKey(Favour record);
}