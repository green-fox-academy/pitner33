package main.java.music;

public class ElectricGuitar  extends StringedInstrument {

    public ElectricGuitar() {
        super("Electric Guitar", 6);
    }

    public ElectricGuitar(int numbersOfStrings) {
        super("Electric Guitar", numbersOfStrings);

    }

    @Override
    String  sound() {
        return "Twang";
    }


}
