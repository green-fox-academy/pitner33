package com.greenfoxacademy.url2.Controllers;

import com.greenfoxacademy.url2.Models.SecretCodeObject;
import com.greenfoxacademy.url2.Models.UrlModel;
import com.greenfoxacademy.url2.Services.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UrlRestController {

    @Autowired
    private UrlService urlService;

    @GetMapping("/api/links")
    public ResponseEntity<List<UrlModel>> findAllEntries() {
        List<UrlModel> allUrlModelEntries = urlService.findAll();
        return ResponseEntity.ok(allUrlModelEntries);
    }

    @DeleteMapping("/api/links/{id}")
    public ResponseEntity delete(@PathVariable Long id, @RequestBody SecretCodeObject secretCode) {
        Optional<UrlModel> urlModel = urlService.findById(id);
        if (!urlModel.isPresent()) {
            return ResponseEntity.notFound().build();
        } else if (!urlModel.get().getSecretCode().equals(secretCode.getSecretCode())) {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
        } else {
            urlService.delete(urlModel.get());
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
    }
}
