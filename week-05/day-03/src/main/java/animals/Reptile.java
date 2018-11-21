package main.java.animals;

public class Reptile extends Animal {
    public Reptile(String name, int age, String gender, int hungerLevel) {
        super(name, age, gender, 5);
    }
    public Reptile(String name) {
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
