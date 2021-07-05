package com.yaozhou.dao;

import com.yaozhou.pojo.Teacher;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by WXHang on HANG at 2021/7/5 23:13
 */
public interface TeacherMapper {
    @Select("select * from teacher where id = #{id}")
    List<Teacher> getTeachetById(int id);
}
