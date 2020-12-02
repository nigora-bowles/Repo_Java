package Class5;

public class LabSession_1 {
    public static void main(String[] args) {

        String sentence = "Happy world is a world to live for better future.";

        // how to find the number of words in the sentence?
        /*
            1. use split (by " ") method to generate String[]
            2. use length from Array to class, and store result in an int variable.
            3. print the int variable.
         */


        // String sentence = "Happy WoRld is a WORLD to live";
                            // "Happy ", " is a ", " to live"   3
                            // 3-1 = 2

        // find how many times, 'world' word appears in the sentence. (ignoring cases)

        /*
            1. use toLowerCase() method on sentence, and store result in same variable.
            2. use toLowerCase() method on "world", and store result in new variable.
            3. use split (by "world") method to generate String[]
            4. find arrayLength
            5. len-1
         */
        sentence = sentence.toLowerCase();
        String splitBy = "world";
        String[] afterSplit = sentence.split(splitBy);
        int afterSplitLength = afterSplit.length;
        int worldCount = afterSplitLength-1;
        System.out.println(worldCount);


        // String threeWordString = "geT WeLL SooN";
        // Get Well Soon
        /*
            1. use toLowercase() method to convert string into lowercase,
                and store result in same variable.
            2. use split (by " ") method, to generate String[] words

            3. words[0] // "geT" convert first-letter into uppercase, and rest in lowercase
            5. String firstLetter = words[0].subString(0,1);    // "g"
            6. firstLetter = firstLetter.toUppercase();         // "G"
            7. String restLetters = words[0].subString(1);      // "eT"
            8. restLetters = restLetters.toLowercase();         // "et"
            9. words[0] = firstLetter + restLetters;            // words[0] = "Get"

            3. words[1] // "WeLL" convert first-letter into uppercase, and rest in lowercase
            5. String firstLetter = words[1].subString(0,1);    // "W"
            6. firstLetter = firstLetter.toUppercase();         // "W"
            7. String restLetters = words[1].subString(1);      // "eLL"
            8. restLetters = restLetters.toLowercase();         // "ell"
            9. words[1] = firstLetter + restLetters;            // words[1] = "Well"

            3. words[2] // "SooN" convert first-letter into uppercase, and rest in lowercase
            5. String firstLetter = words[2].subString(0,1);    // "S"
            6. firstLetter = firstLetter.toUppercase();         // "S"
            7. String restLetters = words[2].subString(1);      // "ooN"
            8. restLetters = restLetters.toLowercase();         // "oon"
            9. words[2] = firstLetter + restLetters;            // words[2] = "Soon"

            // words = ["Get" , "Well", "Soon"]

            threeWordString = words[0] + " " + words[1] + " " + words[2];
                                Get Well Soon

         */


        // String statement = "Have a great day ahead, may god be with you";
        // replace all A with Z
        /*
            1. convert statement into uppercase
            2. replace method
         */

        /*
         *
         * String strNew = "hello dear, how are you?";
         *
         * Assign result (String)
         * as "valid" if length of strNew is greater than 10
         * else assign "invalid".
         *
         * print the result value.
         *
         */
        String strNew = "hello dear, how are you?";
        int strNewLength = strNew.length();
        String result = strNewLength>10?"valid":"invalid";
        System.out.println(result);





    }
}
