package Class11.LabSession2;

public class PreviousHomeworks {

    /**
     * Create variable to store student-score and total-possible-score;
     * Based on the percentage, display grade to student:
     * Grade A: 91-100
     * Grade B: 81-90
     * Grade C: 71-80
     * Grade D: 61-70
     * Grade E: 51-60
     * Grade F: less than or equal to 50
     *
     * int maxScore = 200;
     * double studentScore = 150;
     *
     * percentage = (studentScore * 100) / maxScore;    // 94.5
     *
     * if (percentage >= 91) {
     *     sout("Your grade: A");
     * } else if (precentage >= 81) {
     *     sout("Your grade: B");
     * } else if (percentage >= 71) {
     *     sout("Your grade: C");
     * } else if (percentage >= 61) {
     *     sout("Your grade: D");
     * } else if (percentage >= 51) {
     *     sout("Your grade: E");
     * } else {
     *     sout("Your grade: F");
     * }
     *
     * if (studentPercentage>=91) {
     *     System.out.println("Student's Grade is A");
     * } else {
     *     System.out.println("Student's Grade is below A");
     * } if (studentPercentage>=81 && studentPercentage>80) {
     *     System.out.println("Student's Grade is B");
     * }
     *
     *
     *
     */


    /**
     * Write a method to print(no return) the duplicate values in a given String array.
     *
     * Input String array -> {"hello", "peace", "happy" , "hello", "Happy", "hello"}
     *
     * index-0
     *      if (index-0 is equal to index-1)
     *          print index-0
     *      if (index-0 is equal to index-2)
     *          print index-0
     *      ..
     *      ..
     *      if (index-0 is equal to index-lastIndex)
     *          print index-0
     *
     * index-1
     *      if (index-1 is equal to index-2)
     *          print index-1
     *      if (index-1 is equal to index-3)
     *          print index-1
     *      ..
     *      ..
     *      if (index-1 is equal to index-lastIndex)
     *          print index-1
     *
     */
    public void printDuplicates(String[] arr) {
        String duplicates = "";
        for (int i=0 ; i<arr.length ; i++) {
            String word = arr[i].toLowerCase();
            for (int j=i+1 ; j<arr.length ; j++) {
                if (word.equalsIgnoreCase(arr[j])) {
                    if (!(duplicates.contains(word))) {
                        duplicates = duplicates + word + "\n"; // "hello happy " + "hello" -> "hello happy "
                    }
                    // System.out.println(word);
                    break;
                }
            }
        }
        System.out.println(duplicates.trim());
    }

    /**
     * write a method to return the count of vowels in the given string
     * a,e,i,o,u
     *
     * String statement = "have a great day to you";
     * 9
     *
     * split a ->  {"h", "ve ", " gre", "t d", "y to you"} -> counA = length-1
     *
     * split e -> {"hav", " a gr", "at day to you"} -> countE = length-1
     *
     * split i -> {"have a great day to you"} -> countI = length-1
     */
    public int checkVowelCount(String vowels) {
        int vowelCount = 0;
        for (int i = 0; i < vowels.length(); i++) {
            if (vowels.charAt(i) == 'a' || vowels.charAt(i) == 'e' || vowels.charAt(i) == ('i') || vowels.charAt(i) == ('o') || vowels.charAt(i) == ('u')) {
                vowelCount++;
            }
        }
        return vowelCount;
    }

    /**
     * write a method to find (and print) the first perfect square value in the given array. (upto 20)
     *
     * 1*1 = 1
     * 2*2 = 4
     * 3*3 = 9
     * 4*4 = 16
     * 5*5 = 25
     * 6*6 = 36
     * 7*7 = 49
     * 8*8 = 64
     * 9*9 = 81
     * 10*10 = 100
     * 11*11 = 121
     *
     *
     * Input array = {111, 32, 54, 64, 121, 91, 73}
     * 64
     *
     * i=1
     * num = i*i    // 1
     *      if (index-0 == num)
     *          sout(num)
     *          break;
     *      if (index-1 == num)
     *          sout(num)
     *          break;
     *      if (index-2 == num)
     *          sout(num)
     *          break;
     *      ..
     *      ..
     *      if (index-lastIndex == num)
     *          sout(num)
     *          break;
     *
     * i=2
     * num = i*i    // 4
     *      if (index-0 == num)
     *          sout(num)
     *          break;
     *      if (index-1 == num)
     *          sout(num)
     *          break;
     *      if (index-2 == num)
     *          sout(num)
     *          break;
     *      ..
     *      ..
     *      if (index-lastIndex == num)
     *          sout(num)
     *          break;
     * ...
     * ...
     * i=20
     * num = i*i    // 400
     *      if (index-0 == num)
     *          sout(num)
     *          break;
     *      if (index-1 == num)
     *          sout(num)
     *          break;
     *      if (index-2 == num)
     *          sout(num)
     *          break;
     *      ..
     *      ..
     *      if (index-lastIndex == num)
     *          sout(num)
     *          break;
     */
    public void perfectSquare (int[] arr) {

    }





}
