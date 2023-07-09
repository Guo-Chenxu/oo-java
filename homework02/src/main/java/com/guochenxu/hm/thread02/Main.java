package com.guochenxu.hm.thread02;

import com.guochenxu.hm.thread01.MyThread01;

/**
 * @program: oo-java
 * @description: main
 * @author: 郭晨旭
 * @create: 2023-05-29 10:26
 * @version: 1.0
 **/
public class Main {
    public static void main(String[] args) {
        for (int i = 0;i < 3; ++i){
            MyThread02 myThread02 = new MyThread02();
            new Thread(myThread02).start();
        }
    }
}
