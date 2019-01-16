package com.greenfoxacademy.authenticatedtodo.Models;

import com.greenfoxacademy.authenticatedtodo.User.ApplicationUser;

import java.util.List;

public class ApplicationUserListDTO {
    private List<ApplicationUser> userList;

    public ApplicationUserListDTO() {
    }

    public ApplicationUserListDTO(List<ApplicationUser> userList) {
        this.userList = userList;
    }

    public List<ApplicationUser> getUserList() {
        return userList;
    }

    public void setUserList(List<ApplicationUser> userList) {
        this.userList = userList;
    }
}