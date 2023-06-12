package conditional_loops.intermediate;

import java.util.Scanner;

public class distance {
        public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

          System.out.println("enter first point");
            int x1= sc.nextInt();
            int y1= sc.nextInt();

           System.out.println("enter first point");
            int x2= sc.nextInt();
            int y2= sc.nextInt();
 
            System.out.println(Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2)));
// System.out.println(Math.pow((y2-y1),2));
    }
}
