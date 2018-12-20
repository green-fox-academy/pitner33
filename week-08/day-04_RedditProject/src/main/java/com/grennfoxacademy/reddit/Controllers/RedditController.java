package com.grennfoxacademy.reddit.Controllers;

import com.grennfoxacademy.reddit.Models.Reddit;
import com.grennfoxacademy.reddit.Repositories.RedditRepository;
import com.grennfoxacademy.reddit.Services.RedditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.jws.WebParam;

@Controller
public class RedditController {
//    private RedditRepository redditRepository;
    private RedditService redditService;

    @Autowired
    public RedditController(RedditService redditService) {
//        this.redditRepository = redditRepository;
        this.redditService = redditService;
    }

    @GetMapping("")
    public String redditMain(Model model) {
        model.addAttribute("allReddits", redditService.mostPopularReddits());
        return "redditMain";
    }

    @GetMapping("{id}/details")
    public String redditDetail(@PathVariable Long id, Model model) {
        model.addAttribute("reddit", redditService.findById(id));
        return "redditDetails";
    }

    @GetMapping("{id}/upscore")
    public String upScore(@PathVariable Long id) {
        redditService.upScore(id);
        return "redirect:/";
    }

    @GetMapping("{id}/downscore")
    public String downScore(@PathVariable Long id) {
        redditService.downScore(id);
        return "redirect:/";
    }

    @GetMapping("{id}/upscoreall")
    public String upScoreAll(@PathVariable Long id) {
        redditService.upScore(id);
        return "redirect:/all";
    }

    @GetMapping("{id}/downscoreall")
    public String downScoreAll(@PathVariable Long id) {
        redditService.downScore(id);
        return "redirect:/all";
    }

    @GetMapping("/submit")
    public String submitG(Model model, @ModelAttribute(value = "newReddit") Reddit reddit) {
        model.addAttribute("newReddit", reddit);
        return "redditSubmit";
    }

    @PostMapping("/submit")
    public String submitP(@ModelAttribute(value = "newReddit") Reddit reddit) {
        redditService.save(reddit);
        return "redirect:/";
    }

    @GetMapping("/all")
    public String redditAllPosts(Model model) {
        model.addAttribute("allReddits", redditService.findAll());
        return "redditAllPosts";
    }
}
