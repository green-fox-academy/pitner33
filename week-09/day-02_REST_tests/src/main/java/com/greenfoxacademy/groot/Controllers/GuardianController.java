package com.greenfoxacademy.groot.Controllers;

import com.greenfoxacademy.groot.Models.ErrorGroot;
import com.greenfoxacademy.groot.Models.Groot;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

    @GetMapping("/groot")
    ResponseEntity groot(@RequestParam(value = "message", required = false) String message) {
        if (message != null) {
            return ResponseEntity.ok(new Groot(message));
        } else {
            ErrorGroot error = new ErrorGroot("I am Groooot");
            return ResponseEntity.badRequest().body(error);
        }

    }

}
