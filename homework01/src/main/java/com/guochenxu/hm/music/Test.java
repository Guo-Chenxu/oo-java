package com.guochenxu.hm.music;

/**
 * @program: oo-java
 * @description: 测试类
 * @author: 郭晨旭
 * @create: 2023-04-24 22:16
 * @version: 1.0
 **/
public class Test {
    public static void main(String[] args) {
        Musician musician = new Musician();
        Instrument erHub = new Erhu();
        Instrument piano = new Piano();
        Instrument violin = new Violin();
        musician.play(erHub);
        musician.play(piano);
        musician.play(violin);
    }
}
