package com.greenfoxacademy.pizzaorder.Repositories;

import com.greenfoxacademy.pizzaorder.Models.PizzaOrder;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PizzaOrderRepository extends CrudRepository<PizzaOrder, Long> {

}
