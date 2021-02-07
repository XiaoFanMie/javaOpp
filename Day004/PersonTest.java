package com.ff.javaopp.Day004;

public class PersonTest {
    public static void main(String[] args) {

        /*Person p = new Person("jim",20);*/
        /*Person p1 = new Person("jack",28);*/


        Person p = new Person();
               p.setName("崔");
               p.setAge(21);
        System.out.println(p.getName()+p.getAge());


        Person p1 = new Person();
               p1.setName("瑞");
               p1.setAge(22);
        System.out.println(p1.getName()+p1.getAge());
    }
}
