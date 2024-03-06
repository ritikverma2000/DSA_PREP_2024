package Arrays;


import java.util.*;

public class StringCompress {
    public static void main(String[] args) {
        char[] charArray = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};

//        //we need to modify the same array
//        for (int i = 0; i <charArray.length ; i++) {
//
//            int countCurrentChar = 1;
//            char ch = charArray[i];
//            int k = i;
//            while(ch==charArray[k+1]){
//                countCurrentChar++;
//                k++;
//            }
//            charArray[k]= countCurrentChar;
//
//
//        }

        Map<Character, Integer> countChar = new HashMap<>();

        for (int i = 0; i < charArray.length; i++) {

            if (countChar.containsKey(charArray[i])) {
                countChar.put(charArray[i], countChar.get(charArray[i]) + 1);
            }

            if (!countChar.containsKey(charArray[i])) {
                countChar.put(charArray[i], 1);
            }

        }

        List<Object> charString = new ArrayList<>();

        for (Map.Entry<Character, Integer> map : countChar.entrySet()) {

            charString.add(map.getKey());

            int val = map.getValue();


            if (val < 10 && val != 1) {
                charString.add(val);
            }
            if (val > 10) {

                while (val > 0) {
                    int ch = val % 10;
                    charString.add(ch);
                    val = val / 10;
                }


            }


        }
//        char[] charArray1 = new char[charString.size()];
//        for (int i = 0; i <charString.size(); i++) {
//            charArray1[i] = (char) charString.get(i);
//        }

        System.out.println(charString);


    }
}
