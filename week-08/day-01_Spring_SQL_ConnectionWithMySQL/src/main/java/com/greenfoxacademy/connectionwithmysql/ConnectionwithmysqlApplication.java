package com.greenfoxacademy.connectionwithmysql;

import com.greenfoxacademy.connectionwithmysql.Models.Todo;
import com.greenfoxacademy.connectionwithmysql.Repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectionwithmysqlApplication implements CommandLineRunner {

    @Autowired
    private TodoRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(ConnectionwithmysqlApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Todo("todo1", false, true));
        repository.save(new Todo("todo2"));
        repository.save(new Todo("todo3", true, false));
        repository.save(new Todo("todo5", true, false));
        System.out.println("DONE________________________________________________________________");


    }
}

