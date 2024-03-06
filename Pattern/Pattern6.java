package Pattern;

public class Pattern6 {


    public static void main(String[] args) {
        /*

         1 2 3 4 5 6
         1 2 3 4 5
         1 2 3 4
         1 2 3
         1 2
         1

         */
        int rows = 3;

        for (int i = rows; i >=1 ; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();

        }



    }
}
