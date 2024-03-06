package Strings;

public class ReverseWords {
    public static void main(String[] args) {
        String s="a good   example";
       String ans =  reverseWords(s);
        System.out.println(ans);
    }

    private static String reverseWords(String s){
        s=s.trim();
        StringBuilder word= new StringBuilder();
        String ans= "";
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)!=' '){
                word.append(s.charAt(i));
            }
            if (s.charAt(i)==' '&& !word.isEmpty()){
                ans=" "+word+ans;
                word.delete(0,word.length());

            }
        }
        if(!word.isEmpty()){
            ans=word+ans;
        }
        return ans;
    }


}
