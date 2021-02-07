package com.ff.javaopp.Day004.abstractDemo;

/*
    被abstract修饰的类就是抽象类

    抽象类中不一定有抽象方法
    有抽象方法,那么这个类必定是抽象类
 */
public abstract class Animal {

    String name;

    /*
      在顶层类中,方法的实现与子类大多不相同,那么在顶层类中可以将方发声明为抽象方法
      被abstract修饰,没有方法体
      只作为方法的定义
    */


    public void play(){
        System.out.println("Animal Play");
    }
}
