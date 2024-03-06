package Arrays;


import java.util.*;

public class CanPlaceFlowers {

    public static void main(String[] args) {

        int[] flowerbed = {0,0,1,0,0};
        System.out.println(canPlaceFlowers(flowerbed,1));

    }



    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

        int left = 1;
        int right = left+1;

        List<Integer> newflowerbed = new ArrayList<>();
       newflowerbed.add(0);
        for (int val:flowerbed) {
            newflowerbed.add(val);
        }
        newflowerbed.add(0);
        while(left<right && right < newflowerbed.size()){

            if(newflowerbed.get(left-1)==0 && newflowerbed.get(right)==0 && n>=0 && newflowerbed.get(left)!=1){
                newflowerbed.set(left,1);
                left++;
                right++;
                n--;
                continue;
            }
            left++;
            right++;

        }

        if(n==0){
            return true;
        }
        return false;

    }

}

