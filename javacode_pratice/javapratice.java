import java.util.Scanner;
import java.util.*;

public class javapratice {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        bubblesort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void bubblesort(int[] arr){
        int n = arr.length;
        for(int i=0;i<=n-2;i++){
            for(int j=0;j<=n-2-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

}
