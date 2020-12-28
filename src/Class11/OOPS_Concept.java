package Class11;

public class OOPS_Concept {

    /**
     * 1. Encapsulation:
     *      Wrapping up the code in a single unit (eg: class).
     *
     * 2. Abstraction:
     *      Hiding unnecessary information from user.
     *
     * 3. Inheritance:
     *      -> parent-child set up between two classes.
     *      -> when a childClass can access parentClass methods/variable (except private methods/variables)
     *      -> to establish, we use "extends" keyword with child class to achieve Inheritance
     *      -> the child class can extend only 1 class (why? - Diamond Problem)
     *
     * 4. Polymorphism:
     *      -> same name but different forms
     *      -> In java: when we have two or more methods with SAME name.
     *      -> Types:
     *          1. Compile Time Polymorphism (Static Binding or Method Overloading)
     *          2. Run Time Polymorphism (Dynamic Binding or Method Overriding)
     *
     * Compile Time Polymorphism (Static Binding or Method Overloading):
     *      In a class, we have two or more methods with same name but different arguments.
     *      Ways to set different arguments:
     *          a) different no. of arguments
     *          b) different data-types of arguments
     *          c) different sequence of arguments
     * Note: Return-type DO NOT play any role in Compile-time polymorphism.
     *
     * Run Time Polymorphism (Dynamic Binding or Method Overriding):
     *      This can be achieved only in Inheritance set-up
     *      When we have method with same name and same number of arguments in parentClass and childClass.
     *      In other words, if childClass method has SAME signature as of a parentClass method.
     *
     *     example of signature : public void sayHello(String name, int count)
     *
     *     ***********
     *
     *     super - keyword
     *
     *     We use "super" keyword, when we want to call parent-Class method(s) within child-class method.
     */

    public static int addNum(int num1, int num2) {         // signature
        return num1+num2;
    }

    public static int addNum1(int num1, int num2) {         // signature
        return num1+num2;
    }

    public static void addNum(int num1, double num2) {
        System.out.println(num1+num2);
    }

    public static double addNum(double num2, int num1) {
        return num1+num2;
    }

    public static int addNum(int num1, int num2, int num3) {
        return num1+num2+num3;
    }



    public static void main(String[] args) {

        addNum(1,2,2);

        String word = "happy";
        System.out.println(word.toUpperCase());     // HAPPY

    }


}
