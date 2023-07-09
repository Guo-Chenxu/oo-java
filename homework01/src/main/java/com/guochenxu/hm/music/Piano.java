package com.guochenxu.hm.music;

/**
 * @program: oo-java
 * @description: 钢琴类
 * @author: 郭晨旭
 * @create: 2023-04-24 22:13
 * @version: 1.0
 **/
public class Piano extends Instrument{
    @Override
    public void makeSound() {
        System.out.println("发出钢琴声");
    }
}
