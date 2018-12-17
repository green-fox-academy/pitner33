package com.greenfoxacademy.springsql;

import com.greenfoxacademy.springsql.Models.Todo;
import com.greenfoxacademy.springsql.Repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringsqlApplication implements CommandLineRunner {
    @Autowired
    private TodoRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(SpringsqlApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Todo("I have to learn a lots of stuff"));
        repository.save(new Todo("I have to watch lunchtime"));
        repository.save(new Todo("Need beer"));
        repository.save(new Todo("Sleep a lot"));

    }
}

