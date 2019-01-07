package com.greenfoxacademy.w09d01.Models;

public class Appended {
    private String appended;

    public Appended(String appended) {
        this.appended = (appended + "a");
    }

    public String getAppended() {
        return appended;
    }

    public void setAppended(String appended) {
        this.appended = appended;
    }
}
