package com.greenfoxacademy.authenticatedtodo.Models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.greenfoxacademy.authenticatedtodo.User.ApplicationUser;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String description;

    @ManyToOne
    @JsonBackReference
//    @JoinColumn(name = "application_user_id")
//    @JoinTable(name = "todo_user", joinColumns = @JoinColumn(name ="todo_id", referencedColumnName="id"),
//            inverseJoinColumns = @JoinColumn(name = "application_user_id", referencedColumnName="id"))
    private ApplicationUser applicationUser;

    public Todo() {
    }

    public Todo(String title, String description) {
        this.title = title;
        this.description = description;
        this.applicationUser = applicationUser;
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
