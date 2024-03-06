package Oops;

import java.util.Arrays;

public class Test {

    //class is a named group of property and functions
    // by convention class name starts with capital letter
    // create a own datatype is class
    // class is template of object object is instance of class
    //class is logical construct object is physical entity

    //To use the object we need to
    //intialize the object using new variable
    public static void main(String[] args) {
        //dynamically allocates memory and returns reference to it
        Student s[] = new Student[5];
//        s[0]=new Student();
//
//
//         s[0].name="Kunal";
//        System.out.println(Arrays.toString(s[0]));

        Student ritik = new Student(1,"Ritik",99.8f,true);
//        ritik.check = true;
        System.out.println(ritik.rno);
        System.out.println(ritik.name);
        System.out.println(ritik.marks);
        System.out.println(ritik.check);



    }


}

//for every single student
class Student {
    int rno;
    String name;
    float marks;
    Boolean check;

    Student() {

    }

    Student(int rno,
            String name,
            float marks,
            Boolean check) {
        rno = this.rno;
        name = this.name;
        marks = this.marks;
        check = this.check;

    }


}


