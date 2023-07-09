import java.util.Scanner;

public class Pyhtagorean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(checkPyhtagorean(a,b,c)){
            System.out.println("pythagorean");
        }

        else{
          System.out.println("not pythagorean");

        }

    }

    public static boolean checkPyhtagorean(int a, int b,int c){
         if(((a*a + b*b) ==c*c) || ((a*a + c*c) ==b*b) || ((c*c + b*b) ==a*a)){
            return true;
         }

         return false;
    }

}

