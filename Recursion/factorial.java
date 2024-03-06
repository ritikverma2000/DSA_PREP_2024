package Recursion;

public class factorial {
    public static void main(String[] args) {
        int n = 4;
        int ans = fact(n);
        System.out.println(ans);
    }

    private static int fact(int n) {

        if( n== 0 || n==1){
            return 1;
        }


        return n*fact(n-1);

    }


}
