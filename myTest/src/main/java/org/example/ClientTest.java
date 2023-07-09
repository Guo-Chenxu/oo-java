package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @program: springboot-learning
 * @description:
 * @author: 郭晨旭
 * @create: 2023-05-02 17:54
 * @version: 1.0
 **/


public class ClientTest {

    private static final ExecutorService executorService = Executors.newFixedThreadPool(5);

    private static String host = "127.0.0.1";

    private static int port = 9879;

    public static void main(String[] args) {
        new Thread(new ClientHeartThread(host, port)).start();
//        new Thread(new ClientPrintThread(host,port)).start();
//        new Thread(new ClientHeartThread(host,port)).start();

    }
}
