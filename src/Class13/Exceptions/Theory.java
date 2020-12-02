package Class13.Exceptions;

import java.io.File;
import java.io.FileInputStream;

public class Theory {

    /**
     *
     * Exceptions
     *      CompileTime Exception
     *          InterruptedException
     *          FileNotFoundException
     *      RunTime Exception
     *          ArrayIndexOutOfBoundsException
     *
     * Exception Class - Parent Class of all exceptions
     *
     * How to handle exception: using try-catch block
     *
     * try {
     *     // code which can throw exception
     * } catch() {     // one catch block should catch only one exception
     *     // code to execute in case of exception
     * }
     *
     *
     */
    int b=10;

    public static void main(String[] args) {

        try {
            System.out.println("hello");

            int[] arr = {11,  22, 33, 44, 55};

            Thread.sleep(5000);         // InterruptedException

            System.out.println(arr[4]);     // 55

            System.out.println(arr[2]);     // ArrayIndexOutOfBoundException

            System.out.println(arr[2]);     //

            System.out.println("Again");

            System.out.println(1/0);        // ArithmeticException

        } catch (InterruptedException var) {
            // one catch block should catch only one exception
            System.out.println("OMG interrupted exception occurs");
        } catch (ArrayIndexOutOfBoundsException e2) {
            System.out.println("ArrayIndexOutOfBounds exception occurs");
            e2.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
            e.printStackTrace();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e1) {
                System.out.println("Interrupted exception from nested try-catch");
                e1.printStackTrace();
            }
        }


    }

}
