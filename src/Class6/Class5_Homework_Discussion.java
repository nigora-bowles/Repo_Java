package Class6;

public class Class5_Homework_Discussion {
    public static void main(String[] args) {

        // Subject: Homework-3

        /**
         * Store your full name in a variable, and display the following:
         *     1. Display length of the first name.
         *     2. Does your last name starts with "K" (Ignoring cases)
         *     3. print the last alphabet of your first name
         *     4. Does your last name ends with "M" (Ignoring cases)
         */

        /*
            String fullName = "Happy Peace";
            int indexOfSpace = fullName.indexOf(" ");
            String firstname = fullName.substring(0,indexOfSpace);
            String lastname = fullName.substring(indexOfSpace+1);
        */

        String fullName = "Happy King";
        String[] names = fullName.split(" ");   // ["Happy" , "Peace"]
        String firstname = names[0];
        String lastname = names[1]; // KIng
        System.out.println("Length of " + firstname + " is: " + firstname.length());

        boolean isStartWithK = lastname.toUpperCase().startsWith("K");
        System.out.println("Last name '" + lastname + "' starts with 'K: " + isStartWithK);

        int fNameLastIndex = firstname.length()-1;
        char lastChar = firstname.charAt(fNameLastIndex);
        System.out.println("Last char present in '" + firstname + "' is: " + lastChar);

        boolean isEndsWithM = lastname.toUpperCase().endsWith("M");
        System.out.println("Last name '" + lastname + "' ends with 'M': " + isEndsWithM);



        /**
         * String myStatment = "I am a good programmer";    // 5
         * Use string methods to do following tasks:
         * 	1. Display the total number of words in the myStatement.
         * 	2. replace all the 'r' characters with 'f' characters.
         */
        String myStatment = "I am a good programmer";
        String[] words = myStatment.split(" "); // {"I", "am", "a", "good", "programmer"}
        int wordCount = words.length;
        System.out.println("Words count: " + wordCount);


        /**
         * Store your first name in a string variable.
         * Calculate the length of your first name, without using length() method of String class.
         */
        String[] fNameLetters = firstname.split("");    // Happy -> {"H", "a", "p", "p", "y"}
        int fnameLength = fNameLetters.length;

        char[] letters = firstname.toCharArray();
        int len = letters.length;

        String fname = "peace";
        int ab = fname.lastIndexOf("");
        System.out.println(ab);


        /**
         *
         * String strNew = "hello dear, how are you?";
         *
         * Assign result (boolean) as true if length of strNew if greater than 10
         * else assign false.
         *
         * print the result value.
         *
         */
        String strNew = "hello dear, how are you?";
        // boolean result = strNew.length()>10?true:false;
        boolean result = strNew.length()>10;



        /**
         * String threeWordsSentence =  "hApPY nEW yeAr";
         * sout(threeWordsSentence);  // hApPY nEW yeAr
         * // code
         * sout(threeWordsSentence);  // Happy New Year
         */
        String threeWordsSentence =  "hApPY nEW yeAr";
        System.out.println(threeWordsSentence);

        String[] wordsArray = threeWordsSentence.toLowerCase().split(" ");    // {"happy", "new", "year"}

        String f1 = wordsArray[0].substring(0,1).toUpperCase(); // "H"
        String l1 = wordsArray[0].substring(1);  // "appy"
        wordsArray[0] = f1 + l1 ;    // "Happy"

        String f2 = wordsArray[1].substring(0,1).toUpperCase(); // "N"
        String l2 = wordsArray[1].substring(1);  // "ew"
        wordsArray[1] = f2 + l2 ;    // "New"

        String f3 = wordsArray[2].substring(0,1).toUpperCase(); // "Y"
        String l3 = wordsArray[2].substring(1);  // "ear"
        wordsArray[2] = f3+ l3 ;    // "Year"

        threeWordsSentence = words[0] + " " + words[1] + " " + words[2];
        System.out.println(threeWordsSentence);

        /**
         * Create abbreviation:
         * String threeWordsSentence =  "Lab sessIONS clAsses";
         * // code
         * LSC
         *
         */





    }
}
