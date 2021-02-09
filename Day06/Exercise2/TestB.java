package com.ff.javaopp.Day06.Exercise2;

public class TestB extends TestA{
    public void start()  {  System.out.println("TestB");  }
    public static void main(String[]  args) {
        ((TestA)new TestB()).start();
    }

}


