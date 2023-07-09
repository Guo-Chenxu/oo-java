package com.guochenxu.hm.thread03;

/**
 * @program: oo-java
 * @description: main
 * @author: 郭晨旭
 * @create: 2023-05-29 10:46
 * @version: 1.0
 **/
public class Main {
    public static void main(String[] args) {
        Thread03.startCopy("D:\\JavaWork\\oo-java\\homework02\\作业二.docx",
                "D:\\JavaWork\\oo-java\\homework01\\");
        Thread03.startCopy("D:\\JavaWork\\oo-java\\homework01\\作业一.docx",
                "D:\\JavaWork\\oo-java\\homework02\\");
    }
}
