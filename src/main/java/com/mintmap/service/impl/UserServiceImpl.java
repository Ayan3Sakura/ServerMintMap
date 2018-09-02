package com.mintmap.service.impl;

import com.mintmap.common.ServerResponse;
import com.mintmap.dao.UserMapper;
import com.mintmap.pojo.User;
import com.mintmap.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("iUserService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public ServerResponse<User> login(Long phone, String code) {

        //首先验证验证码！！！{✔验证成功——继续下面操作；❌验证失败——返回ServerResponse}
        //验证失败..........
        {
            //验证验证验证验证
            //以下，验证失败，返回status=0，msg="验证失败"
            if(false){
                return ServerResponse.createByErrorCodeMessage(1,"验证失败。");
            }
        }
        //验证成功，以下
        int result = userMapper.checkPhone(phone);//查看是否存在phone对应的用户
        User user = new User();
        if (result == 0) {
            //用户不存在（新用户），插入数据库，登录成功——插入信息，返回前台
            userMapper.insert(new User(phone));//新用户插入记录
            return ServerResponse.createBySuccess(user);//返回status=0，data=user
            /*createBySuccess()返回类型结果如下：
            return new ServerResponse<T>(ResponseCode.SUCCESS.getCode(), data);*/
        } else {
            //用户存在（老用户），登录成功——查询出信息返回前台
            user = userMapper.selectByPhone(phone);
            return ServerResponse.createBySuccess(user);//返回status=0，data=user
            /*createBySuccess()返回类型结果如下：
            return new ServerResponse<T>(ResponseCode.SUCCESS.getCode(), data);*/
        }
    }
}
