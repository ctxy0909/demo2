package com.mmall.demo2.service;

import com.mmall.demo2.mapper.UserMapper;
import com.mmall.demo2.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author ct
 * @Title: UserServiceImpl
 * @ProjectName demo2
 * @Description: TODO
 * @date 2018/11/18 18:45
 */
@Service
public class UserServiceImpl implements UserService {
@Resource
private UserMapper userMapper;
    @Override
    public User findByUsername(String username) {
        return userMapper.findByUsername(username);
    }
}
