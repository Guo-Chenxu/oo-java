package com.guochenxu.hm.complex;

/**
 * @program: oo-java
 * @description: 复数运算
 * @author: 郭晨旭
 * @create: 2023-04-24 22:19
 * @version: 1.0
 **/
public class ComplexOperate {
    //加法 a+bi & c+di --> (a+c) + (b+d)i
    public static Complex add(Complex num1, Complex num2) {
        return new Complex(num1.getReal() + num2.getReal(),
                num1.getImaginary() + num2.getImaginary());
    }

    //减法 a+bi & c+di --> (a-c) + (b-d)i
    public static Complex sub(Complex num1, Complex num2) {
        return new Complex(num1.getReal() - num2.getReal(),
                num1.getImaginary() - num2.getImaginary());
    }

    //乘法 a+bi & c+di --> (ac-bd) + (bc+ad)i
    public static Complex mul(Complex num1, Complex num2) {
        double a = (num1.getReal() * num2.getReal()) - (num1.getImaginary() * num2.getImaginary());
        double b = (num1.getReal() * num2.getImaginary()) + (num1.getImaginary() * num2.getReal());
        return new Complex(a, b);
    }

    public static double compare(Complex num1, Complex num2) {
        return modulus2(num1) - modulus2(num2);
    }

    public static double modulus2(Complex num) {
        return num.getReal() * num.getReal() + num.getImaginary() * num.getImaginary();
    }
}
