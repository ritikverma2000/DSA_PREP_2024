package Pattern;

public class Pattern8 {


    public static void main(String[] args) {
        /*

         *****
          ***
           *

           no. of stars = 2*n-(2*i+1)


         */
        int rows = 6;

        for (int i = 0; i <rows; i++) {
            //before printing stars spaces
            for (int j = 0; j <i ; j++) {
                System.out.print(" ");
            }
            //printing stars
            for (int j = 0; j <2*rows-(2*i+1); j++) {
                System.out.print("*");
            }
            //after printing stars spaces
            for (int j = 0; j <i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }



    }
}
