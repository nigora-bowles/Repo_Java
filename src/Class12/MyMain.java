package Class12;

public class MyMain {
    public static void main(String[] args) {

        CodeTest ct = new CodeTest();

        int[] arr = {0, 5, -1, -1, 2, 5, 3, 7, -1, 2};
        System.out.println(ct.missingSmallest(arr, arr.length));
        System.out.println(ct.missing(arr));


    }
}
