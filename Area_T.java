import java.util.Scanner;
public class Area_T {
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        int base = A.nextInt();
       int heigth  = A.nextInt();
        double  Area;
        Area = 0.5*(base * heigth);
        System.out.println(Area);
        A.close();
    }
    
}
