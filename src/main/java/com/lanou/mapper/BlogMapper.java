package com.lanou.mapper;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.lanou.bean.Blog;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by dllo on 17/8/23.
 */
@Repository
public interface BlogMapper {
    //通过userId查询他所有的博客
    List<Blog> findBlogByUserId(Integer userId);

//    添加博客
  Boolean insertBlog(Blog blog);

//  删除博客
    Boolean deleteBlogById(Integer blogId);
//  修改博客
    Boolean updateBlog(Blog blog);

    List<Blog> findLikeTitle(String title);
//
}
