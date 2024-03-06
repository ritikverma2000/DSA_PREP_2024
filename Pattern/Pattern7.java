package Pattern;

public class Pattern7 {


    public static void main(String[] args) {
        /*

       _ _ * _ _
       _ * * * _
       * * * * *

         */
        int rows = 6;

        for (int i = 0; i <rows; i++) {
            //before printing stars spaces
            for (int j = 0; j <rows-i-1 ; j++) {
                System.out.print(" ");
            }
            //printing stars
            for (int j = 0; j <2*i+1 ; j++) {
                System.out.print("*");
            }
            //after printing stars spaces
            for (int j = 0; j <rows-i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }



    }
}
