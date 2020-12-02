package Class3;

public class LabSession2 {
    public static void main(String[] args) {
        // do 4 hours contain 14400 seconds? -> true/false
        // convert hours into seconds (1hour = 3600seconds)
        int hours = 4;
        int seconds = 14400;
        int hoursIntoSeconds = hours * 3600;

        boolean isSecondsEqual = hoursIntoSeconds == seconds;

        System.out.println("do " + hours + " hours contain " + seconds +
                " seconds? -> " + isSecondsEqual);




        // find if given number is even
        // int num = 67;
        // boolean isEven = false;

        int num = 10;
        boolean isEven = (num%2 == 0);

        System.out.println(num + " is even: " + isEven);
        // System.out.println(num + " is even: " + isEven);

        /**
         * even number -> number is completely divisible by 2
         * odd number -> number is NOT completely divisible by 2
         *
         * num%2 -> 0 for even
         */


        // is 3 miles equal to 5km?

        int mile = 3, km=5;
        double kmInMile = 1.61;
        double milesInKm = mile * kmInMile;   // converting miles into km
        boolean isTrue = (milesInKm == km);
        System.out.println("is " + mile + " miles equal to " + km+"km? -> " + isTrue);



        double kNum = 1.60;
        boolean mIsEqal = ((kNum * 3) == 5);
        System.out.println("is 3 miles equal to 5km? => " + mIsEqal);











    }
}
