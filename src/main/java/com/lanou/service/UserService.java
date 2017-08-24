package com.lanou.service;

import com.lanou.bean.User;
import org.springframework.stereotype.Service;

/**
 * Created by dllo on 17/8/23.
 */
public interface UserService {
    Boolean insertUser(User user);
    User login(User user);
}
