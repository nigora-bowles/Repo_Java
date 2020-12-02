package Class10;

public class Static_AccessModifier {

    int num = 10;
    String name = "Default";
    static int count = 0;
    double balance = 0.00;

    public void enterData(String yourName, int yourNum) {
        name = yourName;
        num = yourNum;
    }

    public void increaseCount(int increaseBy) {
        count = count + increaseBy;
    }

    public int getCountValue() {
        return count;
    }

    public String showUserData() {
        System.out.println("Num = " + num);
        System.out.println("Name = " + name);
        return name;
    }

    public void showCountValue() {
        System.out.println("Count = " + count);
    }

    public static void showUserFullData() {
        System.out.println("User complete profile");
    }
}
