package com.ff.javaopp.Day06.Exercise;

public class Ship extends Transportation {

    private String swimInTheWater="水里游";

    @Override
    public void start() {
        System.out.println("轮船:嘟嘟嘟嘟嘟嘟");
        System.out.println(swimInTheWater);
    }

    @Override
    public void turnTo() {
        System.out.println("轮船转弯");
    }

    @Override
    public void close() {
        System.out.println("轮船熄火");
    }

    public void pearl(){
        System.out.println("航空母舰申请出战");
    }
}
