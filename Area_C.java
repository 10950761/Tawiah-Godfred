import java.util.Scanner;
import java.lang.Math;
public class Area_C {
  public static void main(String[] args) {
    Scanner B = new Scanner(System.in);
    int radius = B.nextInt();
    double  Area;
    Area = radius*radius*Math.PI;
    System.out.println(Area);
    B.close();
    
  }  
}
