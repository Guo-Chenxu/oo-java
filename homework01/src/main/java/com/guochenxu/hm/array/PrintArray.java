package com.guochenxu.hm.array;

import java.util.Arrays;

/**
 * @program: oo-java
 * @description: 打印数组
 * @author: 郭晨旭
 * @create: 2023-04-24 20:54
 * @version: 1.0
 **/
public class PrintArray {
    public static void print(int[] arr) {
        printByFor(arr);
    }

    private static void printByFor(int[] arr) {
        System.out.print("[");
        for (int num : arr) {
            System.out.print(num + ", ");
        }
        System.out.println("]");
    }

    private static void printByString(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
