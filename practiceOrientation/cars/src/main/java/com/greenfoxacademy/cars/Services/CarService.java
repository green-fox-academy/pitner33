package com.greenfoxacademy.cars.Services;

import com.greenfoxacademy.cars.Models.Car;
import com.greenfoxacademy.cars.Repotitories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {
    private CarRepository carRepository;

    @Autowired
    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> findByPlate(String search) {
        List<Car> car = carRepository.findByPlateContains(search);
            return car;

    }

    public List<Car> findAll() {
        return (List<Car>)carRepository.findAll();
    }

    public List<Car> findByPlateStartsWith( String plateStart) {
        return (List<Car>) carRepository.findByPlateStartsWith(plateStart);
    }

    public List<Car> findByBrand(String brand) {
        return (List<Car>) carRepository.findByBrand(brand);
    }

    public void save(Car car) {
        carRepository.save(car);
    }
}
