package com.greenfoxacademy.touristattractions.Controllers;

import com.greenfoxacademy.touristattractions.Models.Attraction;
import com.greenfoxacademy.touristattractions.Services.AttractionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class AttractionController {

    private AttractionService attractionService;

    @Autowired
    public AttractionController(AttractionService attractionService) {
        this.attractionService = attractionService;
    }

    @GetMapping("/")
    public String attractionMain(Model model, @ModelAttribute(value = "newAttraction") Attraction attraction) {
        model.addAttribute("attractionList", attractionService.findAll());
        model.addAttribute("newAttraction", attraction);
        return "index";
    }

    @PostMapping("/add")
    //REDIRECT ATTRIBUTES IF YOU WANT TO KEEP THE TEXT IN THE FORM AFTER OBJECT WAS ADDED
    public String addNewAttraction(/*RedirectAttributes attributes, */@ModelAttribute(value = "newAttraction") Attraction attraction) {
//        attributes.addFlashAttribute("newAttraction", attraction);
      /*  if (attractionService.findById(attraction.getId()) != null) {
            Attraction attractionTemp = attractionService.findById(attraction.getId());
            attractionTemp = attraction;
            attractionService.save(attractionTemp);
        } else*/ attractionService.save(attraction);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        model.addAttribute("newAttraction", attractionService.findById(id));
        model.addAttribute("attractionList", attractionService.findAll());
        return "index";
    }
}


