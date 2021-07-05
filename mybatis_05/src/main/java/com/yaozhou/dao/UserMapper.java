package com.yaozhou.dao;

import com.yaozhou.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

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
    List<User> getUserListLimit(Map<String, Integer> map);

    //使用注解
    @Select("select * from smbms_user")
    List<User> getUserList2();

    //多个参数
    @Select("select * from smbms_user where id = #{id} and userName = #{userName}")
    List<User> getUserById2(@Param("id") int id, @Param("userName") String userName);
}
