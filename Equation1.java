import java.util.Scanner;
public class Equation1 {
    public static void main(String[] args) {
    Scanner godfred = new Scanner(System.in);
    System.out.println("Enter the values of the first Equation");
    double a = godfred.nextDouble();
    double b = godfred.nextDouble();
    double c = godfred.nextDouble();
    double d = godfred.nextDouble();
    System.out.println("Enter the values of the Second Equation");
    double m = godfred.nextDouble();
    double n = godfred.nextDouble();
    double r = godfred.nextDouble();
    double p = godfred.nextDouble();
    System.out.println("Enter the values of the third Equation");
    double q = godfred.nextDouble();
    double u = godfred.nextDouble();
    double v = godfred.nextDouble();
    double s = godfred.nextDouble();
   // let dd be the determeinant 
    double det = (a*(n*v-r*u)-b*(m*v-q*r)+c*(m*u-q*n));
    double det_1 =(d*(n*v-r*u)-b*(p*v-s*r)+c*(p*u-s*n));
    double det_2 =(a*(p*v-r*s)-d*(m*v-q*r)+c*(m*s-q*p));
    double det_3 = (a*(n*s-p*u)-b*(m*s-q*p)+c*(m*v-q*n));    

    if (det == 0){
        System.out.println("The System of the equation has no solution");
    }
    else {
        double x = det_1/det;
        double y = det_2/det;
        double z = det_3/det;
        System.out.printf("The solution is (x = %.2f, y = %.2f, z = %.2f).\n", x, y, z );
    }
   if (det_1 == 0 && det != 0 || det_2 == 0 && det != 0 || det_3 == 0 && det != 0) {
       System.out.println("The System of the equation has infinity number of solution");
    }
    godfred.close();

    }

}
