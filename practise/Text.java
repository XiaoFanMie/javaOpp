package practise;

import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        Tool tool = new Tool();
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println(tool.Parity(a));


        String name = input.next();
        int age = input.nextInt();
        System.out.println(name+"票价为:"+tool.Tickets(name,age)+"元");
    }
}
