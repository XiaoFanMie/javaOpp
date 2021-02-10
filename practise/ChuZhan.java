package practise;
import java.util.Scanner;
import java.util.Stack;

public class ChuZhan {
        public static void main(String args[]) {
            Scanner se=new Scanner(System.in);
            int m=se.nextInt();
            int n=se.nextInt();
            int k=se.nextInt();
            int num;
            int start=1;
            boolean f=false;
            for (int i = 0; i < k; i++) {
                Stack<Integer> stack=new Stack<Integer>();
                start=1;
                f=true;
                for (int j = 0; j < n; j++) {
                    num=se.nextInt();
                    while (start<=num) {
                        stack.push(start++);
                    }
                    if (!stack.isEmpty() && stack.size()<=m&&num==stack.peek()){
                        stack.pop();
                    }else {
                        f=false;
                    }
                }
                if (f) {
                    System.out.println("YES");
                }else {
                    System.out.println("NO");
                }
            }
        }
    }

