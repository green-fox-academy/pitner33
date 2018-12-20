package com.grennfoxacademy.reddit;

import com.grennfoxacademy.reddit.Models.Reddit;
import com.grennfoxacademy.reddit.Repositories.RedditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Random;

@SpringBootApplication
public class RedditApplication implements CommandLineRunner {

    @Autowired
    private RedditRepository redditRepository;

    public static void main(String[] args) {
        SpringApplication.run(RedditApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Reddit reddit = new Reddit();
        Random rand = new Random();

        for (int i = 1; i < 16 ; i++) {
            redditRepository.save(new Reddit(i + ". reddit title", i + ". reddit text", "http://" + i + "reddit.com", rand.nextInt(50) + 1));
        }

        System.out.println("CLR is working");

    }
}

