package Class13.UsingConstructors;

public class BankFlow {
    public static void main(String[] args) {

        Accounts a1 = new Accounts("A1 name", 1111, "savings");

        Accounts a2 = new Accounts("A2 name", 2222, "savings");

        Accounts a6 = new Accounts("My name", "checking");


        a1.deposit(100);

        a2.deposit(200);

        a1.withdraw(10);

        a2.withdraw(20);

        Accounts a3 = new Accounts("A3 Name", 3333, "checking");

        a1.getMiniStatement();

        a2.getMiniStatement();

        a3.getMiniStatement();

        Accounts a4 = new Accounts("A4 name", 4444, "checking");
        // a4.createAccount("A4 name", 4444, "checking");

        // Accounts a4 = new Account("A4", 1234, "S");
        //

        // a4.deposit(100);
        // a4getMiniStatement();
        /*
            A4
            4
            Saving
            $100.00
         */



        a4.getMiniStatement();

        a4.addPhone("1234567890");

        Accounts a5 = new Accounts("A5 name", 5555, "savings");


    }

    /**
     *
     * a1
     *      0
     *      null
     *      0
     *      null
     *      0
     *      0
     *
     * a1.createAccount("myName", 2131, "saving")
     *
     * a1
     *      0
     *      myName
     *      2131
     *      saving
     *      1
     *      1
     *
     * a2
     *      0
     *      null
     *      0
     *      null
     *      0
     *      1
     *
     * a2.createAccount("A 2", 2222, "checking")
     *
     *      0
     *      A 2
     *      2222
     *      checking
     *      2
     *      2
     *
     *
     *
     */



}
