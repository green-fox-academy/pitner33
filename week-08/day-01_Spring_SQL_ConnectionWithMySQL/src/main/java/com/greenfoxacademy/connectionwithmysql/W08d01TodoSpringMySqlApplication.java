package com.greenfoxacademy.connectionwithmysql;

import com.greenfoxacademy.connectionwithmysql.Models.Assignee;
import com.greenfoxacademy.connectionwithmysql.Models.Todo;
import com.greenfoxacademy.connectionwithmysql.Repositories.AssigneeRepository;
import com.greenfoxacademy.connectionwithmysql.Repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class W08d01TodoSpringMySqlApplication implements CommandLineRunner {

    @Autowired
    private TodoRepository todoRepository;

    @Autowired
    private AssigneeRepository assigneeRepository;

    public static void main(String[] args) {
        SpringApplication.run(W08d01TodoSpringMySqlApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        todoRepository.save(new Todo("todo1", false, true));
        todoRepository.save(new Todo("todo2"));
        todoRepository.save(new Todo("todo3", true, false));
        todoRepository.save(new Todo("todo5", true, false));

        assigneeRepository.save(new Assignee("Ádzseszkó", "stewie@wonder.iloveyou"));
        System.out.println("DONE________________________________________________________________");

    }
}

