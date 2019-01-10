package com.greenfoxacademy.pizzaorder.Controllers;

import com.greenfoxacademy.pizzaorder.Services.PizzaOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PizzaOrderRestController {
    private PizzaOrderService pizzaOrderService;

    @Autowired
    public PizzaOrderRestController(PizzaOrderService pizzaOrderService) {
        this.pizzaOrderService = pizzaOrderService;
    }

    @GetMapping("/api/orders/{id}")
    public ResponseEntity orderDetails(@PathVariable Long id) {
        return ResponseEntity.ok(pizzaOrderService.findById(id));
    }
}
