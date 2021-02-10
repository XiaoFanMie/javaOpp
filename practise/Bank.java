package practise;

import java.util.Scanner;

public class Bank {
    int count;
    int password;
    int Balance = 0;
    String BankName;

    /*创建账户*/
    public void createAccount(int count, int password, String BankName) {
        System.out.println("创建账户成功");
        System.out.println("欢迎登陆" + BankName);
    }

    /*操作*/
    public int Operate() {
        Scanner input = new Scanner(System.in);
        System.out.println("请选择您要进行的操作:1.存款;2.取款;3.查询;4.退出");
        int t = input.nextInt();
        return t;
    }

    /*存款*/
    public void bankSavings2(int price) {
        Balance += price;
        System.out.println("存款成功,剩余金额:" + Balance);
    }
    /*取款*/
    public void withdrawal(int price) {
        if (Balance - price <= 0) {
            System.out.println("您的余额不足");
        } else {
            Balance -= price;
            System.out.println("取款成功,剩余金额:" + Balance);
        }
    }
    /*查询*/
    public void Inquire() {
        System.out.println("余额" + Balance);
    }
}
