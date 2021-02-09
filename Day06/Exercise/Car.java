package com.ff.javaopp.Day06.Exercise;

public class  Car extends Transportation {

    private String runningOnTheGround="地上跑";

    @Override
    public void start() {
        System.out.println("汽车:嗵嗵嗵嗵嗵");
        System.out.println(runningOnTheGround);
    }

    @Override
    void turnTo() {
        System.out.println("汽车转弯");
    }

    @Override
    public void close() {
        System.out.println("汽车熄火");
    }
    public void WuLing(){
        System.out.println("五菱宏光申请出战");
    }

}
