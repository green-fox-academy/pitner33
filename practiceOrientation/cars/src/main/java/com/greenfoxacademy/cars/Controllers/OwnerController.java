package com.greenfoxacademy.cars.Controllers;

import com.greenfoxacademy.cars.Models.Car;
import com.greenfoxacademy.cars.Models.Owner;
import com.greenfoxacademy.cars.Services.CarService;
import com.greenfoxacademy.cars.Services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OwnerController {
    private CarService carService;
    private OwnerService ownerService;

    @Autowired
    public OwnerController(CarService carService, OwnerService ownerService) {
        this.carService = carService;
        this.ownerService = ownerService;
    }

    @GetMapping("/owner/list")
    public String ownerList(Model model, @ModelAttribute(value = "owner")Owner owner) {
        model.addAttribute("ownerList", ownerService.findAll());
        return "ownerList";
    }

    @PostMapping("/owner/add")
    public String ownerAdd(@ModelAttribute(value = "owner")Owner owner) {
        ownerService.save(owner);
        return "redirect:/owner/list";
    }

    @GetMapping("/owner/ownedcars/{id}")
    public String ownedCarsListById(@PathVariable Long id, Model model, @ModelAttribute(value = "carAddToOwner") Car car) {
        model.addAttribute("ownedCarList", ownerService.findById(id).getCarList());
        model.addAttribute("owner", ownerService.findById(id));
        model.addAttribute("carAddToOwner", car);

        return "ownedCars";
    }

    @PostMapping("/owner/{id}/addcar")
    public String addCarToOwner(@PathVariable Long id, @ModelAttribute(value = "carAddToOwner") Car car) {
        Car carToAdd = carService.findByPlate(car.getPlate()).get(0);  //TODO works only with exact match - validate!
        Owner owner = ownerService.findById(id);
        owner.getCarList().add(carToAdd);
        carToAdd.setOwner(owner);
        ownerService.save(owner);
        carService.save(carToAdd);
        return "redirect:/owner/ownedcars/{id}";
    }

    @GetMapping("/owner/ownedcars/{id}/deletecar/{plate}")
    public String sellCar(@PathVariable Long id, @PathVariable String plate) {
        Car carToSell = carService.findByPlate(plate).get(0);  //TODO works only with exact match - validate!
        Owner owner = ownerService.findById(id);
//        Owner newOwner = new Owner();
        owner.getCarList().remove(carToSell);
        carToSell.setOwner(null);
        ownerService.save(owner);
        carService.save(carToSell);
        return "redirect:/owner/ownedcars/{id}";
    }

    @GetMapping("/owner/delete/{id}")
    public String deleteOwner(@PathVariable Long id) {
        ownerService.deleteById(id);
        return "redirect:/owner/list";
    }

    @GetMapping("/owner/edit/{id}")
    public String editOwner(Model model, @PathVariable Long id) {
        model.addAttribute("owner", ownerService.findById(id));
        model.addAttribute("ownerList", ownerService.findAll());
        return "ownerList";
    }




}
