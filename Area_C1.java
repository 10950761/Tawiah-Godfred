import java.util.*;
import java.lang.*;
public class Area_C1{
public double area;//make these data fields private but it is okay for now
public int radius;
public void setArea(double area){
this.area=area;
}
public void setRadius(int radius){
this.radius=radius;
}
public double getArea(){
return area;
}
public int getRadius(){
return radius;
}
public static void main(String args[]){
Area_C1 object=new Area_C1();
object.setArea(145.25);
object.setRadius(14);
System.out.println("Area "+object.getArea()+"\n");
System.out.println("Radius "+ object.getRadius());
//second way
Scanner input=new Scanner(System.in);
Area_C1 object1=new Area_C1();
System.out.println("give the area");
double a=input.nextDouble();
System.out.println("give the radius");
int r=input.nextInt();
object1.setArea(a);
object1.setRadius(r);
System.out.println("Area "+object1.getArea());
System.out.println("Radius "+object1.getRadius());
}
}