package Recursion;

public class checkArraySorted {

    public static void main(String[] args) {
        int[] arr = {1,2,3,10,11,-1};
        System.out.println(checkArray(arr, 0, 1));

        System.out.println(checkSortedOrNot(arr,0));
    }

    static boolean checkArray(int[] arr, int p, int q) {

        if (q == arr.length) {
            return true;
        }

        if (arr[p] > arr[q]) {
            return false;
        }

        return checkArray(arr, p + 1, q + 1);
    }


    static boolean checkSortedOrNot(int [] nums,int index){
        if(index==nums.length-1){
            return true;
        }
        return nums[index]>nums[index+1]?false: checkSortedOrNot(nums,index+1);
    }

}
