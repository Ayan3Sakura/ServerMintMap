package com.mintmap.dao;

import com.mintmap.pojo.Subtravel;

public interface SubtravelMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(Subtravel record);

    int insertSelective(Subtravel record);

    Subtravel selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(Subtravel record);

    int updateByPrimaryKey(Subtravel record);
}