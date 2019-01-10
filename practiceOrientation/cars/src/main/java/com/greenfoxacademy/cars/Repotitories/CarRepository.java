package com.greenfoxacademy.cars.Repotitories;

import com.greenfoxacademy.cars.Models.Car;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CarRepository extends CrudRepository<Car, String> {
    List<Car> findByPlateContains(String plate);

    List<Car> findByPlateStartsWith(String plateStart);

    List<Car> findByBrand(String brand);
}
