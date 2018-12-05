package com.greenfoxacademy.springstart;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController //it returns info, not an html - in this case the string "hello Seadog" itself
public class SeadogController {

    @RequestMapping("/seadog")
    public String hello(@RequestParam String p) {
        System.out.println(p);
        return "hello Seadog";
    }

    @RequestMapping("/pet")
    public Pet pet() {
        return new Pet("petsy");
    }
}
