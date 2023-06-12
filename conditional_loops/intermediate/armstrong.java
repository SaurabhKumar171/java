package conditional_loops.intermediate;

import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();

        int p=0;
          while(n>0){
           int t= n%10;
            p+=Math.pow(t,3);
           n=n/10;
    }
  System.out.println(p);
    }
}
