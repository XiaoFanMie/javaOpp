package com.ff.javaoop.day5duotai;

public class Cat extends Animal {

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void sleep() {
        System.out.println("猫睡觉");
    }

    public void dance() {
        System.out.println("猫跳舞");
    }
}

