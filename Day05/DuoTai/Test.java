package com.ff.javaopp.Day05.DuoTai;

public class Test {
    public static void main(String[] args) {
       /* Dog dog =new Dog();
            dog.eat();
            dog.sleep();
        CAt cat = new CAt();
            cat.eat();
            cat.sleep();*/
        /*
            成员方法 多态方式调用  编译期间看左边的类型,运行时以右边实际对象为准
         */
        Animal animal = new Dog();
                animal.eat();
        /*
            静态方法 多态方式调用     编译和运行都看左边
         */
        animal.testStatic();
        System.out.println(animal.num);

        }
}
