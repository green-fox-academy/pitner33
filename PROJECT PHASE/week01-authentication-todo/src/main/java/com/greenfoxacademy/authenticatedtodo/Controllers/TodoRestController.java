package com.greenfoxacademy.authenticatedtodo.Controllers;

import com.greenfoxacademy.authenticatedtodo.Models.Todo;
import com.greenfoxacademy.authenticatedtodo.Models.TodoDTO;
import com.greenfoxacademy.authenticatedtodo.Services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoRestController {
    private TodoService todoService;

    @Autowired
    public TodoRestController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("/")
    public ResponseEntity<List<Todo>> list(){
        return ResponseEntity.ok(todoService.findAll());
    }

    @PostMapping("/addtodo")
    public String addTodo(@RequestBody TodoDTO todoDTO) {
        Todo todoToAdd= new Todo();
        todoToAdd.setTitle(todoDTO.getTitle());
        todoToAdd.setDescription(todoDTO.getDescription());
        todoService.addTodo(todoToAdd);
        return "redirect:/";
    }
}
