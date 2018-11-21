package main.java.music;

public abstract class StringedInstrument extends Instrument{
    protected int numbersOfStrings;

    public StringedInstrument (String name, int numbersOfStrings) {
        super(name);
        this.numbersOfStrings = numbersOfStrings;
    }

    abstract String sound();

    @Override
    public void play() {
        System.out.println(this.name + ", a " + this.numbersOfStrings + "-stringed instrument that goes " + sound());
    }
}
