package javacode_pratice;
import java.util.Scanner;
public class percentagecalculator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the each subject marks to calculate percentage");
        System.out.println("Enter the marks of Math");
        int a = scn.nextInt();
        System.out.println("Enter the marks of biology");
        int b = scn.nextInt();
        System.out.println("Enter the marks of Chemistry");
        int c  = scn.nextInt();
        System.out.println("Enter the marks of Physics");
        int d = scn.nextInt();
        System.out.println("Enter the marks of Hindi");
        int e = scn.nextInt();
        System.out.println("Enter the marks of English");
        int f = scn.nextInt();
        System.out.println("your scor is : ");
        System.out.println((a+b+c+d+e+f)/6.0);
    }
}
