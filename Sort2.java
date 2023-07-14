import java.util.Arrays;
import java.util.Scanner;
public class Sort2 {
    void sort(int arr[]){
        int n = arr.length;
        for(int i = 1; i < n; ++i){
            int k = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > k){
                arr[j+1] = arr[j];
                j = j - 1;

            }
            arr[j+1] = k;
        }
    }
    static void Array(int arr[]){
        int n = arr.length;
        for(int i = 0;  i < n; ++i){
        System.out.print(arr[i] + " ");
        }
        }
        public static void main(String[] args) {
            Scanner srt1 = new Scanner(System.in);
            System.out.print("Enter the index of the array:   ");
            int ar = srt1.nextInt();
            int arr [] = new int[ar];
            System.out.print("The Array element: "  );
            for (int i = 0; i < ar; i++){
                arr[i] = srt1.nextInt();
            }
            Sort2 srt = new Sort2();
            srt.sort(arr);
                Array(arr);
        
        }
}
