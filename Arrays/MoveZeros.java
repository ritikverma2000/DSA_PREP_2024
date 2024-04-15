package Arrays;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = {1, 0};
        int[] result = moveZeroes(nums);

        System.out.println(Arrays.toString(result));
    }

    static int[] moveZeroes(int[] nums) {

        if (nums.length < 1) {
            return nums;
        } else {

            int p = 0;
            int q = p + 1;
            while (q <= nums.length - 1) {
                if (nums[p] == 0 && nums[q] != 0) {
                    int temp = nums[p];
                    nums[p] = nums[q];
                    nums[q] = temp;
                    p++;
                    q++;
                    continue;
                }
                if (nums[p]!=0 && nums[q] == 0) {
                    p++;
                    q++;
                    continue;
                }
                if (nums[p]!=0 && nums[q]!=0) {
                    p++;
                    q++;
                    continue;
                }

                if (nums[p] == 0 && nums[q] == 0) {
                    q++;
                }
            }

        }
        return nums;
    }
}



