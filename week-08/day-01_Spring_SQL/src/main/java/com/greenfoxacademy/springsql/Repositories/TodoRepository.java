package com.greenfoxacademy.springsql.Repositories;

import com.greenfoxacademy.springsql.Models.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {


}
