package Pattern;

public class Pattern15 {


    public static void main(String[] args) {
        /*
        A B C D E F
        A B C D E
        A B C D
        A B C
        A B
        A


         */

        int rows = 6;
        for (int i = 0; i < rows; i++) {
            char ch ='A';
            for (int j = 0; j <rows-i ; j++) {
                System.out.print(ch+" ");
                ch = (char)((int)ch+1);
            }
            System.out.println();
        }






    }
}
