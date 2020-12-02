package Class17;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_Class {
    public static void main(String[] args) {

        Date now = new Date();
        System.out.println(now);

        // https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html#timezone
        SimpleDateFormat df = new SimpleDateFormat("dd");

        String date = df.format(now);


/**
         * Current Date -> 5 -> "d" -> 5
         * Current Date -> 15 -> "d" -> 15
         *
         * Current Date -> 5 -> "dd" -> 05
         * Current Date -> 15 -> "dd" -> 15
         */

        System.out.println("Current Date: " + date);

        df = new SimpleDateFormat("MM");


        /*
            MM - Month in number
            MMM - Month Abr
            MMMM - Full month name
         */


        System.out.println("Current month: " + df.format(now));     // 11

        df = new SimpleDateFormat("MMM dd yyyy, hh:mm:ss:SS a");
        String myFormattedDate = df.format(now);
        System.out.println("Formatted Date: " + myFormattedDate);

        df = new SimpleDateFormat("dd");
        String myDate = df.format(now);

        /*
            print First half in date is 15 or less, else print second half
         */

        int myDateInt = Integer.valueOf(myDate);
        if (myDateInt <= 15) {
            System.out.println("First half");
        } else {
            System.out.println("Second half");
        }



        /*
            Convert String into Date object
         */
        Date myParsedDate = null;
        String dateText = "November 5, 2020 16:00:00";
        SimpleDateFormat df1 = new SimpleDateFormat("MMMM d, yyyy HH:mm:ss");
        try {
            myParsedDate = df1.parse(dateText);    // created Date using String
            System.out.println(myParsedDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }


        System.out.println("My parsed date: " + myParsedDate);
        System.out.println("My current date: " + now);

        System.out.println("now equal to myParsedDate --> " + now.equals(myParsedDate));
        System.out.println("now comes after to myParsedDate --> " + now.after(myParsedDate));
        System.out.println("now comes before to myParsedDate --> " + now.before(myParsedDate));





    }
}
