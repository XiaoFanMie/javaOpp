package practise;

public class Max {
    public int WhoMax(int x,int y){
        return Math.max(x, y);
    }
    public double WhoMax(double x, double y){
        return Math.max(x, y);
    }
    public int WhoMax(int x,int y,int z){
        int t=Math.max(x, y);
        return Math.max(t,z);
    }
    public double WhoMax(double x,double y,double z){
        double t=Math.max(x, y);
        return Math.max(t,z);
    }
}
