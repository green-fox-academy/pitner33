package com.greenfoxacademy.pizzaorder;

import com.greenfoxacademy.pizzaorder.Models.PizzaOrder;
import com.greenfoxacademy.pizzaorder.Services.PizzaOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PizzaorderApplication implements CommandLineRunner {

    @Autowired
    private PizzaOrderService pizzaOrderService;

    public static void main(String[] args) {
        SpringApplication.run(PizzaorderApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        pizzaOrderService.save(new PizzaOrder("John", "London, High End 5", "Margaritha"));
        pizzaOrderService.save(new PizzaOrder("Béla", "Bivalybasznád, Fő u. 6.", "Salami"));
        pizzaOrderService.save(new PizzaOrder("Princess Leia Organa", "Adebaraan", "Mushroom"));
        System.out.println("Pizzas delivered to database");

    }
}

