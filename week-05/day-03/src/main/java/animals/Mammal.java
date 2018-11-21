package main.java.animals;

public class Mammal extends Animal {
    public Mammal(String name, int age, String gender, int hungerLevel) {
        super(name, age, gender, 5);
    }
    public Mammal(String name) {
        super(name, 3, "male", 5);
    }



    @Override
    public String breed() {
        return "pushing miniature versions out.";
    }

    @Override
    public String favFood() {
        return null;
    }


}
