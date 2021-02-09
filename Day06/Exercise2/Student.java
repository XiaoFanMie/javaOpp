package com.ff.javaopp.Day06.Exercise2;

public class Student extends Person implements ITask{

    private String id;

    @Override
    public void working() {
        System.out.println("学习人，学习魂，学习都是人上人");
    }

    @Override
    public void rest() {
        System.out.println("休息一会马上回来");
    }

    @Override
    public void show() {
        System.out.println("这就是街舞");
    }

    public void reading(){
        System.out.println("学习让我快乐");
    }
}
