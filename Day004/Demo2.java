package com.ff.javaopp.Day004;

import com.ff.javaopp.Day03.Demo;

/*
    不同包的不同子类只能访问public
 */
public class Demo2 {
    public static void main(String[] args) {
        Demo d = new Demo();
        System.out.println(d.pub);
        d.pub();

    }
}
