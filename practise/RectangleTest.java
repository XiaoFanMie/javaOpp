package practise;

import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int height = input.nextInt();
        Rectangle rectangle = new Rectangle();
        rectangle.Girth(length,height);
        rectangle.Area(length,height);
    }



}
