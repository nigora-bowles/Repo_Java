package Class15.LabSessions;

import java.util.ArrayList;

public class Tests {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        // to add values in arraylist
//===========================================================
        names.add("Imran Khan");        //["Imran Khan"]
        names.add("Sunil Gavaskar");    //["Imran Khan","Sunil gavaskar"]
        names.add("Arjuna Ranatunga");  //["Imran Khan","Sunil gavaskar","Arjuna Ranatunga"]
        names.add("Brian Lara");        //["Imran Khan","Sunil gavaskar","Arjuna Ranatunga","Brian Lara"]
        names.add("Sakib Al Hasan");       //["Imran Khan","Sunil gavaskar","Arjuna Ranatunga","Brian Lara","Sakib Khan"]
        System.out.println("Names: " + names);
        System.out.println("Names Length:" + names.size());  //5

// to remove the value
//=======================================================
// when using index with remove-> if index is found,returns the removed value else IndexOutOfBoundException.
        System.out.println("\nRemoved value from index-3: " + names.remove(3));
// when using the value with remove -> if value found(first occurrence) and removed,returns true else false.
        System.out.println("Removed 'Sakib Al Hasan': " + names.remove("Sakib Al Hasan"));
        System.out.println("\nNames: " + names);
        System.out.println("Names Length: " + names.size());
// to replace value at specific index
//================================================================
// if index is found, replaces the value and return the old value.
// else IndexOutOfBoundException
        System.out.println("After replacing index no-0 with 'Mark Taylor': " + names.set(0,"Mark Taylor"));
        System.out.println("\nNames: " + names);
// to retrieve from arraylist (to get value from specific index)
//===============================================================
// if index is found, returns the value at given index
// else IndexOutOfBoundException
        System.out.println("\n value at index-0 " + names.get(0));
// to find the index of a given value (Indexof and lastIndex)
// IndexOf
//==========
// if the given value found, returns the index of FIRST OCCURRENCE of the give value
// else returns-1
        System.out.println("Index of 'Imran Khan' " + names.indexOf("Imran Khan"));//0
// lastIndexOf
//==============
// if the given value found,return the index of LAST OCCURRENCE of the given value
// else returns -1
        System.out.println("Last index of 'Sakib Ahmed': " + names.lastIndexOf("Sakib Ahmed"));//-1
        System.out.println("Last Index of 'Sakib Al Hasan' " + names.lastIndexOf("Sakib Al Hasan")); //0
// to find if a given value in present in arraylist
//========================================================
// if given value found, return true
// else false
        System.out.println("is 'Imran Khan' present?:" + names.contains("Imran Khan"));
        System.out.println("is 'imran khan' present:?" + names.contains("imran khan"));
    }
}
