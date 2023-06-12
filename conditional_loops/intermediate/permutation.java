package conditional_loops.intermediate;

import java.util.Scanner;

public class permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         System.out.println("enter n");
        int n= sc.nextInt();

        System.out.println("enter nr");
        int r= sc.nextInt();

         System.out.println(n+"p"+r+" is :"+(factorial(n)/factorial(n-r)));
        System.out.println(n+"c"+r+" is :"+((factorial(n)/(factorial(n-r)*factorial(r)))));

    }

    public static int factorial(int n) {
            int f=1;
            for(int i= n; i>=1;i--){
                   f *=i;
            }

            return f;
    }
}
