package Class8;

public class Variable_Scope {
    /**
     * Field variable (Global variable or Class Variable)
     *  1. variables which we share between the methods within a class
     *  2. variable which we can access anywhere inside the class
     *
     *  Scope: entire class
     *
     *
     * Local variable
     *      variables which we create inside a method
     *      scope: within the method
     *
     */
    // field variables
    static String name = "HAPPY PEACE";
    static int num = 10;
    static int b = 10;
    final static char SCORE = 'A';  // to create constant variables
    // constant


    public static void main(String[] args) {
        final String msgSecret = "Initial value in variable";
        final int number;
        number = 100;
        String msg = "Stay safe";
        int a = 10;
        // int b=10;
        // char l = 'D';
        for (int i=0 ; i<2 ; i++) {
            // int b=10;
            a+=40;
            char l = 'M';
            System.out.println(a);  // 90
            System.out.println(SCORE);
            char myScore = SCORE;
            System.out.println(b);  // 10
        }

        char l = 'D';
        name = "ENJOY";
        System.out.println(SCORE);
        System.out.println(name);   // ENJOY
        System.out.println(b);
        System.out.println(a);      // 90
    }

    public static void sayHello() {
        System.out.println(name);
    }

    /**
     *
     * double balance;
     *
     *
     * Deposit
     *
     *
     *
     * WithDraw
     *
     *
     *
     * CheckBalance
     *
     *
     *
     */






}
