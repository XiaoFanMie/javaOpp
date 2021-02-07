package com.ff.javaopp.Day004;


public class Person {

    /**
    通过访问修饰符来隐藏类中的信息
     */
    private String name;
    private int age;
    private Mobile mobile;//单向关联 一对一关联
    private Mobile[] mobiles;//单项关联  一对多关联

    /*
    依赖关系,Person中的某个方法中使用到另一个类
     */
    public void callPeople(MiddleSchool middleSchool){
        middleSchool.study();
        middleSchool.setAge(25);//传递过来的是引用类型,会改变原来的值
    }
   /* public   Person(String n , int a){k
        name = n;
        age = a;
    }*/

    /**
    *为私有属性提供专门的方法来进行访问
     * this 现实的表示当前正在访问的对象
     */
    public void setName(String name) {
        if (name.length() < 5) {
            this.name = name;//对象p访问时,this表示的是p对象
            eat();
        }else{
            this.name="肖恩";
            this.eat();//本类中访问私有权限的方法
        }
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }

    /*
    私有权限的方法,可以在本类中访问
     */
    private void eat() {
        System.out.print("干饭王:");
    }
}
