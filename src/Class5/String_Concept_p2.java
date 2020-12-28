package Class5;

import java.util.Arrays;

public class String_Concept_p2 {
    public static void main(String[] args) {

        /**
         * to removes spaces from beginning (before the first character)
         *      and end (after the last character) of the string value
         *
         * Method: trim()
         *
         * This method will NOT change the original value,
         *      it will replace the data, and return to new string.
         */
        String cityName = "       New york     City    IN the     ToWN     of USA        .      ";
        System.out.println("#" + cityName + "#");
        String cityNameTrim = cityName.trim();
        System.out.println("#" + cityName + "#");
        System.out.println("#" + cityNameTrim + "#");

        /**
         * to fetch a portion from a string using index values.
         * Method: subString()
         *
         * Returns: String
         *
         * "New york City IN the ToWN of USA"
         *
         * Input only begin Index:
         *      if beginIndex and endIndex are valid
         *          returns string from beginIndex to end of the string.
         *      else
         *          StringIndexOutOfBoundsException
         *
         *
         * Input beginIndex and endIndex:
         *      if beginIndex and endIndex are valid
         *          returns string from beginIndex up to endIndex-1
         *      else
         *          StringIndexOutOfBoundsException
         *
         *  3,7 : 3,4,5,6   ->   " yor"
         *
         *  PS: It will not change the original string value
         */
        cityName = "New york City IN the ToWN of USA";

        String subFrom10 = cityName.substring(10);
        System.out.println("Substring from index-10 to end: " + subFrom10);

        String subFrom10To15 = cityName.substring(10, 15);  // 10,11,12,13,14
        System.out.println("Substring from index-10 to index-15: " + subFrom10To15);

        int num = 10;
        double bill = 100.09;
        String city = "NEW YORK";

        /**
         *  to cut the string value from a specific point into multiple strings
         *  Method: split()
         *
         *  Returns: String[]
         */
        // cityName = "New york City IN the ToWN of USA";
        String[] afterSplitBy_o = cityName.split("o");  // "New y" , "rk City IN the T" , "WN ", "f USA"
        System.out.println("Array direct variable: " + afterSplitBy_o);
        // shortcut to print array
        System.out.println("Array after split from 'o': " + Arrays.toString(afterSplitBy_o));

        String[] afterSplit = cityName.split(""); // Array with every character at each index
        // cityName = "New york City IN the ToWN of USA";
        // afterSpilt = ["N", "e", "w", " ", "y", "o", "r", "k", " ", "C", "i", "t", ........]


        String[] afterSplit2 = cityName.split(" "); //
        // cityName = "New york City IN the ToWN of USA";
        // afterSplit2 = ["New", "york", "City", "IN", "the", "TOWN", "of", "USA"]
    }
}
