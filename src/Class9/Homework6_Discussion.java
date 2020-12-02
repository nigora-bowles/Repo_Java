package Class9;

import sun.lwawt.macosx.CSystemTray;

public class Homework6_Discussion {

    // Subject - Homework-6
    public static void main(String[] args) {
        int[] values = {11, 22, 33, 44, 55};
        double arrayAvg = arrayAvg(values);

        int[] valuesAgain = {111, 224, 353};
        double res = arrayAvg(valuesAgain);

        String[] allnames = {"john" , "michael" , "gphilipppre" , "philip" , "ilena" , "palena" , "fahry"};
        String yourName = "philip";
        findNameIndex(allnames, yourName);
    }

    /**
     * Create a method to find average of an int-array
     * 1. add all numbers and store final result in a variable
     *      arr = {11, 22, 33, 44, 55}
     *      total = 0
     *      total = total + arr[0];     // 0+11=11
     *      total = total + arr[1];     // 11+22=33
     *      total = total + arr[2];     // 33+33=66
     *      ..
     *      ..
     * 2. divide total/allNumbers
     */
    public static double arrayAvg(int[] arr) {
        double sum = 0;
        for (int i=0 ; i<arr.length ; i++) {
            sum = sum + arr[i];
        }
        int count = arr.length;
        return sum/count;
    }

    /*
        Two methods
            1. add all values of int-array (addArrayNumbers)
            2. to find average (findAvg)
                using method-1
     */

    /**
     *
     * String[] names = {"john" , "michael" , "gphilipppre" , "philip" , "ilena" , "palena" , "fahry"}
     * String nameToSearch = "philip";
     * Create a method that will print the index of given name in the given array.
     *
     * Inputs:
     *      String[] allNames <- all names given by user
     *      String nameToSearch <- name to find
     * Return Type: int
     *
     *  allNames -> {"johnson" , "michael" , "gphilipppre" , "philip" , "ilena" , "palena" , "fahry"}
     *  nameToSearch -> john
     *
     *  allNames[0] compare with nameToSearch (equalsIgnoreCase) -> true/false
     *      if true -> print index-0 ; stop
     *  allNames[1] compare with nameToSearch (equalsIgnoreCase) -> true/false
     *      if true -> print index-1 ; stop
     *  ..
     *  ..
     *
     */
    public static void findNameIndex(String[] names, String nameToSearch) {
        int nameIndex = -1;
        for (int i=0 ; i < names.length ; i++) {
            if (names[i].equalsIgnoreCase(nameToSearch)) {
                nameIndex = i;
                // System.out.println(nameToSearch + " is at index -" + i);
                break;
            }
        }
        System.out.println(nameToSearch + " is at index -> " + nameIndex);
        // return nameIndex;
    }



}
