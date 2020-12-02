package Class14.Bank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Customer {

    String name, ssn, phone;
    int age;

    public Customer(String name, String ssn, String phone, int age) {
        this.name = name;
        this.ssn = ssn;
        this.phone = phone;
        this.age = age;
    }

    public void editCustomerName() {
        System.out.println("Please enter new customer name: ");
        Scanner scan = new Scanner(System.in);
        name = scan.nextLine();     // why am I not using "this" operator
        System.out.println("Updated name: " + name);
    }

    public void editCustomerPhone() {
        System.out.println("Please enter new customer phone: ");
        Scanner scan = new Scanner(System.in);
        phone = scan.next();     // why am I not using "this" operator
        System.out.println("Updated phone: " + phone);
    }

    public void editCustomerAge() {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Please enter new customer age: ");
            age = scan.nextInt();     // why am I not using "this" operator
            System.out.println("Updated age: " + age);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        } finally {
            scan.close();
        }
    }

    public void printCustomerData() {
        System.out.println("***** Customer Data *****" +
                "\n\tName: " + name +
                "\n\tPhone: " + phone +
                "\n\tAge: " + age);
    }

}
