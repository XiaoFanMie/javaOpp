package com.ff.javaoop.day5duotai;

    public  class Dog  extends Animal {

        int num = 5;

        @Override
        public void eat() {
            System.out.println("狗吃肉");
        }

        @Override
        public void sleep() {
            System.out.println("狗睡觉");
        }

        public static  void testStatic(){
            System.out.println("静态");
        }

        public void play(){
            System.out.println("狗拉雪橇");
        }
    }


