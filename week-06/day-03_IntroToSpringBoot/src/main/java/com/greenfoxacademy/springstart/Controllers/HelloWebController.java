package com.greenfoxacademy.springstart.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {
    AtomicLong counter = new AtomicLong(1);

    @RequestMapping("/web/greeting")
    public String greeting(Model model) {
        model.addAttribute("name", "World");
        return "greeting";
    }

    @RequestMapping("/web/greetings4") //Web Greet counter app second solution
    public String greeting4(Model model, @RequestParam String name) {
       model.addAttribute("name", name);
       model.addAttribute("counter", counter.getAndIncrement());
       return "greeting4";
    }

}
