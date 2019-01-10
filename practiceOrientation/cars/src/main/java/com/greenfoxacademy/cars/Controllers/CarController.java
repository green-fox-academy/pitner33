package com.greenfoxacademy.cars.Controllers;

import com.greenfoxacademy.cars.Services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CarController {
    private CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/search")
    public String carMain(Model model, @RequestParam(value = "search", required = false) String search,
                          @RequestParam(value = "police", required = false) String police,
                          @RequestParam(value = "diplomat", required = false) String diplomat){

        if (search != null) {
            if (carService.findByPlate(search).isEmpty()) {
                model.addAttribute("error", "Licence plate is not valid");
            } else  {model.addAttribute("carList", carService.findByPlate(search));}
        } else if (police != null) {
            model.addAttribute("carList", carService.findByPlateStartsWith("RB"));
        } else if (diplomat != null) {
            model.addAttribute("carList", carService.findByPlateStartsWith("CD"));
        } else model.addAttribute("carList", carService.findAll());
        return "carMain";
    }

    @GetMapping("/search/{brand}")
    public String searchByBrand(Model model, @PathVariable(value = "brand") String brand) {
        model.addAttribute("carList", carService.findByBrand(brand));
        return "carMain";
    }
}
