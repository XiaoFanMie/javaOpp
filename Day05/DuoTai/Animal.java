package com.ff.javaopp.Day05.DuoTai;

import com.ff.javaopp.Day05.InterFaceA;
import com.ff.javaopp.Day05.InterFaceB;

public abstract class Animal {

    int num=10;

    abstract void eat();
    abstract void sleep();

    public static void testStatic(){
        System.out.println("Animal Static");

    }
    public  void test(){
        System.out.println("Animal Test");
    }
}
