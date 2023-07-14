import java.util.Scanner;
public class Area_R {
   public static void main(String[] args) {
    Scanner C = new Scanner(System.in);
    int length = C.nextInt();
    int width = C.nextInt();
    int Area = length * width;
    System.out.println("Area of Reactangle is : " + Area);
    C.close();
   } 
}
