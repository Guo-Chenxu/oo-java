package com.guochenxu.hm.array2;

/**
 * @program: oo-java
 * @description: 数组的接口
 * @author: 郭晨旭
 * @create: 2023-04-24 22:31
 * @version: 1.0
 **/
public interface ArrayInfo {
    int findMax(int[] arr);

    int findMin(int[] arr);

    double getAverage(int[] arr);

    double getVariance(int[] arr);
}
