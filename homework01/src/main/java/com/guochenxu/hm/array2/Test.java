package com.guochenxu.hm.array2;

import java.util.Arrays;

/**
 * @program: oo-java
 * @description: 测试类
 * @author: 郭晨旭
 * @create: 2023-04-24 22:41
 * @version: 1.0
 **/
public class Test {
    public static void main(String[] args) {
        ArrayInfo arrayInfo = new ArrayInfoImpl();
        int len = 100;
        int[] arr = new int[len];
        for (int i = 0; i < len; ++i) {
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(arrayInfo.findMax(arr));
        System.out.println(arrayInfo.findMin(arr));
        System.out.println(arrayInfo.getAverage(arr));
        System.out.println(arrayInfo.getVariance(arr));
    }
}
