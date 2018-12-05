package com.greenfoxacademy.springstart.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetCounter {

    @RequestMapping("/web/greetings") //Web Greet counter app first solution
    public String greeting3(@RequestParam String name) {
        Greetings webGreating = new Greetings("Hello " + name);
        return webGreating.content + "! This site was loaded " + webGreating.id + " times since the big bang.";
    }


}
