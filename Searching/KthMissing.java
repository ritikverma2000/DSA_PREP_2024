package Searching;


public class KthMissing {
    public static void main(String[] args) {
        int[] arr = {2};
        int k = 1;
        int ans = findKthPositive(arr, k);
        System.out.println(ans);
    }


    private static int findKthPositive(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            int missingNumbers = arr[mid] - (mid + 1);
            if (missingNumbers < k) {
                low = mid + 1;
            } else {
                high=mid-1;
            }
        }
        return low+k;
    }



}
