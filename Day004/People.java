package com.ff.javaopp.Day004;
/*
    primarySchool类继承People
    PrimarySchool是People的子类(派生类)
    父类(基类)
    把人类相关的一些公有属性,行为,定义在people类中
    extends关键字

    当一个类没有显示的继承一类,那么这个类默认继承object
    object是java所有类的基类 称超类
 */
public class People {

    private String name ;
    private int age;

    public People(){
        System.out.println("人类中的无参的构造方法");
    }

    public People(String name){
        this.name=name;
        System.out.println("人类中的有参的构造方法");
    }

    public void setName(String name ){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }


    public void eat(){
        System.out.println(name+"干饭人,干饭魂,干饭都是人上人");
    }
}
