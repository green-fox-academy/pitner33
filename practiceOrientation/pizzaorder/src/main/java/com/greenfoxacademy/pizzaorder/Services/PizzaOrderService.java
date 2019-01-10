package com.greenfoxacademy.pizzaorder.Services;

import com.greenfoxacademy.pizzaorder.Models.PizzaOrder;
import com.greenfoxacademy.pizzaorder.Repositories.PizzaOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class PizzaOrderService {
    private PizzaOrderRepository pizzaOrderRepository;

    @Autowired
    public PizzaOrderService(PizzaOrderRepository pizzaOrderRepository) {
        this.pizzaOrderRepository = pizzaOrderRepository;
    }

    public List<PizzaOrder> findAll() {
        return (List<PizzaOrder>) pizzaOrderRepository.findAll();
    }

    public void save(PizzaOrder pizzaOrder) {
        pizzaOrderRepository.save(pizzaOrder);

    }

    public PizzaOrder findById(Long id) {
        return pizzaOrderRepository.findById(id).get();
    }

    public List<String> getMostOrderedPizzas() {

        Stream<String> pizzaType = findAll().stream().map(e-> e.getPizza());
        Map<String, Long> counts = pizzaType.collect(Collectors.groupingBy(e ->e, Collectors.counting()));

        List<String> returnList = counts.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .map(Map.Entry::getKey)
                .limit(3)
                .collect(Collectors.toList());

        return  returnList;
    }
}
