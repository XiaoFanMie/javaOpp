package practise;

public class Student {
    String sno;
    String name;
    String sex;
    int age;
    int Cgrade;
    int Mgrade;
    int Egrade;

    public void Study(){
        System.out.println("我叫"+name+"\t学号"+sno+"\t今年"+age+"\t性别"+sex+"\t我的格言是:一分钟不学习,浑身难受");

    }
    public void Exam(){
        System.out.println("我考试语文:"+Cgrade+"\t数学:"+Mgrade+"\t英语:"+Egrade);
    }

    public void Study(String name ,String sno,int age ,String sex){
        System.out.println("我叫"+name+"\t学号"+sno+"\t今年"+age+"\t性别"+sex+"\t我的格言是:一分钟不学习,浑身难受");
    }
    public void Exam(int Cgrade, int Mgrade, int Egrade){
        System.out.println("我考试语文:"+Cgrade+"\t数学:"+Mgrade+"\t英语:"+Egrade);
    }
}

