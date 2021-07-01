package com.yaozhou.dao;

import com.yaozhou.pojo.User;

import java.util.List;

/**
 * Created by WXHang on HANG at 2021/6/30 0:37
 * @author HANG
 */
public interface UserMapper {
    List<User> getUserList();

    //插入
    int addUser(User user);

    //修改用户
    int updateUserById(User user);

    //删除用户
    int delUserById(int id);
}
