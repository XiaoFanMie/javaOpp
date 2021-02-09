package com.ff.javaopp.Day06.Exercise2;

public class Test {
    public static void main(String[] args) {
        ITask student =new Student();
        ITask teacher = new Teacher();

        student.rest();
        student.show();
        student.working();

        teacher.working();
        teacher.show();
        teacher.rest();

    }
}
