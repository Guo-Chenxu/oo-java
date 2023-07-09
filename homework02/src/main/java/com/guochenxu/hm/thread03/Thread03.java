package com.guochenxu.hm.thread03;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;

/**
 * @program: oo-java
 * @description: 线程
 * @author: 郭晨旭
 * @create: 2023-05-29 10:46
 * @version: 1.0
 **/

public class Thread03 {
    //传入指定路径,启动复制线程
    public static void startCopy(String srcFile, String destFile) {
        new Thread(() -> {
            //指定路径
            File src = new File(srcFile);
            File dest = new File(destFile);
            try {
                copyFile(src, dest);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
    }

    //定义复制文件的方法,传入源文件路径和粘贴路径
    public static void copyFile(File src, File dest) throws IOException {
        FileInputStream in = new FileInputStream(src);
        FileOutputStream out = new FileOutputStream((dest.getAbsolutePath().endsWith("\\") ?
                dest : dest + "\\") + src.getName());
        int readCount = 0;
        //获取要复制的文件的长度
        double srcSize = src.length();
        //直接设置数组长度为文件长度的10%
        int len = (int) (srcSize / 10);
        double hasRead = 0;
        byte[] bytes = new byte[len];
        while ((readCount = in.read(bytes)) > 0) {
            out.write(bytes, 0, readCount);
            //获取剩余还没有读的数据的长度
            //获取已经读取的数据的长度
            hasRead += readCount;
            //将计算结果保留整数
            DecimalFormat df = new DecimalFormat("##");
            //计算复制比例
            String copyRate = df.format(hasRead * 100 / srcSize);
            //输出已复制比例
            System.out.println(src.getName() + "文件已将复制" + copyRate + "%");
        }
        //最后打印复制完毕
        System.out.println(src.getName() + "复制完毕");
        in.close();
        out.close();
    }
}
