package practise;

import java.util.Scanner;

public class MaxTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("x=");
        int x = input.nextInt();
        System.out.print("y=");
        int y = input.nextInt();
        System.out.print("z=");
        int z = input.nextInt();
        System.out.print("x1=");
        double x1 = input.nextDouble();
        System.out.print("y1=");
        double y1= input.nextDouble();
        System.out.print("z1=");
        double z1 = input.nextDouble();
        Max max = new Max();
        System.out.println("x和y最大值是:"+max.WhoMax(x,y));
        System.out.println("x1和y1最大值是:"+max.WhoMax(x1,y1));
        System.out.println("x和y和z最大值是:"+max.WhoMax(x,y,z));
        System.out.println("x1和y1和z1最大值是:"+max.WhoMax(x1,y1,z1));
    }
}
