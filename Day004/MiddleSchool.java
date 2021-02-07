package com.ff.javaopp.Day004;

public class MiddleSchool extends People{

    private String grade;

    public void study(){
        System.out.println("学习人,学习魂,学习都是人上人");
    }

    public void setGrade(String grade){
        this.grade=grade;
    }
    public String getGrade(){
        return grade;
    }

}
