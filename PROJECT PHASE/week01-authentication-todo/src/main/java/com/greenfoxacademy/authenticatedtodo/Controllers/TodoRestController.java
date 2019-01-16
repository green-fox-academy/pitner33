package com.greenfoxacademy.authenticatedtodo.Controllers;

import com.greenfoxacademy.authenticatedtodo.Models.Todo;
import com.greenfoxacademy.authenticatedtodo.Models.TodoDTO;
import com.greenfoxacademy.authenticatedtodo.Models.TodoListDTO;
import com.greenfoxacademy.authenticatedtodo.Services.TodoService;
import com.greenfoxacademy.authenticatedtodo.User.ApplicationUser;
import com.greenfoxacademy.authenticatedtodo.User.ApplicationUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoRestController {
    private TodoService todoService;
    private ApplicationUserRepository applicationUserRepository;

    @Autowired
    public TodoRestController(TodoService todoService, ApplicationUserRepository applicationUserRepository) {
        this.todoService = todoService;
        this.applicationUserRepository = applicationUserRepository;
    }

    @GetMapping("/")
    public ResponseEntity list(){
        TodoListDTO todoList = new TodoListDTO();
        todoList.setTodoList(todoService.findAll());
        return ResponseEntity.ok(todoList);
    }

    @GetMapping("/todos/{username}")
    public ResponseEntity<List<Todo>> listOfTodosByUser(@PathVariable(value = "username") String username) {
        return ResponseEntity.ok(todoService.findByUsername(username));
    }

    @PostMapping("/addtodo/{username}")
    public String addTodo(@RequestBody TodoDTO todoDTO, @PathVariable(value = "username") String username) {
        Todo todoToAdd= new Todo();
        ApplicationUser user = applicationUserRepository.findByUsername(username);
        List<Todo> usersTodoList = user.getTodoList();

        todoToAdd.setApplicationUser(user);
        todoToAdd.setTitle(todoDTO.getTitle());
        todoToAdd.setDescription(todoDTO.getDescription());
        usersTodoList.add(todoToAdd);
//        user.setTodoList(usersTodoList);

//        applicationUserRepository.save(user);
        todoService.addTodo(todoToAdd);
        return "redirect:/";
    }
}
