package conditional_loops;

import java.util.Scanner;

public class sum {
    
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   int sum=0;
        while(true){
         int n=sc.nextInt();

         if(n==0){
            System.out.println(sum);
            break;
         }

         else{
            sum +=n;
         }
      }
  }

}
