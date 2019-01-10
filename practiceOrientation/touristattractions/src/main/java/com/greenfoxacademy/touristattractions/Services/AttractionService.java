package com.greenfoxacademy.touristattractions.Services;

import com.greenfoxacademy.touristattractions.Models.Attraction;
import com.greenfoxacademy.touristattractions.Repositories.AttractionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AttractionService {

    private AttractionRepository attractionRepository;

    @Autowired
    public AttractionService(AttractionRepository attractionRepository) {
        this.attractionRepository = attractionRepository;
    }

    public void save(Attraction attraction) {
        attractionRepository.save(attraction);
    }

    public List<Attraction> findAll() {
        return (List<Attraction>) attractionRepository.findAll();
    }

    public Attraction findById(Long id) {
        return attractionRepository.findById(id).get();
    }

    public List<Attraction> findByCategoryContainsOrderByPrice(String category) {
        return attractionRepository.findByCategoryContainsOrderByPrice(category);
    }

    public List<Attraction> cheapestRestaurantParkMuseum() {
        List<Attraction> cheap = new ArrayList<>();
        cheap.add(findByCategoryContainsOrderByPrice("restaurant").get(0));
        cheap.add(findByCategoryContainsOrderByPrice("museum").get(0));
        cheap.add(findByCategoryContainsOrderByPrice("park").get(0));
        return cheap;
    }
}
