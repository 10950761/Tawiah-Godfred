import java.util.Scanner;
public class Sequence {
    void printSeq(int r){
        int t1 = 0, ratio = 4;
        int[] seq = new int[r];
        for (int k =0; k < seq.length; k++){
            seq[k] = t1;
            t1 += ratio;
            System.out.print(seq[k] + " ");

            
        }
        

    }
     public static void main(String[] args) {
        Scanner br = new Scanner(System.in);
        Sequence sr = new Sequence();
        System.out.println("Enter the Number of Sequence");
        int w = br.nextInt();
        sr.printSeq(w);
    }
}
