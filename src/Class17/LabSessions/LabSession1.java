package Class17.LabSessions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LabSession1 {
    public static void main(String[] args) {
        Map<Integer,String> ssnData = new HashMap<>();
        ssnData.put(101, "Happy");
        ssnData.put(102, "Very Happy");
        ssnData.put(890, "grow");
        ssnData.put(1111, "grow");
        ssnData.put(104, "live");
        ssnData.put(1000, "Peace");


        // all keys in a variable
        Set<Integer> allKeys = ssnData.keySet();    // 101, 102, 890, 1111, 104, 1000
        Set<Integer> duplicateKeys = new HashSet<>();
        /*
            101
            Set<Integer> duplicateKeys = new HashSet<>();
            v101
                102
                v102
                if (v101.equalsIgnoreCase(v102) <-- if loop code will not execute.
                    duplicateKeys.add(101);
                    duplicateKeys.add(102);
                890
                v890
                if (v101.equalsIgnoreCase(v890) <-- if loop code will not execute.
                    duplicateKeys.add(101);
                    duplicateKeys.add(890);
                1111
                v1111
                if (v101.equalsIgnoreCase(v1111) <-- if loop code will not execute.
                    duplicateKeys.add(101);
                    duplicateKeys.add(1111);
                ....
                ....
                if (duplicateKeys.size()>0) {
                    sout(v101 + " with keys -> " + duplicateKeys);
                }
            102
            v102
            ...
            ...
            890
            v890
                1111
                v1111
                if (v890.equalsIgnoreCase(v1111) <-- if loop code will execute.
                    duplicateKeys.add(890);
                    duplicateKeys.add(1111);
                ....
                ....
                if (duplicateKeys.size()>0) {
                    sout(v890 + " with keys -> " + duplicateKeys);
                }

         */


    }
}
