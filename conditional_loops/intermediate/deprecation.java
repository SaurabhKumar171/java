package conditional_loops.intermediate;

import java.util.Scanner;

public class deprecation {
       public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

          System.out.println("enter value");
            float v= sc.nextFloat();
        
            System.out.println("enter rate");
            float r= sc.nextFloat();

          System.out.println("enter time");
            float t= sc.nextFloat();
   
            float D = (float)(v * Math.pow((1 - (r / 100)), t));
            // (float)(v * Math.pow((1 - r / 100), t));
 
    
 
            System.out.println(D);
// System.out.println(Math.pow((y2-y1),2));
    }

    
}
