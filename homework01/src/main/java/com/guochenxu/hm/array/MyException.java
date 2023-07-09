package com.guochenxu.hm.array;

/**
 * @program: oo-java
 * @description: 自定义异常类
 * @author: 郭晨旭
 * @create: 2023-04-24 20:46
 * @version: 1.0
 **/

public class MyException extends Exception {
    //异常信息
    private String message;

    //构造函数
    public MyException(String message) {
        super(message);
        this.message = message;
    }
}

