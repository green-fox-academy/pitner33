package main.java.animals;

import e06Flyable.Flyable;

public class Bird extends Animal implements Flyable {
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

    @Override
    public void land() {
        System.out.println(name + " is landing");
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying");    }

    @Override
    public void takeoff() {
        System.out.println(name + " is taking off");
    }
}
