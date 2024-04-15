package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DistributeElementsIntoTwoArrays {

    public static void main(String[] args) {

        //leetcode contest question

        int[] nums = {5, 4, 3, 8};

        int[] result = resultArray(nums);

        System.out.println(Arrays.toString(result));


    }

    private static int[] resultArray(int[] nums) {

        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        int[] result = new int[nums.length];

        arr1.add(nums[0]);
        arr2.add(nums[1]);
        int k = 0;

        for (int i = 2; i < nums.length; i++) {

            if (arr1.get(arr1.size() - 1) > arr2.get(arr2.size() - 1)) {
                arr1.add(nums[i]);
                k++;
            } else {
                arr2.add(nums[i]);
            }

        }

        int l = 0;
        int i = 0;
        while (i < arr1.size()) {
            result[l] = arr1.get(i);
            l++;
            i++;
        }
        i = 0;
        while (i < arr2.size()) {
            result[l] = arr2.get(i);
            l++;
            i++;
        }


        return result;

    }


}
