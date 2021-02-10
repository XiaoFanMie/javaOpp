package practise;

import java.util.Scanner;

public class JiSuan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[][] a = new int[N][3];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                int num = input.nextInt();
                a[i][j] = num;
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i][0] + a[i][1] == a[i][2]) {
                System.out.println("Yes");
            } else if (a[i][0] - a[i][1] == a[i][2]) {
                System.out.println("Yes");
            } else if (a[i][0] * a[i][1] == a[i][2]) {
                System.out.println("Yes");
            } else if (a[i][0]*1.0 / a[i][1] == a[i][2]) {
                System.out.println("Yes");
            } else if (a[i][0] % a[i][1] == a[i][2]) {
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
