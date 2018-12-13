package com.greenfoxacademy.dependecies.Controllers;

import com.greenfoxacademy.dependecies.Services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsefulController {
    private UtilityService utilityService;

    @Autowired
    public UsefulController(UtilityService utilityService) {
        this.utilityService = utilityService;
    }

    @GetMapping("/useful")
    public String usefulUtilities(Model model) {
        return "useful";
    }

    @GetMapping("/useful/colored")
    public String coloredBlackground(Model model) {
        model.addAttribute("color", utilityService.randomColor());
        return "coloredBackground";
    }

    @GetMapping("/useful/email")
    public String emailValidator(Model model, @RequestParam("email") String address) {
        model.addAttribute("color", utilityService.validateEmail(address));
        model.addAttribute("address", address);
        return "email";
    }

    @GetMapping("/useful/encode")
    public String encode(Model model, @RequestParam("sentence") String text, @RequestParam("number") int num) {
        model.addAttribute("sentence", utilityService.caesar(text, num));
        return "encode";
    }

    @GetMapping("/useful/decode")
    public String decode(Model model, @RequestParam("sentence") String text, @RequestParam("number") int num) {
        model.addAttribute("sentence", utilityService.caesar(text, -num));
        return "encode";
    }

}
