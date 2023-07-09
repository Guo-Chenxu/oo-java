package com.guochenxu.hm.array3;

import com.guochenxu.hm.complex.Complex;

/**
 * @program: oo-java
 * @description: 求数组平均值接口
 * @author: 郭晨旭
 * @create: 2023-04-24 22:45
 * @version: 1.0
 **/
public interface Average {
    Complex getAverage(Complex[] arr);

    double getAverage(double[] arr);

    double getAverage(int[] arr);
}
