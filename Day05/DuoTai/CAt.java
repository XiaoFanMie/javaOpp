package com.ff.javaopp.Day05.DuoTai;

public class CAt extends Animal{

    public static void testStatic(){
        System.out.println("Cat Static");

    }
    @Override
    public void eat() {
        System.out.println("喵喵鱼");
    }

    @Override
    public void sleep() {
        System.out.println("喵喵睡觉");
    }

    public void catchMouse(){
        System.out.println("猫捉老鼠");
    }
}
