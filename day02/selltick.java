package com.ff.javaopp.day02;

public class selltick {

    static int tick = 11;//票数只有一份,使用static修饰

    public static void SellTick(){
        tick-=1;
        System.out.println(tick);
    }

    public static void main(String[] args) {
        selltick.SellTick();
        selltick.SellTick();
    }
}
