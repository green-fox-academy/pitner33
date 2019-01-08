package com.greenfoxacademy.w09d01.Controllers;

import org.hamcrest.core.Is;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class RestControllersTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void testDoubling_StatusOk_givesGoodResult() throws Exception {
        mockMvc.perform(
                MockMvcRequestBuilders.get("/doubling")
//                        .contentType(MediaType.APPLICATION_JSON)
                        .param("input", "5")
        )
                .andDo(print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.result", Is.is(10)))
                .andExpect(MockMvcResultMatchers.jsonPath("$.received", Is.is(5)));
    }

    @Test
    public void testDoubling_NoInput_GivesError() throws Exception {
        mockMvc.perform(
                MockMvcRequestBuilders.get("/doubling")
//                        .contentType(MediaType.APPLICATION_JSON)
        )
                .andDo(print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.error", Is.is("Please provide an input!")));
    }

    @Test
    public void greeting_WithNameAndTitle_GivesCorrectAnswer_StatusOk() throws Exception {
        mockMvc.perform(
                MockMvcRequestBuilders.get("/greeter")
//                        .contentType(MediaType.APPLICATION_JSON)
                        .param("name", "John")
                        .param("title", "student")
        )
                .andDo(print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.welcome_message", Is.is("Oh, hi there John, my dear student!")));
    }

    @Test
    public void greeting_WithNameOnly_GivesError() throws Exception {
        mockMvc.perform(
                MockMvcRequestBuilders.get("/greeter")
                        .param("name", "John")
        )
                .andDo(print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.error", Is.is("Please provide a title!")));
    }

    @Test
    public void greeting_WithTitleOnly_GivesError() throws Exception {
        mockMvc.perform(
                MockMvcRequestBuilders.get("/greeter")
                        .param("title", "student")
        )
                .andDo(print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.error", Is.is("Please provide a name!")));
    }

    @Test
    public void greeting_WithhoutNameAndTitle_GivesError() throws Exception {
        mockMvc.perform(
                MockMvcRequestBuilders.get("/greeter")
        )
                .andDo(print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.error", Is.is("Please provide a name and a title!")));
    }



    @Test
    public void appended_StatusOk_GivesCorrectAnswer() throws Exception {
        mockMvc.perform(
                MockMvcRequestBuilders.get("/appenda/{appendable}", "kuty")
        )
                .andDo(print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.appended", Is.is("kutya")));
    }

    @Test
    public void appended_NoPathVariable_GivesError() throws Exception {
        mockMvc.perform(
                MockMvcRequestBuilders.get("/appenda")
        )
                .andDo(print())
                .andExpect(MockMvcResultMatchers.status().isNotFound());
    }

    @Test
    public void doUntil_ActionSum_StatusOk_GivesCorrectAnswer() throws Exception {
        mockMvc.perform(
                MockMvcRequestBuilders.post("/dountil/{action}", "sum")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"until\":\"5\"}")
        )
                .andDo(print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.result", Is.is(15)));
    }

    @Test
    public void doUntil_ActionSFactor_StatusOk_GivesCorrectAnswer() throws Exception {
        mockMvc.perform(
                MockMvcRequestBuilders.post("/dountil/{action}", "factor")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"until\":\"5\"}")
        )
                .andDo(print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.result", Is.is(120)));
    }

    @Test
    public void doUntil_NoContent_GivesError() throws Exception {
        mockMvc.perform(
                MockMvcRequestBuilders.post("/dountil/{action}", "sum")
        )
                .andDo(print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.error", Is.is("Please provide a number!")));
    }

    @Test
    public void arrays() throws Exception {
        mockMvc.perform(
                MockMvcRequestBuilders.post("/arrays")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"what\":\"sum\", \"numbers\":[1, 2, 5, 10]}")
        )
                .andDo(print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.result", Is.is(18)));
    }
}