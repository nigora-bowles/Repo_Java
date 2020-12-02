package Class17.LabSessions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LabSession2 {
    public static void main(String[] args) {

        /**
         * List -> [val, val2, val3]
         *
         * Map -> [k-v, k-v, k-v]
         */

        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(101,"happy");
        myMap.put(10,"job");
        myMap.put(908,"learn");
        myMap.put(1111,"grow");
        myMap.put(76,"HappY");

        // if value with Key-76 is of length greater than 4 --> print 'available'
        // else --> print 'not available'
        System.out.println(myMap.get(76));  // HappY
        if( myMap.get(76).length()> 4){
            System.out.println("available");
        } else {
            System.out.println("not available");
        }

        // print the keys which has value of length > 4
        /*
            101
            908
            76
         */
        Set<Integer> allKeys = myMap.keySet();
        for (Integer key : allKeys) {
            String value = myMap.get(key);
            if (value.length() > 4) {
                System.out.println(key);
            }
        }





    }
}
