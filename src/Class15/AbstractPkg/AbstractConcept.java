package Class15.AbstractPkg;

public abstract class AbstractConcept {

    /**
     *
     * Abstract Class - is special type of class.
     * 1. this class can contain methods with ONLY signature (abstract method, like an Interface)
     *    and also can contain usual methods (methods with body and signature, like a usual class)
     *
     * 2. To create abstract class, we have to use "abstract" keyword after the access-modifier.
     *
     * 3. By default, all methods inside abstract class are normal method.
     *    In order to create abstract method, we have to use "abstract" after the access-modifier in the method signature.
     *
     * 4. We can create variable of abstract-class type, BUT
     *    CANNOT create object of an abstract class.
     *
     *
     *  AbstractConcept abc;
     *
     *  what is the datatype of abc? -> AbstractConcept
     *
     *
     */

    public void sayHello() {    // make them sit 6 feet apart
        System.out.println("Hello");
    }

    public abstract void sayBye();  // give comfortable atmosphere in classroom







}
