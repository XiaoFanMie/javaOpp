package com.ff.javaopp.Day01;

/**
 * 发现类
 * [访问权限修饰符] [修饰符] class(定义类) 类名 {
 *      变量：事物属性的描述；
 *      方法:事物的行为；（可以做的事情）
 *      构造方法：用于创建对象；
 *       内部类： 即在类体中声明的类。
 *       块：一段没有名称的代码块
 * }
 * 访问修饰符有两种 public 或者 不写
 * 修饰符: final , abstract
 * 类名: 类名首字母大写,见名知意,驼峰表示
 */
public class People {
    /**
     * 发现共有属性
     * 成员变量定义
     * [访问权限修饰符] [修饰符] type 变量名;
     */
    String name;
    String sex;
    int age;

    /**
     * 类中默认有一个元素的构造方法
     */
    public  People(){
        System.out.println("调用构造方法");
    }
    /**
     * 还可以在类中定义有参数的构造方法,一旦定义,默认元素的就会失效
     */
    public People(String n){
        name=n;
        System.out.println("有参数的构造方法创建一个People对象");

    }
    public People(String n, int a){
        name=n;
        age=a;
    }
    public People(String n , int a ,String s){
        name=n;
        age=a;
        sex=s;
    }
    /**
     成员方法
     人有睡觉吃饭学习等行为
     [访问权限修饰符] [修饰符]/void  方法名(参数类型 参数名){
     sout();
     [return 返回值;]
     }

     */
    /**
     * 睡觉的方法
     */
    public void Sleep() {
        System.out.println(name + "说费觉觉");
        return;
    }

    /**
     * 吃饭的方法
     */
    public void Eat() {
        System.out.println(name + "说开饭了,冲冲冲");
    }

    /**
     * 学习的方法
     */
    public void Study() {
        System.out.println(name + "说一秒不学习,浑身难受");
    }


    /*
    方法的重载overload
        在同一个类中出现多个方法名相同的现象--方法的重载
        方法名相同时,如何区分方法
            通过参数区分:1.参数的个数  2.参数的类型  3.参数的顺序
     */
    public void Play(){
        System.out.println(name+"使劲玩");
    }
    public void Play(int day,String deep){
        System.out.println(name+deep+"使劲玩");
    }
    public void Play(String deep,int day){
        System.out.println(name+deep+day+"使劲玩");
    }
}
