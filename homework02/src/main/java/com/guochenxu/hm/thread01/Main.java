package com.guochenxu.hm.thread01;

/**
 * @program: oo-java
 * @description: main
 * @author: 郭晨旭
 * @create: 2023-05-29 10:18
 * @version: 1.0
 **/
public class Main {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            MyThread01 myThread01 = new MyThread01(i * 10 + 1, i * 10 + 10);
            new Thread(myThread01).start();
        }
        Thread.sleep(50);
        System.out.println("总和：" + MyThread01.sum);
    }
}
