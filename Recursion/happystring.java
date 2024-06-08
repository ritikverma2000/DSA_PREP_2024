package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class happystring {
    public static void main(String[] args) {
        String str = "abccccccc";
        System.out.println(findallsubseq("",str));

    }

    private static String findallsubseq(String p, String up) {

        if(up.isEmpty()){
            return p + " ";
        }

        if(up.startsWith("cc") && !up.startsWith("ccc")){
            return findallsubseq(p,up.substring(2));
        }
       return findallsubseq(p+up.charAt(0),up.substring(1));
    }

}
