package com.ff.javaopp.Day03;

public class Demo {

    public int pub;
    protected int pro;
    int def;
    private int pri;

    /*
        被不同访问权限修饰符修饰的成员变量
     */
    public void pub() {
    }

    protected void pro() {
    }

    void def() {
    }

    private void pri() {
    }

    /*
         在自己的类中,任何访问权限修饰符,修饰的成员变量都可以被访问
     */
    public static void main(String[] args) {
        Demo d = new Demo();
        System.out.println(d.pub);
        d.pub();

        System.out.println(d.pro);
        d.pro();

        System.out.println(d.def);
        d.def();

        System.out.println(d.pri);
        d.pri();
    }
}
