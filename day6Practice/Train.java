package com.ff.javaoop.day6Practice;

public class Train extends Vehicle {
    @Override
    public void open() {
        System.out.println("火车在铁轨上启动");
    }

    @Override
    public void turn() {
        System.out.println("火车在铁轨上转弯");
    }

    @Override
    public void close() {
        System.out.println("火车在铁轨处停下来");
    }
}
