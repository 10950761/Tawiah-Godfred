/*This has no constructors */
import java.util.Scanner;
public class Area_C3 {
    public double area;
    public int radius;
    public double getArea(){
        return area = Math.PI*radius*radius;
    }
    public void setArea(double area){
        this.area =area;
    }
    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius){
        if (radius <= 0){
            System.out.println("Invalid Radius");
            this.radius = 0;
        }
        else {
            this.radius = radius;
        }
    }
    public static void main(String[] args) {
        System.out.println("Eneter the radius of the circle : ");
        Scanner kar = new Scanner(System.in);
        int radius = kar.nextInt();
        Area_C3 ar = new Area_C3();
        ar.setRadius(radius);
        double ARE = ar.getArea();
        System.out.println("Area of the Circle is : " + ARE);
    kar.close();
    }
}
