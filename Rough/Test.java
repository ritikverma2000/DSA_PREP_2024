package Rough;

class Test {

    public static void main(String[] args) {

        String s = "?3:12";

        System.out.println(findLatestTime(s));

    }

    private static String findLatestTime(String s) {
        StringBuilder sb = new StringBuilder();

        sb.append(s);

        for (int i = 0; i <sb.length() ; i++) {
            if(sb.charAt(i)=='?' && i==0){
                sb.setCharAt(i,'1');
            }
            if(sb.charAt(i)=='?' && sb.charAt(i-1)=='1'){
                sb.setCharAt(i,'1');
            }
            if(sb.charAt(i)=='?' && sb.charAt(i-1)=='0'){
                sb.setCharAt(i,'9');
            }

            if(sb.charAt(i)=='?' && sb.charAt(i-1)==':'){
                sb.setCharAt(i,'5');
            }
            if(s.charAt(i)=='?' && i==sb.length()-1){
                sb.setCharAt(i,'9');
            }

        }


        return sb.toString();

    }

}