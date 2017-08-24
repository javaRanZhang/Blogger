package com.lanou.bean;

import java.util.List;
import java.util.Set;

/**
 * Created by dllo on 17/8/23.
 */
public class User {
    private Integer id;
    private String name;
    private String password;
    private String level;//等级
    private String des;//简介
    private String tel;//电话
    private String address;//地址
    private List<Blog> blogList;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", level='" + level + '\'' +
                ", des='" + des + '\'' +
                ", tel='" + tel + '\'' +
                ", address='" + address + '\'' +
                ", blogList=" + blogList +
                '}';
    }

    public List<Blog> getBlogList() {
        return blogList;
    }

    public void setBlogList(List<Blog> blogList) {
        this.blogList = blogList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
