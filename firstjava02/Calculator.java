package firstjava02;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);



    while(true){
          
      System.out.println("Enter operator");
      char op = sc.next().trim().charAt(0);

      if(op=='+' || op=='-' ||op=='*' ||op=='%' ||op=='/'){
        System.out.println("Enter two no.");
        long n1 = sc.nextLong();
        long n2 = sc.nextLong();

        if(op=='+'){
            System.out.println("Addition is "+(n1+n2));
        }else if(op=='-'){
            System.out.println("Subtraction is "+(n1-n2));
        }else if(op=='*'){
            System.out.println("Multiplication is "+(n1*n2));
        }else if(op=='/'){
            if (n2 != 0)
            System.out.println("Division is "+(n1/n2));
        }else if(op=='%'){
            System.out.println("Mod is "+(n1%n2));
        }
      }

      else if(op =='x' || op=='X'){
        System.out.println("Exiting...");
        break;
      }
      else{
        System.out.println("Invalid operator");
      }
  


    }

    }
}
