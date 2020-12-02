package Class9;

public class Homework7 {

    // Homework 7

    /**
     * 1. Create a method to add all the numbers in a array with double-values
     *
     * 2. Create a method to verify if the input-int-number is prime or not
     * prime number: number divisible by 1 and itself
     * eg: 7 -> prime
     * 21 -> not a prime
     *
     * 3. Create a method to find if given string is palindrome.
     * Palindrome: string which reads the same in reverse.
     * racecar  ->  racecar
     * level    ->  level
     *
     * 4. Write a method to print(no return) the duplicate values in a given String array.
     * Input String array -> {"hello", "peace", "happy" , "hello", "Happy", "hello"}
     * Method should print -> hello, happy
     * hello
     * happy
     *
     * 5. Write a method to print(no return) the common values between two arrays (string arrays)
     * Input arrays:
     *  arr1 -> {"hello", "peace", "happy" , "hello", "Happy", "hello", "laugh"}
     *  arr2 -> {"hello", "grow", "laugh" , "peace"}
     * Method should print -> hello, peace, laugh
     * hello
     * peace
     * laugh
     */

    public void method4(String[] arr) {
        String duplicates = "";
        // find first-index and last-Index of arr[0]
        // if (first-Index != last-Index) {
        //      if (!duplicates.contains(arr[0])) {
        //         duplicates = duplicates + arr[0] + " ";     "" + "hello" + " "  -> "hello "
        //      }
        // }
        // find first-index and last-Index of peace
        // if (first-Index != last-Index) {
        //      if (!duplicates.contains("peace"))
        //         duplicates = duplicates + "peace" + " ";
        //      }
        // }
        // find first-index and last-Index of happy
        // if (first-Index != last-Index) {
        //      if (!(duplicates.contains("happy"))) {
        //         duplicates = duplicates + "happy" + " ";     // "hello " + "happy" + " " -> "hello happy "
        //      }
        // }
        // find first-index and last-Index of hello
        // if (first-Index != last-Index) {
        //      if (!duplicates.contains("hello")) {
        //         duplicates = duplicates + "hello" + " ";    // hello happy
        //      }
        // }
    }



}
