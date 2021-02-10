package practise;

import sun.security.krb5.internal.Ticket;

import java.util.Scanner;

public class Tool {

    public String Parity(int t) {
        if (t % 2 == 0) {
            return "偶数";
        } else{
            return "奇数";
        }
    }


    public int Tickets(String name , int age){
    int price;
        if (age>=80){
            price=0;
        }else if(age>=50){
            price=50;
        }else price=100;
        return price;
    }
}
