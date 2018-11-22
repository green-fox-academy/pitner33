package e06Flyable;

public class Helicopter extends Vehicle implements Flyable {

    public Helicopter(int numberOfWheels) {
        super("Helicopter", numberOfWheels, 50);
    }

    @Override
    public void land() {
        System.out.println(name + " is landing");
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying");
    }

    @Override
    public void takeoff() {
        System.out.println(name + " is taking off");
    }
}
