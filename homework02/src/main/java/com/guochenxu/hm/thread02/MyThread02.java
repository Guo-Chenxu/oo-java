package com.guochenxu.hm.thread02;

import java.util.Random;

/**
 * @program: oo-java
 * @description: 线程
 * @author: 郭晨旭
 * @create: 2023-05-29 10:24
 * @version: 1.0
 **/
public class MyThread02 implements Runnable {

    private static final int ROW = 10;
    private static final int COL = 20;
    private static int nowRow = 0;
    private static int nowCol = 0;
    private static Integer num = ROW * COL;
    private boolean loop = true;
    private static final Integer LOCK = 0;

    @Override
    public void run() {
        while (loop) {
            sell();
        }
    }

    public void sell() {
        synchronized (LOCK) {
            if (num <= 0) {
                System.out.println(Thread.currentThread().getName() + "结束");
                loop = false;
                return;
            }
            int tickets = (new Random().nextInt(9) + 1);
            if (tickets > num) {
                System.out.println(Thread.currentThread().getName() + "票数不够, 卖票失败:\n" +
                        "需要 " + tickets + " 现有: " + num);
            } else {
                int temp = tickets;
                while (nowRow < ROW) {
                    if ((nowRow & 1) == 0) {
                        while (nowCol < COL && temp > 0) {
                            ++nowCol;
                            --temp;
                        }
                    } else {
                        while (nowCol >= 0 && temp > 0) {
                            --nowCol;
                            --temp;
                        }
                    }
                    if (temp <= 0) {
                        break;
                    }
                    ++nowRow;
                }
                num -= tickets;
                System.out.println(Thread.currentThread().getName() + "卖了 " + tickets + " 张票, 现在还剩 " + num + " 张");
            }
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
