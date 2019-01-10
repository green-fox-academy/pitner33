package com.greenfoxacademy.touristattractions.Controllers;

import com.greenfoxacademy.touristattractions.Models.Attraction;
import com.greenfoxacademy.touristattractions.Services.AttractionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AttractionRestController {
    private AttractionService attractionService;

    @Autowired
    public AttractionRestController(AttractionService attractionService) {
        this.attractionService = attractionService;
    }

    @GetMapping("/budge")
    public ResponseEntity<List<Attraction>> findBudget() {
        return ResponseEntity.ok(attractionService.cheapestRestaurantParkMuseum());
    }
}
