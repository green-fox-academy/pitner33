package com.greenfoxacademy.touristattractions.Models;

import java.util.List;

public class CheapAttractions {
    List<Attraction> attractions;

    public CheapAttractions() {
    }

    public CheapAttractions(List<Attraction> attractions) {
        this.attractions = attractions;
    }

    public List<Attraction> getAttractions() {
        return attractions;
    }

    public void setAttractions(List<Attraction> attractions) {
        this.attractions = attractions;
    }
}
