package com.greenfoxacademy.dependecies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

@SpringBootApplication

public class DependeciesApplication implements CommandLineRunner {

    private Printer printer;
    private MyColor color;

    @Autowired
    public DependeciesApplication(Printer printer, MyColor color) {
        this.printer = printer;
        this.color = color;
    }

    public static void main(String[] args) {
        SpringApplication.run(DependeciesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        printer.log("Hello");

        color.printColor();
    }
}

