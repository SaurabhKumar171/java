import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int a=sc.nextInt();

        System.out.println( (checkPrime(a))?("Prime"):("Not prime"));
    }

    public static boolean checkPrime(int a) {
        for(int i=2;i<a;i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
}
