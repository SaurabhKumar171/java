package conditional_loops.intermediate;

import java.util.Scanner;

public class sum_of_n_numbrs {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

          System.out.println("enter num");
            float n= sc.nextFloat();

        System.out.println(n*((n+1)/2));
    }
}
