package Class11.LabSession2;

public class MyMain {
    public static void main(String[] args) {

        String[] arr = {"hello", "peace", "happy" , "hello", "Happy", "hello"};
        PreviousHomeworks p = new PreviousHomeworks();
        p.printDuplicates(arr);

        System.out.println(p.checkVowelCount("hcdf"));


    }
}
