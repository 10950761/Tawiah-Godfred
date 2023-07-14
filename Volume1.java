// Volume, and surface area of a Cylinder
import java.util.Scanner;
public class Volume1{
    public int radius;
    public int height;
    public double Volume_ofCylinder;
    public Volume1(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }
    public double getVolume_OFCylinder(){
        return Volume_ofCylinder = Math.PI *height*radius*radius;
    }
    public void setVolume_OFCylinder(double Volume_ofCylinder){
        this.Volume_ofCylinder = Volume_ofCylinder;
    }
    public int getRadius(){
        
        return radius;
    }
    public void setRadius(int radius){
        if(radius <= -1){
            System.out.println("You have entered invalid radius");
             this.radius = 0;
            }
            else {
                this.radius = radius;
            }
        
    }
    public int getHeight(){
       
        return height;
    }
    public void setHeight(int height){
        if(height <= -1){
            System.out.println("You have entered invalid height");
            this.height = 0;
        }
        else {
            this.height = height;
        }
    }
    public static void main(String[] args) {
         System.out.println("Please enter radius and height");
        Scanner v1 = new Scanner(System.in);
        int radius = v1.nextInt();
        int height = v1.nextInt();
        Volume1 vol2 = new Volume1(radius, height);
        double vol0 = vol2.getVolume_OFCylinder();
        System.out.println("Radius: " + radius);
         System.out.println("Height :" + height);
        System.out.println("Volume of cyclinder is: " + vol0);
        v1.close();
    }

}
