package com.ff.javaopp.day02;

public class Pig {
    String name;
    /**
     * variety是Pig类共有的都是猪
     * 使用static修饰后变成类变量,类变量只有一份,所有static修饰的变量也只有一份
     */
    static String variety="猪";

    //成员方法中可以访问成员变量,还可以访问静态变量
    public void PigTest(){
        System.out.println(name);
        System.out.println(variety);
    }

    public static void PigStatic(){
        //System.out.println(name);
        /*
        静态类的方法只能访问静态成员变量,不能使用非静态成员变量
        静态方法是类的,优先于对象加载
         */
        System.out.println(variety);
    }
}
