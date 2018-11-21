package main.java.animals;

public class Bird extends Animal {
    public Bird(String name, int age, String gender, int hungerLevel) {
        super(name, age, gender, 5);
    }
    public Bird(String name) {
        super(name, 3, "male", 5);
    }


    @Override
    public String breed() {
        return "laying eggs.";
    }

    @Override
    public String favFood() {
        return null;
    }

}
