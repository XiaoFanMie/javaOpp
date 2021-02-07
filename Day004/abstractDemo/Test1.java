package com.ff.javaopp.Day004.abstractDemo;

public class Test1 {
    public static void main(String[] args) {
        /*
            向上转型
         */
        Animal dog = new Dog();
        //dog.eat();编译期间看左边,运行期间看右边
        Animal cat = new Cat();
        Test1 t = new Test1();
        dog.play();
        cat.play();
       // dog.sleep;


        /*
        向下转型
        为了使用子类中特有方法
         */
        Animal d = new Dog();
        Dog m = (Dog) d;
        Animal c = new Cat();
        Cat n = (Cat) c;
        m.sleep();
        m.eat();
        n.eat();
        n.sleep();
    }


}
