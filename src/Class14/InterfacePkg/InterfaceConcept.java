package Class14.InterfacePkg;

public interface InterfaceConcept {

    /**
     * 1. Interface looks like a class.
     * 2. It contains method with ONLY signature, no method with body/code.
     *      In other words, all methods inside interface are Abstract by default.
     * 3. We can create variable of an Interface,
     *      BUT can NEVER create object of an interface.
     * 4. A class can implement one or more interfaces.
     * 5. class which implements the interface, has to give body to all interface methods.
     * 6. By default, all variables are static and final in interface.
     * 7. an Interface can extend another Interface.
     *
     *      Interface1
     *
     *      Interface2 extends Interface1
     *
     *      Class MyClass implements Interface2
     *          // MyClass has to give body to methods from Interface2 as well as Interface1
     *
     */


    public void sayHello();
    /**
     * Abstract Method:
     *      Method with ONLY signature and NO body/code.
     */

    public int addNum(int num1, int num2);




}
