package com.ff.javaoop.day5duotai;

public class Test {
    public static void main(String[] args) {
          /*Dog dog = new Dog();
              dog.eat();

          Cat cat = new Cat();
              cat.eat();*/

         /*
           成员方法，多态方式调用，编译期间看左边类型,运行期间看右边。
           静态方法，多态方式调用，编译期间和运行期间都看左边
           成员变量，多态方式调用，编译期间和运行期间都看左边
         */
        /*向上转型
        优点：使得父类可以表示所有子类
        缺点：子类只可以访问父类中的方法，但访问不到子类自己特有的方法
         */
      /*  Animal animal = new Dog();
        animal.eat();
        animal.testStatic();
        System.out.println(animal.num);*/

        //animal.play();在向上转型中不可以访问到子类中特有的对象
        /*Animal animal = new Dog();
        Dog dog = (Dog) animal;
        dog.play();

        Cat cat = (Cat) animal;
        cat.dance();*/
        /*
        向下转型：Dog dog = (Dog)animal;相当于强制类型转化
        优点：可以实现子类中特有方法的访问，但当有多个子类同时访问时可能会出现问题
        运行有错，用if 语句加instanceof改正
        animal instanceof Dog在运行时检测判断animal中实际包含是否含有指定的类型
            */
        /*if(animal instanceof Dog){
            Dog dog = (Dog)animal;
            dog.play();
        }
        if(animal instanceof Cat){
            Cat cat= (Cat) animal;
            cat.dance();
        }

        }*/
    }
}


