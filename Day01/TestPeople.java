package com.ff.javaopp.Day01;


public class TestPeople {
    public static void main(String[] args) {
        /*
          类定义好后,是一个文件,但不能使用
          以类为模板创建对象,对象是实例,视具体存在的,可以被使用
          People cui = new People();
                       new + People 类的构造方法,在内存中创建一个具体的对象
                      People cui 以People类为类型声明一个变量cui
                       = 让cui变量 指向(引用)内存中的对象
           cui.name = "崔瑞荣";
           使用cui变量 . 调用对象中的属性(变量)\行为(方法)
         */
        People cui = new People();
        cui.name = "崔瑞荣";
        cui.age = 21;
        cui.sex = "女";
        System.out.println("姓名:" + cui.name + "\t性别:" + cui.sex + "\t年龄:" + cui.age);
        cui.Eat();
        cui.Sleep();
        cui.Study();

        People w = new People();
        w.name = "王一凡";
        w.age = 21;
        w.sex = "男";
        System.out.println("姓名:" + w.name + "\t性别:" + w.sex + "\t年龄:" + w.age);
        w.Eat();
        w.Sleep();
        w.Study();

        People z=new People("田");
        System.out.println(z.name);

        People wing = new People("赵",21);
        System.out.println(wing.name+wing.age);

        People t = new People("李",22,"男");
        System.out.println(t.name+t.age+t.sex);

        cui.Play();
        cui.Play(22222,"哈哈哈哈");
        cui.Play("嘿嘿嘿",2222);
    }
}
