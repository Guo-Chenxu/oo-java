package com.guochenxu.hm.exception02;

import java.util.Scanner;

/**
 * @program: oo-java
 * @description: main
 * @author: 郭晨旭
 * @create: 2023-05-29 10:05
 * @version: 1.0
 **/
public class Main {
    public static void main(String[] args) throws Exception02 {

        while (true) {
            try {
                System.out.println("程序启动");
                Scanner in = new Scanner(System.in);
                int i = Integer.valueOf((in.nextLine()));
                if (i == 0) {
                    throw new Exception02("出现异常");
                } else {
                    break;
                }
            } catch (Exception02 e) {
                e.printStackTrace();
                continue;
            }
        }
    }
}
