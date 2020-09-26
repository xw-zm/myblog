package com.xw.service;

import com.xw.entity.User;

/**
 *  用户业务层接口
 */
public interface UserService {

//    核对用户名和密码
    User checkUser(String username, String password);

}