package com.ff.javaoop.day5duotai;

public class Test2 {
    public static void main(String[] args) {
        /*
        向上转型
        优点：使得父类可以表示所有子类
        缺点：子类只可以访问父类中的方法，但访问不到子类自己特有的方法
         */

        Animal dog = new Dog();
        Animal cat = new Cat();
        Test2 test2 = new Test2();

        test2.feedAnimal(dog);
        test2.feedAnimal(cat);
    }

        public void feedAnimal(Animal animal){
            animal.eat();
           // animal.play();向上转型为父类类型不能访问子类中特有的方法
            /* 向下转型：Dog dog = (Dog)animal;相当于强制类型转化
            优点：可以实现子类中特有方法的访问，但当有多个子类同时访问时可能会出现问题
            运行有错，用if 语句加instanceof改正
            animal instanceof Dog在运行时检测判断animal中实际包含是否含有指定的类型
            */
            if(animal instanceof Dog){
                Dog dog = (Dog)animal;
                dog.play();
            }
            if(animal instanceof Cat){
                Cat cat= (Cat) animal;
                cat.dance();
            }
    }
}
