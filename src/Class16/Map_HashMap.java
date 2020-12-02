package Class16;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_HashMap {
    public static void main(String[] args) {

        /**
         *
         * Map is an Interface, child of Collection Interface.
         * HashMap is a class which implements Map Interface.
         *
         * Map: it is a datatype which can store pair of values.
         *  --> it doesn't main the order the insertion.
         *
         * pair --> (key,value)
         *
         * {(key->value), (key->value), (key->value), (key->value)}
         * --> key is ALWAYS UNIQUE in a Map.
         *
         * List/Set --> [ val, val, val]
         *
         *
         *
         *
         * Syntax to create Map/HashMap:
         * HashMap<keyDatatypeClass, valueDatatypeClass> myHashMap = new HashMap<>();
         * OR
         * Map<keyDatatypeClass, valueDatatypeClass> myHashMap = new HashMap<>();
         *
         *
         */

        Map<Integer,String> ssnData = new HashMap<>();


        System.out.println("\nssnData -> " + ssnData);
        // to Calculate length/size of HashMap/Map
        System.out.println("Length of ssnData -> " + ssnData.size());   // 0

        // to add pairs in HashMap
        // put
        ssnData.put(101, "Happy");
        ssnData.put(102, "Very Happy");
        ssnData.put(890, "grow");
        ssnData.put(1111, "grow");
        ssnData.put(102, "learn");
        ssnData.put(104, "live");
        ssnData.put(1000, "Peace");
        ssnData.put(9898, "stay healthy");

        System.out.println("\nssnData -> " + ssnData);
        System.out.println("Length of ssnData -> " + ssnData.size());   // 7

        // to remove a pair/value form HashMap/Map
        // if user supplies the key:
        // if key found, removes the pair and returns the associated value
        // else returns null
        System.out.println("Value after removing pair with key-101: " + ssnData.remove(101));
        System.out.println("Value after removing pair with key-100: " + ssnData.remove(100));


        // if user supplies the pair to remove:
        // if pair found and removed, returns true
        // else false
        System.out.println("Result after removing (1111,'Grow'): " + ssnData.remove(1111, "Grow"));     // false
        System.out.println("Value after removing (1000,'live'): " + ssnData.remove(1000, "live"));            // false

        System.out.println("\nssnData -> " + ssnData);
        System.out.println("Length of ssnData -> " + ssnData.size());   // 6

        // to retrieve value associated with a key
        // if key found, returns the associated value
        // else returns null
        System.out.println("Value associated with key-101: " + ssnData.get(101));
        System.out.println("Value associated with key-1000: " + ssnData.get(1000));

        // to check if a given data is present in HashMap
        // if the given data is present in HashMap/Map as Key, returns true
        // else returns false
        System.out.println("is key-792 present as one of the keys?: " + ssnData.containsKey(792));
        System.out.println("is key-9898 present as one of the keys?: " + ssnData.containsKey(9898));

        // to check if a given data is present in HashMap
        // if the given data is present in HashMap/Map as Value, returns true
        // else returns false
        System.out.println("is 'Grow' present as one of the Values?: " + ssnData.containsValue("Grow"));
        System.out.println("is 'live' present as one of the Values?: " + ssnData.containsValue("live"));

        // to get all the keys in a variable
        Set<Integer> allKeys = ssnData.keySet();
        System.out.println("All keys: " + allKeys);

        // to get all the values in a variable
        Collection<String> allValues = ssnData.values();
        System.out.println("All values: " + allValues);

        System.out.println("\nssnData -> " + ssnData);
        System.out.println("Length of ssnData -> " + ssnData.size());
        // to verify if HashMap/Map is empty
        System.out.println("is ssnData empty?: " + ssnData.isEmpty());

        System.out.println("\nClearing the ssnData HashMap");
        ssnData.clear();

        System.out.println("\nssnData -> " + ssnData);
        System.out.println("Length of ssnData -> " + ssnData.size());
        System.out.println("is ssnData empty?: " + ssnData.isEmpty());


        /**
         *
         *
         * (1, "absent"), (2, "present"), (3, "absent"), (4, "absent"), (5, "unknown")
         *
         *
         * remove -> (1, "absent")
         * remove -> (3, "absent")
         *
         * (2, "present"), (4, "absent"), (5, "unknown")
         *
         * take attendance for: 2
         *
         * (2, "absent"), (4, "absent"), (5, "unknown")
         *
         * ssn.put(4,"present")
         *
         * (2, "absent"), (4, "present"), (5, "unknown")
         *
         *
         *
         *
         */

        /*

        Map<Integer,String> ssnData = new HashMap<>();
        ssnData.put(101, "Happy");
        ssnData.put(102, "Very Happy");
        ssnData.put(1000, "Peace");
        ssnData.put(9898, "stay healthy");

        Print the key-value as shows below:
            101 -> Happy
            102 -> Very Happy
            1000 -> Peace
            9898 -> stay healthy

         */















    }
}
