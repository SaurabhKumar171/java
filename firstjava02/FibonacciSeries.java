package firstjava02;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        
        int i=1;

        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        int a=1;
        int b=1;

        // System.out.print(a +" "+b +" ");

        while(i<=n){
            int c= a+b;
            System.out.print(a +" ");
            a=b;
            b=c;

            i++;
        }
    }
}
