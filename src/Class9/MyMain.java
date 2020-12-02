package Class9;


public class MyMain {
    // having main method and using methods from Methods class

    public static void main(String[] args) {
        // I want to use method from Architecture
        /**
         * Syntax:
         * ClassName var = new ClassName();
         */
        Architecture a1 = new Architecture();

        int[] values = {11, 22, 33, 44, 55};
        System.out.println(a1.arrayAvg(values));

        // In simple terms: a1 is object of Architecture class.
        // In technical terms:
        //      a1 is variable of Architecture datatype.
        //      new Architecture() -> object of Architecture class
        //      a1 stores the object of Architecture class.

        System.out.println(a1.getWindowsCount());   // 14

        a1.changeWindowsCount(2);

        System.out.println(a1.getWindowsCount());   // 2

        Architecture a2 = new Architecture();

        System.out.println(a2.getWindowsCount());   // 14

        System.out.println(a1.getWindowsCount());   // 2








    }

}
