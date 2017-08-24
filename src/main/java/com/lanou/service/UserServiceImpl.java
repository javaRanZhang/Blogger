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

    //添加注册
    public Boolean insertUser(User user) {
        Boolean aBoolean = userMapper.insertUser(user);
        return aBoolean;
    }

    //登录--得到登陆者的user
    public User login(User user) {
        String name = user.getName();
        User userByName = userMapper.findUserByName(name);
        //判断是否查到了这个人
        if (userByName == null) {
            return null;
        }
        if (!user.getPassword().equals(userByName.getPassword())){
            return null;
        }
        return userByName;
    }


}
