package Class14.InterfacePkg.Cars;

public class FordFactory implements Guidelines, EnvironmentGuidelines {


    public void putEngine() {
        System.out.println("Ford electric engine");
    }

    public void putEngine(String engineTye) {
        System.out.println("Ford engine: " + engineTye);
    }

    @Override
    public void putSeats() {
        System.out.println("Ford premium seats");
    }

    @Override
    public void putTyres(String tireType) {
        System.out.println("Ford tyres - " + tireType);
    }

    @Override
    public void addSteering() {
        System.out.println("Ford basic steering");
    }

    @Override
    public void carbonEmission() {

    }

    @Override
    public void plasticUsed() {

    }
}
