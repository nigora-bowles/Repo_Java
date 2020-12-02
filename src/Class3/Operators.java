package Class3;

public class Operators {
    public static void main(String[] args) {

        /**
         * Java Operators:
         * 1. Assignment (=)
         * 2. Arithmetic (+, -, *, /, %, ++, --)
         * 3. Comparison (>, <, >=, <=, ==, !=)
         * 4. Logical (&& , ||, !)
         * 5. Ternary (?:)      -> Class4/Operators_Continues
         * 6. Advanced Assignment (+=, -=, *=, /=, %=)  -> Class4/Operators_Continues
         */

        /**
         * Assignment (=)
         */
        int num = 10;

        /**
         * Arithmetic:
         * +
         * -
         * *
         * /
         * %    Modulus
         * ++   increment (pre-increment/post-increment)
         * --   decrement (pre-decrement/post-decrement)
         */
        int num1 = 10;
        int num2 = 20;
        int num3 = num1 + num2;     // 10 + 20 = 30
        System.out.println("num3 = " + num3);

        int num4 = num1 + num2 + num3;  // 10 + 20 + 30 = 60
        System.out.println("num4 = " + num4);

        num4 = num4 + num1;     // 60 + 10 = 70
        System.out.println("num4 = " + num4);

        double dNum = 100;
        double res = dNum + num1;   // 100.00 + 10 = 110.00
        System.out.println("res = " + res);

        int result = (num1 + num2) - (num1 - num4) * num2 + num3;
                    // (10+20) - (10-70) * 20 + 30
                    // 30 + 60 * 20 + 30
                    // 30 + 1200 + 30 = 1260
        System.out.println("result = " + result);

        // num1=10 , num2=20
        int divRes = num2/3; // int/int -> int (20/3 -> 6)
                             // double/int -> double
                             // int/double -> double
        System.out.println("divRes = " + divRes);

        double divRes1 = num2/3; // 20/3 = 6  -> 6.0
        System.out.println("divRes1 = " + divRes1);     // 6.0

        divRes1 = num2/3.0;     // 20/3.0 -> 6.666
        System.out.println("divRes1 with 3.0= " + divRes1); // 6.666


        // 20/3 -> 6 (2)
        // 40/5 -> 8 (0)
        // 11/4 -> 2 (3)
        /**
         * % -> Modulus
         */
        System.out.println("40 % 5 -> " + 40%5); // 0
        System.out.println("20 % 3 -> " + 20%3); // 2
        System.out.println("11 % 4 -> " + 11%4); // 3

        // 14 -> 14%2=0
        // 15 -> 15%2=1

        // 15%3 = 0

        /**
         * increment (++)
         * post-increment and pre-increment
         * int b = 10;
         * b++  -> post-increment
         * ++b  -> pre-increment
         *
         * ++
         *      increment the current value of variable by 1;
         *      and store new value in the SAME value
         */
        int inc = 10;
        inc++;  // inc=11
        System.out.println("inc = " + inc);   // 11
        ++inc;  // inc=12
        System.out.println("inc = " + inc);   // 12

        /**
         * post -> use the current value of variable for whatever action,
         *          then increment
         * pre -> increment the value of variable,
         *          then use the latest value for whatever action
         */
        System.out.println(inc++);  // print->12 and inc=13
        System.out.println(++inc);  // inc=14 and print->14

        int i1 = 1;
        int i2 = i1++;  // i2=1 , i1=2
        i2 = ++i1;      // i2=3 , i1=3

        System.out.println("i1 = " + i1);   // 2
        System.out.println("i2 = " + i2);   // 1

        int ab = 5;
        System.out.println(ab++);   // print -> 5 | ab=6
        System.out.println(++ab);   // ab=7 | print -> 7
        System.out.println(ab);     // print -> 7
        System.out.println(ab++);   // print -> 7 | ab=8
        System.out.println(ab);     // print -> 8
        System.out.println(ab++);   // print -> 8 | ab=9
        System.out.println(ab++);   // print -> 9 | ab=10
        System.out.println(ab);     // print -> 10

        /**
         * decrement (--)
         * post-decrement and pre-decrement
         * int b = 10;
         * b--  -> post-decrement
         * --b  -> pre-decrement
         *
         * --
         *      decrement the current value of variable by 1;
         *      and store new value in the SAME value
         */

        int dec = 10;
        System.out.println(dec--);  // print -> 10 | dec=9
        System.out.println(--dec);  // dec=8 | print -> 8

        /**
         * Comparison Operators
         * (>, <, >=, <=, ==, !=)
         *
         * Result of any comparison operation is always boolean
         *
         */
        int com1 = 5;
        int com2 = 7;

        boolean com1GrCom2 = com1 > com2;
        System.out.println(com1 + " > " + com2 + " = " + com1GrCom2);       // false

        boolean com1GrEqCom2 = com1 >= com2;
        System.out.println(com1 + " >= " + com2 + " = " + com1GrEqCom2);    // false

        boolean com1LeCom2 = com1 < com2;
        System.out.println(com1 + " < " + com2 + " = " + com1LeCom2);       // true

        boolean com1LeEqCom2 = com1 <= com2;
        System.out.println(com1 + " <= " + com2 + " = " + com1LeEqCom2);    // true

        boolean com1EqCom2 = (++com1 == --com2);
        System.out.println(com1 + " == " + com2 + " = " + com1EqCom2);      // false

        boolean com1NtEqCom2 = com1 != com2;
        System.out.println(com1 + " != " + com2 + " = " + com1NtEqCom2);    // true

        int num11 = 11;
        int num12 = 13;

        boolean abc = (++num11 == num12--);
        System.out.println(num11 + " == " + num12 + " = " + abc);      // false

        /**
         * Logical (&&, ||, !)
         * && -> and operator
         * || -> or operator
         * !  -> not operator
         *
         * We use Logical operators to join two or more conditions
         * Final result will be boolean datatype.
         *
         * if day==monday or raining=false or time>9am or hangover=false
         *      then I'll go to office
         */
        int lVar1 = 10, lVar2 = 20 , lVar3=30, lVar4=40;

        boolean lRes1 = lVar1 <= lVar3 && (lVar2 == (lVar4-lVar1-lVar1)) && lVar4 == lVar2;
        // lVar1 <= lVar3 && (lVar2 == (40-10-10)) && lVar4 == lVar2;
        // lVar1 <= lVar3 && (lVar2 == 20) && lVar4 == lVar2;
        // lVar1 <= lVar3 && true && lVar4 == lVar2;
        // 10 <= 30 && true && lVar4 == lVar2;
        // true && true  && 40 == 20;
        // true && true && false -> false
        System.out.println("lRes1 -> " + lRes1);


        boolean lRes2 = lVar1 <= lVar3 || (lVar2 == (lVar4-lVar1-lVar1)) || lVar4 == lVar2;
        // lVar1 <= lVar3 || (lVar2 == (40-10-10)) || lVar4 == lVar2;
        // lVar1 <= lVar3 || (lVar2 == 20) || lVar4 == lVar2;
        // lVar1 <= lVar3 || true || lVar4 == lVar2;
        // 10 <= 30 || true || lVar4 == lVar2;
        // true || true  || 40 == 20;
        // true || true || false -> true
        System.out.println("lRes2 -> " + lRes2);

        boolean lRes3 = !(lVar1 <= lVar3 || (lVar2 == (lVar4-lVar1-lVar1)) || lVar4 == lVar2);
        // !(lVar1 <= lVar3 || (lVar2 == (40-10-10)) || lVar4 == lVar2);
        // !(lVar1 <= lVar3 || (lVar2 == 20) || lVar4 == lVar2);
        // !(lVar1 <= lVar3 || true || lVar4 == lVar2);
        // !(10 <= 30 || true || lVar4 == lVar2);
        // !(true || true  || 40 == 20);
        // !(true || true || false) -> !(true) -> false
        System.out.println("lRes3 -> " + lRes3);


        boolean lRes4 = !(lVar1 <= lVar3 && (lVar2 == (lVar4-lVar1-lVar1)) && lVar4 == lVar2);
        System.out.println("lRes4 = " + lRes4);


        double fTemp = 90.9;
        // cT = (fT - 32) × 5/9
        double cTemp = (fTemp - 32) * 5/9;
        System.out.println(fTemp + " F is equal to " + cTemp + " deg celsius");




    }
}
