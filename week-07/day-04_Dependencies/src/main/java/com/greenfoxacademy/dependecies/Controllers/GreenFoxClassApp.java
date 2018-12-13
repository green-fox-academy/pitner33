package com.greenfoxacademy.dependecies.Controllers;

import com.greenfoxacademy.dependecies.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreenFoxClassApp {
    private StudentService studentService;

    @Autowired
    public GreenFoxClassApp(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/gfa")
    public String gfaMainPage(){
        return "gfaMain";
    }

    @GetMapping("/gfa/list")
    public String gfaStudentList(Model model) {
        model.addAttribute("names", studentService.findAll());
        return "gfaStudentList";
    }
}
