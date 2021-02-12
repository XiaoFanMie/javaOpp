package com.ff.javaoop.day5duotai;

public abstract class Animal {
    int num = 10;

    abstract void eat();
    abstract void sleep();

    public static void testStatic() {
        System.out.println("静态方法");
    }

    public void test() {
        System.out.println("Animal test");
    }
}
