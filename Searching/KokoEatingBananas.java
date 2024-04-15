package Searching;

public class KokoEatingBananas {
    public static void main(String[] args) {

        int [] piles = {30,11,23,4,20};

        int h = 5;
        System.out.println(minEatingSpeed(piles,h));
        double val = (double)4/(double) 12;
        System.out.println(Math.ceil(val));
    }


   private static int minEatingSpeed(int[] piles, int h)
    {

        int maxValue = Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            if(piles[i]>maxValue){
                maxValue=piles[i];
            }
        }

//        for(int i=1;i<=maxValue;i++){
//            int totalTime = totalTimerequired(piles,i);
//            if(totalTime<=h){
//                return i;
//            }
//
//        }
        int low = 1;
        int high= maxValue;
        int ans =0;
        while(low<high){
            int mid = low +(high-low)/2;
            int totalTime = totalTimerequired(piles,mid);
            if(totalTime<=h){
                high = mid-1;
            }
            else{
                low = mid +1;
            }


        }

        return low;


    }

    private static int totalTimerequired(int [] piles,int k){

        int totalTime = 0;

        for(int i=0;i<piles.length;i++){
            totalTime+=Math.ceil((double) piles[i]/(double) k);
        }

        return totalTime;
    }
}
