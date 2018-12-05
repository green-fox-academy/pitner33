package com.greenfoxacademy.springstart.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {


    @RequestMapping("/greetings")
    public Greetings greetings() {
        return new Greetings(1, "Greetings");
    }

    @RequestMapping("/greetings2")
    public Greetings greetings2(@RequestParam String name) {
        return new Greetings("Hello " + name);
    }
}
