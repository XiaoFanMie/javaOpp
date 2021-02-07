package com.ff.javaopp.Day004;

public class PeopleTset  {
    public static void main(String[] args) {
        PrimarySchool p = new PrimarySchool();
        p.setName("瑞瑞");//父类
        p.setAge(21);//父类
        p.setClass("学前班");//小学生自己的属性
        System.out.println(p.getName()+p.getAge());//父类
        System.out.println(p.getClas());//小学生自己的属性
        p.eat();//父类
        p.play();//小学生自己的方法

        MiddleSchool M = new MiddleSchool();
        M.setName("荣荣");//父类
        M.setAge(22);//父类
        M.setGrade("高中生");//高中生自己的属性
        System.out.println(M.getName()+M.getAge());//父类
        System.out.println(M.getGrade());//高中生自己的属性
        M.study();//高中生自己的属性
        M.eat();//父类

        p.hashCode();//调用object类中的方法
        /*
        子类继承了父类后,可以拥有父类中费私有属性,方法
         */

        XiaoMing xm= new XiaoMing();
        xm.Question();
    }
}
