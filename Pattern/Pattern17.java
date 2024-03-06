package Pattern;

public class Pattern17 {


    public static void main(String[] args) {
        /*
        A
       ABA
      ABCBA


         */

        int rows = 6;
        char ch ='A';
        for (int i = 0; i < rows; i++) {
            char ch1 = (char)((int)ch+i);
            for (int j = 0; j <=i; j++) {
                System.out.print(ch1+" ");

            }
            System.out.println();
        }






    }
}
