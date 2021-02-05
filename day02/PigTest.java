package com.ff.javaopp.day02;

public class PigTest {
    public static void main(String[] args) {

        Pig z = new Pig();
        z.name = "猪猪";
        System.out.println(z.variety);


        Pig.variety = "狗";//静态的变量在内存中只有一份,建议使用类名调用
        System.out.println(Pig.variety);//静态方法 通过类名调用

        Pig x = new Pig();
        x.name = "狗狗";
        System.out.println(x.variety);
    }
}

