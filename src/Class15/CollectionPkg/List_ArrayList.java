package Class15.CollectionPkg;

import java.util.ArrayList;
import java.util.List;

public class List_ArrayList {
    /**
     * Limitations of Array:
     *
     * 1. While creating the array:
     *      either number of values that are going to be stored in array.
     *          eg: int[] arr = new int[5];
     *      or, all the values that are going to be stored in array.
     *          eg: int[] arr = {11, 33, 44, 22, 55};
     *
     * 2. the array has fixed length
     *
     * 3. array can store values of SAME datatype
     *
     *
     */

    /**
     * Syntax to create ArrayList:
     *
     * ArrayList<datatypeClass> arrList = new ArrayList<>();
     * OR
     * List<datatypeClass> myList = new ArrayList<>();
     *
     * int -> Integer
     * double -> Double
     * char -> Character
     * String -> String
     * boolean -> Boolean
     *
     * eg:
     * Create an arraylist to store int/Integer values
     * ArrayList<Integer> myList = new ArrayList<>();
     *
     *
     *
     * List(I)/ArrayList(C):
     *  It's a datatype which can store multiple values.
     *
     * ArrayList(C) implementing List(I)
     *
     * List variable can store object of ArrayList class.
     *
     *
     * List<Integer> myList = new ArrayList<>();
     * myList.add(10);
     *
     *
     *
     */

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        System.out.println("Names : " + names);

        // calculate size (or length) of ArrayList/List
        System.out.println("Names length: " + names.size());    // 0

        // to add values in arraylist
        names.add("happy");     // ["happy"]
        names.add("peace");     // ["happy", "peace"]
        names.add("joy");       // ["happy", "peace", "joy"]
        names.add("grow");      // ["happy", "peace", "joy", "grow"]
        names.add("peace");     // ["happy", "peace", "joy", "grow, "peace"]


        System.out.println("Names : " + names);
        System.out.println("Names length: " + names.size());    // 5


        //  to remove the values
        // when using index with remove -> if index is found, returns the removedValue else IndexOutOfBoundsException
        System.out.println("\nRemoved value from index-3: " + names.remove(3));
        // when using the value with remove -> if value found (first occurrence) and removed, returns true else false
        System.out.println("Removed 'peace': " + names.remove("peace"));

        System.out.println("\nNames : " + names);
        System.out.println("Names length: " + names.size());

        // to replace value at specific index
        // if index is found, replaces the value and returns the old value.
        // else IndexOutOfBoundsException
        System.out.println("\nAfter replacing index-1 with 'very happy': " + names.set(1, "very happy"));
        System.out.println("Names : " + names);

        // to retrieve from arrayList (to get value from specific index)
        // if index is found, returns the value at given index
        // else IndexOutOfBoundsException
        System.out.println("\nValue at index-0: " + names.get(0));

        // to find the index of a given value (indexOf and lastIndexOf)
        // indexOf
        //      if the given value found, returns the index of FIRST OCCURRENCE of the given value
        //      else returns -1
        System.out.println("Index of 'happy': " + names.indexOf("happy"));  // 0

        // lastIndexOf
        //      if the given value found, returns the index of LAST OCCURRENCE of the given value
        //      else returns -1
        System.out.println("Last index of 'happiness': " + names.lastIndexOf("happiness"));     // -1
        System.out.println("Last index of 'happy': " + names.lastIndexOf("happy"));  // 0

        // to find if a given value in present in arraylist
        // if given value found, returns true
        // else false
        System.out.println("is 'happy' present?: " + names.contains("happy"));
        System.out.println("is ' very happy' present?: " + names.contains(" very happy"));

        // to check if ArrayList is empty or not
        // returns true if empty else false
        System.out.println("\nis ArrayList empty?: " + names.isEmpty());
        System.out.println("Names : " + names);
        System.out.println("Names length: " + names.size());

        // to empty arrayList
        System.out.println("Clearing the arraylist");
        names.clear();

        // to check if ArrayList is empty or not
        // returns true if empty else false
        System.out.println("\nis ArrayList empty?: " + names.isEmpty());
        System.out.println("Names : " + names);
        System.out.println("Names length: " + names.size());



        // Limitation #3: array can store values of SAME datatype.
        List<Object> places = new ArrayList<>();

        places.add("usa");  // String   Object
        places.add(1.1);    // Double   Object
        places.add(100);    // Integer  Object
        places.add(true);   // Boolean  Object

        System.out.println(places);











    }
}
