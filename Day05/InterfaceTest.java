package com.ff.javaopp.Day05;

public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Animal.nums);
        System.out.println(Animal.s);

        Animal dog = new Dog();

        dog.eat();
        dog.sleep();
        dog.test();
        Animal.play();
    }
}
