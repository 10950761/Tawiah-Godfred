import java.util.Scanner;
public class prinum {
     public static void main(String[] args) {
       Scanner A = new Scanner(System.in);
       int INPUT = A.nextInt();
       int b,c;
       for(b = 1; b < INPUT; b++){
        for (c = 2; c < b; c++){
            if (b%c == 0) {
                break; 
            }
            }

        if (c==b){
            System.out.print(c + " ");
        }
       }
       
     }
}
