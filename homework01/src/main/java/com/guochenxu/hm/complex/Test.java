package com.guochenxu.hm.complex;

import java.util.Scanner;

/**
 * @program: oo-java
 * @description: 测试类
 * @author: 郭晨旭
 * @create: 2023-04-24 22:07
 * @version: 1.0
 **/
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("第一个复数:");
        Complex t1 = new Complex(scanner.nextDouble(), scanner.nextDouble());
        System.out.println("第二个复数:");
        Complex t2 = new Complex(scanner.nextDouble(), scanner.nextDouble());
        System.out.println("(a + b) = " + ComplexOperate.add(t1, t2));
        System.out.println("(a - b) = " + ComplexOperate.sub(t1, t2));
        System.out.println("(a * b) = " + ComplexOperate.mul(t1, t2));
        System.out.println(ComplexOperate.compare(t1, t2));
    }
}
