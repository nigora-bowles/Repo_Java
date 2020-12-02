package Class10.AccessModifiers;

public class Modifiers {

    /**
     * public - accessible from anywhere in the project
     * protected - accessible within the package
     * private - only accessible within the class
     * default - as as protected
     */

    private int var1 = 100;
    private String var2;
    private double var3;

    public void method1()  {
        System.out.println("Inside Method1");
    }

    protected void method2()  {
        System.out.println("Inside Method1");
    }

    private void method3()  {
        System.out.println("Inside Method1");
    }




}
