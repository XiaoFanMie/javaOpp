package com.ff.javaopp.Day06.Exercise;

public class Plane extends Transportation {

    private String flyingInTheSky="天上飞";

    @Override
    public void start() {
        System.out.println("飞机:呜呜呜呜呜呜呜");
        System.out.println(flyingInTheSky);
    }

    @Override
    public void turnTo() {
        System.out.println("飞机转弯");
    }

    @Override
    public void close() {
        System.out.println("飞机关闭引擎");
    }

    public void f20(){
        System.out.println("歼-20申请出战");
    }
}
