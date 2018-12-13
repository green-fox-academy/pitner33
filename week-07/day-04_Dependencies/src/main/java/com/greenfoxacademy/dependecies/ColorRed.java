package com.greenfoxacademy.dependecies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ColorRed implements MyColor {
    Printer printer;


    @Autowired
    public ColorRed(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void printColor() {
        printer.log("RED");
    }
}
