package com.ff.javaopp.Day004;

public class PrimarySchool extends People {

    private String clas;

    public PrimarySchool(){
        super("小红");
        System.out.println("小学生中的无参构造方法");
    }
    public void setClass(String clas){
        this.clas=clas;
    }
    public String getClas(){
        return clas;
    }


    public void play(){
        System.out.println("过家家");
    }

}
