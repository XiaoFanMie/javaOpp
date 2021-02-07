package com.ff.javaopp.Day004;

public class XiaoMing extends PrimarySchool{

    /*
    在调用子类方法时,会先调用父类的构造方法
     */
    public XiaoMing(){
        //super(); 构造方法第一行默认使用super();调用父类默认无参的构造方法
        super();//需要显示调用,必须放在构造方法的第一行
        System.out.println("小学生小明中无参的构造方法");
    }

    /*
            父类的实现方式不能满足子类的功能时可以进行重写
    方法的重写:当子类中的实现步骤与父类中的实现方式不同时,
    可以在子类中将父类中的方法重写
            必须与父类的方法结构相同(返回值,参数)
            子类重写后的方法的权限范围要大于等于父类方法的访问权限

            super表示当前类的父类对象
            在子类中可以通过super访问父类中成员

            @Override 注解  标签
            表明该方法是从父类中重写过来了的
     */
    @Override
    public void eat(){
        System.out.println("小明喜欢吃面面");
        super.eat();//调用父类成员
    }

    public void Question(){
        System.out.println("小学生小明喜欢问问题");
    }
}
