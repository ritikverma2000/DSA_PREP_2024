package Searching;

public class BinarySearch {

    public static void main(String[] args) {
        int [] nums = {5,9,14,15,16,22,23,24,28,29,34};

        int low = 0;
        int high = nums.length-1;
        int target = 16;
         while (low <high){
             int mid = (low+high)/2;

             if(nums[mid]>target){
                 high = mid -1;
             }
             if(nums[mid]<target){
                 low = mid +1;

             }
             if(nums[mid]==target){
                 System.out.println(mid);
                 break;
             }
         }
        System.out.println(target+" not found in array");
    }
}
