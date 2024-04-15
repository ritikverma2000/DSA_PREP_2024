package Recursion;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {1,12,45,55,90};
        int target = 55;
        System.out.println("Found " + target + " at "+linearsearch(arr,target,0));

    }

    private static int linearsearch(int[] arr, int target,int k) {

       if(arr[k]== target){
           return k;
       }
       if(k<arr.length-1){
          return linearsearch(arr,target,k+1);
       }
       return -1;
    }
}
