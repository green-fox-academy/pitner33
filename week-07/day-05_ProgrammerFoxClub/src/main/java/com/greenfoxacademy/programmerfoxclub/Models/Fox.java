package com.greenfoxacademy.programmerfoxclub.Models;

import java.util.ArrayList;
import java.util.List;

public class Fox {
    private String name;
    private List<String> listOfTricks;
    private String food;
    private String drink;

    public Fox(String name) {
        this.name = name;
        this.listOfTricks = new ArrayList<>();
        this.food = "pizza";
        this.drink = "beer";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getListOfTricks() {
        return listOfTricks;
    }

    public void setListOfTricks(List<String> listOfTricks) {
        this.listOfTricks = listOfTricks;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public void addTrick(String trick) {
        listOfTricks.add(trick);
    }
}
