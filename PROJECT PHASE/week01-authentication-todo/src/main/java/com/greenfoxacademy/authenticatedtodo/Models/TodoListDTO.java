package com.greenfoxacademy.authenticatedtodo.Models;

import java.util.List;

public class TodoListDTO {
    private List<Todo> todoList;

    public TodoListDTO() {
    }

    public TodoListDTO(List<Todo> todoList) {
        this.todoList = todoList;
    }

    public List<Todo> getTodoList() {
        return todoList;
    }

    public void setTodoList(List<Todo> todoList) {
        this.todoList = todoList;
    }
}
