package Class11.LabSession1;

public class MyMain {
    public static void main(String[] args) {

        MyClass obj = new MyClass();
        obj.add(1.1, 7.1);
        obj.add(1,1);
        obj.add("", "");

        String name = "happy";

        Child c = new Child();
        c.investment(); // Child Investment


        c.investment();
            // Parent Investment
            // Child Investment

        c.parentMethod1();

        Practice p = new Practice();
        int[] numbers = {111, 32, 11, 54, 64, 144, 11, 82, 91, 23};

        System.out.println(p.firstPerfectSq(numbers));

        String statement = "have a great day a ahead";
        System.out.println(p.vowelNumber(statement));

        System.out.println(findVowels("hello dear"));

    }

    public static int findVowels (String vowels) {
        int count = 0;
        for (int i = 0; i <= vowels.length() - 1; i++) {
            if (vowels.charAt(i) == 'a'|| vowels.charAt(i) == 'e' || vowels.charAt(i) == 'o' || vowels.charAt(i) == 'i' || vowels.charAt(i) == 'u'){
                count++;
            }
        }
        return count;
    }


}
