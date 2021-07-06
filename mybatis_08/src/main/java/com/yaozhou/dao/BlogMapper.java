package com.yaozhou.dao;

import com.yaozhou.pojo.Blog;

import java.util.List;
import java.util.Map;

/**
 * Created by WXHang on HANG at 2021/7/5 23:13
 */
public interface BlogMapper {
    int addBlog(Blog blog);

    List<Blog> getBlog(Map map);

    List<Blog> queryBlogChoose(Map map);

    //更新blog
    int updateBlog(Map map);

    //使用ForEach查询blog
    List<Blog> queryBlogByForEach(Map map);
}
