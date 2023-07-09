package com.guochenxu.hm.tcpFile;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @program: oo-java
 * @description: 服务端
 * @author: 郭晨旭
 * @create: 2023-05-29 10:55
 * @version: 1.0
 **/
public class Server {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ServerSocket server = new ServerSocket(19288);
        Socket accept = server.accept();
        TransFile.getFile(accept, "D:\\JavaWork\\oo-java\\homework02\\server存储.docx");
        TransFile.sendFile(accept, "D:\\JavaWork\\oo-java\\homework02\\作业二.docx");
    }
}
