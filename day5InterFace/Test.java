package com.ff.javaoop.day5InterFace;

public class Test {
    public static void main(String[] args) {
        System.out.println(Animal.NUM);
       //Dog dog = new Dog();
        Animal dog = new Dog();
       dog.eat();
       dog.play();
       dog.sleep();
       Animal.dance();
    }
}
