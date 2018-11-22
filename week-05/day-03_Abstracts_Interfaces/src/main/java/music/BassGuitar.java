package main.java.music;

public class BassGuitar extends StringedInstrument {

    public BassGuitar() {
        super ("Bass Guitar", 4);
    }

    public BassGuitar(int numbersOfStrings){
        super("Bass Guitar", numbersOfStrings );

    }




    @Override
    String sound() {
        return "Duum-duum-duum";
    }
}
