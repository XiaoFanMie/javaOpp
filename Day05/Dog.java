package com.ff.javaopp.Day05;

    /*
    当类实现接口时,类要实现接口中所有的方法.
    否则,类必须声明为抽象的类
    一个类实现多个接口
     */
public class Dog extends  Object implements Animal,InterFaceC{

    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }

    @Override
    public void sleep() {
        System.out.println("狗 to bed");
    }

    @Override
    public void testA() {

    }

    @Override
    public void testB() {

    }

    @Override
    public void testc() {

    }
}
