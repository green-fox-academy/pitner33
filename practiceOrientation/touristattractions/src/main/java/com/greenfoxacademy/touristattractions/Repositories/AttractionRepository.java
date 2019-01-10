package com.greenfoxacademy.touristattractions.Repositories;

import com.greenfoxacademy.touristattractions.Models.Attraction;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AttractionRepository extends CrudRepository<Attraction, Long> {
    List<Attraction> findByCategoryContainsOrderByPrice(String category);
}
