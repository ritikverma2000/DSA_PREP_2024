package Pattern;

public class Pattern10 {


    public static void main(String[] args) {
        /*

         *
         * *
         * * *
         * *
         *

          //use concept of mirroring



         */
        int rows = 6;

        //upper half logic
        for (int i = 0; i <rows; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        //lower half logic

        for (int i = 1; i <rows; i++) {
            for (int j = 0; j < rows-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
