package com.ff.javaopp.Day03;

public class Demo1 {
    /*
        同一个包中的不同类中可以访问public default protected
     */
    public static void main(String[] args) {
        Demo d = new Demo();
        System.out.println(d.pub);
        d.pub();

        System.out.println(d.def);
        d.def();

        System.out.println(d.pro);
        d.pro();

        /*
        同一包中的不同类中不能访问private
         */
        /*System.out.println(d.pri);
        d.pri();*/
    }
}
