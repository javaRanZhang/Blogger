package com.lanou.service;

import com.github.pagehelper.PageInfo;
import com.lanou.bean.Blog;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dllo on 17/8/23.
 */
public interface BlogService {
//    发表博客
     Boolean insertBlog(Blog blog);
//     博客分页
     PageInfo<Blog> queryPage(Integer pageNum, Integer pageSize,Integer id);

     //博客的增删改查

     //删除
     Boolean delete(Integer blogId);

     //改
     Boolean update(Blog blog);

//     博客搜索
     List<Blog> findLikeTitle(String title);
}
