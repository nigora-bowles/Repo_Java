package Class14.InterfacePkg.Cars;

public class Market {
    public static void main(String[] args) {

        FordFactory f1 = new FordFactory();
        BMWFactory b1 = new BMWFactory();

        // InterfaceConcept ic = stores the object of class which is
        //                       in direct/indirect relation with interface.

        Guidelines ic = new FordFactory();

        Guidelines g = new FordFactory2();

        System.out.println(BMWFactory.vip);

        System.out.println(Guidelines.str);

        BMWFactory.vip = "New value for vip";

        // Guidelines.str = "new value for str";


        f1.addSteering();       // Ford basic steering
        b1.addSteering();       // BMW Heated steering

        f1.putEngine();
        f1.putTyres("Premium");



    }
}
