package Class2;

public class OtherPrimitives {
    public static void main(String[] args) {

        /**
         * float, double
         */
        /**
         * float:
         *  is a primitive datatype which can store value with decimal point.
         */
        float mortgageRate = 1.1f;  // f is just an indicator for java to store/treat given value as float instead double
        // Mortgage rate is 1.1
        System.out.println("Mortgage rate = " + mortgageRate);

        /**
         * double:
         *  is a primitive datatype which can store value with decimal point.
         */
        double accBalance = 100.10;
        System.out.println("Account Balance: " + accBalance);

        accBalance = 99.98;     //
        System.out.println("Account Balance: " + accBalance);


        float fNum = 2003f;     // 2003.00 <- float
        System.out.println(fNum);   // 2341.543211

        double dNum = 200;      // 200.00   <- double
        System.out.println(dNum);   // 200.00

        /**
         * float vs double
         *  1a. double is more precise than float
         *      float can store value with 7-8 digits
         *      whereas double can store up to 15-16 digits
         *
         *  1b. in terms of memory
         *      float uses 4-bytes of memory, whereas double uses 8-bytes of memory.
         *
         *  2. double is convenient to use.
         *      While defining float variable, user/programmer has to add 'f' to explicitly inform java
         *      to store/treat value as float.
         *      In double, user can simple store the value in variable.
         *
         */

        /**
         * char
         *  is a primitive datatype which can hold a single character.
         *  while storing the value, the value should be in between single-quotes.
         */

        char singleLetter = 'a';
        System.out.println("First letter in alphabets -> " + singleLetter);

        singleLetter = 'z';
        System.out.println("Letter from alphabets -> " + singleLetter);

        char newChar = '1';
        System.out.println("new char -> " + newChar);;

        /**
         * boolean
         *  is a primitive which can hold either true or false as value.
         */
        boolean isRaining = true;
        System.out.println("is raining currently? : " + isRaining);

        isRaining = false;
        System.out.println("is raining currently? : " + isRaining);

    }
}
