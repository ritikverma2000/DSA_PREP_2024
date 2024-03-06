package Pattern;

public class Pattern16 {


    public static void main(String[] args) {
        /*
        A
        B B
        C C C
        D D D D
        E E E E E
        F F F F F F


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
