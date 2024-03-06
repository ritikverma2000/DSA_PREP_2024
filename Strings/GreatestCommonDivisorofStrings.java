package Strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GreatestCommonDivisorofStrings {

    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABABABAB","ABAB"));
    }


    public static String gcdOfStrings(String str1, String str2) {

        StringBuilder sb1 = new StringBuilder();
        sb1.append(str1);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        List<String> listofSubstring = new ArrayList<>();
        String smallest = "";
        if (sb1.length() > sb2.length()) {
            for (int k = 0; k < sb2.length(); k++) {
                String substring = sb2.substring(k);
                boolean check = checkSubstring(substring, sb1);
                if (check) {
                    listofSubstring.add(substring);

                }


            }

            if (listofSubstring.isEmpty()) {
                return "";
            } else {

                for (int i = 0; i < listofSubstring.size(); i++) {

                    boolean check1 = checkSubstring(listofSubstring.get(i), sb1);
                    boolean check2 = checkSubstring(listofSubstring.get(i),sb2);
                    if(check1 && check2){
                        if((smallest!="" || smallest.equals("")) && smallest.length()<listofSubstring.get(i).length()) {
                            smallest = listofSubstring.get(i);
                        }



                    }
                }

            }

        } else {

            for (int k = 0; k < sb1.length(); k++) {
                String substring = sb1.substring(k);
                boolean check = checkSubstring(substring, sb2);
                if (check) {
                    listofSubstring.add(substring);

                }


            }
            if (listofSubstring.isEmpty()) {
                return "";
            } else {

                for (int i = 0; i < listofSubstring.size(); i++) {

                    boolean check1 = checkSubstring(listofSubstring.get(i), sb1);
                    boolean check2 = checkSubstring(listofSubstring.get(i),sb2);
                    if(check1 && check2){
                        if((smallest!="" || smallest.equals("")) && smallest.length()<listofSubstring.get(i).length()) {
                            smallest = listofSubstring.get(i);
                        }



                    }
                }


            }

        }


        return smallest;


    }

    private static boolean checkSubstring(String substring, StringBuilder sb) {

        StringBuilder check = new StringBuilder();
        while (check.length() < sb.length()) {
            check.append(substring);

        }

        return check.toString().equalsIgnoreCase(sb.toString());


    }
}

