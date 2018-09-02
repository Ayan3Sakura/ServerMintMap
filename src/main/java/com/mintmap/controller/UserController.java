package com.mintmap.controller;

import com.mintmap.common.ServerResponse;
import com.mintmap.pojo.User;
import com.mintmap.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user/")
public class UserController {

    //注入
    @Autowired
    private IUserService iUserService;

    /**
     * 用户登录/注册
     *
     * @param phone
     * @param code
     * @return response
     */
    @RequestMapping(value = "login.do", method = RequestMethod.POST)
    @ResponseBody  //自动将返回值转换为json
    public ServerResponse<User> login(Long phone, String code) {
        //service-->mybatis-->dao
        ServerResponse<User> response=iUserService.login(phone,code);
        return response;
    }
}
