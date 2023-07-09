package com.guochenxu.hm.tcpFile;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @program: oo-java
 * @description: 客户端
 * @author: 郭晨旭
 * @create: 2023-05-29 10:55
 * @version: 1.0
 **/
public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Socket client = new Socket(InetAddress.getLocalHost(), 19288);
        TransFile.sendFile(client, "D:\\JavaWork\\oo-java\\homework02\\作业二.docx");
        TransFile.getFile(client, "D:\\JavaWork\\oo-java\\homework01\\client存储.docx");
    }
}
