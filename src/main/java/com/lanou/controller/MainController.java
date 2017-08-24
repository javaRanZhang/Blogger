package com.lanou.controller;

import com.lanou.bean.Blog;
import com.lanou.bean.User;
import com.lanou.service.BlogService;
import com.lanou.service.UserService;
import com.lanou.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.io.IOException;

/**
 * Created by dllo on 17/8/23.
 */
@Controller
public class MainController {
    @Resource
    private UserService userService;
    @Resource
    private BlogService blogService;

    @RequestMapping("/user")
    public void test1() throws IOException {
        User user = new User();
        user.setName("zhang");
        user.setPassword("111111");
        user.setTel("18311111111");
        user.setAddress("11");
        user.setDes("11");
        user.setLevel("1");
        userService.insertUser(user);
    }

//    @RequestMapping("/login")
//    @ResponseBody
//    public User id(@RequestParam("user") User user) {
//        User userById = userService.findUserById(id);
//        System.out.println("111" + userById);
//        return userById;
//    }


    @RequestMapping("/blog")
    public void insertBlog() {
        Blog blog = new Blog();
        blog.setTitle("我的第一个博客");
        blog.setDes("hahha");
        blog.setContent("lall");
        blog.setUserId(10);
        blogService.insertBlog(blog);
    }

}
