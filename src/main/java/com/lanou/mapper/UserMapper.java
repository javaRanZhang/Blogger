package com.lanou.mapper;

import com.lanou.bean.User;
import org.springframework.stereotype.Repository;

/**
 * Created by dllo on 17/8/23.
 */
@Repository
public interface UserMapper {
//    登录
    User findUserByName(String name);

//    注册添加
    Boolean insertUser(User user);
}
