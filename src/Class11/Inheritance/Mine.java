package Class11.Inheritance;

public class Mine extends MyParent {

    String myName = "Me";

    public void mineMethod() {
        System.out.println("Method in Mine class");
    }

    public void myMethod() {
        System.out.println("Mine - Inside My Method");
    }

    public void hello() {
        System.out.println("hello");
        mineMethod(); // call mineMethod from Mine class.
        myParentMethod(); // call myParentMethod from MyParent class.
        super.myMethod(); // call myMethod from MyParent class. <- super
    }

    /**
     * super
     *      keyword to call parent-class method within child-class methods.
     *      esp when parent and child classes having method with same name.
     */

}
