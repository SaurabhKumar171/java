package firstjava02;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

    System.out.println("Enter no.");
    long n = sc.nextLong();

    long v=0;

    while(n>0){
      v=(v*10)+ n%10;
      n=n/10;
    }

      System.out.println(v);
    }
}
