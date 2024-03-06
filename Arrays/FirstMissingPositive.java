package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class FirstMissingPositive {

    public static void main(String[] args) {
        int [] nums = {3,4,-1,1};
        //
        int ans = firstMissingPositive1(nums);
        System.out.println(ans);
    }


    // Using constant space
    private static int firstMissingPositive(int[] nums) {
        HashMap<Integer,Boolean>map =new HashMap<>();
        for (int i = 1; i <= nums.length+1; i++) {
            map.put(i,false);
        }

        for (int i = 0; i < nums.length ; i++) {
            if(map.containsKey(nums[i])){
                map.put(nums[i],true );
            }
        }
        int ans =0;
        for (int i = 1; i <=map.size(); i++) {
            if(!map.get(i)){
                ans=i;
                break;
            }
        }

        return ans;

    }


    //optimized solution
    private static int firstMissingPositive1(int[] nums){
        for (int i = 0; i < nums.length; i++) {
                 int element = nums[i];
                 int chair = element-1;
                 if(element>0 && element<= nums.length){
                     if(nums[chair]!=element){
                         int temp = nums[chair];
                         nums[chair]=element;
                         nums[i]=temp;
                         i--;
                     }
                 }
        }
        for (int i = 0; i < nums.length; i++) {
            if(i+1!=nums[i]){
                return i+1;
            }
        }
        return nums.length+1;
    }


}

