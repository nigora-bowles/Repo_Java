package Class8;

public class Homework5_Discussion {
    public static void main(String[] args) {

        // Subject - Homework-5

        /**
         * Write code/method to return abbreviation for any given string
         * Example: String msg = "Outfit of the day"
         * Expected: OOTD   // GM HAGDTY
         * String msg = "have a great day to you"
         *
         * //code
         *
         * sout("Abbreviation : " + abr);   // HHAPL
         */
        String msg = "have happy and prosperous life";
        String abr = "";
        // code
        System.out.print("Abbreviation: ");
        String[] words = msg.toUpperCase().split(" ");  // ["HAVE", "HAPPY", "AND", "PROSPEROUS", "LIFE"]
        for (int i = 0; i <= words.length-1; i++) {
            abr = abr + words[i].charAt(0);
        }
        System.out.println("Abbreviation: " + abr);     // HHAPL


        /**
         * Change the string to title case
         */
        String line = "once upOn a tiMe in the UNIVERSE";   //  Once Upon A Time In The Universe
        System.out.println("Line (Before modification) : " + line);
        String[] str = line.toLowerCase().split(" ");
        line = "";
        for(int b=0; b<str.length; b++) {
            line = line + " " + str[b].substring(0,1).toUpperCase()+str[b].substring(1);    // line = " Once Upon A Time"
        }
        line = line.trim();
        System.out.println("Line (After modification) : " + line);


        /**
         * reverse a string
         */
        String message = "happy holidays"; //syadiloh yppah
        String reverseMessage = "";
        System.out.println("Message : " + message);
        // code
        System.out.println("Message in reverse: " + reverseMessage);    // syadiloh yppah









    }

}
