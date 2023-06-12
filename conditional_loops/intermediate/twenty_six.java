package conditional_loops.intermediate;

import java.util.Scanner;

public class twenty_six {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number");

        int pos_odd=0;
        int pos_even=0;
        int negative=0;

        while(true){
          int n = sc.nextInt();  

          if(n%2==0 && n>0){
            pos_even +=n;
          }
          else if(n%2!=0){
            pos_odd +=n;
          }

          else if(n<0){
            negative +=n;
          }

          else if(n==0){
            break;
          }
        }

        System.out.println("positive even sum is : "+pos_even);
        System.out.println("positive odd sum is : "+pos_odd);
        System.out.println("negative sum is : "+negative);
        
    }


}
