package com.ff.javaopp.Day05.DuoTai;

public class Test1 {

    public static void main(String[] args) {

        Dog dog = new Dog();//多要体现在调用方法

        Animal cat = new CAt();//父类的引用指向子类对象

        Test1 t1 = new Test1();
        t1.feedAnimal(dog);
        t1.feedAnimal(cat);
        t1.sleepAnimal(dog);
        t1.sleepAnimal(cat);
    }

    //多态应用: 同一种事物,在不同时刻表现不同的状态
    public void feedAnimal(Animal animal){
       animal.eat();
    }
    public void sleepAnimal(Animal animal){
        animal.sleep();
    }
}
