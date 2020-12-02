package Class10.Banking;

public class Customer {

    // variables
    private String name = "";
    private String phoneNumber = "";
    private String ssn = "";
    private double balance = 0.00;
    private int customerId = 0;
    private static int customerCount = 0;

    // methods
    /**
     * Input: String, String, String
     * Return: void
     */
    public void makeProfile(String cName, String cPhone, String cSsn) {
        name = cName;
        phoneNumber = cPhone;
        ssn = cSsn;
        customerCount++;
        customerId = customerCount;
        // customerId = ++customerCount;
    }

    /**
     * Input: -
     * Return: void
     */
    public void showCustomerProfile() {
        System.out.println("Count : " + customerCount);
        System.out.println("Id: " + customerId);
        System.out.println("Name: " + name);
        // Customer phone
        // Customer ssn
        System.out.println("Balance: " + balance);
    }

    /**
     * Input: double
     * Return: double
     */
    public double makeDeposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        } else {
            System.out.println("Invalid amount to deposit");
        }
        return balance;
    }

    /**
     * Input: double
     * Return: double
     */
    public double makeWithdraw(double amount) {
        if (amount>0 && amount<=balance) {
            balance = balance - amount;
        } else {
            System.out.println("Invalid funds");
        }
        return balance;
    }

    /**
     * Input: -
     * Return: double
     */
    public void showBalance() {
        System.out.println("Balance : " + balance);
    }



}
