package com.guochenxu.hm.thread01;

/**
 * @program: oo-java
 * @description: 线程
 * @author: 郭晨旭
 * @create: 2023-05-29 10:17
 * @version: 1.0
 **/
public class MyThread01 implements Runnable {
    static int sum;
    private int begin;//首
    private int over;//尾

    public MyThread01(int begin, int over) {
        this.begin = begin;
        this.over = over;
    }

    private int temp;

    @Override
    public void run() {
        for (int i = begin; i <= over; i++) {
            temp += i;
        }
        System.out.println(Thread.currentThread().getName() + " 的和为: " + temp);
        sum += temp;
    }
}
