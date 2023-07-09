package com.guochenxu.hm.mathmethod;

/**
 * @program: oo-java
 * @description: 数学方法第一题
 * @author: 郭晨旭
 * @create: 2023-04-24 21:49
 * @version: 1.0
 **/
public class Homework01 {
    public static void main(String[] args) {
        // 随机数
        double num = Math.random() * 100;
        System.out.println(num);
        // 小数部分四舍五入
        System.out.println(Math.round(num));
        //开方
        System.out.println(Math.sqrt(num));
        //次方（2的4次方）
        System.out.println(Math.pow(num, 2));
        //π
        System.out.println(Math.PI);
        //自然常数
        System.out.println(Math.E);
    }
}
