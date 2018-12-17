package com.greenfoxacademy.connectionwithmysql.Controllers;

import com.greenfoxacademy.connectionwithmysql.Models.Todo;
import com.greenfoxacademy.connectionwithmysql.Repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    public String list(Model model,  @RequestParam(value = "isActive", required=false) Boolean isActive){
        if (isActive == null) {
            model.addAttribute("todos", repository.findAll());
        } else {
            model.addAttribute("todos", repository.findByDone(!isActive));
        }
        return "todolist";
    }

    @GetMapping("/add")
    public String add(Model model, @ModelAttribute (name="newtodo") Todo todo) {  //átadok neki egy üres Todo objectet ("ModelAttrib) amit összekötök a mezőmmel (Th:field) - és a html-hetz átpasszolást a Model csinálja
        model.addAttribute("newtodo", todo);
        return "addtodo";
    }

    @PostMapping("/add")
    public String addTodo(@ModelAttribute(value="newtodo") Todo todo) {
        repository.save(todo);
        return "redirect:/todo/list";
    }

    @GetMapping("{id}/delete")
    public String delete(@PathVariable Long id) {
        repository.deleteById(id);
        return "redirect:/todo/list";
    }

    @GetMapping("{id}/edit")
    public String edit(@PathVariable Long id, Model model) {
        model.addAttribute("todo", repository.findById(id).get());
        return "edittodo";
    }

    @PostMapping("{id}/edit")
    public String editing(@ModelAttribute("todo") Todo todo) {
        repository.save(todo);
        return "redirect:/todo/list";

    }



}
