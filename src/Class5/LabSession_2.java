package Class5;

public class LabSession_2 {
    public static void main(String[] args) {

        String sentence = "Lets make a WoRld, is a WORLD where everybody is HaPpy and live hAppYly";

        // "Lets make a Happy WoRld is a WORLD where everybody is HaPpy and
        // live hAppYly"

        // how many times "Happy" appears in the sentence? (ignore cases)

        /*
            1. convert sentence in to lowercase, and store new value in same variable
            2. split by "happy" -> String[] words
            3. int threads = words.length
            4. threads-1
         */
        sentence = sentence.toLowerCase();
        String[] words = sentence.split("happy");
        int threads = words.length;
        int happyCount = threads-1;
        System.out.println(happyCount);



        // String sentence = "Lets make a WoRld, is a WORLD where everybody is HaPpy and live hAppYly";
        // replace all A/a to Z in sentence

        /*
            1. convert sentence into lowercase, and store new value in same variable
            2. replace('a', 'Z'), and store the new value in new variable.
         */


        /*
            String str = "hello dear how are you?";
            Assign result(String) as,
                "valid" if length of str is greater than 10
                else assign "invalid"
         */
        /*
            1. find length of str using length(), and store in strLength(int)
            2. Use ternary operator
                String result = strLength>10?"valid":"invalid"
         */
        int a=10;
        double b = 20.0;
        System.out.println(a+b);    // double


        /**
         * Create abbreviation:
         * String threeWordsSentence =  "happy NeW year";
         *      // code
         * HNY
         */
        /*
            1. split by " ", this generates String[] words  // "happy", "NeW", "year"

            2. convert words[0] into uppercase,and store in same variable   // HAPPY
            3. find first character in words[0] using charAt(), store in new variable(a) -> H

            2. convert words[1] into uppercase,and store in same variable   // NEW
            3. find first character in words[1] using charAt(), store in new variable(b) -> N

            2. convert words[2] into uppercase,and store in same variable   // YEAR
            3. find first character in words[2] using charAt(), store in new variable(c) -> Y


            2. convert words[i] into uppercase,and store in same variable   // YEAR
            3. find first character in words[i] using charAt(), store in new variable(c) -> Y

            sout(a+b+c)     // HNY

         */


        /**
         * Array (non primitive datatype, which can store more than one value of same datatype).
         *
         * 1. total number of values that we want to store in array
         *      OR
         * 2. all the values that I want to store in array
         *
         *
         * 1.
         * datatype[] arr = new datatype[noOfValues];
         *      OR
         * 2.
         * datatype[] arr = {val1, val2, val3, val4, val5};
         *
         */
        int[] num = new int[5];     // { ,  ,  ,  , }
        num[3]= 33;                 // { ,  ,  , 33, }
        num[0]=11;                  // { 11,  ,  , 33, }
        num[1]=22;
        num[2]=44;
        num[4]=11;                  // {11, 22, 44, 33, 11}

        String[] names = {"happy", "peace", "world", "laugh", "grow"};  // 5
        // {"happy", "peace", "world", "laugh", "grow"}

        // print value at index-2 from num-array
        System.out.println(num[2]);

        // find length of value present at index-1 in names array.
        /*
            retrieve value from index-1
            find length of it
         */
        String var = names[1];    // var = peace
        int varLength = var.length();      // varLength = 5



    }
}
