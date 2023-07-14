import java.math.*;

public class Area_C2 {
    public int radius;
    public double area;
    public double getArea(){
        return area = Math.PI*radius*radius;
    }   
    public void setArea(double area){
        this.area = area;
    }
    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    public static void main(String[] args) {
        Area_C2 ar = new Area_C2();
        ar.setRadius(4);
        double c = ar.getArea();
        System.out.println(c);
    }
}
