package Class13.UsingConstructors;

public class Accounts {

    double balance;
    String name;
    int ssn;
    String type;
    String phone;
    int accNum;
    static int accounts;

    /**
     * Create an account
     * Input
     *      String
     *      int
     *      String
     *
     */
    public Accounts (String uName, int uSsn, String uType) {
        name = uName;
        ssn = uSsn;
        type = uType;
        accNum = ++accounts;    // accNum = 2
    }

    public Accounts (String uName, String uType) {
        name = uName;
        type = uType;
        accNum = ++accounts;    // accNum = 2
    }

    /**
     * Create an account
     * Input
     *      String
     *      int
     *      String
     *
     */
    public void createAccount(String uName, int uSsn, String uType) {
        name = uName;
        ssn = uSsn;
        type = uType;
        accNum = ++accounts;    // accNum = 2
    }

    /**
     * Inputs - 1
     *      double
     * Return
     *      void
     *
     * Steps:
     * 1. if given value is valid
     *      then add given value to balance
     *    else display error
     *
     */
    public void deposit (double amount) {
        if (amount > 0) {
            balance+=amount;
            System.out.println("Amount $" + amount + " deposited successfully.");
            System.out.println("Total Balance: $" + balance);
        } else {
            System.out.println("Invalid amount entered -> " + amount);
        }
    }

    /**
     * withdraw
     * Inputs - 1
     *      double
     * Return
     *      void
     *
     * Steps:
     * 1. if amount is valid and less or equal to balance
     *      then subtract amount from balance
     *    else show error
     */
    public void withdraw(double amount) {
        if (amount>0 && amount<=balance) {
            balance-=amount;
            System.out.println("Amount $" + amount + " withdrew successfully.");
            System.out.println("Total Balance: $" + balance);
        } else {
            System.out.println("Invalid amount entered -> " + amount);
        }
    }

    /**
     * to print mini statement
     * Name
     * Account number
     * Account Type
     * Balance
     */
    public void getMiniStatement() {
        System.out.println("Name: " + name +
                "\nAccount Number: " + accNum +
                "\nAccount Type: " + type +
                "\nBalance: $" + balance);
    }

    public void addPhone(String phoneNum) {
        phone = phoneNum;
    }



}
