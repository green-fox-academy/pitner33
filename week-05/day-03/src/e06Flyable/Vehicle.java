package e06Flyable;

public abstract class Vehicle {
    protected String name;
    protected int numberOfWheels;
    protected int fuelLevel;

    public Vehicle(String  name, int numberOfWheels, int fuelLevel) {
        this.name = name;
        this.numberOfWheels = numberOfWheels;
        this.fuelLevel = fuelLevel;
    }
}
