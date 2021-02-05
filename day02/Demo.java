package com.ff.javaopp.day02;

public class Demo {

    static int num;
    /*
       代码块定义在类中,类似一个没有名称的方法
       实例块
       静态块
     */
      /*
      实例块:与成员方法类似   属于对象的
      每次在创建对象时调用  先于构造方法执行
     */
    {
        System.out.println("实例块1");
    }
    {
        System.out.println("实例块2");
    }

    /*
      静态块:属于类
      类加载时执行,只加载一次,多个静态块按顺序执行
     */
    static {
        System.out.println("静态块1");
    }

    static {
        System.out.println("静态块2");
    }

    public static void main(String[] args) {
        System.out.println(Demo.num);
        new Demo();
    }
}
