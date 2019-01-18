package com.greenfoxacademy.authenticatedtodo.Controllers;

import com.greenfoxacademy.authenticatedtodo.Services.TodoService;
import com.greenfoxacademy.authenticatedtodo.User.ApplicationUserRepository;
import com.greenfoxacademy.authenticatedtodo.User.UserDetailsServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.web.servlet.DispatcherServlet;

import java.util.Collections;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@RunWith(SpringRunner.class)
@WebMvcTest(TodoRestController.class)
//@ActiveProfiles("Test")
//@SpringBootTest
//@AutoConfigureMockMvc
public class TodoRestControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    private TodoService todoService;

    @MockBean
    private ApplicationUserRepository applicationUserRepository;

    @MockBean
    private UserDetailsServiceImpl userDetailsService;

    @MockBean
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @MockBean
    private DispatcherServlet dispatcherServlet;

    @Test
    public void list() throws Exception {
        when(todoService.findAll()).thenReturn(Collections.emptyList());

        mockMvc.perform(
                MockMvcRequestBuilders.get("/")
        )
                .andDo(print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().json("[]"));
    }

    @Test
    public void listOfTodosByUser() {
    }

    @Test
    public void addTodo() {
    }
}