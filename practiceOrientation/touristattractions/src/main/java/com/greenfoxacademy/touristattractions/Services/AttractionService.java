package com.greenfoxacademy.touristattractions.Services;

import com.greenfoxacademy.touristattractions.Models.Attraction;
import com.greenfoxacademy.touristattractions.Repositories.AttractionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
