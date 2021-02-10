package practise;

public class Circle {
    int r;
    final double  PI=3.14;

    public Circle(){
       r = 4;
    }
    public void Area(){
        double S = PI * Math.pow(r,2);
        System.out.println("面积为:"+S);
    }

    public void Girth(){
        double C= PI*2*r;
        System.out.println("周长为:"+C);
    }

    public static void main(String[] args) {
        Circle c= new Circle();
        c.Area();
        c.Girth();
    }
}
