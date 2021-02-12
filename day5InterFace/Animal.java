package com.ff.javaoop.day5InterFace;
/*
interface是定义接口的关键字
一个接口可以继承多个接口，如接口Animal继承了InterFaceA和InterFaceB
 */
public interface Animal extends InterFaceA,InterFaceB {
/*
在接口中的成员变量是常量，必须得符初值
int NUM= 2;前面默认有public static final修饰
 */
    int NUM = 2;
/*
在jdk8以后接口中声明的方法默认被public abstract修饰
 */
    void eat();
    void sleep();
    void play();
    //jdk8以后加入静态方法和默认方法
    public static void dance(){
        System.out.println("会跳舞");
    }

    //默认方法,子类可以重写也可以不重写,或者通过子类调用
    public default void test(){

    }
}
