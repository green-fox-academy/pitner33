package main.java.music;

public class Violin extends StringedInstrument {
    public Violin() {
        super("Violin", 4);
    }
    public Violin(int numbersOfStrings) {
        super("Violin", numbersOfStrings);
    }

    @Override
    String sound() {
        return "Screech";
    }
}
