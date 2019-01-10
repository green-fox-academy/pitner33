package com.greenfoxacademy.touristattractions.Repositories;

import com.greenfoxacademy.touristattractions.Models.Attraction;
import org.springframework.data.repository.CrudRepository;

public interface AttractionRepository extends CrudRepository<Attraction, Long> {
}
