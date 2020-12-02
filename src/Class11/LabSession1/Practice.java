package Class11.LabSession1;

public class Practice {

    /**
     * Method to find(and print) the first number in given array which is a perfect square.
     *
     * 1*1 = 1
     * 2*2 = 4
     * 3*3 = 9
     * 4*4 = 16 (16 is perfect square of 4)
     * 5*5 = 25
     * 6*6 = 36
     * 7*7 = 49
     * 8*8 = 64
     * 9*9 = 81
     * 10*10 = 100
     * 11 * 11 = 121
     *
     * int numbers = {111, 32, 43, 54, 64, 144, 11, 82, 91, 23}
     * 64
     *
     * 1
     * 1*1 = 1
     * index-0 == 1
     *      print index-0
     *      stop loop (break)
     * index-1 == 1
     *      print index-1
     *      stop loop (break)
     * index-2 == 1
     *      print index-2
     *      stop loop (break)
     * ...
     * index-last == 1
     *      print index-last
     *      stop loop (break)
     *
     * 2
     * 2*2 = 4
     * index-0 == 4
     *      print index-0
     *      stop loop (break)
     * index-1 == 4
     *      print index-1
     *      stop loop (break)
     * index-2 == 4
     *      print index-2
     *      stop loop (break)
     * ...
     * index-last == 4
     *      print index-last
     *      stop loop (break)
     * 3
     * 3*3 = 9
     * index-0 == 9
     *      print index-0
     *      stop loop (break)
     * index-1 == 9
     *      print index-1
     *      stop loop (break)
     * index-2 == 9
     *      print index-2
     *      stop loop (break)
     * ...
     * index-last == 9
     *      print index-last
     *      stop loop (break)
     *
     */

    // int numbers = {111, 32, 1, 54, 64, 144, 11, 82, 91, 23};
    public int firstPerfectSq(int[] arr) {
        int firstPerfectS = 0;
        boolean foundPerfectSquare = false;
        int num = 0;
        for (int i = 0; i <= 20; i++) {
            num = i * i;
            for (int m=0; m<arr.length; m++) {
                if (num == arr[m]) {
                    foundPerfectSquare = true;
                    firstPerfectS = arr[m];
                    break;
                }
            }
            if (foundPerfectSquare) {
                break;
            }
        }
        return firstPerfectS;
    }

    /**
     * write a method to return the count of vowels in the given string
     * a,e,i,o,u
     *
     * String statement = "have a great day ahead";
     * 9
     */

    public int vowelNumber(String str){
        int vowelCount = 0;
        for (int i = 0; i < str.toLowerCase().length(); i++){
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                vowelCount++;
            }
        }
        return vowelCount;
    }

















}
