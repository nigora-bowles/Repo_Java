package Class13.Exceptions;

import java.io.FileNotFoundException;

public class ExceptionsSample {
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
            try {
                System.out.println(2/0);
                System.out.println(numbers[10]);
                System.out.println("Line 21 - Inside Arithmetic exception catch");
            } catch (ArrayIndexOutOfBoundsException e1) {
                System.out.println("Array index out of bound in nested try block");
            } catch (ArithmeticException e2) {
                System.out.println("Arithmetic exception in nested try-catch block");
            }
        } catch (InterruptedException e) {
            System.out.println("Exception occurred in thread.sleep");
        }
        System.out.println("Line 33");



    }
}
