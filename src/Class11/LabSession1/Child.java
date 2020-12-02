package Class11.LabSession1;

public class Child extends Parent {


    public void childMethod1() {
        System.out.println("Child Method1");
    }

    public void investment() {
        super.investment();
        System.out.println("Child Investment");
    }

    public void talkToFamily() {
        System.out.println("Talk to family on Facetime");
    }

}
