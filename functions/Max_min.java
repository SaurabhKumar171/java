import java.util.*;

class Max_min{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();


        System.out.println("max is : "+max(a,b,c));
        System.out.println("min is : "+min(a,b,c));

    }


        public static int max(int a,int b,int c) {
       
            int res=(a>b)?( (a>c)?( a):(c)):((b>c)?( b):( c));

            return res;

    }

        public static int min(int a,int b,int c) {
       
            int res=(a<b)?( (a<c)?( a):(c)):((b<c)?( b):( c));

            return res;

    }
}