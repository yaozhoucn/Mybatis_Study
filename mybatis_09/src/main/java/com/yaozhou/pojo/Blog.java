package com.yaozhou.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by WXHang on HANG at 2021/7/5 23:08
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Blog implements Serializable {
    private String id;
    private String title;
    private String author;
    private Date createTime;
    private int views;
}