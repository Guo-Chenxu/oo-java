package com.guochenxu.hm.array;

/**
 * @program: oo-java
 * @description: 查询数组
 * @author: 郭晨旭
 * @create: 2023-04-24 21:06
 * @version: 1.0
 **/
public class SearchArray {
    public static int search(int[] arr, int target) {
        int len = arr.length;
        for (int i = 0; i < len; ++i) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target) {
        SortArray.sort(arr);
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = ((l + r) >> 1);
            if (arr[m] == target) {
                return m;
            } else if (arr[m] < target) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }
}
