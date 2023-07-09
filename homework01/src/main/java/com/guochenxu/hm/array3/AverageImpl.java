package com.guochenxu.hm.array3;

import com.guochenxu.hm.complex.Complex;

/**
 * @program: oo-java
 * @description: 求数组平均值实现类
 * @author: 郭晨旭
 * @create: 2023-04-24 22:46
 * @version: 1.0
 **/
public class AverageImpl implements Average {

    @Override
    public Complex getAverage(Complex[] arr) {
        double realAvg = 0, imaginaryAvg = 0;
        for (Complex c : arr) {
            realAvg += c.getReal();
            imaginaryAvg += c.getImaginary();
        }
        return new Complex(realAvg / arr.length, imaginaryAvg / arr.length);
    }

    @Override
    public double getAverage(double[] arr) {
        double avg = 0;
        for (double num : arr) {
            avg += num;
        }
        avg = avg / arr.length;
        return avg;
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
}
