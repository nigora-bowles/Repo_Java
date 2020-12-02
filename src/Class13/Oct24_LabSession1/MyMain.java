package Class13.Oct24_LabSession1;

public class MyMain {
    public static void main(String[] args) {
        int[] myNumbers = {-11, -7, -44, -22, -66, -33};

        Practice p = new Practice();

        int maxInNumbers = p.maxInArray(myNumbers);

        System.out.println("Maximum: " + maxInNumbers);

    }
}
