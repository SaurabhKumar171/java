package conditional_loops.intermediate;

import java.time.YearMonth;
import java.util.Scanner;

public class twenty_five {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter month");
        int month = sc.nextInt();  

         System.out.println("enter year");
        int year =  sc.nextInt();;  // Year of the month

        YearMonth yearMonth = YearMonth.of(year, month);
        int daysInMonth = yearMonth.lengthOfMonth();

        System.out.println("Number of days in the month of August " + year + ": " + daysInMonth);


        int c=0;
        for(int i=1;i<=daysInMonth;i++){
            if(i%2==0){
                c++;
            }
        }

          System.out.println("Total days : " + c);

       }
}
