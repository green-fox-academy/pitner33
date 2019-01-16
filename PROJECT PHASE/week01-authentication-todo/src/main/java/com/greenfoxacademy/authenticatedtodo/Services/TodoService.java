package com.greenfoxacademy.authenticatedtodo.Services;

import com.greenfoxacademy.authenticatedtodo.Models.Todo;
import com.greenfoxacademy.authenticatedtodo.Repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    private TodoRepository todoRepository;

    @Autowired
    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> findAll() {
        return (List<Todo>)todoRepository.findAll();
    }

    public void addTodo(Todo todoToAdd) {
        todoRepository.save(todoToAdd);
    }

    public List<Todo> findById(Long id) {
        return (List<Todo>)todoRepository.findById(id).get();
    }

    public List<Todo> findByUsername(String username) {
        return todoRepository.findByApplicationUser_Username(username);
    }
}
