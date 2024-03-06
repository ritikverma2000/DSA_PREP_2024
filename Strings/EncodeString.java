package Strings;

public class EncodeString {

    public static void main(String[] args) {
        String s="coder";
        String encodedString=encodeString(s.length(), s);
    }

    private static String encodeString(int n, String s){
        String ans="";
        char[] ch = s.toCharArray();

        for (int i = 0; i <n ; i++) {
            int val;
            if(s.charAt(i)=='a'||s.charAt(i)=='e'
                    ||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                val = (int) ch[i] + 1;
            }
            else{
                val = (int) ch[i] - 1;
            }
            ans=ans+(char)val;
        }
        return ans;
    }
}
