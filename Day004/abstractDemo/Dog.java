package com.ff.javaopp.Day004.abstractDemo;

/*
    抽象类就是作为定义,让其他类继承

    一个类继承抽象类:
        要么将子类声明为抽象类
        要么重写抽象类中所有的抽象方法
 */
public class  Dog  extends Animal{



    public void eat() {
        System.out.println("狗子吃");
    }


    public void sleep() {
        System.out.println("狗子睡");
    }
}
