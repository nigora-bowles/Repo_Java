package Class7;

public class Loops {
    public static void main(String[] args) {

        /**
         * Loops
         * 1. for loop
         * 2. Enhanced for loop
         * 3. while loop
         * 4. do-while loop
         */

        /*
        initialization

            for (initialization ; condition ; increment) {
                // code
            }

        */
        // print "Hello" 5 times
/*      System.out.println("Hello - 1");
        System.out.println("Hello - 2");
        System.out.println("Hello - 3");
        System.out.println("Hello - 4");
        System.out.println("Hello - 5");*/


        for (int i=1 ; i<=5 ; i++) {
            System.out.println("Hello - " + i);
        }

        for (int i=0 ; i<=4 ; i++) {
            System.out.println("Hello - " + (i+1));
        }
        System.out.println("TRIAL");
        for (int i=100 ; i>95 ; i--) {      // 100, 99, 98, 97, 96
            System.out.println("Hello - " + (i-(i-1)));
        }

        /**
         * 100-x = 1
         * 99-x = 2
         */

        for (int i=0 ; i<5 ; i++) {
            System.out.println("Hello");
        }

        /*
            1. java initializes the variable i to given value (i=0)

            2. verify the condition (i<5 -> 0<5=true)
            3. if result of condition is true, java will enter the for-loop and execute the code ; else stop the loop
            4. after the last line of code inside-for-loop, perform increment operation(i++)
            5. Go to top and verify the condition (i<5 -> 1<5=true)
            6. if result of condition is true, java will enter the for-loop and execute the code ; else stop the loop
            7. after the last line of code inside-for-loop, perform increment operation(i++)
            and so on....
        */




        String[] names = {"Happy", "Peace", "Joy", "Laugh"};
        /*
        Happy
        Peace
        Joy
        Laugh
         */

        for (int i=0 ; i<=names.length-1 ; i++) {   // i<4 0,1,2,3
            System.out.println(names[i]);           // i    0,1,2,3
        }

        for (int i=1 ; i<=names.length ; i++) {   // i<=4   1,2,3,4
            System.out.println(names[i-1]);       // i-1    0,1,2,3
        }

        // String[] names = {"Happy", "Peace", "Joy", "Laugh"}; -> len=4
        // 0/2 -> 0,2,4,...
        /*
            print the values present in even index      (0,2,4,6,8,...)
         */

        for (int i = 0; i < names.length; i++) {
            if (i % 2 == 0) {
                System.out.println(names[i]);
            }
        }

        for (int i=0 ; i<names.length ; i+=2) {
            System.out.println(names[i]);
        }

        for (int i=0 ; i<=names.length-1 ; i++) {   // i<4 0,1,2,3      i<=3 i<4
            System.out.println(names[i]);           // i    0,1,2,3
        }

        /**
         Enhanced for loop
            when you need to traverse an array (or similar datatypes)
            from index-0 to last-index, one by one
         */

        /*
            for (datatype var : arrName) {
                var
            }
            for 1st loop -> var = arrName[0]
            for 2nd loop -> var = arrName[1]
            ...
            ...
         */
        // String[] names = {"Happy", "Peace", "Joy", "Laugh"};

        System.out.println("Enhanced for loop");
        for (String name : names) {
            System.out.println(name);
        }
        /*
            name = Happy
                sout(name)  -> Happy
            name = Peace
                sout(name)  -> Peace

         */

        int[] ssn = {1111, 2222, 3333, 4444, 5555};
        /*
            1111
            2222
            3333
            4444
            5555
         */
        for (int i=0; i<5;i++) {    // i<=4     0,1,2,3,4
            System.out.println(ssn[i]);
        }

        for (int ab : ssn) {
            System.out.println(ab);
        }


        /**
         * print numbers from 10 to 1
         *
         * Expected answer:
         * 10
         * 9
         * 8
         * 7
         * 6
         * 5
         * 4
         * 3
         * 2
         * 1
         */

        int[]num={10,9,8,7,6,5,4,3,2,1};
        for(int ab:num) {
            System.out.println(ab);
        }

        for (int i = 15; i>=5; i--) {
            System.out.println(i);
        }


        /**
         * while loop
         *
         * syntax:
         *
         *      int j = 0
         *      while (condition) {
         *          // code to run
         *          // until condition is true
         *          increment/decrement operation
         *      }
         *
         *
         */
        int j1=0;
        // print Hello 5 times
        while (j1<5) {   // 0,1,2,3,4
            System.out.println("Hello");
            j1++;
        }


        char[] alphabets = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        // print all values from array using for-loop, enhanced-for loop and while-loop

        for (int i=0; i<=alphabets.length-1; i++) {
            System.out.println(alphabets[i]);
        }

        for (char letters : alphabets) {
            System.out.println(letters);
        }

        int j3=0;
        while (j3<alphabets.length) {
            System.out.println(alphabets[j3]);
            j3++;
        }

        /**
         * write a code to print the reverse a given string
         *
         * "happy"
         *
         * "yppah"
         *
         */
        /*
                find lastIndex (length-1)
                sout(charAt(lastIndex))
                find secondIndex (length-2)
                sout(charAt(secondLastIndex)
         */




        String message = "happy holidays";
        String reverseMessage = "";
        System.out.println("Message :" + message);
        int j=0;
        while(j<message.length()) {
            reverseMessage = message.substring(j, j+1) +  reverseMessage;
            j++;
        }
        System.out.println("Message in reverse :" + reverseMessage);






    }
}
