package practise;

public class Rectangle {

    int length;
    int height;

    public void Girth(int length,int height){
        int C=(length+height)*2;
        System.out.println("周长="+C);
    }
    public void Area(int length,int height){
        int S=length*height;
        System.out.println("面积="+S);
    }
}
