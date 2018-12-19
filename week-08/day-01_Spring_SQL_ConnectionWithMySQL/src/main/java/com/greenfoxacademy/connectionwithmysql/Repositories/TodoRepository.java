package com.greenfoxacademy.connectionwithmysql.Repositories;

import com.greenfoxacademy.connectionwithmysql.Models.Todo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TodoRepository extends CrudRepository<Todo, Long> {

    List<Todo> findByDone(Boolean b);
    List<Todo> findByTitleContains(String search);
    List<Todo> findByTitleContainsOrDescriptionContains(String title, String description);


}
