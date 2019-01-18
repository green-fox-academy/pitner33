package com.greenfoxacademy.authenticatedtodo.User;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.ApplicationContext;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.persistence.EntityManager;

import static org.junit.Assert.*;
import static org.springframework.security.test.web.reactive.server.SecurityMockServerConfigurers.springSecurity;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(UserController.class)
@ActiveProfiles("Test")
public class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ApplicationUserRepository applicationUserRepository;

    @MockBean
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @MockBean
    private UserDetailsServiceImpl userDetailsService;

    @MockBean
    private ApplicationContext applicationContext;

    @MockBean
    private EntityManager entityManager;

    @MockBean
    private DispatcherServlet dispatcherServlet;

//    @Before
//    public void setup() {
//        mockMvc = MockMvcBuilders
//                .webAppContextSetup(context)
//                .apply(springSecurity())
//                .build();
//    }

    @Test
    public void showUser_401Error () throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/"))
                .andExpect(status().isUnauthorized());
    }

    @Test
    public void singUp() {
    }
}