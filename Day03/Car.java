package com.ff.javaopp.Day03;
/*
 * package包 com.ff.javaoop路径
 */

/*
import 类的地址
在一个类中使用另一个包中的类,需通过import关键字,将类和地址导入
 */
import java.util.Date;
//import java.sql.Date;不能导入相同的类名
//java.lang中的类不需要导入
public class Car {
    /*
   全包名= 包名 + 类名的简称
    */
    public static void main(String[] args) {
        Date date = new Date();
        java.sql.Date  date1= new java.sql.Date(1);
    }
}
