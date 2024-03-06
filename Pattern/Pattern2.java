package Pattern;

public class Pattern2 {


    public static void main(String[] args) {
        /*

         *
         * *
         * * *
         * * * *
         * * * * *

         */
        int rows = 6;

        for (int i = 1; i <=rows ; i++) {
            int cols=rows;
            for (int j = 1; j <=i; j++) {
                System.out.print('*'+" ");
            }
            System.out.println();

        }



    }
}
