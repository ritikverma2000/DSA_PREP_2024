package BigIntegerAndBigDecimal;

import java.util.HashSet;
import java.util.*;

public class BigIntegerTest {

    public static void main(String[] args) {


        StringBuilder sb1 = new StringBuilder();
        sb1.append("ABABAB");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ABAB");


       List<String> listofSubstring = new ArrayList<>();

       if(sb1.length() > sb2.length()){
           for (int k = 0; k < sb2.length(); k++) {
               String substring = sb2.substring(k);
               boolean check = checkSubstring(substring, sb1);
               if (check) {
                   listofSubstring.add(substring);

               }


           }

           if(listofSubstring.isEmpty()){
               System.out.println("");
           }
           else{
               String smallest = "";
               for (int i = 0; i <listofSubstring.size() ; i++) {
                  if(smallest.isEmpty()){
                      smallest=listofSubstring.get(i);
                  }

                   if(listofSubstring.get(i).length()<smallest.length()){
                      smallest=listofSubstring.get(i);
                  }
               }
               System.out.println(smallest);
           }

       }
       else{

           for (int k = 0; k < sb1.length(); k++) {
               String substring = sb1.substring(k);
               boolean check = checkSubstring(substring, sb2);
               if (check) {
                   listofSubstring.add(substring);

               }


           }
           if(listofSubstring.isEmpty()){
               System.out.println("");
           }
           else{
               String smallest = "";
               for (int i = 0; i <listofSubstring.size() ; i++) {
                   if(smallest.isEmpty()){
                       smallest=listofSubstring.get(i);
                   }

                   if(listofSubstring.get(i).length()<smallest.length()){
                       smallest=listofSubstring.get(i);
                   }
               }
               System.out.println(smallest);
           }

           //System.out.println(listofSubstring.isEmpty() && listofSubstring.size() >1?"":listofSubstring.get(0));

       }




    }

    private static boolean checkSubstring(String substring,StringBuilder sb) {

        StringBuilder check = new StringBuilder();
        while(check.length()<sb.length()){
            check.append(substring);

        }

        return check.toString().equalsIgnoreCase(sb.toString());


    }
}
