package practise;

public class TestStudent {
    public static void main(String[] args) {
        Student cui = new Student();
        cui.sno="1821014014";
        cui.name="傻狗";
        cui.sex="女";
        cui.age=21;
        cui.Cgrade=100;
        cui.Mgrade=100;
        cui.Egrade=100;
        cui.Study();
        cui.Exam();

        Student rui = new Student();
        rui.Study("傻猪","1821014014",21,"女");
        rui.Exam(  1000,  1000,  1000);
    }


}
