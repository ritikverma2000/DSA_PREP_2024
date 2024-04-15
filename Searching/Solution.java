package Searching;



class Solution {
    public static void main(String[] args) {

        int [] arr={1,3};
        System.out.println(findKthPositive(arr,5));
    }

    public static int findKthPositive(int[] arr, int k) {

        // 1 -- 11
        // 1 , 5, 6,8,9,10,12...

        // 1 - 10
        // 5,6,7,8

        // 1 - 20
        // 2,4,5,6,7

        int high = 0;
        int low = 0;
        for (int i = 0; i < arr.length; i++) {
            high += arr[i];
        }

        // range to check kth missing postive number will be
        // from 1 to maxCap
        int l=k;
        for (int i = 1; i <= (high * l); i++) {
            boolean check = checkpresent(i, arr);
            if (!check) {
                k--;
                if (k == 0) {
                    return i;
                }
            }

        }
        return -1;

    }

    private static Boolean checkpresent(int val, int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (val == arr[i]) {
                return true;
            }
        }
        return false;
    }
}
