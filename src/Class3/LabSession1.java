package Class3;

public class LabSession1 {
    public static void main(String[] args) {

        // print the result, is 1mile equal to 1km?
        /**
         *  bring the data to same unit.
         *      convert 1mile into km using formula "kilometers = miles × 1.609344"
         *      -> 1mile = xkm
         *  compare x with 1
         */
        double miles = 1;
        double km = 1;
        // convert miles into km
        double milesIntoKm = miles * 1.609344;
        System.out.println("is " + miles + "miles equal to "
                + km + "km = " + (milesIntoKm==km));


        // do 4 hours contain 14400 seconds?
        /**
         * convert 4 hours into seconds
         *  1 hour -> 60mins
         *  1min -> 60seconds
         *  1 hour = 60*60 seconds
         *  4 hours = 4*60*60 seconds
         */



        // find if given number is even
        int num = 11;
        boolean isEven = false;
        /*
            code
         */
        int remainder = num%2;
        isEven = remainder == 0;
        System.out.println("is " + num + " even: " + isEven); // is 11 even: falses




















    }
}
