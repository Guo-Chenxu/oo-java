package com.guochenxu.hm.array2;

/**
 * @program: oo-java
 * @description: 接口实现
 * @author: 郭晨旭
 * @create: 2023-04-24 22:35
 * @version: 1.0
 **/
public class ArrayInfoImpl implements ArrayInfo {

    @Override
    public int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            max = Math.max(max, num);
        }
        return max;
    }

    @Override
    public int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            min = Math.min(min, num);
        }
        return min;
    }

    @Override
    public double getAverage(int[] arr) {
        double avg = 0;
        for (int num : arr) {
            avg += num;
        }
        avg = avg / arr.length;
        return avg;
    }

    @Override
    public double getVariance(int[] arr) {
        double avg = getAverage(arr);    //求平均值
        double var = 0;
        for (double num : arr) {
            var += (num - avg) * (num - avg);    //（x1-x）^2+（x2-x）^2+......（xn-x）^2
        }
        return var / arr.length;
    }
}
