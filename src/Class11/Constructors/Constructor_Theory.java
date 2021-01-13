package Class11.Constructors;

public class Constructor_Theory {

    String name;
    String ssn;
    String addr;
    String phone;


    public Constructor_Theory(String name) {
        System.out.println("Inside no parameter constructor" + name);
    }



    public void makeProfile(String cName, String cSSN) {
        name = cName;
        ssn = cSSN;
    }

    public void abc() {
        //
    }

    /**
     * Constructor: It's a special method.
     *  1. It has SAME name as of its class.
     *  2. It DOES NOT return anything, not even VOID. (It cannot have any return type).
     *  3. It will execute AUTOMATICALLY, when we create object of the class.
     *      For normal method --> we use object to execute it.
     *      For constructor --> constructor method will execute AUTOMATICALLY, when we create object.
     *
     *  Syntax:
     *  public <SAME NAME AS OF CLASS>() {
     *      // code
     *  }
     *
     *  ----------------
     *
     *  1. Constructor can be public, private or protected.
     *  2. Constructor can have arguments as well
     *  3. There can be more than one Constructor in a class. This is called 'Constructor Overloading'.
     *  4. when there is no constructor defined by the user, then
     *      while creating the object Java creates a default constructor (constructor with no parameter and no code).
     *  5. If user defines a constructor; then Java never creates a default constructor.
     *  6. When do we create a private Constructor?
     *      when we DO-NOT want the user to create object of that class.
     *      and, all methods in such class is 'static'.
     *      eg: we use private constructors in the helper/util files
     *      in other words, a file contains code to read excel-sheet, to take screenshot
     *
     */

}
