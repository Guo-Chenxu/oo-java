package com.guochenxu.hm.complex;

/**
 * @program: oo-java
 * @description: 复数类
 * @author: 郭晨旭
 * @create: 2023-04-24 22:07
 * @version: 1.0
 **/
public class Complex {

    private double real;
    private double imaginary;

    public Complex(double real, double imaginary) {
        super();
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex() {
        this.real = 0;
        this.imaginary = 0;
    }

    public double getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    @Override
    public String toString() {
        return  real + " + " + imaginary + "i";
    }
}
