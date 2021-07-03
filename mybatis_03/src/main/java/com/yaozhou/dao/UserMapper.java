package com.yaozhou.dao;

import com.yaozhou.pojo.User;

import java.util.List;
import java.util.Map;

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

    //模糊查询用户
    List<User> getUserListLike(String userName);

    //分页查询
    List<User> getUserListLimit(Map<String,Integer> map);
}
