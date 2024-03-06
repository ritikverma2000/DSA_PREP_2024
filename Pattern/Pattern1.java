package Pattern;

public class Pattern1 {
    public static void main(String[] args) {
        /*

        * * * *
        * * * *
        * * * *
        * * * *

       */
        int rows = 3;

        for (int i = 1; i <=rows ; i++) {
            int cols=rows;
            for (int j = 1; j <=cols; j++) {
                System.out.print('*'+" ");
            }
            System.out.println();

        }



    }
}
