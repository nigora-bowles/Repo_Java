package Class14.InterfacePkg.Cars;

public class BMWFactory implements Guidelines {

    static String vip = "BMW First class service";

    public void getBMWFirstClassService() {
        System.out.println("Inside first class method");
    }

    @Override
    public void putEngine() {
        System.out.println("BMW All weather engine");
    }

    @Override
    public void putSeats() {
        System.out.println("BMW leather seats");
    }

    @Override
    public void putTyres(String tireType) {
        System.out.println("BMW tyres - " + tireType);
    }

    @Override
    public void addSteering() {
        System.out.println("BMW Heated steering");
    }
}
