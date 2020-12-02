package Class11.Inheritance;

public class MyMain {
    public static void main(String[] args) {

        Mine m1 = new Mine();   // child var = new child();
                                // access of child class method/var and
                                // parent class methods/var
        m1.myMethod();          // mine-class

        MyParent p1 = new MyParent();   // parent var = new parent();
                                        // access of ONLY parent methods/var
        p1.myMethod();                  // MyParent-class


        MyParent p2 = new Mine();       // parent var = new child();
                                        // access of ONLY parent methods/var
        p2.myMethod();                  // mine-child

        // Mine m2 = new MyParent();       // Compile time error


    }
}
