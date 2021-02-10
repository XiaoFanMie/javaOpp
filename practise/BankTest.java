package practise;

import java.util.Scanner;

public class BankTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("请输入账户");
        int count = input.nextInt();
        System.out.println("请输入密码");
        int password = input.nextInt();
        System.out.println("请输入银行名称");
        String BankName = input.next();

        /*登陆账户*/
        Bank bank = new Bank();
        bank.createAccount(count,password,BankName);

        out:while(true){
            int t =bank.Operate();
            switch (t){

                case 1:
                    System.out.println("请输入存款金额");
                    int price = input.nextInt();
                    bank.bankSavings2(price);
                    continue out;

                case 2:
                    System.out.println("请输入取款金额");
                    int price1 = input.nextInt();
                    bank.withdrawal(price1);
                    continue out;

                case 3:
                    bank.Inquire();
                    continue out;

                case 4:
                    break out;
            }
        }
        System.out.println("欢迎下次光临"+BankName);
    }
}
