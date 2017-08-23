package com.lanou.service;

import com.lanou.bean.User;
import com.lanou.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by dllo on 17/8/23.
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    public  void insertUser(User user){
        System.out.println(111);
        userMapper.insertUser(user);
        System.out.println(222);
    }
}
