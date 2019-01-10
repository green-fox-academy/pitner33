package com.greenfoxacademy.url.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.net.URL;
import java.util.Random;

@Entity
public class UrlModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private URL url;
    private String alias;
    private String secretCode;
    private Integer hitCount;

    public UrlModel() {
        this.secretCode = secretCodeGenerator();
        this.hitCount = 0;
    }

    public UrlModel(URL url, String alias) {
        this();
        this.url = url;
        this.alias = alias;
    }

    public String secretCodeGenerator() {
        Random random = new Random();
        return Integer.toString(random.nextInt(10)) +  Integer.toString(random.nextInt(10)) + Integer.toString(random.nextInt(10)) + Integer.toString(random.nextInt(10));
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getSecretCode() {
        return secretCode;
    }

    public void setSecretCode(String secretCode) {
        this.secretCode = secretCode;
    }

    public Integer getHitCount() {
        return hitCount;
    }

    public void setHitCount(Integer hitCount) {
        this.hitCount = hitCount;
    }
}
