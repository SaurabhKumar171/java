package conditional_loops.intermediate;

import java.util.Scanner;

public class compound_interest {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

          System.out.println("enter value");
            float p= sc.nextFloat();
        
            System.out.println("enter rate");
            float r= sc.nextFloat();

          System.out.println("enter time");
            float t= sc.nextFloat();
   
            float ci = (float) (p*Math.pow((1+(r/100)),t));
            // (float)(v * Math.pow((1 - r / 100), t));
 
    
 
            System.out.println(ci);
    }
}

