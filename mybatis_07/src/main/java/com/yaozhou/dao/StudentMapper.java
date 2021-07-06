package com.yaozhou.dao;

import com.yaozhou.pojo.Student;

import java.util.List;

/**
 * Created by WXHang on HANG at 2021/7/5 23:13
 */
public interface StudentMapper {
    List<Student> getStudent();

    List<Student> getStudent2();
}
