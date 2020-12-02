package Class8;

public class Loops_Continue {
    public static void main(String[] args) {

        /**
         * Loops
         * 1. for loop
         * 2. Enhanced for loop
         * 3. while loop
         * 4. do-while loop
         */

        /**
         * initialization
         * while (conditions) {
         *
         *      // code to run if condition is true
         *
         *      // last line will be increment/decrement operation based on requirement
         * }
         * code inside will run only when condition is true
         *
         */

        /**
         *
         * do {
         *
         *      // code to run if condition is true
         *
         *
         * } while (condition)
         *
         * code inside the do-while will run atleast one time.
         *
         */

        int i=0;
        do {
            System.out.println("i = " + i);
        } while (i<0);

        int j=0;
        while (j<0) {
            System.out.println("j = " + j);
        }




    }
}
