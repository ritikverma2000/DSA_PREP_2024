package Pattern;

public class Pattern13 {


    public static void main(String[] args) {
        /*
        1
        2  3
        4  5  6
        7  8  9  10
        11  12  13  14  15





         */

        int rows = 3;
        int k=1;
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j <=i ; j++) {
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }






    }
}
