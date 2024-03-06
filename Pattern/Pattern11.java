package Pattern;

public class Pattern11 {


    public static void main(String[] args) {
        /*

        1
        01
        101

          //use concept of mirroring



         */

        //incomplete
        int rows = 6;
        for (int i = 0; i <rows; i++) {
            if(i==0){
                System.out.print(i+1);
            }
            for (int j = 0; j <i ; j++) {
                if((i+1)%2==0){
                    System.out.print("0"+i);
                }
                if((i+1)%2!=0){
                    System.out.print("1"+i);
                }

            }
            System.out.println();
        }





    }
}
