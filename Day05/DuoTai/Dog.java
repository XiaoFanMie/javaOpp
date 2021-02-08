package com.ff.javaopp.Day05.DuoTai;

public class Dog extends Animal {

    int num=5;

    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }

    @Override
    public void sleep() {
        System.out.println("狗 to bed");
    }

    public void play(){
        System.out.println("狗玩辣子");
    }

}
