package com.ff.javaopp.Day06.Exercise2;

public class Teacher extends Person implements ITask{

    private String department;
    @Override
    public void working() {
        System.out.println("教书人");
    }

    @Override
    public void rest() {
        System.out.println("休息一下");
    }

    @Override
    public void show() {
        System.out.println("这就是教书");
    }
    public void teaching(){
        System.out.println("教书育人");
    }
}
