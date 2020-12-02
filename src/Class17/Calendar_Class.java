package Class17;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Calendar_Class {
    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();

        System.out.println(cal);

        Date date = cal.getTime(); // creating Date object using Calendar object
        System.out.println(date);


        Date myParsedDate = null;
        String dateText = "December 15, 2020 16:00:00";
        SimpleDateFormat df1 = new SimpleDateFormat("MMMM d, yyyy HH:mm:ss");
        try {
            myParsedDate = df1.parse(dateText);    // created Date using String
            System.out.println(myParsedDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // setting Calendar using Date object
        cal.setTime(myParsedDate);

        System.out.println(cal);

        Calendar myCalendar = Calendar.getInstance();

        // Printing Date using Calendar instance
        System.out.println(myCalendar.getTime());

        // Add 4 days to current date
        myCalendar.add(Calendar.DATE, 54);
        myCalendar.add(Calendar.MONTH, -5);

        System.out.println(myCalendar.getTime());
        Date myDate = myCalendar.getTime();
        SimpleDateFormat df = new SimpleDateFormat("");
        String myDateString = df.format(myDate);


        /**
         * Print current time as 7:52 PM
         */
        Calendar myCalendar1 = Calendar.getInstance();
        Date myDate1 = myCalendar1.getTime();
        SimpleDateFormat df11 = new SimpleDateFormat("h:mm a");
        String myTime = df11.format(myDate1);
        System.out.println(myTime);


        SimpleDateFormat dateFormat = new SimpleDateFormat("h:mm a");
        Date now = new Date();
        System.out.println(dateFormat.format(now));






    }
}
