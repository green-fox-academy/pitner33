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
}
