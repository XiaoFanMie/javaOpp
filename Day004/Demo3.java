package com.ff.javaopp.Day004;

import com.ff.javaopp.Day03.Demo;

/*
    不同包的不同子类中可以访问父类中的受保护的成员
    使用extends继承
 */
public class Demo3 extends Demo {

    public static void main(String[] args) {
        Demo3 d3 = new Demo3();
        System.out.println(d3.pub);
        d3.pub();

        System.out.println(d3.pro);
        d3.pro();

    }
}
