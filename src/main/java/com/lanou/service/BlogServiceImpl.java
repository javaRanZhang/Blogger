package com.lanou.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lanou.bean.Blog;
import com.lanou.mapper.BlogMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by dllo on 17/8/23.
 */
@Service
public class BlogServiceImpl implements BlogService {
    @Resource
    private BlogMapper blogMapper;

    //        发表博客
    public Boolean insertBlog(Blog blog) {
        Boolean aBoolean = blogMapper.insertBlog(blog);
        return aBoolean;
    }

    //登录--得到登陆者的所有的博客 并分页
    public PageInfo<Blog> queryPage(Integer pageNum, Integer pageSize, Integer id) {

        pageNum = pageNum == null ? 1 : pageNum;
        pageSize = pageSize == null ? 1 : pageSize;

        PageHelper.startPage(pageNum, pageSize);

        List<Blog> selfBlog = blogMapper.findBlogByUserId(id);

        PageInfo<Blog> pageInfo = new PageInfo<Blog>(selfBlog);

        return pageInfo;
    }

//博客的增删改查

    //删除
    public Boolean delete(Integer blogId) {
        blogMapper.deleteBlogById(blogId);
        return null;
    }
    //改
    public Boolean update(Blog blog) {
        Boolean aBoolean =  blogMapper.updateBlog(blog);
        return aBoolean;
    }
    //     博客搜索
    public List<Blog> findLikeTitle(String title) {
        List<Blog> blogs = blogMapper.findLikeTitle(title);
        return blogs;
    }


}
