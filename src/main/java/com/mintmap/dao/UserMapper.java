package com.mintmap.dao;

import com.mintmap.pojo.User;

public interface UserMapper {

    int deleteByPrimaryKey(Integer uid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    int checkPhone(Long phone);

    User selectByPhone(Long phone);
}