package Class6;

public class ConditionalLoops {
    public static void main(String[] args) {

        /**
         * Conditional Loops (Conditional Code):
         * 1. if-else
         * 2. switch
         */

        /**
         * If you find oat milk at store and it is before 7pm,
         *      buy grocery
         *      call me
         * else if it is after 7pm
         *      call home
         * else
         *      text me.
         */

        /**
         * if (condition(s)) {
         *      //if
         *      // block
         * }
         *
         *
         * if (condition(s)) {
         *      // if
         *      // block
         * } else {
         *      // else
         *      // block
         * }
         *
         * if (condition(s)) {
         *      // 1st if block
         * } else if (condition(s)) {
         *      // 2nd if block
         * } else {
         *      // else block
         * }
         */

        String days = "weekend";         // weekend or weekdays
        boolean anyMeetings = true;     // true or false
        String clothes = "";

        /**
         * days = weekend ; clothes = casual
         * days = weekdays and meeting = false ; clothes = formals
         * days = weekdays and meeting = true ; clothes = suit
         */
        if (days.equals("weekdays") && anyMeetings == false) {    //  false && false -> false
            clothes = "formals";
        } else if (days.equals("weekdays") && anyMeetings == true) {
            clothes = "suit";
        } else {
            clothes = "casual";
        }
        System.out.println(clothes);    // suit


        /**
         * print "Even" if value in num variable is even
         */

        int num = 10;
        if (num % 2 == 0) {
            System.out.println("Even");
        }


        String name = "Happy";
        boolean result = true;
        int number = 22;
        /**
         * if name length is greater than 10 and number is greater than 5
         * print the below:
         *      name in all uppercase
         *      and replace p with b in name
         * else
         * make result as false
         *
         *
         * sout(result) // outside the if-else block
         */

        if (name.length() > 10 && number > 5) {
            System.out.println(name.toUpperCase());
            System.out.println(name.replace('p', 'b'));
        } else {
            result = false;
        }
        System.out.println(result);     // false


        /*

        name

            if name = "happy"
                    do this
            else if name = "peace"
                    do this
            else if name = "joy"
                    do this
            else if name = "grow"
                    do this


        switch (variable) {
            case value1:
                  // do this
                  // code if variable is equal to value1
                  break;
            case value2:
                  // do this
                  // code if variable is equal to value2
                  break;
            case value3:
                  // do this
                  // code if variable is equal to value3
                  break;
            default:
                  // do this
                  // code if variable is NOT matching any case
        }
         */


        /**
         * dayName = monday ; print "day 1"
         * dayName = tuesday; print "day 2"
         *
         */

        String dayName = "Monday";
        switch (dayName) {
            case "Monday":
                System.out.println("Day 1");
                break;
            case "Tuesday":
                System.out.println("Day 2");
                break;
            case "Wednesday":
                System.out.println("Day 3");
                break;
            case "Thursday":
                System.out.println("Day 4");
                break;
            case "Friday":
                System.out.println("Day 5");
                break;
            case "Saturday":
                System.out.println("Day 6");
                break;
            case "Sunday":
                System.out.println("Day 7");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }


        /**
         * based on month name, print season
         * dec, jab, feb -> winter
         * mar, apr, may -> summer
         * jun, jul, aug -> fall
         * sep, oct, nov -> spring
         * if invalid monthName, print invalid month entered
         */
        String monthName = "sepTemBeR";
        switch (monthName.toLowerCase()) {  // september
            case "january":
            case "february":
            case "december":
                System.out.println("Winter");
                break;
            case "march":
            case "april":
            case "may":
                System.out.println("Spring");
                break;
            case "june":
            case "july":
            case "august":
                System.out.println("Summer");
                break;
            case "september":
            case "october":
            case "november":
                System.out.println("Fall");
                break;
            default:
                System.out.println("Invalid Month");
                break;
        }
    }
}
