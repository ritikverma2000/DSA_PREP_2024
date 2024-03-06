package StringBuffer;

import java.util.Random;


class RandomString {

   static String generateRandomString(int size){
       StringBuffer sb = new StringBuffer();
       Random random = new Random();
       for (int i = 0; i < size ; i++) {
           int randomCharValue = 97 + (int)(random.nextFloat()*26);
           sb.append((char)randomCharValue);
       }


       return sb.toString();

    }

}
