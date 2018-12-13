package com.greenfoxacademy.dependecies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public class ColorGreen implements MyColor {
    Printer printer;

    @Autowired
    public ColorGreen(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void printColor() {
       printer.log("GREEN");
    }
}
