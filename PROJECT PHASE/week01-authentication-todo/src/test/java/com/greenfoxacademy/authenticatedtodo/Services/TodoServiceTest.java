package com.greenfoxacademy.authenticatedtodo.Services;

import com.greenfoxacademy.authenticatedtodo.Models.Todo;
import com.greenfoxacademy.authenticatedtodo.Repositories.TodoRepository;
import com.greenfoxacademy.authenticatedtodo.User.ApplicationUser;
import com.greenfoxacademy.authenticatedtodo.User.ApplicationUserRepository;
import com.greenfoxacademy.authenticatedtodo.User.UserController;
import com.greenfoxacademy.authenticatedtodo.User.UserDetailsServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.DispatcherServlet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import static org.hamcrest.Matchers.empty;
import static org.hamcrest.core.Is.is;

@RunWith(SpringRunner.class)
@WebMvcTest(UserController.class)
public class TodoServiceTest {

    @Autowired
    private MockMvc mockMvc;


    @MockBean
    private UserDetailsServiceImpl userDetailsService;

    @MockBean
    private ApplicationUserRepository applicationUserRepository;

    @MockBean
    private TodoRepository todoRepository;

    @MockBean
    private TodoService todoService;

    @MockBean
    private DispatcherServlet dispatcherServlet;

    Todo testTodo = new Todo("title1", "desc1");
    Todo testTodo2 = new Todo("title2", "desc2");

    List<Todo> todoTestList = new ArrayList<Todo>();


    @Test
    public void findAll() {
        when(todoRepository.findAll()).thenReturn(Collections.emptyList());
        assertThat(todoService.findAll(), is(empty()));
    }

    @Test
    public void addTodo() {
    }

    @Test
    public void findByTodoId() {
        testTodo.setId(1l);
        testTodo2.setId(2l);
        todoTestList.add(testTodo);
        todoTestList.add(testTodo2);
        assertEquals(testTodo, todoService.findByTodoId(1l));

    }

    @Test
    public void findByUsername() {
        testTodo.setId(1l);
        testTodo2.setId(2l);
        todoTestList.add(testTodo);
        todoTestList.add(testTodo2);
        ApplicationUser applicationTestUser = new ApplicationUser("John", "pwd", todoTestList);
        testTodo.setApplicationUser(applicationTestUser);
        testTodo2.setApplicationUser(applicationTestUser);

        when(todoRepository.findByApplicationUser_Username("John")).thenReturn(todoTestList);
        assertEquals(todoTestList, todoService.findByUsername("John"));
    }
}