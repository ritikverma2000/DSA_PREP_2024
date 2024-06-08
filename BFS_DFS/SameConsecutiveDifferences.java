package BFS_DFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SameConsecutiveDifferences {

    public static void main(String[] args) {

        int n = 3, k = 0;

        List<Integer> numbers=new ArrayList<>();

        for(int i=1;i<=9;i++){

            dfs(n,k,i,0,i,numbers);
        }
        System.out.println(Arrays.toString(numbers.toArray()));

    }

    private static void dfs(int n, int k, int cur, int i, int prev, List<Integer> numbers) {
        //base condition
        if(i==n-1){
            numbers.add(cur);
            return;
        }
        int next = prev + k;
        if(next<10){
            dfs(n,k,(cur*10)+next,i+1,next,numbers);
        }
        next = prev -k;
        //k != 0 to handle duplicates
        if(k!=0 && next >=0){
            dfs(n,k,(cur*10)+next,i+1,next,numbers);
        }

    }
}
