package com.ff.javaopp.Day06;

class FinalDemo {

    //final 修饰的变量变为常量,值不能改变
    final static int x = 10;//直接初始化变量,建议用static修饰,在内存中就会有一份

    public final void test(final int a) {
        //x=5;
        System.out.println(a);
        //a=1;不能重新赋值
    }


    /*在创建的每一个对象中包含一个常量,必须在构造方法中赋值*/
    /*final int y;

    public FinalDemo(int a) {
        y=a;
    }*/

    /*
    被final修饰的方法  不能被子类重写
     */
    public final void eat() {
        System.out.println("aaaaa");
    }

   /* public FinalDemo(){

    }*/

    public static void main(String[] args) {
        /*FinalDemo f1 = new FinalDemo(10);
        FinalDemo f2 = new FinalDemo(5);*/
    }

}
