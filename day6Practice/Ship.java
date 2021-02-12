package com.ff.javaoop.day6Practice;

public class Ship extends Vehicle {
    @Override
    public void open() {
        System.out.println("轮船在水中启动");
    }

    @Override
    public void turn() {
        System.out.println("轮船在需要时候转弯");
    }

    @Override
    public void close() {
        System.out.println("轮船在水中关闭");
    }
}
