package com.greenfoxacademy.pizzaorder.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PizzaOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String address;
    private String pizza;

    public PizzaOrder() {
    }

    public PizzaOrder(String name, String address, String pizza) {
        this.name = name;
        this.address = address;
        this.pizza = pizza;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPizza() {
        return pizza;
    }

    public void setPizza(String pizza) {
        this.pizza = pizza;
    }
}
