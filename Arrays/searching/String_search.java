public class String_search {
    public static void main(String[] args) {
        String s="saurabh";
        char target ='k';

        for(char ch : s.toCharArray()){
            if(target==ch){
                System.out.println(true);
                break;
            }
        }

        System.out.println(false);
    }
}