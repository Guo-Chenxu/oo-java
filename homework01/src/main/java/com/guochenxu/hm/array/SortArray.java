package com.guochenxu.hm.array;

import org.junit.Test;

import java.util.Arrays;

/**
 * @program: oo-java
 * @description: 数组排序
 * @author: 郭晨旭
 * @create: 2023-04-24 20:57
 * @version: 1.0
 **/
public class SortArray {
    public static void sort(int[] arr) {
        Arrays.sort(arr);
    }

    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
    }

    @Test
    public void test() {
        int len = 100;
        int[] arr = new int[len];
        for (int i = 0; i < len; ++i) {
            arr[i] = (int) (Math.random() * 100);
        }
        PrintArray.print(arr);
//        sort(arr);
//        selectSort(arr);
        bubbleSort(arr);
        PrintArray.print(arr);
    }
}
