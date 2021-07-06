package com.yaozhou.dao;

import com.yaozhou.pojo.Blog;
import org.apache.ibatis.annotations.Param;

/**
 * Created by WXHang on HANG at 2021/7/5 23:13
 */
public interface BlogMapper {
    Blog quertBlogById(@Param("id") int id);
}
