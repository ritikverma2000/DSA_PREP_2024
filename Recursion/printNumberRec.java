package Recursion;

public class printNumberRec {
    public static void main(String[] args) {


        printNumberRec(5);

    }

    private static void printNumberRec(int n) {

        if(n==0){
            return;
        }

        System.out.print(n+" "+" : ");
        printNumberRec(n-1);
        System.out.print(n+" "+" : ");

    }
}
