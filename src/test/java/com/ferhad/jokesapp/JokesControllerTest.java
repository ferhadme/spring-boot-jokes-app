package com.ferhad.jokesapp;

import com.ferhad.jokesapp.controllers.JokesController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@WebMvcTest(JokesController.class)
public class JokesControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void jokeListTest() throws Exception{
        mockMvc.perform(get("/jokes"))
                .andExpect(status().isOk())
                .andExpect(view().name("jokes"));
    }
}
