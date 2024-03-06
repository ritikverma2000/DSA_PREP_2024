package Pattern;

public class Pattern9 {


    public static void main(String[] args) {
        /*

          *
         ***
        *****
        *****
         ***
          *

          //use concept of mirroring



         */
        int rows = 3;

        //upper half logic
        for (int i = 0; i <rows; i++) {
            //before printing stars spaces
            for (int j = 0; j <rows-i-1 ; j++) {
                System.out.print(" ");
            }
            //printing stars
            for (int j = 0; j <2*i+1; j++) {
                System.out.print("*");
            }
            //after printing stars spaces
            for (int j = 0; j <rows-i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }


        //lower half logic
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
