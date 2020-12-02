package Class9;

public class MathLibrary {

    /**
     * create generic methods to:
     *  add two int numbers
     *  sub two int numbers
     *  multiple two int numbers
     *  divide two int numbers
     *
     */

    public int addTwo(int num1, int num2) {
        return num1 + num2;
    }

    // sub two ints
    public int subTwo(int num1, int num2) {
        return num1 - num2;
    }

    public int multiplyTwo(int num1, int num2) {
        return num1 * num2;
    }

    public double divideTwo(double num1, int num2) {
        double result = 0.00;
        if (num2 != 0) {
            result = num1/num2; // double/int -> double
        }
        return result;
    }







}
