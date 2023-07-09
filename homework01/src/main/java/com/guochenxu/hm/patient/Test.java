package com.guochenxu.hm.patient;

/**
 * @program: oo-java
 * @description: 测试方法
 * @author: 郭晨旭
 * @create: 2023-04-24 22:01
 * @version: 1.0
 **/
public class Test {
    public static void main(String[] args) {
        Patient april = new Patient();
        april.setName("zhangli");
        april.setSex('f');
        april.setAge(330);
        april.setWeight(154.72F);
        april.setAllergies(true);
        System.out.println("name：  " + april.getName());
        System.out.println("sex:  " + april.getSex());
        System.out.println("age:   " + april.getAge());
        System.out.println("weight:  " + april.getWeight());
        System.out.println("allergies:  " + april.getAllergies());
        System.out.println(april);
    }
}
