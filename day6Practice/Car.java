package com.ff.javaoop.day6Practice;

public class Car  extends Vehicle{
    @Override
    public void open() {
        System.out.println("汽车多数人都可以启动");
    }

    @Override
    public void turn() {
        System.out.println("汽车在弯道处必须转弯");
    }

    @Override
    public void close() {
        System.out.println("多数人都可以使汽车停下来");
    }
}
