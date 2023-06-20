package com.example.hello.controller;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
 
@WebMvcTest
public class RestHelloControllerTest {
 
    @Autowired
    private MockMvc mockMvc;
 
    private static ObjectMapper mapper = new ObjectMapper();
 
    @Test
    public void testGetExample() throws Exception {
        mockMvc.perform(get("/rest-hello/manish")).andExpect(status().isOk()).andExpect(content().string(containsString("manish")));
    }
}