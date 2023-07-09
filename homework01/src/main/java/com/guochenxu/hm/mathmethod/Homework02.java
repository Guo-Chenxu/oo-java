package com.guochenxu.hm.mathmethod;

/**
 * @program: oo-java
 * @description: 计算自然对数
 * @author: 郭晨旭
 * @create: 2023-04-24 21:54
 * @version: 1.0
 **/
public class Homework02 {
    public static void main(String[] args) {
        double e = 1, mul = 1;
        for (double i = 1; i <= 0x7fffffff; ++i) {
            mul *= i;
            e = e + 1 / mul;
        }
        System.out.println(e);
        System.out.println(Math.E);
    }
}
