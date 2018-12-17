package com.greenfoxacademy.springsql.Controllers;

import com.greenfoxacademy.springsql.Repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping("/todo")
public class TodoController {

    private TodoRepository repository;

    @Autowired
    public TodoController(TodoRepository repository) {
        this.repository = repository;
    }

    //    MULTIPLE REQUESTMETHODS TO THE SAME CONTROLLER METHOD
    @RequestMapping( value = { "", "/", "/list" }, method = GET)
    public String list(Model model){
        model.addAttribute("todos", repository.findAll());
        return "todolist";
    }
}
