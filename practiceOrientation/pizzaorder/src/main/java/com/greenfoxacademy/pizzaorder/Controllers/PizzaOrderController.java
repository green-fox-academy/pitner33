package com.greenfoxacademy.pizzaorder.Controllers;

import com.greenfoxacademy.pizzaorder.Models.PizzaOrder;
import com.greenfoxacademy.pizzaorder.Services.PizzaOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PizzaOrderController {
    private PizzaOrderService pizzaOrderService;

    @Autowired
    public PizzaOrderController(PizzaOrderService pizzaOrderService) {
        this.pizzaOrderService = pizzaOrderService;
    }

    @GetMapping("/")
    public String pizzaMain(Model model, @ModelAttribute(value = "pizzaOrder")PizzaOrder pizzaOrder) {
        model.addAttribute("pizzaOrder", pizzaOrder);
        model.addAttribute("pizzaList", pizzaOrderService.findAll());
        return "main";
    }

    @PostMapping("/order")
    public String pizzaOrder(@ModelAttribute(value = "pizzaOrder")PizzaOrder pizzaOrder) {
        pizzaOrderService.save(pizzaOrder);
        return "redirect:/";
    }

    @GetMapping("/order/{id}")
    public String orderDetails(Model model, @PathVariable Long id) {
        model.addAttribute("pizzaOrder", pizzaOrderService.findById(id));
        return "order";
    }

    @GetMapping("/statistics")
    public String threeMostOrderedPizza (Model model) {
        model.addAttribute("mostOrdered", pizzaOrderService.getMostOrderedPizzas());
        return "statistics";
    }
}
