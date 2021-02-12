package com.ff.javaoop.day5;
public class Main {
        /*//向上转型,将Superman提升到Person对象，只能使用Person中的方法
        public static void main(String[] args) {
            Person person = new Superman();
            person.sleep(); //调用的是父类person的方法
            person.eat(); // 调用的是Superman里面的eat方法，Superman重写了Person父类的方法
            //person.fly(); //报错了，丢失了Superman类的fly方法
        }*/
        //向下转型，子父类中的方法都可以被使用
            public static void main(String[] args) {
                Person person = new Superman();
                Superman s = (Superman)person;   //向下转型
                s.sleep();
                s.fly();
                s.eat();
            }
        }



