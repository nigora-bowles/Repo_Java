package Class2;

import Class1.TestFile;

public class NonPrimitives {
    public static void main(String[] args) {

        TestFile t1;    // t1 is a variable of TestFile datatype
        OtherPrimitives var;    // var is variable of OtherPrimitives

        /**
         * String
         *  is a non-primitive datatype which can store multiple characters.
         *  while storing the value in variable, the value should be enclosed in DOUBLE-QUOTES
         */
        String fullName = "Hello World";
        // fullName is a variable of String datatype, storing Hello World as value.
        System.out.println("Full name : " + fullName);

        String single = "a b c d e";
        String info = "Value in single variable -> ";
        int num = 10;
        System.out.println(num);    // 10
        System.out.println(info + single);   // Value in single variable -> a b c d e
        // Value in single variable -> a b c d e






    }
}
