package com.ff.javaopp.Day05;
/*
    interface关键字修饰的是接口
    接口与接口之间可以一对多继承
 */
public interface Animal extends InterFaceA,InterFaceB {
    /*
    接口定义的成员变量是一个常量,默认被public static final 修饰
    public static final int nums= 10;
     */
    int nums= 10;
    String s= "傻狗";

    /*
    jdk8以后接口中声明的抽象方法,默认被public abstract 修饰
    public abstract void eat();
     */
    void eat();
    void sleep();

    /*
    jdk8以后加入静态方法,默认方法
     */
    public static void play(){
        System.out.println("狗玩");
    }
    /*
    默认方法,子类可以重写也可以不重写,或通过子类进行调用
     */
    public default void test(){
        System.out.println("接口中的默认方法");
    }
}
