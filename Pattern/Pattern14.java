package Pattern;

public class Pattern14 {


    public static void main(String[] args) {
        /*
        A
        A  B
        A  B  C
        A  B  C  D
        A  B  C  D E


         */

        int rows = 6;
        for (int i = 0; i < rows; i++) {
            char ch ='A';
            for (int j = 0; j <=i ; j++) {
                System.out.print(ch+" ");
                ch = (char)((int)ch+1);
            }
            System.out.println();
        }






    }
}
