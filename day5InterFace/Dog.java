package com.ff.javaoop.day5InterFace;
/*
用接口实现继承关系时候必须使用implement
在类中要么实现父类的全部方法，要么直接写成抽象类
 */
/*
一个类可以实现多个接口，如Dog类实现了接口Animal,InterFaceA和InterFaceB
一个类可以直接继承一个类，如Dog类可继承Object类
 */
public class Dog extends Object implements Animal,InterFaceA,InterFaceB{

    @Override
    public void eat() {
        System.out.println("王二狗吃");
    }

    @Override
    public void sleep() {
        System.out.println("王二狗睡");
    }

    @Override
    public void play() {
        System.out.println("王二狗玩");
    }

    @Override
    public void testA() {

    }

    @Override
    public void testB() {

    }

}
