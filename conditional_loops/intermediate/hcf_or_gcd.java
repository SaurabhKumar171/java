package conditional_loops.intermediate;

import java.util.Scanner;

public class hcf_or_gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1= sc.nextInt();
        int n2= sc.nextInt();
      
        System.out.println(factor( n1 , n2));
        
    }

    public static int factor(int n1 ,int n2){
       int factor=0;

        for(int i=1;i<n1;i++){
            if(n1%i==0){
                if(n2%i==0){
                  factor = Math.max(factor,i);
              }
            }
        }

        if(factor==0){
            return 0;
        }

        return factor;
    }
}
