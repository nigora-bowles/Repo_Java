package Class5;

public class Classwork {
    public static void main(String[] args) {

        String statement = "Hello world, I am good";
        // code
        /**
         * 1. String[] words = statement.split(" ");    // words = {"Hello", "world,", "I", "am" "good"}
         * 2. int len = words.length;   // 5
         * 3. String lastWord = words[len-1]    // words[4] -- lastWord=good
         * 4. int lastWordLength = lastWord.length()
         * 5. sout("Last word in the statement is " + lastWord + ", length = " +  lastWordLength);
         */
        /**
         * 1. int lastSpaceIndex = statement.lastIndexOf(" ");   // 17
         * 2. String lastWord = statement.subString(lastSpaceIndex+1)   // beginIndex=18, no-endIndex    good
         * 3. int lastWordLength = lastWord.length();   // 4
         * 4. sout("Last word in the statement is " + lastWord + ", length = " +  lastWordLength);
         */
        // Last word in the statement is STATEMENT, length = 9


    }
}
