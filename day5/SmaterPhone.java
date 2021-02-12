package com.ff.javaoop.day5;
//手机连接了Printer
public abstract class SmaterPhone implements Printer{
    @Override
    //手机的打印方法
    public void print() {
        System.out.println("智能手机");
    }
}
