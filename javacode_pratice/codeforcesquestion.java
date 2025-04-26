import java.util.Scanner;
public class codeforcesquestion {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(i)

    }
    public static int solve(int x,int k){
        int count =0;
        if(x%2 !=0 && k%2 != 0){
            count++;
            x = x-k;
            count += x/k-1;
        }
        else if(x%2 !=0 && k%2==0){
            count =  x/k;
        }
        else if(x%2 ==0 && k%2 != 0){
            count 
        }
    }
}