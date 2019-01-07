package com.greenfoxacademy.w09d01.Controllers;

import com.greenfoxacademy.w09d01.Models.*;
import com.greenfoxacademy.w09d01.Services.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RestControllers {

    @Autowired
    private ResultService resultService;

    @GetMapping("/doubling")
    public Doubling doubling(@RequestParam(value="input", required = false) Integer input) {
        if (input != null) {
            return new Doubling(input);
        } else throw  new UnsupportedOperationException("Please provide an input!");
    }

    @GetMapping("/greeter")
    public Greeting greeting(@RequestParam(value="name", required=false) String name, @RequestParam(value="title", required=false) String title) {
        if ((name == null) && (title == null)) {
            throw new UnsupportedOperationException("Please provide a name and a title!");
        } else if (name == null) {
            throw new UnsupportedOperationException("Please provide a name!");
        } else if (title == null) {
            throw new UnsupportedOperationException("Please provide a title!");
        } else return new Greeting(name, title);
    }

    @GetMapping("/appenda/{appendable}")
    public Appended appended(@PathVariable String appendable) {
        return new Appended(appendable);
    }

    @PostMapping("/dountil/{action}")
    public Result doUntil(@PathVariable(required = false) String action, @RequestBody(required = false) DoUntil until) {
        if (until == null) {
            throw new UnsupportedOperationException("Please provide a number!");
        } else if (action.equals("sum")) {
            return new Result(resultService.sumUntil(until.getUntil()));
        } else if (action.equals("factor")) {
            return new Result(resultService.factor(until.getUntil()));
        }
        return null;
    }

    @PostMapping("/arrays")
    public Result arrays(@RequestBody(required = false) ArrayToWorkWith numbers) {
        if (numbers.getWhat().equals("sum")) {
           return new Result(resultService.sumAll(numbers.getNumbers()));
        } else if (numbers.getWhat().equals("multiply")) {
            return new Result(resultService.multiply(numbers.getNumbers()));
        } else if (numbers.getWhat().equals("double")) {
            return new Result(resultService.doubler(numbers.getNumbers()));
        } else if ((numbers.getWhat() == null) || (numbers.getNumbers() == null)) {
            throw new UnsupportedOperationException("Please provide what to do with the numbers!");
        }
        return null;

    }

}
