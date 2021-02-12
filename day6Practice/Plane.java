package com.ff.javaoop.day6Practice;

public class Plane extends Vehicle {
    @Override
    public void open() {
        System.out.println("飞机在航母上启动");
    }

    @Override
    public void turn() {
        System.out.println("飞机在空中转弯");
    }

    @Override
    public void close() {
        System.out.println("飞机滑翔后慢慢的停下来");
    }
}
