package main.java.animals;

public abstract class Animal {
    protected String name;
    protected int age;
    protected String gender;
    protected int hungerLevel;


    public Animal(String name, int age, String gender, int hungerLevel) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hungerLevel = hungerLevel;
    }

    public String getName() {
        return this.name;
    }

    public abstract String breed();

    public abstract String favFood();

    public void eat(int foodAmount) {
        hungerLevel += foodAmount;
    }




}
