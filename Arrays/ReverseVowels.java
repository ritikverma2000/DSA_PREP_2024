package Arrays;

import java.util.Stack;

public class ReverseVowels {
    public static void main(String[] args) {
        String s = "leetcode";


//        System.out.println(reverseVowelString(s));
        System.out.println(optimizedreverseVowelString(s));
    }

    static String optimizedreverseVowelString(String s) {


        int p = 0;
        int q = s.length() - 1;

        StringBuilder sb = new StringBuilder();
        sb.append(s);

        while (p < q) {

            if ((s.charAt(p) == 'a' || s.charAt(p) == 'A' || s.charAt(p) == 'e' || s.charAt(p) == 'E' || s.charAt(p) == 'i' ||
                    s.charAt(p) == 'I' || s.charAt(p) == 'O' || s.charAt(p) == 'o' || s.charAt(p) == 'u' || s.charAt(p) == 'U') && (
                    s.charAt(q) == 'a' || s.charAt(q) == 'A' || s.charAt(q) == 'e' || s.charAt(q) == 'E' || s.charAt(q) == 'i' ||
                            s.charAt(q) == 'I' || s.charAt(q) == 'O' || s.charAt(q) == 'o' || s.charAt(q) == 'u' || s.charAt(q) == 'U')
            ) {

                char temp = s.charAt(p);
                sb.setCharAt(p, s.charAt(q));
                sb.setCharAt(q, temp);
                p++;
                q--;


            } else if ((s.charAt(p) == 'a' || s.charAt(p) == 'A' || s.charAt(p) == 'e' || s.charAt(p) == 'E' || s.charAt(p) == 'i' ||
                    s.charAt(p) == 'I' || s.charAt(p) == 'O' || s.charAt(p) == 'o' || s.charAt(p) == 'u' || s.charAt(p) == 'U')) {
                q--;

            } else if (s.charAt(q) == 'a' || s.charAt(q) == 'A' || s.charAt(q) == 'e' || s.charAt(q) == 'E' || s.charAt(q) == 'i' ||
                    s.charAt(q) == 'I' || s.charAt(q) == 'O' || s.charAt(q) == 'o' || s.charAt(q) == 'u' || s.charAt(q) == 'U') {

                p++;
            } else {
                p++;
                q--;


            }


        }

        return sb.toString();

    }


    static String reverseVowelString(String s) {

        String result = "";
        Stack<Character> vowels = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A' || s.charAt(i) == 'e' || s.charAt(i) == 'E' || s.charAt(i) == 'i' ||
                    s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'U') {
                vowels.push(s.charAt(i));
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A' || s.charAt(i) == 'e' || s.charAt(i) == 'E' || s.charAt(i) == 'i' ||
                    s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'U') {
                result = result + vowels.pop();
            } else {
                result = result + s.charAt(i);
            }

        }

        return result;

    }
}
