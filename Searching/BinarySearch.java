package Searching;

import java.util.ArrayList;
import java.util.List;

public class BinarySearch {

    public static void main(String[] args) {
//        int[] nums = {5, 9, 14, 15, 16, 22, 23, 24, 28, 29, 34};
//
//        int low = 0;
//        int high = nums.length - 1;
//        int target = 16;
//        while (low < high) {
//            int mid = (low + high) / 2;
//
//            if (nums[mid] > target) {
//                high = mid - 1;
//            }
//            if (nums[mid] < target) {
//                low = mid + 1;
//
//            }
//            if (nums[mid] == target) {
//                System.out.println(mid);
//                break;
//            }
//        }
//        System.out.println(target + " not found in array");
//
//
//        //lower bound
//        System.out.println(lowerbound(nums, 5, 0, nums.length - 1));
//
//        //floor and ciel in an array floor is the largest no. in array <=target and ciel is the smallest no. in array greater than equal to x
//
//        int[] nums2 = {10, 20, 30, 40, 50};
//        int target2 = 51;
//        System.out.println(findfloorandciel(nums2, target2));
//
//
//        //first and last occurance of index of target
//
//        int[] nums3 = {5, 7, 7, 8, 8, 10};
//        int target3 = 6;
//        System.out.println(firstAndLastOccurance(nums3, target3));

        //search in rotated sorted array
//        int [] nums4 = {4,5,6,7,0,1,2};
//        int target4=6;
//        //FYI this same code will work for duplicate sorted rotated array as well.
//        System.out.println(searchInRotatedArray(nums4,target4));
//
//        //find minimum in rotated sorted array
//        int [] nums5 = {4,5,6,7,0,1,2};
//        System.out.println(findmin(nums5));


        //find single element in sorted array
        int[] nums6 = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        System.out.println(findsingle(nums6));

        //find sqrt of a number using binary search
//        int n = 28;
//        int low =1;
//        int high =n;
//        int ans = 1;
//        while(low<=high){
//            int mid = low + (high-low)/2;
//            if(mid*mid<=n){
//                ans = mid;
//                low = mid +1;
//            }
//            if(mid*mid>n){
//                high=mid-1;
//            }
//
//        }

        //find nth root of a number
        int m = 27, n = 3;
        int low = 1;
        int high = m;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (Math.pow(mid, n) == m) {
                ans = mid;
                break;
            } else if (Math.pow(mid, n) < m) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println(ans);

        //minimum-number-of-days-to-make-m-bouquets/
        int[] bloomDay = {1000000000, 1000000000};
        int bouquets = 1;
        int flowerset = 1;
        int result = minDays(bloomDay, bouquets, flowerset);
        System.out.println(result);


        int [] nums={21212,10101,12121};
        smallestDivisor(nums, 1000000);


    }

    private static int smallestDivisor(int[] nums, int threshold) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        min = 1;

        int ans = -1;
        while (min <= max) {
            int mid = (min + max) / 2;
            boolean check = divisorCheck(nums, mid, threshold);
            if (check) {
                ans = mid;
                max = mid - 1;

            } else {
                min = mid + 1;
            }
        }

        return ans;


    }

    private static Boolean divisorCheck(int[] nums, int mid, int threshold) {
        int totalThreshold = 0;
        for (int i = 0; i < nums.length; i++) {
            totalThreshold += Math.ceil((double) nums[i] / (double) mid);
        }
        if (totalThreshold <= threshold) {
            return true;
        }
        return false;

    }

    private static int minDays(int[] bloomDay, int m, int k) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] < min) {
                min = bloomDay[i];
            }
            if (bloomDay[i] > max) {
                max = bloomDay[i];
            }
        }

        if (m * k > bloomDay.length) {
            return -1;
        }

//        for(int i=min;i<=max;i++){
//            boolean check = possibleDay(i,m,k,bloomDay);
//            if(check){
//                return i;
//            }
//        }

        int ans = -1;
        while (min <= max) {
            int mid = (min + max) / 2;
            boolean check = possibleDay(mid, m, k, bloomDay);
            if (check) {
                ans = mid;
                max = mid - 1;
            } else {
                min = mid + 1;
            }


        }

        return ans;


    }

    private static Boolean possibleDay(int i, int m, int k, int[] bloomDay) {
        int counter = 0;
        int countbloom = 0;

        for (int j = 0; j < bloomDay.length; j++) {
            if (bloomDay[j] <= i) {
                counter++;
            } else {
                countbloom += (counter / k);
                counter = 0;
            }
        }
        countbloom += (counter / k);
        if (countbloom >= m) {
            return true;
        }
        return false;

    }


    private static int findsingle(int[] nums6) {

        //edge cases
        //handling edge cases
        if (nums6.length == 1) {
            return nums6[0];
        }
        if (nums6[0] != nums6[1]) {
            return nums6[0];
        }
        if (nums6[nums6.length - 1] != nums6[nums6.length - 2]) {
            return nums6[nums6.length - 1];
        } else {
            int low = 1;
            int high = nums6.length - 2;

            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (nums6[mid] != nums6[mid - 1] && nums6[mid] != nums6[mid + 1]) {
                    return nums6[mid];
                }
                //eliminate the left half
                if ((mid % 2 == 0 && nums6[mid] == nums6[mid + 1]) ||
                        (mid % 2 == 1 && nums6[mid] == nums6[mid - 1])) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }

            }

        }

        return -1;


    }


    private static int findmin(int[] nums5) {

        int low = 0, high = nums5.length - 1;
        int ans = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums5[low] <= nums5[mid]) {
                ans = Math.min(ans, nums5[low]);
                low = mid + 1;
            } else {
                high = mid - 1;
                ans = Math.min(ans, nums5[mid]);
            }

        }
        return ans;

    }

    private static int searchInRotatedArray(int[] nums4, int target4) {

        int low = 0, high = nums4.length - 1, pivot = 0;

        //firstly find the pivot index
        for (int i = 0; i < nums4.length - 1; i++) {
            if (nums4[i] > nums4[i + 1]) {
                pivot = i + 1;
            }
        }
        int high2 = pivot;
        //firstly searching for target before pivot index
        while (low <= high2) {
            int mid = low + (high2 - low) / 2;
            if (nums4[mid] == target4) {
                return mid;
            }
            if (nums4[mid] > target4) {
                high2 = mid - 1;
            }
            if (nums4[mid] < target4) {
                low = mid + 1;
            }


        }

        //searching after pivot index
        while (pivot <= high) {
            int mid = pivot + (high - pivot) / 2;
            if (nums4[mid] == target4) {
                return mid;
            }
            if (nums4[mid] > target4) {
                high = mid - 1;
            }
            if (nums4[mid] < target4) {
                pivot = mid + 1;
            }
        }

        return -1;


    }

    private static int lowerbound(int[] arr, int target, int low, int high) {
        int lowerBound = Integer.MAX_VALUE;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] >= target) {
                if (lowerBound > arr[mid]) {
                    lowerBound = arr[mid];
                }
                high = mid - 1;
            }

            if (arr[mid] < target) {
                low = mid + 1;
            }

        }
        return lowerBound;

    }

    private static List<Integer> findfloorandciel(int[] nums, int target) {

        int ciel = -1, floor = -1, low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] <= target) {
                floor = nums[mid];
                low = mid + 1;
            }
            if (nums[mid] >= target) {
                ciel = nums[mid];
                high = mid - 1;
            }
        }

        List<Integer> ansList = new ArrayList<>();
        ansList.add(floor);
        ansList.add(ciel);

        return ansList;

    }

    private static List<Integer> firstAndLastOccurance(int[] nums, int target) {

        int firstoccur = -1, lastoccur = -1, low = 0, high = nums.length - 1;

        //finding first occurance only
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                firstoccur = mid;
                high = mid - 1;
            }

            if (nums[mid] < target) {
                low = mid + 1;
            }
            if (nums[mid] > target) {
                high = mid - 1;
            }


        }

        low = 0;
        high = nums.length - 1;

        //finding last occurance only

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                lastoccur = mid;
                low = mid + 1;
            }

            if (nums[mid] < target) {
                low = mid + 1;
            }
            if (nums[mid] > target) {
                high = mid - 1;
            }


        }


        List<Integer> ansList = new ArrayList<>();
        ansList.add(firstoccur);
        ansList.add(lastoccur);

        return ansList;

    }


}
