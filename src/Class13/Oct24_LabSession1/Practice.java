package Class13.Oct24_LabSession1;

public class Practice {


    /**
     * write method to reverse a string
     * Input:
     *      string
     *
     * Return:
     *      String
     */
    public String revString(String str) {
        /*

            String abc = "";

            happy
            yppah

            abc = abc + charAt(len-1)   // abc = "" + y = y
            abc = abc + charAt(len-2)   // abc = y + p = yp
            abc = abc + charAt(len-3)   // abc = yp + p = ypp
            abc = abc + charAt(len-4)
            abc = abc + charAt(len-5)

            return abc to user

         */
        String abc = "";
        int len = str.length();     // 5
        for (int i=1 ; i<=len ; i++) {
            abc = abc + str.charAt(len-i);
        }
        return abc;
    }

    /**
     * Find the index given name in given names array
     * Inputs:
     *      String[] names
     *      String findThis
     *
     * Return
     *      int
     *
     *
     *  ["happy", "peace", "laugh", "grow"]
     */
    public int findIndexForName(String[] names, String findThis) {
        int resultIndex = -1;
        /*
            ["happy", "peace", "learn", "grow"]     // laugh
            pick index-0 from names array //names[0]
            compared with give string // boolean res = names[0].equalsIgnoreCase(findThis)
            if (equal)  if (res == true)
                got index value     resultIndex = 0;
                stop/break          break;
            pick index-1
            compared with give string
            if (equal)
                got index value
                stop/break
            pick index-2
            compared with give string
            if (equal)
                got index value
                stop/break
            pick index-3
            compared with give string
            if (equal)
                got index value
                stop/break
         */
        for (int i=0 ; i<names.length; i++) {
            String name = names[i];
            boolean res = name.equalsIgnoreCase(findThis);
            if (res == true) {
                resultIndex = i;
                break;
            }
        }
        return resultIndex;
    }


    /**
     * find the maximum number from given int array
     * Inputs:
     *      int[] numbers
     *
     * Return:
     *      int
     */
    public int maxInArray(int[] numbers) {
        int max = numbers[0];
        // [-11, -33, -22, -55, -10, -6]
        /*
            numbers[1] > max
                max = numbers[1]
            numbers[2] > max
                max = number[2]
            numbers[3] > max
                max = numbers[3]
            numbers[4] > max
                max = number[4]
            numbers[5] > max
                max = numbers[5]
         */
        for (int i=1 ; i<numbers.length ; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

}
