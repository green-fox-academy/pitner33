package com.greenfoxacademy.touristattractions;

import com.greenfoxacademy.touristattractions.Models.Attraction;
import com.greenfoxacademy.touristattractions.Services.AttractionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TouristattractionsApplication implements CommandLineRunner {

    @Autowired
    private AttractionService attractionService;

    public static void main(String[] args) {
        SpringApplication.run(TouristattractionsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        attractionService.save(new Attraction("Pulitzer", "Budapest", 1200, 47.4841, 19.0602, "restaurant", 60, 3));
        attractionService.save(new Attraction("Heroes' Square", "Budapest", 0, 47.4841, 19.0601, "park", 30, 3));
        attractionService.save(new Attraction("House of Terror", "Budapest", 3000, 47.4841, 19.0602, "museum", 120, 12));
        System.out.println("Database filled");
    }
}



