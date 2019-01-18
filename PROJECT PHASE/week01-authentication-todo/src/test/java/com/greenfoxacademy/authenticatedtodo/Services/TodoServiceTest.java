package com.greenfoxacademy.authenticatedtodo.Services;

import com.greenfoxacademy.authenticatedtodo.Repositories.TodoRepository;
import com.greenfoxacademy.authenticatedtodo.User.UserController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@WebMvcTest(UserController.class)
public class TodoServiceTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private TodoRepository todoRepository;

    @Test
    public void findAll() {
    }

    @Test
    public void addTodo() {
    }

    @Test
    public void findById() {
    }

    @Test
    public void findByUsername() {
    }
}