package Class4;

public class String_Concept {
    public static void main(String[] args) {

        String cityName = "New York City";
        // Length = 13
        // lastIndex = 12
        // lastIndex = length - 1

        // String methods or Methods available in String class.
        // Method is set of code to perform a specific task.

        System.out.println("cityName = " + cityName);   // cityName = New York City

        /**
         * how to find/calculate the length of String
         * Method: length()
         */
        int cityNameLength = cityName.length();
        System.out.println("Length of '" + cityName + "' is: " + cityNameLength);   // 13

        /**
         * to convert entire string value in lowercase
         * Method: tolowercase()
         *
         * This method will NOT change the original value,
         *      it will replace the data, and return to new string.
         */

        /*
            converting the value in cityName variable in lowercase
            and, storing the all-lowercase value in cityNameInLowerCase variable
                KEEPING the original value of cityName as it is.
         */
        String cityNameInLowerCase = cityName.toLowerCase();
        System.out.println("cityName in lowercase: " + cityNameInLowerCase); // new york city
        System.out.println("cityName: " + cityName); // New York City

        // cityName = cityName.toLowerCase();
        /*
            converting the value in cityName variable in lowercase
            and, replacing the original value of cityName with the all-lowercase value
         */

        /**
         * to convert entire string value in uppercase
         * Method: toUppercase()
         *
         * This method will NOT change the original value,
         *      it will replace the data, and return to new string.
         */
        String cityNameInUpperCase = cityName.toUpperCase();
        System.out.println("cityName in uppercase: " + cityNameInUpperCase); // NEW YORK CITY
        System.out.println("cityName: " + cityName); // New York City

        /**
         * For comparison, when we need to verify if two strings are identical
         * Method: equals()
         *
         * Returns: boolean
         *
         * String abc = "New York";
         * String def = "New York city";
         *
         * boolean result = abc.equals(def);               // result = false
         * boolean result1 = abc.equalsIgnoreCase(def);    // result = false
         *
         */
        boolean isEqual = cityName.equals(cityNameInUpperCase);
        System.out.println("is " + cityName + " equals to " + cityNameInUpperCase + ": " + isEqual);    // false

        /**
         * For comparison, when we need to verify if two strings have same value
         * Method: equalsIgnoreCase()
         *
         * Returns: boolean
         */
        boolean isEqualsIgnoreCase = cityName.equalsIgnoreCase(cityNameInUpperCase);
        System.out.println("is " + cityName + " equals (ignore case) to " + cityNameInUpperCase + ": " + isEqualsIgnoreCase); // true

        /**
         * to find if a particular sequence is present in the String
         * Method: contains()
         *
         * Returns: boolean
         */
        boolean isContains_new = cityName.contains("new");  // cityName = New York City
        System.out.println("Does " + cityName + " contain 'new': " + isContains_new);   // false

        /**
         * Task: verify if cityName contains "nEw"    // cityName = New York City
         * Note: pls ignore case
         * Expected ans: true
         */
        // cityName = cityName.toLowerCase();  // cityName = new york city
        // String newStr = "nEw".toLowerCase();    // newStr = new
        // boolean isContains_new_IgnoringCases = cityName.contains(newStr);
        // -- OR --
        // boolean isContains_new_IgnoringCases = cityName.toLowerCase().contains("nEw".toLowerCase());
        // System.out.println("Does " + cityName + " contain 'nEw' (ignoring cases): " + isContains_new_IgnoringCases );  // true

        /**
         * to replace in string
         * Method: replace
         *
         * It will replace all instances
         * This method will NOT change the original value,
         *      it will replace the data, and return to new string.
         */
        // cityName = "New York CitY";
        String cityNameReplace_Y_z = cityName.replace('Y', 'Z'); // New York City
        System.out.println("cityName : " + cityName);
        System.out.println("cityName after replace Y with z: " + cityNameReplace_Y_z);

        String cityNameReplaceMultiple = cityName.replace("w Y", "Hello world");
        System.out.println("cityName : " + cityName);
        System.out.println("cityName after replace multiples: " + cityNameReplaceMultiple); // NeHello Worldork City

        /**
         *  to find the char present at which index
         *  Method: charAt()
         *
         *  If given index within the index-range, it will return the char at the index
         *  else, it will throw Exception (StringIndexOutOfBoundsException)
         *
         */
        char charAtIndex7 = cityName.charAt(7);
        System.out.println("In '" + cityName + "' char at index 7 is: " + charAtIndex7);

        /**
         * Task: Write a code to print the char present at last index of the string.
         * String hello = "Hello Worldwide";
         * char lastIndexChar;
         * // code
         * // 1. find the length of String
         * // 2. Using length value, calculate the value of last Index (lastIndex = length -1)
         * // 3. Using the charAt method, we can find the char present at lastIndex
         * sout("char at last index is : " + lastIndexChar)
         */
        String hello = "Hello Dear, how are you?";
        char lastIndexChar;
        int len = hello.length();
        int lastIndex = len - 1;
        lastIndexChar = hello.charAt(lastIndex);
        System.out.println("char at last index is : " + lastIndexChar);

        /**
         *  to find the Index of the given value (FIRST occurrence)
         *  Method: indexOf()
         *
         *  If the given value found,
         *      will return the index of FIRST occurrence of the given value.
         *  else
         *      return -1
         *
         */
        cityName = "New york City IN the ToWN";
        int indexOfN = cityName.indexOf("N");      // cityName = New York City
        System.out.println("index of 'N' in " + cityName + " is: " + indexOfN); // 0

        int indexOfn = cityName.indexOf("zebra");      // cityName = New York City
        System.out.println("index of 'n' in " + cityName + " is: " + indexOfn); // -1

        int indexOfMultiple = cityName.indexOf("york");
        int indexOfMultiple2 = cityName.toUpperCase().indexOf("city".toUpperCase());    //
        System.out.println("index of 'york' in " + cityName + " is: " + indexOfMultiple); // 4
        System.out.println("index of 'city' (Ignoring cases) in " + cityName + " is: " + indexOfMultiple2); // 9

        /**
         *  to find the Index of given value (LAST occurrence)
         *  Method: lastIndexOf()
         *
         *  If the given value found,
         *      will return the index of LAST occurrence of the given value.
         *  else
         *      return -1
         */
        cityName = "New york City IN the ToWN of USA";
        int lastIndexOfN = cityName.lastIndexOf("N");
        System.out.println("Last index of 'N' in '" + cityName + "' is : " + lastIndexOfN); // 24
        int lastIndexOfRus = cityName.lastIndexOf("Rus");
        System.out.println("Last index of 'Rus' in '" + cityName + "' is : " + lastIndexOfRus); // -1

        /**
         * To find if the String starts with the given value
         * Method: startsWith
         *
         * Returns: boolean
         */
        boolean cityNameStartsWith_ne = cityName.startsWith("ne");  // New york City IN the ToWN
        System.out.println("does '" + cityName + "' start with 'ne'?: " + cityNameStartsWith_ne); // false

        boolean cityNameStartsWith_New_y = cityName.startsWith("New y");  // New york City IN the ToWN
        System.out.println("does '" + cityName + "' start with 'New y'?: " + cityNameStartsWith_New_y); // true


        /**
         * To find if the String ends with the given value
         * Method: endsWith
         *
         * Returns: boolean
         */
        boolean cityNameEndsWith_e_ToWN = cityName.endsWith("e ToWN");
        System.out.println("does '" + cityName + "' ends with 'e ToWN'? : " + cityNameEndsWith_e_ToWN);   // true

    }
}
