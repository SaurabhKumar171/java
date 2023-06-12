package conditional_loops.intermediate;

import java.util.Scanner;

public class leap {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        int y= sc.nextInt();

        System.out.println( (check(y))?"leap":"Not leap");
    }

    public static boolean check(int y){
       boolean leap = false;

       if(y%4==0){

         leap = true;   
          
         if(y%100==0){

            if(y%400==0){
                leap = true;
            }
            else{
                 leap = false;
            }
         }
       }
       else{
         leap = false;
       }

       return leap;
    }
}
