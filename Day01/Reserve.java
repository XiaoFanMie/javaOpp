package com.ff.javaopp.Day01;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Reserve {
   /* *
     * 值传递
     **/
   /* public static void main(String[] args) {
        int a = 10;
        Reserve r1 = new Reserve();
        r1.test(a);//基本类型数据  是直接将值传递给其他的变量
        System.out.println(a);
    }
    public void test(int t){
        System.out.println(t);
        t=5;
        System.out.println(t);
    }*/
   /* *
     * 引用调用*/
    public static void main(String[] args) {
        Reserve r2 = new Reserve();
        Dog dog = new Dog();
        dog.name="cui";
        r2.test1(dog); //引用类型 传递的是对象的地址 并不是对象本身
        System.out.println(dog.name);
    }
    public void test1(Dog dog1){
        System.out.println(dog1.name);
        dog1.name="rui";
        System.out.println(dog1.name);
    }

}
