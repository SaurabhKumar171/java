package conditional_loops.intermediate;

import java.util.Scanner;

public class reverse_string {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter string");
    String s = sc.nextLine();

    String v="";

    for(int i=s.length()-1;i>=0;i--){
       v +=s.charAt(i);
    }

    System.out.println(v);
    }


}
