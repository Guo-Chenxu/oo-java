package com.guochenxu.hm.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * @program: oo-java
 * @description: 二维数组排序
 * @author: 郭晨旭
 * @create: 2023-04-24 21:20
 * @version: 1.0
 **/
public class SortArray2 {

    public static void sort(int[][] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            int[] dest = new int[n];
            System.arraycopy(arr[i], 0, dest, 0, n);
            Arrays.sort(dest);
            arr[i] = dest;
        }
    }

    public static void selectSort(int[][] arr) {
        int n = arr.length;
        for (int k = 0; k < n; ++k) {
            for (int i = 0; i < n - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < n; j++) {
                    if (arr[k][j] < arr[k][minIndex]) {
                        minIndex = j;
                    }
                }
                if (i != minIndex) {
                    int temp = arr[k][i];
                    arr[k][i] = arr[k][minIndex];
                    arr[k][minIndex] = temp;
                }
            }
        }
    }

    public static void bubbleSort(int[][] arr) {
        int n = arr.length;
        for (int k = 0; k < n; ++k) {
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[k][j] > arr[k][j + 1]) {
                        int temp = arr[k][j];
                        arr[k][j] = arr[k][j + 1];
                        arr[k][j + 1] = temp;
                    }

                }
            }
        }
    }

    @Test
    public void test() {
        int n = 10;
        int[][] arr = new int[n][n];
        int[][] arr1 = new int[n][n];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                int x = (int) (Math.random() * 100);
                arr[i][j] = x;
                arr1[i][j] = x;
            }
        }
        System.out.println(Arrays.deepToString(arr));
        sort(arr);
        bubbleSort(arr1);
        Assert.assertEquals(arr, arr1);
//        selectSort(arr);
        System.out.println(Arrays.deepToString(arr));
    }
}
