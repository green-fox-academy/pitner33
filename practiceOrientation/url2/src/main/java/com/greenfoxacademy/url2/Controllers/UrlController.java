package com.greenfoxacademy.url2.Controllers;

import com.greenfoxacademy.url2.Models.UrlModel;
import com.greenfoxacademy.url2.Services.UrlService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.net.URL;

@Controller
public class UrlController {
    private UrlService urlService;

    @Autowired
    public UrlController(UrlService urlService) {
        this.urlService = urlService;
    }

    @GetMapping("/")
    public String urlSave(Model model, @ModelAttribute(value = "newUrlModel")UrlModel newUrlModel, @ModelAttribute(value = "error") String error, @ModelAttribute(value = "message") String message) {
        model.addAttribute("newUrlModel", newUrlModel);
        model.addAttribute("error", error);
        model.addAttribute("message", message);
        return "urlmain";
    }

    @PostMapping("/save-link")
    public String urlSave(RedirectAttributes attributes, @ModelAttribute(value = "newUrlModel")UrlModel newUrlModel) {
        if (urlService.findByAlias(newUrlModel.getAlias()) != null) {
            attributes.addFlashAttribute("error", "Your alias is already in use!");
            attributes.addFlashAttribute("newUrlModel", newUrlModel);
        } else {
            attributes.addFlashAttribute("message", "Your url is aliased to " + newUrlModel.getAlias() + " and your secret code is " + newUrlModel.getSecretCode());
            urlService.saveUrl(newUrlModel);

        }
        return "redirect:/";
    }

    @GetMapping("/a/{alias}")
    public String urlHitIncrement(@PathVariable String alias) throws NotFoundException {
        UrlModel urlToFind = urlService.findByAlias(alias);
        if (urlToFind == null) {
            throw new NotFoundException("Alias not exists");
        } else {
            urlToFind.setHitCount(urlToFind.getHitCount() + 1);
            urlService.saveUrl(urlToFind);
        }
        return  "redirect:" + urlToFind.getUrl();

    }
}
