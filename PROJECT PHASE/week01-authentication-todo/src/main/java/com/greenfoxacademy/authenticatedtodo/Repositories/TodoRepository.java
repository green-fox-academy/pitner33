package com.greenfoxacademy.authenticatedtodo.Repositories;

import com.greenfoxacademy.authenticatedtodo.Models.Todo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TodoRepository extends CrudRepository<Todo, Long> {

    List<Todo> findByApplicationUser_Username(String username);
}
