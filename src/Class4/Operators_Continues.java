package Class4;

public class Operators_Continues {
    public static void main(String[] args) {
        /**
         * 5. Ternary (?:)
         * 6. Advanced Assignment (+=, -=, *=, /=, %=)
         */

        /**
         * Ternary (?:)
         *
         * double var =
         *      if creditScore>700, then mortgage=1.1
         *      else mortgage=2.0
         *
         * Assign tVar1 = 10 if tVar2>20 else assign tVar1 = 5
         *
         * Syntax:
         * int var = condition?trueValue:falseValue
         *
         */
        int creditScore = 670;
        double mortgageRate = creditScore>700?1.1:2.0;
        System.out.println("For credit score - " + creditScore + " -- Mortgage Rate - " + mortgageRate);

        int time = 19;
        String greeting = time>12?"Good Evening":"Good Day";
        System.out.println("Greeting -> " + greeting);

        int myResult = creditScore>700?time:time++;
        System.out.println("Time : " + time);           // 19 -- 20
        System.out.println("MY Resylt : " + myResult);  // 20 -- 19

        boolean res = time<10 ? creditScore>700 : myResult>20;

        /**
         * Advanced Assignment (+=, -=, *=, /=, %=)
         *
         * ++   ->  increment by 1
         *
         * int num = 15;
         * num++    // num = num + 1
         * num++    // num=17
         * num++
         * num++
         * num++
         *
         * num+=5   // num = num + 5
         *
         * abbreviation += s.charAt(0); // abbreviation = abbreviation + s.charAt(0);
         *
         * sout(num);       num=20
         *
         */

        int var1 = 10;
        var1+=5;    // var1 = var1 + 5
        System.out.println("var1 = " + var1);   // var1 = 15

        var1-=2;    // var1 = var1 - 2
        System.out.println("var1 = " + var1);   // var1 = 13

        var1*=10;    // var1 = var1 * 10
        System.out.println("var1 = " + var1);   // var1 = 130

        var1/=13;   // var1 = var1 / 13;
        System.out.println("var1 = " + var1);   // var1 = 10

        var1%=4;    // var1 = var1 % 4;
        System.out.println("var1 = " + var1);   // var1 = 2


    }
}
