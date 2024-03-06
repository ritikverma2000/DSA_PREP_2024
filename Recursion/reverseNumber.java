package Recursion;

public class reverseNumber {

    static int val = 0;

    public static void main(String[] args) {

//        System.out.println(reversenumber(54321, ""));
//        reversenumber1(102);
//        System.out.println(val);

        System.out.println(reversenumber2(54321,0));

        countZeros (10001, 0);


    }

    private static String reversenumber(int n, String ans) {

        if (n < 10) {
            return ans + n;
        }

        return reversenumber(n / 10, ans + n % 10);
    }

    private static void reversenumber1(int n) {

        if (n < 10) {
            val = val * 10 + n % 10;
            return;
        }

        val = val * 10 + n % 10;

        reversenumber1(n / 10);
    }

    private static int reversenumber2(int n, int ans) {

        if (n < 10) {
            //How to find digits of a number
            int digit = (int) Math.log10(n);

            return ans + n * (int) Math.pow(10, digit);

        }
        int digit = (int) Math.log10(n);

        ans = ans + n % 10 * (int) Math.pow(10, digit);

        return reversenumber2(n / 10, ans);
    }

    private static int countZeros (int n, int count){

        if(n<10){
            return count;
        }
        if(n==0){
            count++;
        }

       return countZeros(n/10,count);



    }

}
