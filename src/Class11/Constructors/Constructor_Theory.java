package Class11.Constructors;

public class Constructor_Theory {

    String name;
    String ssn;
    String addr;
    String phone;

    public Constructor_Theory() {
        System.out.println("Inside no parameter constructor");
    }



    public void makeProfile(String cName, String cSSN) {
        name = cName;
        ssn = cSSN;
    }

    public void abc() {
        //
    }

    /**
     * Constructor:
     *  It's a special method
     *  1. it MUST has the same name as of the class.
     *  2. it cannot have any return type not even void.
     *
     *  When we create an object of the class,
     *      the constructor-method executes AUTOMATICALLY.
     *
     *  Constructor can be parameterized (or arguments).
     *
     *  There can be multiple constructors in a class.
     *      This is called 'Constructor Overloading'.
     *
     *
     *
     */

}
