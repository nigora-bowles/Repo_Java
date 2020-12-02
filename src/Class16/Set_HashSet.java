package Class16;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set_HashSet {
    public static void main(String[] args) {

        /**
         * Set is an Interface, child of Collection Interface.
         * HashSet is a class which implements Set Interface.
         *
         * Set: It's a datatype which can store multiple values, BUT
         *      NOT duplicate.
         *
         *
         * Syntax to create Set/HashSet:
         * HashSet<datatypeClass> myHashSet = new HashSet<>();
         * OR
         * Set<datatypeClass> myHashSet = new HashSet<>();
         *
         *  List vs Set
         *  1. List can contain duplicate data/values whereas Set cannot.
         *  2. List maintains the order of insertion whereas Set(HashSet) doesn't.
         *      HashSet: stores data in memory using the Hashing technique.
         *
         */

        Set<Double> mortages = new HashSet<>();

        System.out.println("Mortages: " + mortages);
        // to calculate size (or length) of Set/HashSet
        System.out.println("Length/Size of mortgages: " + mortages.size());

        // to add values in HashSet/Set
        mortages.add(1.1);
        mortages.add(2.2);
        mortages.add(3.3);
        mortages.add(4.4);
        mortages.add(2.2);
        mortages.add(1.7);
        mortages.add(2.1);

        System.out.println("\nMortages: " + mortages);
        System.out.println("Length/Size of mortgages: " + mortages.size());

        // to remove value from Set/HashSet
        // when using the value with remove ->
        //  if value found and removed, returns true
        //  else returns false
        System.out.println("Removed '2.2' successfully?: " + mortages.remove(2.2));
        System.out.println("Removed '2.8' successfully?: " + mortages.remove(2.8));

        System.out.println("\nMortages: " + mortages);
        System.out.println("Length/Size of mortgages: " + mortages.size());

        // to find if a given value in present in hashSet/Set
        // if given value found, returns true
        // else false
        System.out.println("does mortgage contains '1.7'?: " + mortages.contains(1.7));
        System.out.println("does mortgage contains '1.1'?: " + mortages.contains(1.1));

        System.out.println("\nMortages: " + mortages);
        System.out.println("Length/Size of mortgages: " + mortages.size());
        // to check if HashSet/Set is Empty or not
        System.out.println("is HashSet empty? : " + mortages.isEmpty());

        // to empty HashSet/Set
        System.out.println("\nClearing data from HashSet");
        // mortages.clear();

        System.out.println("\nMortages: " + mortages);
        System.out.println("Length/Size of mortgages: " + mortages.size());
        // to check if HashSet/Set is Empty or not
        System.out.println("is HashSet empty? : " + mortages.isEmpty());



        List<String> names = new ArrayList<>();
        names.add("happy");     // ["happy"]
        names.add("peace");     // ["happy", "peace"]
        names.add("joy");       // ["happy", "peace", "joy"]
        names.add("grow");      // ["happy", "peace", "joy", "grow"]
        names.add("peace");     // ["happy", "peace", "joy", "grow, "peace"]
        names.add("learn");
        names.add("joy");
        names.add("Joy");


        System.out.println("List -> " + names);     // 8
        System.out.println("List size -> " + names.size());

        /**
         * Create Set using values from List
         */
        Set<String> mySet = new HashSet<>(names);
        System.out.println("Set -> " + mySet);      //
        System.out.println("Set size -> " + mySet.size());

        /**
         * Create List using values from Set
         */
        List<Double> myList = new ArrayList<>(mortages);
        System.out.println("\n\nMy List -> " + myList);
        System.out.println("Mortgage -> " + mortages);

        /**
         * Create a method which can tell if given List<Integer> contains duplicate data or not.
         * Input: List<Integer>
         * Return type: boolean
         *
         */




    }

    // Anna
    public static boolean ifAnyDoubles (List<Integer> myList) {
        HashSet<Integer> mySet = new HashSet<>(myList);
        boolean result;
        if (myList.size() == mySet.size()) {
            result = false;
        } else {
            result = true;
        }
        return result;
    }







}
