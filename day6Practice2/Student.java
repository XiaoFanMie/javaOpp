package com.ff.javaoop.day6Practice2;

public class Student extends Person implements ITask {
    String id;

    public void reading() {
        System.out.println("学生必须读书");
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
