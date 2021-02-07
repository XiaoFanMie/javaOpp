package com.ff.javaopp.Day004.abstractDemo;

public class Test {
    public static void main(String[] args) {
     /*   Dog d = new Dog();
        d.eat();
        d.sleep();
        d.play();*/
        //Dog d = new Dog();不是多态
        Dog dog = new Dog();
        Cat cat = new Cat();
        Test t = new Test();
        t.feedCat(cat);
        t.feedDog(dog);
    }

    public void feedDog(Dog dog) {
        dog.eat();
        dog.sleep();
    }

    public void feedCat(Cat cat) {
        cat.eat();
        cat.sleep();
    }
}
