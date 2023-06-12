package conditional_loops.intermediate;

import java.util.Scanner;

public class lcm {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1= sc.nextInt();
        int n2= sc.nextInt();
      
        System.out.println(factor( n1 , n2));
        
    }

    public static int factor(int n1 ,int n2){
        
       int lcm= (n1>n2)?n1:n2;
      while(true){
            if((lcm%n1 ==0) && (lcm%n2 ==0)){
               System.out.println("lcm is "+lcm);
               break;
            }
            lcm++;
      }


        return lcm;
    }
}
