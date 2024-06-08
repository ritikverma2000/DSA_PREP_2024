package Searching;

import java.util.Arrays;

public class ShipWithinDays {
    public static void main(String[] args) {

        int[] weights = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int days = 5;
        System.out.println(shipWithinDays(weights, days));



    }


    private static int shipWithinDays(int[] weights, int days) {

        int maxCap = Arrays.stream(weights).sum();

        int minCap = Arrays.stream(weights).max().getAsInt();


        int ans = -1;
        while (minCap <= maxCap) {
            int mid = minCap + (maxCap - minCap) / 2;

            if (checkCap(weights, days, mid)) {
                ans = mid;
                maxCap = mid - 1;
            } else {
                minCap = mid + 1;
            }
        }


        return ans;


    }

    private static boolean checkCap(int[] weights, int days, int mid) {
        int threshold = 0;
        int reqDays = 1;
        for (int i = 0; i < weights.length; i++) {
            if (threshold + weights[i] <= mid) {
                threshold += weights[i];

            } else {
                threshold = weights[i];
                reqDays++;
            }
        }

        if (reqDays <= days) {
            return true;
        }
        return false;
    }
}
