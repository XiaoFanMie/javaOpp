package com.ff.javaoop.day6;

public  final class FinalDemo {
    /*final 修饰的变量
    1.final int num = 56;直接初始化常量建议有static修饰，在内存中只有一份
    2.final int count;先定义
   public FinalDemo(int count) {
        this.count = count;
    }在写出他的构造方法
    在创建的每一个对象中包含一个常量，必须在构造方法中赋值*/
    /*
     final修饰的变量为常量，值不可以变
     */
    //final int num = 56;
    static  final int num = 56;
    final int count ;
    public FinalDemo(int a) {
       count = a;
    }

    public final void eat(){
        System.out.println("eatting...");
    }
    /*
    被final修饰的方法的参数不能改
     */
    public void test (final int a){
       // num = 5;
        System.out.println("testing....");
        //a = 5;
    }

    public static void main(String[] args) {
        FinalDemo f1 = new FinalDemo(10);
        FinalDemo f2 = new FinalDemo(5);
    }
}
