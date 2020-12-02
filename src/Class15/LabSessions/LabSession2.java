package Class15.LabSessions;

import java.util.ArrayList;
import java.util.Scanner;

public class LabSession2 {
    public static void main(String[] args) {

        /**
         *
         * Collection(I)
         *      List(I)
         *          ArrayList(C)        ArrayList(C) implements List(I) extends Collection(I)
         *      Set(I)
         *      Map(I)
         *
         */

        /**
         * ArrayList is a datatype which can store more than one data of a datatype.
         *
         *
         * ArrayList<String> -->  ["", "", "", "", ""]
         *
         * How to create object of any class
         * classname var = new classname();
         *
         *
         */

        ArrayList<String> arr = new ArrayList<>();

        // []
        // 0

        // add values in ArrayList
        arr.add("happy");
        arr.add("grow");
        arr.add("laugh");
        arr.add("happy");
        arr.add("learn");
        arr.add("happy");
        arr.add("peace");
        arr.add("happy");

        // to find the length --> size()
        System.out.println("Length of arr: " + arr.size());

        // print me the value at index-1
        System.out.println("Value present at index-1: " + arr.get(1));

        /**
         * print all the values from ArrayList
         * happy
         * grow
         * laugh
         * ...
         * ...
         */
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }

        ArrayList<String> arr1 = new ArrayList<>();
        arr1.add("happy");
        arr1.add("grow");
        arr1.add("laugh");
        System.out.println("Lenghth off arr: " + arr.size());

        /**
         * print the value present at even index
         */
        for (int i = 0; i < arr.size(); i+=2) {      // i=i+2
            System.out.println(arr.get(i));
        }

        /**
         * 1. Create an ArrayList variable, which can store Integer type data at each index
         * 2. Ask user how many values they want to enter/add in the arrayList, that will become length/size of your arrayList
         *      using scanner, take int value from user
         * 3. Run a loop, so that user can add values in arrayList (using scanner)
         *      BUT stop the user as soon user enters the total values
         * 4. print the arrayList
         */






        /**
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the num value:");
        // if you want user to enter int data
        int num = input.nextInt();

        System.out.println("You entered : " + num);

        System.out.println("Please enter the str1 value:");
        // if you want user to enter String data (without spaces)
        String str1 = input.next();
        System.out.println("String you entered: " + str1);

        System.out.println("Please enter the str2 value:");
        // if you want user to enter String data (spaces)
        String str2 = input.nextLine();
        System.out.println("String you entered: " + str2);
        */





    }
}
