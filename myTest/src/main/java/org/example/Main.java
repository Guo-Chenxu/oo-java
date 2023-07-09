package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String op = cin.nextLine();
        int n = Integer.parseInt(cin.nextLine());
        String[] cs;
        Complex c1;
        Complex c2;
        switch (op) {
            case "add":
                for (int i = 0; i < n; ++i) {
                    cs = cin.nextLine().split(" ");
                    c1 = new Complex(Double.parseDouble(cs[0]), Double.parseDouble(cs[1]));
                    c2 = new Complex(Double.parseDouble(cs[2]), Double.parseDouble(cs[3]));
                    c1.add(c2).print();
                    System.out.println();
                }
                break;
            case "sub":
                for (int i = 0; i < n; ++i) {
                    cs = cin.nextLine().split(" ");
                    c1 = new Complex(Double.parseDouble(cs[0]), Double.parseDouble(cs[1]));
                    c2 = new Complex(Double.parseDouble(cs[2]), Double.parseDouble(cs[3]));
                    c1.sub(c2).print();
                    System.out.println();
                }
                break;
            case "mul":
                for (int i = 0; i < n; ++i) {
                    cs = cin.nextLine().split(" ");
                    c1 = new Complex(Double.parseDouble(cs[0]), Double.parseDouble(cs[1]));
                    c2 = new Complex(Double.parseDouble(cs[2]), Double.parseDouble(cs[3]));
                    c1.mul(c2).print();
                    System.out.println();
                }
                break;
            case "div":
                for (int i = 0; i < n; ++i) {
                    cs = cin.nextLine().split(" ");
                    c1 = new Complex(Double.parseDouble(cs[0]), Double.parseDouble(cs[1]));
                    c2 = new Complex(Double.parseDouble(cs[2]), Double.parseDouble(cs[3]));
                    Complex div = c1.div(c2);
                    if (div != null) {
                        div.print();
                    }
                    System.out.println();
                }
                break;
        }
    }
}


class Complex { // 复数类
    double real;  // 实部
    double image; // 虚部

    Complex(double real, double image) { // 带参数的构造方法
        this.real = real;
        this.image = image;
    }

    Complex add(Complex a) { // 复数相加
        double real2 = a.real;
        double image2 = a.image;
        double newReal = real + real2;
        double newImage = image + image2;
        return new Complex(newReal, newImage);
    }

    Complex sub(Complex a) { // 复数相减
        double real2 = a.real;
        double image2 = a.image;
        double newReal = real - real2;
        double newImage = image - image2;
        return new Complex(newReal, newImage);
    }

    Complex mul(Complex a) { // 复数相乘
        double real2 = a.real;
        double image2 = a.image;
        double newReal = real * real2 - image * image2;
        double newImage = image * real2 + real * image2;
        return new Complex(newReal, newImage);
    }

    Complex div(Complex a) { // 复数相除
        double real2 = a.real;
        double image2 = a.image;
        if (real2 == 0 && image2 == 0) {
            new ComplexDivException();
            return null;
        }
        double newReal = (real * real2 + image * image2) / (real2 * real2 + image2 * image2);
        double newImage = (image * real2 - real * image2) / (real2 * real2 + image2 * image2);
        return new Complex(newReal, newImage);
    }

    public void print() { // 输出
        double r = Double.parseDouble(String.format("%.1f", real));
        double i = Double.parseDouble(String.format("%.1f", image));
        if (image > 0) {
            System.out.print(r + "+" + i + "i");
        } else if (image < 0) {
            System.out.print(r + "" + i + "i");
        } else {
            System.out.print(r + "+0.0i");
        }
    }
}

class ComplexDivException {
    int code;
    String msg;

    public ComplexDivException() {
        System.out.print("Error No : 1001\n" +
                "Error Message : Divide by zero.");
    }
}

