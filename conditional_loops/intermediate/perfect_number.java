package conditional_loops.intermediate;

import java.util.Scanner;

public class perfect_number {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        int n1= sc.nextInt();
         
      
        System.out.println(factor( n1));
    }


     public static int factor(int n1){
       int factor=0;

        for(int i=1;i<n1;i++){
            if(n1%i==0){
               factor += i;
            }
        }

        return factor;
    }

}
