package Class8;

public class Methods {
    /**
     * Method:
     *      Lines of code to perform a specific task
     *
     * Benefit:
     *  no code repetition
     *
     *  Syntax:
     *  <access-modifier> [static] <dataType-of-the-returnedValue|void> <methodName> (blank | <datatype> <varName1>, <datatype> <varName2>) {
     *
     *      // code
     *
     *  }
     *
     *
     *  public static char charAt(int index) {
     *
     *
     *
     *
     *
     */
    public static void main(String[] args) {
        String name = "Happy";
        name.toUpperCase();
        String name1 = "Test";
        name1.toUpperCase();
        name.charAt(0);

        int res = addTwoInts(5, 15);

        System.out.println(name);

        System.out.println(name1.toUpperCase());

        double divRes = divideNums(10,20);
        System.out.println(divRes);

        System.out.println(divideNums(10,20));

        divideNums(10,20);

        sayHello("Shawan");


    }

    // <access-modifier> [static] <dataType-of-the-returnedValue|void> <methodName> (blank | <datatype> <varName1>, <datatype> <varName2>) {
    // create method to add 2 int numbers
    public static int addTwoInts(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    public static double divideNums(int num1, double num2) {
        double result = 0;
        if (num2!=0) {
            result = num1/num2;     // 10/5
        }
        return result;
    }

    public static void sayHello(String username) {
        System.out.println("Hello " + username);
    }




}
