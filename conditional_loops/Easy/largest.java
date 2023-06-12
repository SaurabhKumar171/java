package conditional_loops.Easy;

import java.util.Scanner;

public class largest {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     int lar=0;
     
        while(true){
         int n=sc.nextInt();

         if(n==0){
            System.out.println(lar);
            break;
         }

         else{
           lar=Math.max(lar, n);
         }
      }
    }

}
