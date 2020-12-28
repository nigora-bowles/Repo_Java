package Class11.Inheritance;

public class MyMain {
    public static void main(String[] args) {

        //child Class ref = child class object
        Mine m1 = new Mine();   // child var = new child();
                                // access of child class method/var and
                                // parent class methods/var
        m1.myMethod();          // mine-class


        //parent Class ref = parent class object
        MyParent p1 = new MyParent();   // parent var = new parent();
                                        // access of ONLY parent methods/var
        p1.myMethod();                  // MyParent-class


        //parent Class ref = child class object
        MyParent p2 = new Mine();       // parent var = new child();
                                        // access of ONLY parent methods/var and
                                        // overridden-methods from child class
        p2.myMethod();                  // mine-child


        //child Class ref = parent class object
        // Mine m2 = new MyParent();       // Compile time error


    }
}
