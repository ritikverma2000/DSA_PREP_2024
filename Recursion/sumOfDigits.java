package Recursion;

public class sumOfDigits {
    public static void main(String[] args) {

        System.out.println(sumofdigits(995));
    }

    private static int sumofdigits(int n) {

        if(n==0){
            return n;
        }
        return n%10+sumofdigits(n/10);


    }
}
