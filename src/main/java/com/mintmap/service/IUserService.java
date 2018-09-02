package com.mintmap.service;

import com.mintmap.common.ServerResponse;
import com.mintmap.pojo.User;

public interface IUserService {

    ServerResponse<User> login(Long phone, String code);

}
