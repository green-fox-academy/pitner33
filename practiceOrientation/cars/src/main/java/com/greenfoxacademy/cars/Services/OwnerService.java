package com.greenfoxacademy.cars.Services;

import com.greenfoxacademy.cars.Models.Car;
import com.greenfoxacademy.cars.Models.Owner;
import com.greenfoxacademy.cars.Repotitories.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnerService {
    private OwnerRepository ownerRepository;


    @Autowired
    public OwnerService(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    public List<Owner> findAll() {
        return (List<Owner>) ownerRepository.findAll();
    }

    public Owner findById(Long id) {
        return ownerRepository.findById(id).get();
    }

    public void save(Owner owner) {
        ownerRepository.save(owner);
    }

    public void deleteById(Long id) {
        setOwnerCarListToNull(id);
        ownerRepository.deleteById(id);
    }

    public  void setOwnerCarListToNull(Long id) {
        Owner owner = ownerRepository.findById(id).get();
        List<Car> carsToRemove = owner.getCarList();
        for (int i = 0; i < carsToRemove.size() ; i++) {
            carsToRemove.get(i).setOwner(null);
            owner.setCarList(carsToRemove);
        }
        owner.setCarList(null);

        ownerRepository.save(owner);
    }

    public Owner editById(Long id) {
        return null;
    }
}
