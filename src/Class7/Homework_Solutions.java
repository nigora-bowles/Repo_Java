package Class7;

public class Homework_Solutions {
    public static void main(String[] args) {

        // Subject - Homework 4

        /**
         * Create variable to store student-score and total-possible-score;
         * Based on the percentage, display grade to student:
         * Grade A: 91-100
         * Grade B: 81-90
         * Grade C: 71-80
         * Grade D: 61-70
         * Grade E: 51-60
         * Grade F: less than or equal to 50
         */
        double studentScore = 120;
        double maxScore = 200;
        char studentGrade;
        // calculate percentage
        // Your percentage: XX.yy and your grade: Z
        if (studentScore >= 0 && studentScore <= maxScore) {
            double percentage = (studentScore/maxScore)*100;
            if(percentage >= 91) {
                studentGrade = 'A';
            } else if (percentage >= 81) {
                studentGrade = 'B';
            } else if (percentage >= 71) {
                studentGrade = 'C';
            } else if (percentage >= 61) {
                studentGrade = 'D';
            } else if (percentage >= 51) {
                studentGrade = 'E';
            } else {
                studentGrade = 'F';
            }
            System.out.println("Your percentage: " + percentage + " and your grade: " + studentGrade);
        } else {
            System.out.println("Invalid score entered by you." +
                    "\nEntered student score: " + studentScore +
                    "\nEntered max score: " + maxScore);
        }


        /**
         * store value in an int variable
         * if the number is divisible by 3, print "divisible by 3"
         * if the number is divisible by 5, print "divisible by 5"
         * if the number is divisible by 3 and 5, print "divisible by both"
         * if not divisible by 3 or 5, print the number
         *
         * eg:
         * int number = 15;   // divisible by both
         *
         *
         */
        int number = 15;

        if (number%3==0 && number %5==0) {
            System.out.println("divisible by both");
        } else if (number%3==0) {
            System.out.println("divisible by 3");
        } else if (number%5==0) {
            System.out.println("divisible by 5");
        } else {
            System.out.println(number);
        }


        /**
         * Checking car mode (P, D, N, R)   // switch
         * if car mode is P and "you can park car"
         * if car mode is D drive car
         *      if drive type is Snow, display "You are on Snow mode"
         *      if drive type is Sport, display "You are on Sport mode"
         *      if drive type is Eco, display "You are on Eco mode"
         * if car mode is N you can "put car in car wash"
         * if car mode is R you can "revere the car"
         */
        char gear = 'D';
        String cMode = "Eco";  // Snow, Sport or Eco

        // code
    }
}
