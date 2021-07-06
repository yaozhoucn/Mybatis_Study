package com.yaozhou.utils;

import org.junit.Test;

import java.util.UUID;

/**
 * Created by WXHang on HANG at 2021/7/6 12:45
 * Desc：
 */
public class IDUtils {
    public static String getId(){
        String id = UUID.randomUUID().toString().replaceAll("-", "");
        return id;
    }
    @Test
    public void test1(){
        String id = IDUtils.getId();
        System.out.println(id);
    }
}
