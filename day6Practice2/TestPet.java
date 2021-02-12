package com.ff.javaoop.day6Practice2;

public class TestPet {
    public static void main(String[] args) {
        Pet[]  p=  {new Cat (),new Dog(),new Pet()};
        for (int i=0;i<p.length;i++)
            p[i] .speak();
    }
}
