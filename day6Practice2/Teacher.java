package com.ff.javaoop.day6Practice2;

public class Teacher extends Person implements ITask {
    String department;
    public void teaching(){
        System.out.println("老师有公寓号");
    }

    @Override
    public void working() {

    }

    @Override
    public void rest() {

    }

    @Override
    public void show() {

    }
}
