package com.guochenxu.hm.tcpFile;

import com.guochenxu.hm.utils.StreamUtil;

import java.io.*;
import java.net.Socket;

/**
 * @program: oo-java
 * @description: 传输文件
 * @author: 郭晨旭
 * @create: 2023-05-29 10:55
 * @version: 1.0
 **/
public class TransFile {
    public static void sendFile(Socket client, String src) throws IOException {
        // 读取文件
        File file = new File(src);
        if (file.exists()) {
            FileInputStream fileInputStream = new FileInputStream(src);
            byte[] bytes = StreamUtil.streamToByteArray(fileInputStream);
            fileInputStream.close();

            // 向服务端发送消息
            ObjectOutputStream oos = new ObjectOutputStream
                    (client.getOutputStream());
            oos.writeObject(bytes);
        } else {
            System.out.println("发送失败, 文件不存在");
        }
    }

    public static void getFile(Socket client, String dest) throws IOException, ClassNotFoundException {
        ObjectInputStream inputStream = new ObjectInputStream(client.getInputStream());
        byte[] bytes = (byte[]) inputStream.readObject();
        FileOutputStream fileOutputStream = new FileOutputStream(dest);
        fileOutputStream.write(bytes);
        fileOutputStream.close();
        System.out.println("接收完成");
    }
}
