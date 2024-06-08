package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubSeq {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(findallsubseq("",str));
        System.out.println(findallsubseq2("",str));
        System.out.println(findallsubseq3("",str));
        int[] arr = {1,2,3};
        System.out.println(subsetitr(arr));
        List<Integer> p = new ArrayList<>();
        List<Integer> up = new ArrayList<>();
        up.add(1);
        up.add(2);
        up.add(3);
        List<List<Integer>> outer =new ArrayList<>();

        System.out.println(subsetrec(outer,p,up));
    }




    private static String findallsubseq(String p, String up) {

        if(up.isEmpty()){
            return p + " ";
        }

        return findallsubseq(p+up.charAt(0),up.substring(1)) + findallsubseq(p,up.substring(1));
    }

    private static List<String> findallsubseq2(String p, String up) {

        if(up.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

       List<String> left = findallsubseq2(p+up.charAt(0),up.substring(1));

        List<String> right= findallsubseq2(p,up.substring(1));


        left.addAll(right);
        return left;
    }


    private static List<String> findallsubseq3(String p, String up) {

        if(up.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        List<String> left = findallsubseq3(p+up.charAt(0),up.substring(1));

        List<String> middle = findallsubseq3(p+(up.charAt(0)+0),up.substring(1));

        List<String> right= findallsubseq3(p,up.substring(1));

        left.addAll(middle);
        left.addAll(right);
        return left;
    }

    //iterative approach subset --> [1,2,3]
    private static List<List<Integer>> subsetitr(int[]arr){
        List<List<Integer>> outer =  new ArrayList<>();
        //add empty arraylist in the outer starting point.
        outer.add(new ArrayList<>());
        for(int num:arr){
            int n = outer.size();
            for(int i=0;i<n;i++){
                //create copy of ith list
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }
        return outer;
    }


    //subset recursion
    private static List<List<Integer>>  subsetrec(List<List<Integer>> outer,List<Integer>p,List<Integer> up){

        //base
        if(up.isEmpty()){
            outer.add(p);
            return outer;
        }
        //either we will take element
        p.add(up.get(0));
       subsetrec(outer,p,up.subList(1, up.size()));
        //or will ignore the element
       subsetrec(outer,p,up.subList(1,up.size()));



        return outer;

    }

}
