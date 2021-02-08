package com.ff.javaopp.Day05.DuoTai;

public class Test2 {

    public static void main(String[] args) {

        /*
        向上类型准换
         */
        Dog dog = new Dog();//多态体现在调用方法
        CAt cat = new CAt();//父类的引用指向子类对象

        Test2 t1 = new Test2();
        t1.feedAnimal(dog);
        t1.feedAnimal(cat);
    }

    //多态应用: 同一种事物,在不同时刻表现不同的状态
      /*
    向上类型转换的弊端:无法访问子类中的特有方法
     */
    public void feedAnimal(Animal animal) {
        animal.eat();
        animal.sleep();
       /*
        向下转型,可以访问子类中的方法
        */
        if(animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.play();
        }
        /*
            animal instanceof CAt:在运行时检测判断animal 中实际包含是否是指定的类型
         */
        if (animal instanceof CAt){
            CAt cat = (CAt) animal;//向下转型:由父类类型转为子类类型
            cat.catchMouse();
        }
    }

}
