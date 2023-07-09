import java.util.Scanner;

public class Prime_num_between_two_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        prime(a,b);

    }

    public static void prime(int a,int b) {

        boolean flag =true;

         
        for(int i=a;i<=b;i++){
             for(int j=2;j<i;i++){
               if(i%j!=0){
                  flag =false;
               }
          }

          if(flag==false){
            System.out.println(i);
          }

          flag =true;
        }
    } 
}
