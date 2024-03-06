package StringBuffer;

import java.text.DecimalFormat;

public class StringBufferPractice {


    // String buffer is mutable whereas String is immutable
    // Edit the object without making changes into the object
    // More efficient
    // Thread safe ( small unit of processes ) ( when two thread are working on same data then string buffer will tell thread (t2) to not work till I t1 is working)
    //  Its slower compared to StringBuilder since SB is not thread safe.
    public static void main(String[] args) {

        // Constructs a string buffer with no characters in it and an initial capacity of 16 characters.
        StringBuffer sb = new StringBuffer();
        sb.append("ritik ");
        sb.append("verma");
        sb.insert(0, "My name is ");
        sb.reverse();
        char ch = 'A';
//        System.out.println((int)ch);


        String name = RandomString.generateRandomString(5);
        System.out.println(name);

        //Remove whitespaces from String
        String sentence = " Hi     my name is Ritik Ver   ma I am 24 yrs   o l d";
        System.out.println(sentence.replaceAll("\\s", ""));

        //Rounding off
        DecimalFormat df = new DecimalFormat("00.0000");
        System.out.println(df.format(7.29));


        //Constructs a string buffer initialized to the contents of the specified string.
        // The initial capacity of the string buffer is 16 plus the length of the string argument.
        StringBuffer sb2 = new StringBuffer("Ritik Verma");

//        System.out.println(sb2.length());

        //Constructs a string buffer with no characters in it and the specified initial capacity.
        //Params:
        //capacity – the initial capacity.
        //Throws:
        //NegativeArraySizeException – if the capacity argument is less than 0.
        StringBuffer sb3 = new StringBuffer(20);
//        System.out.println(sb3.length());


    }
}
