package com.greenfoxacademy.groot.Controllers;

import org.hamcrest.core.Is;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@RunWith(SpringRunner.class)
@WebMvcTest(GuardianController.class)
public class GuardianControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void groot_WithParam_StatusOk_GoodAnswer() throws Exception {
        mockMvc.perform(
                MockMvcRequestBuilders.get("/groot")
                        .param("message", "somemessage")
        )
                .andDo(print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.received", Is.is("somemessage")))
                .andExpect(MockMvcResultMatchers.jsonPath("$.translated", Is.is("I am Groot")));
    }

    @Test
    public void groot_WithoutParam_GivesError() throws Exception {
        mockMvc.perform(
                MockMvcRequestBuilders.get("/groot")

        )
                .andDo(print())
                .andExpect(MockMvcResultMatchers.status().isBadRequest())
                .andExpect(MockMvcResultMatchers.jsonPath("$.error", Is.is("I am Groooot")));
    }
}