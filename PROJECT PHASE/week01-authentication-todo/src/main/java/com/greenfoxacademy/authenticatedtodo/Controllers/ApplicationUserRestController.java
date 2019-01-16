package com.greenfoxacademy.authenticatedtodo.Controllers;

import com.greenfoxacademy.authenticatedtodo.Models.ApplicationUserListDTO;
import com.greenfoxacademy.authenticatedtodo.Services.TodoService;
import com.greenfoxacademy.authenticatedtodo.User.ApplicationUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class ApplicationUserRestController {
    private TodoService todoService;
    private ApplicationUserRepository applicationUserRepository;

    @Autowired
    public ApplicationUserRestController(TodoService todoService, ApplicationUserRepository applicationUserRepository) {
        this.todoService = todoService;
        this.applicationUserRepository = applicationUserRepository;
    }

    @GetMapping("/list")
    public ResponseEntity userList() {
        ApplicationUserListDTO allUserList = new ApplicationUserListDTO();
        allUserList.setUserList(applicationUserRepository.findAll());

        return ResponseEntity.ok(allUserList);
    }
}
