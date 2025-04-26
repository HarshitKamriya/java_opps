import java.util.Arrays;
import java.util.Scanner;

class Largebag{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        for(int i=1;i<=t;i++){
            int n = scn.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = scn.nextInt();
            }
            boolean ans = helper(arr,n);
            if(ans == true){
                System.out.println("YES");
            }
            else{
                System.out.println("No");
            }
        }
    }
    public static boolean helper(int[][] arr,int n){
        Arrays.sort(arr);
        
    }
}
