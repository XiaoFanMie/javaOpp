package com.ff.javaoop.day5duotai;

public class Test1 {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Test1 t1 = new Test1();

        t1.feedAnimal(dog);
        t1.feedAnimal(cat);
    }

    //多态应用:同一种事务,在不同时刻表现不同的状态
    public void feedAnimal(Animal animal){
        animal.eat();
    }
}

