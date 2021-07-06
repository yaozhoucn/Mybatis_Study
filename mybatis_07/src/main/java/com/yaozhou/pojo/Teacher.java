package com.yaozhou.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created by WXHang on HANG at 2021/7/5 23:10
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
    private int id;
    private String name;
    //一个老师对应多个学生
    private List<Student> studentList;
}