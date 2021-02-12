package com.ff.javaoop.day5;
//电脑连接了Printer
public abstract class Computer implements Printer {
    //电脑的print方法
    @Override
    public void print() {
        System.out.println("电脑");
    }
}
