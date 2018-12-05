package com.greenfoxacademy.springstart.Controllers;

import java.util.concurrent.atomic.AtomicLong;

public class Greetings {
    long id;
    String content;
    static AtomicLong count = new AtomicLong(1);

    public Greetings(String content) {
        this.id = count.getAndIncrement();
        this.content = content;

    }

    public Greetings(long id, String content) {
        this.id = id;
        this.content = content;

    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
