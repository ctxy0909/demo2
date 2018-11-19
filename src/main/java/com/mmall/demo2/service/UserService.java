package com.mmall.demo2.service;

import com.mmall.demo2.model.User;

/**
 * @author ct
 * @Title: UserService
 * @ProjectName demo2
 * @Description: TODO
 * @date 2018/11/18 18:43
 */
public interface UserService {
    User findByUsername(String username);
}
