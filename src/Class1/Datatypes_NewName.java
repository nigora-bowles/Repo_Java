package Class1;

public class Datatypes_NewName {
    public static void main(String[] args) {
        /**
         * numbers
         *      whole -> byte, short, int, long
         *      decimals -> float, double
         *
         * text
         *      single-letter -> char
         *      multiple-letters -> String
         *
         * yes/no
         *      true/false -> boolean
         *
         *
         * How many datatypes we have in Java?
         *
         * Primitive
         *      byte, short, int, long, float, double, char, boolean
         *
         * Non-primitive (Class and Interface)
         *      String, Array, User defined Class, Interface
         *
         */
        /**
         * Good practice to provide names:
         * 1. Package:
         *      -> starts with Uppercase.
         *      -> never start with digit or special character
         *      -> It should always follow CamelCaseFormat
         *
         * 2. Class:
         *      -> starts with Uppercase.
         *      -> never start with digit or special character
         *      -> It should always follow CamelCase
         *
         * 3. Variable:
         *      -> starts with lowercase.
         *      -> never start with digit or special character
         *      -> It should always follow camelCaseFormat
         *
         *  Rule: you must NEVER use the Java language keywords
         *
         */

        /**
         * To store any data, we need variable
         *
         * Syntax to create a variable:
         *      datatype variableName = value;
         *      -- OR --
         *      datatype variableName;
         *      variableName = value;
         *
         * eg:
         * write code to create a byte variable of any name.
         *
         * byte testVariable = 10;
         * int age = 5;
         *
         */
        // Primitive: byte, short, int, long, float, double, char, boolean

        /**
         * byte: is a primitive datatype.
         * can store only whole numbers ranging from -128 to 127
         */
        byte age=20, myDogAge=4;
        // create a variable 'age' of byte datatype, and stored 20 in it.
        // what is the datatype of age? -> byte
        byte soccerGoal = 8;
        /**
         * short: is a primitive datatype
         * can store only whole numbers, ranging from -32,768 to 32,767
         */
        short noOfDaysInYear = 365; // 20
        // 365 days in an year
        System.out.println("365 days in an year");

        System.out.println("Hello world");      // Hello world
        System.out.println(noOfDaysInYear);     // 365

        System.out.println(noOfDaysInYear + " days in an year");
                            //  365 days in an year
        // Days in an year is 365, with 52 weeks
        int weeksInYear = 52;
        System.out.println("Days in an year is "+noOfDaysInYear+", with "+weeksInYear+" weeks");

        /**
         * int: is a primitive datatype
         * can store only whole numbers, ranging from -2,147,000,000 to 2,147,000,000
         *
         * In daily routine: we use 'int' to store whole values.
         *
         */
        int usaCovidCasesCount = 100000;

        /**
         * long: is a primitive datatype
         * can store only whole numbers, ranging from
         * -9,000,000,000,000,000,000 to 9,000,000,000,000,000,000
         */

        long worldPopulation = 99999999999L;    // L is an indicator for Java to treat value as long instead int
        // created a variable 'worldPopulation' of long datatype, and stored 99999999999 value

        System.out.println("Hello Dear");       // Hello Dear
        System.out.println(age);                // 20
        System.out.println(worldPopulation);    // 99999999999


        System.out.println(usaCovidCasesCount);



        worldPopulation = 888888888888L;        // replacing the value in existing variable

        System.out.println("World population is " + worldPopulation);    // 888888888888


        int population = 100;
        population = 50;

        System.out.println(population);     // 50

        population = 25;

        System.out.println(worldPopulation);     // 25

        System.out.println(noOfDaysInYear); //
        // Casting



        // store dog's age in a variable
        // -128 to 127
        byte dogAge = 4;
        byte dogWeigh = 10;
        short myAge = 22;

        System.out.println("Hello world");
        System.out.println("Dog age is " + dogAge + ", weigh is " + dogWeigh); // Dog age is X, weigh is Y
        System.out.println(myAge);  // My age is 22








        // store no. of floors in the Empire State building
        // 100-110
        // byte (-128 to 127)
        byte floorsCountEmpireState = 105;

        // store your cat's age in a variable
        // 0-15
        // byte
        byte catAge = 10;

        // store your age in a variable
        // 0 - 150
        // short
        short humanAge = 140;

        // store your account balance in a variable
        // float, double

        // Store subject grade (A,B,C,D) in a variable.
        // char

        // Store your blood group (or name) in a variable
        // String

        // Store ssn in a variable
        // int

        // Balance: XXXXX.XX
        // sout("Balance: " + balance);


        System.out.println("Sep 14 2020");  // Sep 14 2020
        System.out.println("Text value");   // Text value
        System.out.println(worldPopulation);  // value of 'worldPopulation' variable will be printed out.

        // +

        // world population is worldPopulation
        System.out.println("world population is " + worldPopulation);
                        //  world population is 888888888

        int amount = 98;
        byte discount = 5;

        // Amount is 100, discount is 10
        System.out.println("Amount is " + amount + ", discount is " + discount);
                         // Amount is 100, discount is 10

        System.out.println(amount);
        System.out.println(discount);



        int abc = 20;   // abc is int-datatypes
        int def = abc;  // assign the value inside abc to def

        System.out.println("DEF = " + def);






    }
}




