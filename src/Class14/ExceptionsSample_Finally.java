package Class14;

import java.io.FileNotFoundException;

public class ExceptionsSample_Finally {
    public static void main(String[] args) {
        int[] numbers = {11, 22};

        try {
            System.out.println(numbers[0]);     // ArrayIndex
            System.out.println("Line 11");
            System.out.println(1 / 0);
            int a = 10, b=100;
            System.out.println(b/a);
            Thread.sleep(1000);
            System.out.println(numbers[1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index value");
        } catch (ArithmeticException e) {
            System.out.println("No divide by zero");
        } catch (InterruptedException e) {
            System.out.println("Exception occurred in thread.sleep");
        } finally {
            // code in this block will always execute
            // whether exception occurs or not
            System.out.println("Finally section");
        }
        System.out.println("Line 33");


        /*try {
            // code to connect with excel   <- FileNotFoundException
            // execute code to fetch data from excel
            // store in a variable
        } catch (FileNotFoundException e) {
            System.out.println("Excel sheet is not found");
        } finally {
            // code to close connection with excel
        }*/


    }
}
