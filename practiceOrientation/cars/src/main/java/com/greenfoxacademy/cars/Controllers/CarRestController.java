package com.greenfoxacademy.cars.Controllers;

import com.greenfoxacademy.cars.Models.BrandResult;
import com.greenfoxacademy.cars.Models.Car;
import com.greenfoxacademy.cars.Services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarRestController {
    private CarService carService;

    @Autowired
    public CarRestController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/api/search/{brand}")
    public ResponseEntity searchBrandResult(@PathVariable(value = "brand") String brand){
        List<Car> carsWithBrand = carService.findByBrand(brand);
        BrandResult brandResult = new BrandResult();
        if (!carsWithBrand.isEmpty()) {
           brandResult.setResult("ok");
           brandResult.setData(carsWithBrand);
        } else
            {brandResult.setResult("notOk");
            brandResult.setData(carsWithBrand);}
        return ResponseEntity.ok(brandResult);
    }
}
