package com.greenfoxacademy.authenticatedtodo.Models;

import com.greenfoxacademy.authenticatedtodo.User.ApplicationUser;

public class TodoDTO {
    private String title;
    private String description;
    private ApplicationUser applicationUser;

    public TodoDTO() {
    }

    public TodoDTO(String title, String description, ApplicationUser applicationUser) {
        this.title = title;
        this.description = description;
        this.applicationUser = applicationUser;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ApplicationUser getApplicationUser() {
        return applicationUser;
    }

    public void setApplicationUser(ApplicationUser applicationUser) {
        this.applicationUser = applicationUser;
    }
}
