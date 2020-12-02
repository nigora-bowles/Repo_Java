package Class10.Banking;

public class UsingCustomer {
    public static void main(String[] args) {
        Customer c1 = new Customer();
        // name="" ; phoneNumber="" ; ssn="" ; balance=0.00
        // customerCount=0 customerId=0

        c1.makeProfile("First", "1234567890", "1234");
        // name="First" ; phoneNumber="1234567890" ; ssn="1234" ; balance=0.00
        // customerCount=1 customerId=1

        System.out.println("Balance : " + c1.makeDeposit(100));
        // name="First" ; phoneNumber="1234567890" ; ssn="1234" ; balance=100.00
        // customerCount=1 customerId=1
        System.out.println("Balance : " + c1.makeWithdraw(50));
        // name="First" ; phoneNumber="1234567890" ; ssn="1234" ; balance=50.00
        // customerCount=1 customerId=1

        Customer c2 = new Customer();
        // name="" ; phoneNumber="" ; ssn="" ; balance=0.00
        // customerCount=1 ; customerId=0

        c2.makeProfile("Second", "764876878", "9090");
        // name="" ; phoneNumber="" ; ssn="" ; balance=0.00
        // customerCount=2 customerId=2

        c2.showCustomerProfile();
        // name="Second" ; phoneNumber="764876878" ; ssn="9090" ; balance=0.00
        // customerCount=2 customerId=2

        c1.showCustomerProfile();
        // name="First" ; phoneNumber="1234567890" ; ssn="1234" ; balance=50.00
        // customerCount=2 customerId=1














    }
}
