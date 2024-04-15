package Arrays;

import java.util.*;

public class ProductExceptSelf {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4};
//        1 2 6 24
//        24 24 12 4

//        System.out.println(Arrays.toString(productexceptself(nums)));
        System.out.println(Arrays.toString(productexceptselfoptimized(nums)));

    }

    private static int[] productexceptselfoptimized(int[] nums) {

        int[] prefix = new int[nums.length];
        int[] postfix = new int[nums.length];
        int left = 1;
        int right = 1;
        for (int i = 0; i < nums.length; i++) {
            prefix[i] = nums[i] * left;
            left = prefix[i];
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            postfix[i] = nums[i] * right;
            right = postfix[i];
        }

        for (int i = 0; i < nums.length; i++) {

            left = 1;
            right = 1;

            if (i == 0) {
                right = postfix[i + 1];
                nums[i] = left * right;
            } else if (i == nums.length - 1) {
                left = prefix[i - 1];
                nums[i] = left * right;
            } else {
                left = prefix[i - 1];
                right = postfix[i + 1];
                nums[i] = left * right;
            }

        }

        return nums;


    }


    private static int[] productexceptself(int[] nums) {
        List<Integer> productList = new ArrayList<Integer>();


        int leftProduct = 0;
        int rightProduct = 0;

        for (int i = 0; i < nums.length; i++) {

            if (i == 0) {
                leftProduct = 1;
                rightProduct = calrightproduct(i + 1, nums);
                productList.add(leftProduct * rightProduct);
            } else if (i == nums.length - 1) {

                rightProduct = 1;
                leftProduct = calleftproduct(i, nums);
                productList.add(leftProduct * rightProduct);

            } else {

                int left = i;
                int right = i + 1;
                leftProduct = calleftproduct(left, nums);
                rightProduct = calrightproduct(right, nums);
                productList.add(leftProduct * rightProduct);


            }


        }
        int k = 0;
        for (int i = 0; i < productList.size(); i++) {


            nums[k] = productList.get(i);
            k++;
        }

        return nums;


    }

    private static int calleftproduct(int k, int[] nums) {
        int product = 1;

        for (int i = 0; i < k; i++) {
            product = product * nums[i];
        }

        return product;


    }

    private static int calrightproduct(int k, int[] nums) {

        int product = 1;

        for (int i = k; i < nums.length; i++) {
            product = product * nums[i];
        }

        return product;

    }
}
