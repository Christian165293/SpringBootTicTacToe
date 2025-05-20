package com.example.TicTacToe;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//Focuses on only the HealthCheckController web layer for Mvc testing
@WebMvcTest(HealthCheckController.class)
class HealthCheckControllerTest {

    @Autowired
    private MockMvc mockMvc;//simulates HTTP requests

    @Test
    void healthCheckReturnOk() throws Exception {
        mockMvc.perform(get("/healthcheck")) // Performs GET request to /healthcheck
                .andExpect(status().isOk())// Expect HTTP OK status
                .andExpect(jsonPath("$.status").value("ok"));// Expect JSON with status = "ok"
    }
}