package com.grennfoxacademy.reddit.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Reddit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private String message;
    private String URL;
    private Integer score;

    public Reddit() {
        this.score = 0;
    }

    public Reddit(String title, String message, String URL) {
        this();
        this.title = title;
        this.message = message;
        this.URL = URL;
    }

    public Reddit(String title, String message, String URL, Integer score) {
        this.title = title;
        this.message = message;
        this.URL = URL;
        this.score = score;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}
