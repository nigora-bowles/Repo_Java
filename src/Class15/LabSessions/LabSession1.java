package Class15.LabSessions;

import java.util.ArrayList;
import java.util.Scanner;

public class LabSession1 {

    public static void main(String[] args) {

        /**
         *
         * Collection(I):
         *      List(I):
         *          ArrayList(C):    FYI: ArrayList(C) implements List(I) extends Collection(I)
         *      Set(I):
         *      Map(I):
         *
         *
         */


        ArrayList<String> arrList = new ArrayList();
        ArrayList<String[]> arrList1 = new ArrayList();

        // {"", ""} , {"", "", ""} , .....

        // add values
        arrList.add("happy");
        arrList.add("peace");
        arrList.add("grow");
        arrList.add("learn");
        arrList.add("happy");
        arrList.add("laugh");
        arrList.add("peace");
        arrList.add("happy");

        // length of arraylist
        System.out.println("Length/Size of arrList: " + arrList.size());

        // to retrieve value present at particular index
        System.out.println("Value at index-1 is: " + arrList.get(1));


        /**
         * using for-loop, print the values at even index
         */
        for (int i = 0; i<=arrList.size()-1; i+=2) {
            System.out.println("value at index-" + i + " is " + arrList.get(i));
        }

        /**
         * 1. Create an ArrayList variable, which can store Integer type data
         * 2. Ask user how many values they want to enter/add in the arrayList
         * 3. Run a loop, so that user can add values in arrayList
         *      BUT stop the user as soon user enters the total values
         * 4. print the arrayList
         */
        // #1
        ArrayList<Integer> arr = new ArrayList<>();

        // #2
        System.out.println("how many values they want to enter/add in the arrayList?");
        Scanner scan = new Scanner(System.in);
        int arrLength = scan.nextInt();

        // #3
        for (int i=0 ; i<arrLength ; i++) {
            System.out.println("\nPlease enter value #"+(i+1)+":");     // Please enter value #3:
            int temp = scan.nextInt();
            arr.add(temp);
        }

        // #4
        System.out.println("\nYour created arraylist -> " + arr);

        /**
         * Create a method that is able to find/return the string occurring maximum number of times in given ArrayList.
         *
         *
         *
         * ["happy", "peace", "joy", "grow, "peace", "happy", "peace", "grow"]
         *
         *
         * peace
         *
         *
         *
         *
         */

















    }
}
