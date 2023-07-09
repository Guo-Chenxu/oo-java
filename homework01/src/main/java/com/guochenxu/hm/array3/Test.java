package com.guochenxu.hm.array3;

import com.guochenxu.hm.complex.Complex;

import java.util.Arrays;

/**
 * @program: oo-java
 * @description: 测试类
 * @author: 郭晨旭
 * @create: 2023-04-24 22:07
 * @version: 1.0
 **/
public class Test {
    public static void main(String[] args) {
        Average a = new AverageImpl();
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6};
        double[] arr2 = new double[]{1.2, 2.4, 3.2, 4.3, 5.4, 6.1};
        Complex[] arr3 = new Complex[]{new Complex(1, 2), new Complex(3, 2), new Complex(1, 3)};
        System.out.println(Arrays.toString(arr1));
        System.out.println(a.getAverage(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(a.getAverage(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println(a.getAverage(arr3));
    }
}
