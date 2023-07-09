package com.guochenxu.hm.file;

import java.io.File;

/**
 * @program: oo-java
 * @description: 列出文件
 * @author: 郭晨旭
 * @create: 2023-05-29 11:20
 * @version: 1.0
 **/
public class FileList {
    public static void list(File file) {
        //如果是目录，则输出目录名称，然后遍历目录下的文件；否则输出文件名称
        if (file.isDirectory()) {
            System.out.println("Directory => " + file.getName());
            File[] files = file.listFiles();
            if (files != null) {
                for (File child : files) {
                    list(child);
                }
            }
        } else {
            System.out.println("File => " + file.getName());
        }
    }
}
