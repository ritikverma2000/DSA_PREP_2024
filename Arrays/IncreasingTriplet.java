package Arrays;

public class IncreasingTriplet {


    public static void main(String[] args) {

        int[] nums = {1,5,0,4,1,3};

        System.out.println(findTriplet(nums));

    }

    private static boolean findTriplet(int[] nums) {

     int n1 = Integer.MAX_VALUE;
     int n2 = Integer.MAX_VALUE;
     int n3 = 0;

        for (int i = 0; i < nums.length ; i++) {

            if(nums[i]<n1){
                n1=nums[i];
            }
            if(nums[i]<n2 && nums[i]>n1){
                n2=nums[i];
            }
            if(nums[i]>n1 && nums[i]>n2){
                n3=nums[i];
                return true;
            }

        }
        return false;

    }
}
