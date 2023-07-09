package com.guochenxu.hm.patient;

/**
 * @program: oo-java
 * @description: 病人类
 * @author: 郭晨旭
 * @create: 2023-04-24 22:00
 * @version: 1.0
 **/
public class Patient {
    private String name;
    private char sex;
    private int age;
    private float weight;
    private boolean allergies;

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", allergies=" + allergies +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public boolean getAllergies() {
        return allergies;
    }

    public void setAllergies(boolean allergies) {
        this.allergies = allergies;
    }
}
