package Class10;

import Class10.AccessModifiers.Modifiers;

public class MyMainClass {

    public static void main(String[] args) {

        Static_AccessModifier s1 = new Static_AccessModifier();
        // num = 10 ; name = "Default" ; count=0
        /**
         * object will get a fresh copy of the class
         *    object will get fresh copy (default values) for non-static field variables
         *    object will get latest copy (latest value) for static field variables
         */

        s1.enterData("first", 100);
        // num=100 ; name="first" ; count=0

        Static_AccessModifier s2 = new Static_AccessModifier();
        // num=10 ; name="Default" ; count=0

        s1.increaseCount(20);
        // num=100 ; name="first" ; count=20

        if (s1.getCountValue() > 10) {
            //
        } else {
            //
        }

        String val = s2.showUserData();
        System.out.println(val);

        // System.out.println(s2.showUserData());
        s2.showUserData();

        int presentCountValue = s2.getCountValue();

        System.out.println(s1.getCountValue());

        s1.showCountValue();    // Count = 20

        s2.increaseCount(40);   // count=60

        s1.showCountValue();    // Count = 60

        Static_AccessModifier s3 = new Static_AccessModifier();
        // num=10 ; name="Default" ; count=60

        Static_AccessModifier.showUserFullData();


        Modifiers m = new Modifiers();
        // m will get access of Public methods/variables

    }
}
