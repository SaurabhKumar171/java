package firstjava02;

import java.util.Scanner;

public class CountOccurences {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter no.");
    long n = sc.nextLong();
    
   System.out.println("Enter no. to srch");
    int s = sc.nextInt();

    int c=0;


    while(n>0){
      long t= n%10;

      if(t==s){c++;}

      n=n/10;
    }

      System.out.println(c);
  }  
}
