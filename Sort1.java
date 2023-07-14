import java.io.*;
public class Sort1 {
    static void BS(int arr[],int n){
        int i, j, t;
        boolean swapped; 
        for(i = 0; i < n-1; i++){
            swapped = false;
            for (j = 0; j < n - i - 1; j++){
                if (arr[j] > arr[j+1]) {
                t  = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = t;
                swapped = true;
                }

            }
            if (swapped == false) 
                break;
       
        }
    }
     static void Array(int arr[], int s){
        int i ;
        for (i = 0; i < s; i ++)
        System.out.print(arr[i] + " ");
        System.out.println();
     }
     public static void main(String[] args) {
        int arr[] = {16,34,17,98,56,30,67,65,79,68,86,41,0};
        int n = arr.length;
        BS(arr,n);
        Array(arr,n);
     }
}

