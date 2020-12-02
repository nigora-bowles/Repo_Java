package Class16;

import java.util.*;

public class Homework10_Solutions {
    /**
     * Question 1:
     * Create a method, that will return all duplicates values with count from the given List<String>
     * List<String> words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
     * Output:
     *      happy - 2
     *      joy - 3
     *      laugh - 2
     */
    public static Map<String, Integer> countDuplicates(List<String> wordsList) {
        Map<String, Integer> wordCount = new HashMap<>();
        for (int j=0 ; j<wordsList.size(); j++) {
            String word = wordsList.get(j);
            int count = 1;
            for (int i = j+1; i < wordsList.size(); i++) {
                if (wordsList.get(i).equalsIgnoreCase(word)) {
                    count++;
                }
            }
            if (count>1 && !wordCount.containsKey(word.toLowerCase())) {
                wordCount.put(word.toLowerCase(), count);
            }
        }
        return wordCount;
    }

     /**
     * Question 2:
     * Create a hashMap with any numbers of key-value pairs from the user
     * Key should be Integer
     * Value should be String
     *
     * Create method that will print the keys with same value, else "All keys have different values"
     *
     * Input to method -> [{101="happy"}, {102="peace"}, {103="Happy"}, {104="learn"}, {105="PEaCe"}, {106="HAPPY"}]
     * Output (print) ->
     *      "happy" with keys -> 101, 103, 106
     *      "peace" with keys -> 102, 105
     *
     * Input to method -> [{111="happy"}, {98="peace"}, {10="LAugh"}, {55="learn"}, {101="Grow"}]
     * Output (print) ->
     *      All keys have different values
     *
     */
    /**
     * Get all Keys from hashMap <-- for loop   Set<Integer> allKeys = [101, 102, 103, 104, 105, 106]
     *   pick key (let's say, key1) from keySet
     *   store value(value1) related to above key in a variable
     *       pick a key(key2) from KeySet <-- for loop
     *             if value of key2 is same as value1
     *                 store key1 and key2 in hashSet
     *       pick a key(key2) from KeySet <-- for loop
     *             if value of key2 is same as value1
     *                 store key1 and key2 in hashSet       101, 103
     *       pick a key(key2) from KeySet <-- for loop
     *             if value of key2 is same as value1
     *                 store key1 and key2 in hashSet
     *       pick a key(key2) from KeySet <-- for loop
     *             if value of key2 is same as value1
     *                 store key1 and key2 in hashSet
     *
     *
     * [{101=v101}, {102=v102}, {103=v103}, {104=v104}]
     *  101
     *  v101 (v101 is the value with key-101)
     *      v101 == v101 --> ignore
     *      v102 == v101
     *          storing 101 and 102 in hashSet ----> [101, 102]
     *      v103 == v101
     *          storing 101 and 103 in hashSet ----> [101, 102, 103]
     *
     *
     * [{101="happy"}, {102="joy"}, {103="happy"}, {104, "peace"}, {105, "joy"}, {106, "happy"}]
     * store all values ---> ["happy", "happy", "joy", "peace", "joy", "happy"] --> using values();
     * find duplicates (in Set) from all values ---> ["happy", "joy"]
     * find keys which has values mentioned in above Set
     *
     *
     */
     public static void setDuplicatekeys(Map<Integer, String> dataMap) {
         Set<Integer> allKeys = dataMap.keySet();
         Map<String,Set<Integer>> keysWithSameValues = new HashMap<>();

         for (Integer key : allKeys) {
             Set<Integer> keysWithDuplicateValues = new HashSet<>(); // this is to store all keys with same value
             String keyValue = dataMap.get(key);
             for (Integer anotherKey : allKeys) {
                 if (anotherKey != key) {
                     if (dataMap.get(anotherKey).equalsIgnoreCase(keyValue)) {
                         keysWithDuplicateValues.add(key);
                         keysWithDuplicateValues.add(anotherKey);
                     }
                 }
             }
             if (keysWithDuplicateValues.size()>0) {
                 keysWithSameValues.put(keyValue.toLowerCase(),keysWithDuplicateValues);
             }
         }
         if (keysWithSameValues.size()>0) {
             for (String key : keysWithSameValues.keySet()) {
                 System.out.println(key + " with keys -> " + keysWithSameValues.get(key));
             }
         } else {
             System.out.println("All keys have different values");
         }
     }

     public static void setDuplicateKeys(Map<Integer, String> dataMap) {
         // get all values in a variables (["happy", "haPpy", "joy", "peace", "joy", "hAppy"])
         Collection<String> allValues = dataMap.values();   // ["happy", "happy", "joy", "peace", "joy", "happy"]
         List<String> myList = new ArrayList<>(allValues);

         // find the values which are occurring more than 1 time (["happy", "joy"])
         Set<String> duplicateValues = new HashSet<>();
         for (int i=0 ; i<myList.size()-1 ; i++) {
             for (int j=i+1 ; j<myList.size() ; j++) {
                 if (myList.get(i).equalsIgnoreCase(myList.get(j))) {
                     duplicateValues.add(myList.get(i).toLowerCase()); // happy
                 }
             }
         }

         // find the keys related to common values
         Map<String, Set<Integer>> finalMapWithAns = new HashMap<>();
         Set<Integer> allkeys = dataMap.keySet();
         for (String value : duplicateValues) {
             Set<Integer> keysWithCommonValues = new HashSet<>();
             for (Integer key : allkeys) {
                 if (dataMap.get(key).equalsIgnoreCase(value)) {
                     keysWithCommonValues.add(key);
                 }
             }
             finalMapWithAns.put(value,keysWithCommonValues);
         }

         if (finalMapWithAns.size()>0) {
             for (String key : finalMapWithAns.keySet()) {
                 System.out.println(key + " with keys -> " + finalMapWithAns.get(key));
             }
         } else {
             System.out.println("All keys have different values");
         }

     }

    public static void main(String[] args) {
        Map<Integer,String> ssnData = new HashMap<>();
        ssnData.put(101, "Happy");
        // ssnData.put(102, "happy");
        ssnData.put(890, "grow");
        // ssnData.put(1111, "gRow");
        // ssnData.put(1102, "HaPPy");
        ssnData.put(104, "live");
        ssnData.put(1000, "Peace");
        // ssnData.put(9898, "stay healthy");
        ssnData.put(998, "stay hEaLthy");
        setDuplicateKeys(ssnData);


        String[] words = {"happy", "peace", "joy", "grow", "haPPY", "joy", "laugh", "HaPpy", "lAugh", "joy"};
        List<String> wordsList = Arrays.asList(words);

        System.out.println(countDuplicates(wordsList));


    }
}
